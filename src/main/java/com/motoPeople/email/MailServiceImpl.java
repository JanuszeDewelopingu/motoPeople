package com.motoPeople.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    SimpleMailMessage message = new SimpleMailMessage();

    @Autowired
    private JavaMailSender javaMailSender;

    public MailServiceImpl(JavaMailSender javaMailSender) {
    }

    @Override
    public void sendingRegistryMail(String to) {

    }

    @Override
    public void sendingUpdateMail(String to) {

        String subject = "Your data has been updated";
        String text = "Your data has been updated. Thank you.";

        try {
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);

            logger.info("Sending...");
            javaMailSender.send(message);
            logger.info("Done!");
        } catch(Exception ex) {
            logger.info("Error Sending Email: " + ex.getMessage());
        }
    }

    @Override
    public void sendingDeleteMail(String to) {

        String subject = "Your account has been deleted";
        String text = "Your account has been deleted. Thank you.";

        try {
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);

            logger.info("Sending...");
            javaMailSender.send(message);
            logger.info("Done!");
        } catch(Exception ex) {
            logger.info("Error Sending Email: " + ex.getMessage());
        }
    }
}