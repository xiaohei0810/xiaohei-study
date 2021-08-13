package com.hand.service;

import com.hand.domain.Entity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author xiaohei
 * @Date 2021/6/30 11:03 上午
 * @Version 1.0
 */
@Component
@Slf4j
@RabbitListener(queues = "FANOUT_EMAIL_QUEUE")
public class FanoutEmailConsumer {

    @RabbitHandler
    public void process(Entity entity){
        log.info("email:消费邮件信息"+entity);
    }

}
