package com.hand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xiaohei
 * @Date 2021/6/9 5:06 下午
 * @Version 1.0
 */
public class Test {
    public static class ListUnion {
        static List<Integer> union(List<Integer> a, List<Integer> b) {
            // 在这儿实现
            //
            List<Integer> list = new ArrayList<>();
            b.forEach(t->{
                list.add(t);
            });

            for (int i = 0;i<a.size();i++){
                if (b.indexOf(a.get(i)) == -1){
                    list.add(a.get(i));
                }
            }
            return list;
        }
        public static void main(String[] args) {
            // union([ 2, 1, 3], [ 2, 3, 4]) ==  [1, 2, 3, 4]
            System.out.println(union(Arrays.asList(2,1,3), Arrays.asList(2,3,4)));
        }
    }
}
