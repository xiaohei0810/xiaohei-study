package com.hand.rabbitmqproducer;

import com.hand.designPatterns.FormService;
import com.hand.strategy.StrategyMode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqProducerApplicationTests {

    @Autowired
    private FormService formService;

    @Autowired
    private StrategyMode strategyMode;

    @Test
    void contextLoads() {

//        calculateStrategy;
//        BigDecimal bigDecimal = new BigDecimal(100);
//        BigDecimal excute = saleService.excute("vip", bigDecimal);
//        System.out.println(excute);
//        formService.excute("qude");
//        formService.excute("diaobo");
//        formService.excute("lingyong");
        try {
            strategyMode.submitForm("lingyong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
