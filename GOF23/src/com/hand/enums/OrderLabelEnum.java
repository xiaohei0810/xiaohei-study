package com.hand.enums;

import java.util.Arrays;

/**
 * <p>
 * 订单种类枚举
 * </p>
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/27 10:02 上午
 * @Version 1.0
 */
public enum OrderLabelEnum {

    MARKETING_ACTIVITY_ORDER("市场活动单"),
    ORDINARY_ORDER("普通单"),
    DISCOUNT_ORDER("折扣单"),
    BIG_CLIENT_ORDER("大客户单");

    private String name;

    OrderLabelEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        // 输出code、
        System.out.println(OrderLabelEnum.MARKETING_ACTIVITY_ORDER);
        System.out.println(OrderLabelEnum.ORDINARY_ORDER);
        System.out.println(OrderLabelEnum.DISCOUNT_ORDER);
        System.out.println(OrderLabelEnum.BIG_CLIENT_ORDER);

        System.out.println(OrderLabelEnum.MARKETING_ACTIVITY_ORDER.name());
        System.out.println(OrderLabelEnum.MARKETING_ACTIVITY_ORDER);

        // 输出内容
//        System.out.println(OrderLabelEnum.MARKETING_ACTIVITY_ORDER.getName());
//        System.out.println(OrderLabelEnum.ORDINARY_ORDER.getName());
//        System.out.println(OrderLabelEnum.DISCOUNT_ORDER.getName());
//        System.out.println(OrderLabelEnum.BIG_CLIENT_ORDER.getName());

        System.out.println(Arrays.asList(null));
    }
}
