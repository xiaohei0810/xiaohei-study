package com.hand.strategy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/8 5:59 下午
 * @Version 1.0
 * @Describtion
 */
@Service
public class StrategyMode {

    private Map<String, ApplicationForm> map = new HashMap<>();

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

    // 初始化数据，项目启动spring会自动创建对象初始化，所有继承FormStrategy的对象都能拿到
    public StrategyMode(List<ApplicationForm> list){
        list.forEach(t->{
            map.put(t.formType(),t);
        });
        System.out.println("初始化订单类型数据:"+map);
    }

}
