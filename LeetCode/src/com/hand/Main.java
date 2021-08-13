package com.hand;

public class Main {

    public static void main(String[] args) throws Exception {
	 int [] nums = {1,2,3};
	 int target = 3;
        System.out.println(Solution.twoSum(nums,target));
        int[] ints = Solution.twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) throws Exception {
        int [] arr = new int[nums.length];
        int aa = 0;
        for(int i=0;i<nums.length-1; i++){
            for(int j=i+1;j<nums.length;j++){
                if(target-nums[i] == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new Exception("没有符合条件的数");
    }
}