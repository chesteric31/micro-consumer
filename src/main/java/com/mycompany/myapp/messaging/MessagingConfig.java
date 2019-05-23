package com.mycompany.myapp.messaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@EnableBinding(value = {Source.class, ConsumerChannel.class})
public class MessagingConfig {
}
