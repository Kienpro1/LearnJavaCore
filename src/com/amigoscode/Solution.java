package com.amigoscode;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target &&(i!=j)){

                    newArr[0]=i;
                    newArr[1]=j;

                }
            }
        }
        return newArr;
    }


    public static void main(String[] args) {

        int[] nums={3,2,4};

        int target=6;
        int[] arr = Solution.twoSum(nums, target);
        System.out.println( Arrays.toString(arr));
    }

}