package com.hzf.mq.MQ;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
 
@Component
@Slf4j
public class RabbitmqConsumer {

    @RabbitListener(queues = "queue_test_one")
    public void processQueue13(String data) {
        try {

            log.info("data:" + data);
            //业务处理 ...
 
        } catch (Exception e) {
            log.error("peocess error", e);
            throw new RuntimeException("process error", e); //抛出异常， 消息重新入列并重试
        }
 
    }

}