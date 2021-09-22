package com.hand.designPatternsTest;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:28 下午
 * @Version 1.0
 */
@Component
public class VipStrategy implements CalculateStrategy{
    @Override
    public String userLevel() {
        return "vip";
    }

    @Override
    public BigDecimal discount(BigDecimal originalPrice) {
        return originalPrice.multiply(BigDecimal.valueOf(0.8));
    }
}
