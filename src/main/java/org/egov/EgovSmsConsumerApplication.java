package org.egov;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class EgovSmsConsumerApplication {

    @StreamListener(Sink.INPUT)
    public void readSms(SmsRequest smsRequest) {
        System.out.println("Received sms " + smsRequest);
    }

    public static void main(String[] args) {
        SpringApplication.run(EgovSmsConsumerApplication.class, args);
    }
}

@Getter
@AllArgsConstructor
@ToString
class SmsRequest {
    private String message;
    private String mobileNumber;
}
