package com.hand.designPatternsTest;

import java.math.BigDecimal;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:25 下午
 * @Version 1.0
 */
public interface CalculateStrategy {
    String userLevel();

    BigDecimal discount(BigDecimal originalPrice);
}
