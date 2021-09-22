package com.hand.designPatternsTest;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:29 下午
 * @Version 1.0
 */
@Service
public class SaleService {

    Map<String,CalculateStrategy> map = new HashMap<>();

    public SaleService(List<CalculateStrategy> list) {
        list.forEach(t->{
            map.put(t.userLevel(),t);
        });
        System.out.println("初始化map:----------------------"+map);
    }

    public BigDecimal excute(String key,BigDecimal price){
        CalculateStrategy calculateStrategy = map.get(key);
        return calculateStrategy.discount(price);
//        System.out.println(discount);
    }

}
