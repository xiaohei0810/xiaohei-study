package com.hand.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;

import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;


/**
 * @Author xiaohei
 * @Date 2021/6/29 11:42 上午
 * @Version 1.0
 */
@Component
public class RabbitMQConfig {

    /**
     * 定义交换机
     */
    private static final String EXCHANGE_SPRINGBOOT_NAME = "/XIAOHEI_EX";

    private static final String FANOUT_SMS_QUEUE = "FANOUT_SMS_QUEUE";

    private static final String FANOUT_EMAIL_QUEUE = "FANOUT_EMAIL_QUEUE";

    /**
     * 交给spring ioc创建队列 消息队列,邮件队列
     */
    @Bean
    public Queue smsQueue(){
        return new Queue(FANOUT_SMS_QUEUE);
    }

    @Bean
    public Queue emailQueue(){
        return new Queue(FANOUT_EMAIL_QUEUE);
    }

    /**
     * 注入交换机
     */
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange(EXCHANGE_SPRINGBOOT_NAME);
    }

    /**
     * 队列绑定交换机:消息队列
     */
    @Bean
    public Binding bindSmsFanoutExchange(Queue smsQueue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(smsQueue).to(fanoutExchange);
    }

    /**
     * 队列绑定交换机:邮件队列
     */
    @Bean
    public Binding bindEmailFanoutExchange(Queue emailQueue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(emailQueue).to(fanoutExchange);
    }

}
