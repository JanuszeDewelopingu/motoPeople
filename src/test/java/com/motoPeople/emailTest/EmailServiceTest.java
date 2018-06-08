package com.motoPeople.emailTest;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.GreenMailUtil;
import com.icegreen.greenmail.util.ServerSetupTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.mail.Message;
import javax.mail.MessagingException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailServiceTest {

    @Resource
    private JavaMailSenderImpl emailSender;

    private GreenMail testSmtp;

    @Before
    public void testSmtpInit(){
        testSmtp = new GreenMail(ServerSetupTest.SMTP);
        testSmtp.start();

        emailSender.setPort(465);
        emailSender.setHost("localhost");
    }

    @After
    public void cleanup(){
        testSmtp.stop();
    }

    @Test
    public void testEmail() throws InterruptedException, MessagingException {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("test@test.com");
        message.setTo("test@test.com");
        message.setSubject("test subject");
        message.setText("test text");
        emailSender.send(message);

        Message[] messages = testSmtp.getReceivedMessages();
        assertEquals(1, messages.length);
        assertEquals("test subject", messages[0].getSubject());
        String body = GreenMailUtil.getBody(messages[0]).replaceAll("=\r?\n", "");
        assertEquals("test message", body);
    }
}