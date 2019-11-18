package com.lt.msg.conf;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/7 0007
 * @since v1.0
 */
@Configuration
public class RabbitConfig {

    @Autowired
    private CachingConnectionFactory connectionFactory;
    /**
     * 创建队列
     *
     * @return 队列
     */
    @Bean
    public Queue createQueue() {
        return new Queue(RabbitMQConfig.RESERVER_WASH_CAR_QUEUE);
    }

    /**
     * topic 消息队列之 -- order 监听 队列
     *
     * @return Queue
     */
    @Bean(name = "createQueueWithTopicModelAndByOrder")
    public Queue createQueueWithTopicModelAndByOrder(){
        return new Queue(RabbitMQConfig.QUEUE_WITH_TOPIC_MODEL_BY_ORDER);
    }

    /**
     * topic 消息队列之 -- Evaluate 监听 队列
     *
     * @return Queue
     */
    @Bean(name = "createQueueWithTopicModelAndByEvaluate")
    public Queue createQueueWithTopicModelAndByEvaluate(){
        return new Queue(RabbitMQConfig.QUEUE_WITH_TOPIC_MODEL_BY_EVALUATE);
    }

    /**
     * topic 消息队列之 -- Record 监听 队列
     *
     * @return Queue
     */
    @Bean(name = "createQueueWithTopicModelAndByRecord")
    public Queue createQueueWithTopicModelAndByRecord(){
        return new Queue(RabbitMQConfig.QUEUE_WITH_TOPIC_MODEL_BY_RECORD);
    }

    /**
     * 使用 topic 转发模式
     * @return 交换机名字
     */
    @Bean
    public TopicExchange createTopicExchange() {
        return new TopicExchange(RabbitMQConfig.TOPIC_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingExchangeMessage(@Qualifier("createQueueWithTopicModelAndByOrder") Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with(RabbitMQConfig.QUEUE_WITH_TOPIC_MODEL_BY_ORDER);
    }

    /**
     * 创建 消息模板 发消息的
     */
    @Bean
    public RabbitTemplate createRabbitTemplate() {
        return new RabbitTemplate(connectionFactory);
    }
}
