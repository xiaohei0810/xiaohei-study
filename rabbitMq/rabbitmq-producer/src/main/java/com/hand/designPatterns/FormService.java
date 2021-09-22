package com.hand.designPatterns;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/9/22 6:09 下午
 * @Version 1.0
 */
@Service
public class FormService {

    private Map<String,ApplicationForm> map = new HashMap<>();

    public FormService(List<FormStrategy> list) {
//        this.map = map;
        list.forEach(t->{
            map.put(t.formType(),t.getForm());
        });
        System.out.println("初始化map：==========="+map);
    }


    public void excute(String formType){
        ApplicationForm applicationForm = map.get(formType);
        applicationForm.excute();
    }


}
