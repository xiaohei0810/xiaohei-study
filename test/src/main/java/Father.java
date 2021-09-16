import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/8/13 6:51 下午
 * @Version 1.0
 */
public class Father {
    public static void main(String[] args) {
//        for (int i = 1; i < 200; ++i) {
//            int as = i;
//            System.out.println(i);
//        }
//        List<Map<String, String>> list = new ArrayList();
//
//
//        Map<String, String> map = new LinkedHashMap();
//        map.put("prize_name","电子券");
//        map.put("code","eek");
//
//        Map<String, String> map2 = new LinkedHashMap();
//
//        map2.put("12","电子券");
//        map2.put("13","eek");
//        list.add(map);
//        list.add(map2);
//
//        String key = list.get(0).keySet().iterator().next();
//
//        System.out.println(list.size());
//        System.out.println(key);
////
//        for (int i=0; i<list.size(); ++i){
//            System.out.println(list.get(i).get(key));
//        }
//        List<Map<String, String>> list = new ArrayList();
//
//        Map<String, String> map1 = new LinkedHashMap();
//        map1.put("券","券");
//        map1.put("code","eek");
//        list.add(map1);
//
//        Map<String, String> map2 = new LinkedHashMap();
//
//        map2.put("券","券");
//        map2.put("code","eek");
//        list.add(map2);
//
//        Map<String, String> map3 = new LinkedHashMap();
//        map3.put("券","券");
//        map3.put("code","eek");
//        list.add(map3);
//
//        System.out.println(list.get(0).keySet().iterator().next());
//        System.out.println(list);

//        String sha1 = Sha1Util.getSha1("124214a1");
//        System.out.println(sha1);

//        JSONArray queryOptions2 = new JSONArray();
//        queryOptions2.add("refund_detail_item_list");
//
//        JSONObject bizContent = new JSONObject();
//        bizContent.put("trade_no", "2021081722001419121412730660");
//        bizContent.put("refund_amount", 0.01);
//        bizContent.put("out_request_no", "HZ01RF001");
//
//
//
//        //// 返回参数选项，按需传入
//        JSONArray queryOptions = new JSONArray();
//        queryOptions.add("refund_detail_item_list");
//        bizContent.put("query_options", queryOptions);
//
//        String test = "{" +
//                "\"out_trade_no\":\"" + "122323" + "\"," +
//                "\"refund_amount\":\"" + "232323" + "\"," +
//                "\"out_request_no\":\"" + "2323232323" + "\"," +
//                "\"query_options\":"+ queryOptions2+
//                "}";
//
//        String s = queryOptions.toString();
//        System.out.println(s);
//        System.out.println(bizContent.toString());
//        System.out.println(test);


//        JSONObject bizContent = new JSONObject();
//        bizContent.put("out_trade_no", "12313");
//        bizContent.put("refund_amount", "12312312");
//        bizContent.put("out_request_no", "1241241241");
//
//        // 返回参数选项，需要返回单笔退款的金额
//        JSONArray queryOptions = new JSONArray();
//        queryOptions.add("refund_detail_item_list");
//        bizContent.put("query_options",queryOptions);
//
//        System.out.println(bizContent.toString());

        int year = DateUtil.year(new Date());
        System.out.println(year);
    }
}
