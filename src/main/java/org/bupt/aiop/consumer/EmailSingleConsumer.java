package org.bupt.aiop.consumer;

import org.bupt.aiop.Sender.EmailSender;
import org.bupt.aiop.message.EmailToMultiEntity;
import org.bupt.aiop.message.EmailToSingleEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Component
public class EmailSingleConsumer {

    @KafkaListener(topics = "topic_send_email_to_single")
    public void processSingleMessage(EmailToSingleEntity message) {
        try {
            EmailSender.sendToSingle(message.getTo(), message.getSubject(), message.getContent(), message.getFooter());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @KafkaListener(topics = "topic_send_email_to_multi_by_copy")
    public void processMultiCopyMessage(EmailToMultiEntity message) {
        try {
            EmailSender.sendToMultiByCopy(message.getTo(), message.getMultiTo(), message.getSubject(), message.getContent(), message.getFooter());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @KafkaListener(topics = "topic_send_email_to_multi_by_secret")
    public void processMultiSecretMessage(EmailToMultiEntity message){
        try {
            EmailSender.sendToMultiBySecret(message.getTo(), message.getMultiTo(), message.getSubject(), message.getContent(), message.getFooter());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
