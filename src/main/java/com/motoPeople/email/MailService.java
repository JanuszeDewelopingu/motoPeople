package com.motoPeople.email;

public interface MailService {

    void sendingRegistryMail(String to);

    void sendingUpdateMail(String to);

    void sendingDeleteMail(String to);
}