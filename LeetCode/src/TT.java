import com.hand.HmallPlanetCouponPoolItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2022/3/7 4:10 下午
 * @Version 1.0
 * @Describtion
 */
public class TT {
    public static void main(String[] args) {
//        BigDecimal bigDecimal = new BigDecimal(0.01);
//        System.out.println(bigDecimal.equals(new BigDecimal(0)));
        List<Integer> list = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int number = rand.nextInt(15) + 1;
//            buffer.append(number);
            list.add(number);
            System.out.println(number);
        }

        System.out.println();
//
//        List<String> o1 = new ArrayList<>();
//        o1.add("1");
//        o1.add("2");
//        o1.add("3");
//        o1.add("4");
//        o1.add("5");
//
//        List<String> o2 = new ArrayList<>();
//        o2.add("1");
//        o2.add("2");
//
//        o1.remove(o2);
//        System.out.println(o1.toString());

//        List<HmallPlanetCouponPoolItems> list = new ArrayList<>();
//        HmallPlanetCouponPoolItems items1 = new HmallPlanetCouponPoolItems();
//        items1.setCode("code1");
//        items1.setWeight(0.32);
//
//        HmallPlanetCouponPoolItems items2 = new HmallPlanetCouponPoolItems();
//        items2.setCode("code2");
//        items2.setWeight(0.64);
//
//        HmallPlanetCouponPoolItems items3 = new HmallPlanetCouponPoolItems();
//        items3.setCode("code3");
//        items3.setWeight(0.04);
//
//        list.add(items1);
//        list.add(items2);
//        list.add(items3);
//        for (int i = 0; i < 30; i++) {
//            String randomNum = getRandomNum(list);
//            System.out.println(randomNum);
//        }
    }


    /**
     * 从一组数据按照概率分布随机取出一个
     * @param nums
     * @return 随机生成的数据的id
     */
    public static String getRandomNum(List<HmallPlanetCouponPoolItems> nums) {

//        //计算总权重
//        for (int i = 0; i < nums.size(); i++) {
//            sumWeight += nums.get(i).getWeight();
//        }
//
//        for (int i = 0; i < nums.size(); i++) {
//            //计算出每个数据所占百分比，保留两位小数
//            percent.add(Double.parseDouble(stringFormat(Arith.div(String.valueOf(nums.get(i).getWeight()),String.valueOf(sumWeight)))));
//        }

        //按照每个数据对应的概率分布，生成100个数据
        List<String> list = new ArrayList<>();
        for (int j = 0; j < nums.size(); j++) {
            for (int i = 0; i < 100 * nums.get(j).getWeight(); i++) {
                list.add(nums.get(j).getCode());
            }
        }

        //产生0-99的整数值,也是list的索引
        int index = (int) (Math.random() * 100);
        //从生成的100个数据中，随机取出
        String couponCode = list.get(index);
        return couponCode;
    }

}
