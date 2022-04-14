package com.hand.strategyMode;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 5:54 下午
 * @Version 1.0
 * @Describtion 申请单接口
 */
public interface ApplicationForm {

    /**
     *     不同申请单执行不同的逻辑
     */
    public void excute();


    /**
     * 获取申请单类型
     * @return
     */
    public String formType();

}
