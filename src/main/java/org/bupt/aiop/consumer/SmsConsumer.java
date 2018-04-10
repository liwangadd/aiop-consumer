package org.bupt.aiop.consumer;

import org.bupt.aiop.Sender.SmsSender;
import org.bupt.aiop.message.SmsEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Component
public class SmsConsumer {

    @KafkaListener(topics = "topic_send_sms_to_single")
    public void processSms(SmsEntity smsEntity){
        try {
            SmsSender.send(smsEntity.getTo(), smsEntity.getContent(), smsEntity.getFooter());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
