package org.egov;

import org.springframework.kafka.support.serializer.JsonDeserializer;

public class SmsRequestDeserializer extends JsonDeserializer<SmsRequest> {
    public SmsRequestDeserializer() {
        super(SmsRequest.class);
    }
}