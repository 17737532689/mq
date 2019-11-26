package com.hzf.mq.config;



import com.hzf.mq.entity.QueueConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author feri
 * @Date Created in 2019/6/29 16:36
 */
@Configuration
public class RabbitMqConfig {
    /**
     * 此处使用自动装配，定义customers和max-customers
     * @param connectionFactory
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.rabbitmq")
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
//        factory.setMessageConverter(new FastJsonMessageConverter());
        return factory;
    }

    @Bean("queue1")
    public Queue queue1() {
        return new Queue(QueueConstants.QUEUE_TEST1.getCode());
    }
    @Bean("queue2")
    public Queue queue2() {
        return new Queue(QueueConstants.QUEUE_TEST2.getCode());
    }

    /**
     * 定义exchange. 根据需要定义不同的exchange
     * @return
     */
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange("exchange_test", true, false);
    }

    @Bean
    Binding bindingExchangeQueue(@Qualifier("queue1") Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("topic.message");
    }

}
