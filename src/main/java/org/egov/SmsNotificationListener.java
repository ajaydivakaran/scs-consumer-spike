package org.egov;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public class SmsNotificationListener {

    @KafkaListener(id = "${kafka.topics.notification.sms.id}",
            topics = "${kafka.topics.notification.sms.name}",
            group = "${kafka.topics.notification.sms.group}")
    public void listen(ConsumerRecord<String, SmsRequest> record) {
        System.err.println("***** received message [key " + record.key() + "] + value [" + record.value()
                + "] from topic egov-notification-mail");
        SmsRequest request = record.value();
        System.out.println("Received SMS " + request);
    }

}
