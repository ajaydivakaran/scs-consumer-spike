package org.egov;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EgovSmsConsumerApplication {


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
