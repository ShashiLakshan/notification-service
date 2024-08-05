package com.event_booking.demo.service;


import com.event_booking.demo.dto.NotificationDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class KafkaNotificationListener {

    @KafkaListener(topics = "notification-topic", groupId = "notification-group")
    public void consumeNotificationEvent(NotificationDto notificationDto) {
        log.info("Payment event consumed: {}", notificationDto);
    }
}
