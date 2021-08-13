package com.hand.service;

import com.hand.domain.Entity;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaohei
 * @Date 2021/6/29 4:35 下午
 * @Version 1.0
 */
@RestController
public class ProducerService {

    @Autowired
    private AmqpTemplate amqpTemplate;


    /**
     * 参数1: 交换机名称
     * 参数2: 路由key
     * 参数3: fa发送内容， json格式
     */
    @RequestMapping("/sendMessage")
    public String sendMsg(){
        Entity entity = new Entity(1127113014L, "iphone", "1127113014@qq.com");
        amqpTemplate.convertAndSend("/XIAOHEI_EX","",entity);
        return "添加队列成功";
    }

}
