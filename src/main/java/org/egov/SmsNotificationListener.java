package org.egov;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationListener {

    @KafkaListener(id = "${kafka.topics.notification.sms.id}",
            topics = "${kafka.topics.notification.sms.name}",
            group = "${kafka.topics.notification.sms.group}")
    public void listen(ConsumerRecord<String, SmsRequest> record) {
        SmsRequest request = record.value();
        System.out.println("Received SMS " + request);
    }

}
