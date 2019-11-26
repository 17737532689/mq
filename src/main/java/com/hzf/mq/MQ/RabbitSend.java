package com.hzf.mq.MQ;


import com.hzf.mq.config.RabbitMqConfig;
import com.hzf.mq.entity.QueueConstants;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author feri
 * @Date Created in 2019/6/29 16:46
 */


@Component
public class RabbitSend {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 发送字符串消息
     */
    public void sendToMQ() {
        String content = "this is test content";
        rabbitTemplate.convertAndSend(QueueConstants.QUEUE_TEST1.getCode(), content);
    }


}


