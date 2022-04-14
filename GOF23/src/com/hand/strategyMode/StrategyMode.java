package com.hand.strategyMode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 5:59 下午
 * @Version 1.0
 * @Describtion
 */

public class StrategyMode {

    private Map<String,ApplicationForm> map = new HashMap<>();

    private int count = 0;

    public void submitForm(String formType) throws Exception {
        ApplicationForm applicationForm = map.get(formType);
        try {
            applicationForm.excute();
            count += 2;
        }catch (Exception e){
            System.out.println("异常捕获处理，不影响代码逻辑");
            count =+ 4;
//            throw new Exception();
        }
        System.out.println("出现异常，是否影响后续代码执行。"+count);
    }

    // 初始化类型
    public void init(){
        map.put("lingyong",new LingyongForm());
        map.put("qude",new QudeForm());
        map.put("feiyong",new FeiyongForm());
    }

}
