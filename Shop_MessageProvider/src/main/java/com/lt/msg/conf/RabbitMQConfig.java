package com.lt.msg.conf;

/**
 * 这个类放的是 RabbitMQ 消息队列的 队列名字
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/7 0007
 * @since v1.0
 */
public class RabbitMQConfig {
    public static final String RESERVER_WASH_CAR_QUEUE = "wc:xixicheyueyueduilie";
    public static final String TOPIC_EXCHANGE_NAME = "TopicExchangeName";
    public static final String QUEUE_WITH_TOPIC_MODEL_BY_ORDER = "QueueWithTopicModel.order";
    public static final String QUEUE_WITH_TOPIC_MODEL_BY_EVALUATE = "QueueWithTopicModel.EVALUATE";
    public static final String QUEUE_WITH_TOPIC_MODEL_BY_RECORD = "QueueWithTopicModel.RECORD";
}
