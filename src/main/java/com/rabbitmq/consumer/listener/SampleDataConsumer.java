package com.rabbitmq.consumer.listener;

import com.rabbitmq.consumer.config.RabbitMQConsumerConfig;
import com.rabbitmq.consumer.dto.SampleData;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SampleDataConsumer {

    @RabbitListener(queues = RabbitMQConsumerConfig.QUEUE_NAME)
    public void consumeFromQueue(SampleData sampleData){
        System.out.println("Consumed message : "+sampleData.toString());
    }
}
