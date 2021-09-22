package com.hand.rabbitmqproducer;

import com.hand.designPatterns.FormService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqProducerApplicationTests {

    @Autowired
    private FormService formService;

    @Test
    void contextLoads() {

//        calculateStrategy;
//        BigDecimal bigDecimal = new BigDecimal(100);
//        BigDecimal excute = saleService.excute("vip", bigDecimal);
//        System.out.println(excute);
        formService.excute("qude");
        formService.excute("diaobo");
        formService.excute("lingyong");
    }

}
