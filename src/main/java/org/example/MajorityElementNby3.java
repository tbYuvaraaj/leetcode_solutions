package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Problem - 229
// Extended Moore's voting algorithm
public class MajorityElementNby3 {

    public static void main(String[] args) {
        int a[] = {2, 1, 1, 3, 1, 4, 5, 6};
        System.out.println(majorityElement(a));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int first= Integer.MIN_VALUE; int second = Integer.MAX_VALUE;
        int count1=0;int count2=0;
        for(int i=0;i<nums.length;i++) {
            if(count1==0 && second!=nums[i]) {
                first= nums[i];
                count1++;
            } else if(count2==0 && first!=nums[i]) {
                second= nums[i];count2++;
            } else if(nums[i] == first) {
                count1++;
            } else if(nums[i] == second) {
                count2++;
            } else {count1--;count2--;}
        }

        // Find the occurences of first and second value
        count1=0;count2 =0;
        for(int j=0;j<nums.length;j++) {
            if(first == nums[j]) {
                count1++;
            } else if(second == nums[j]) {
                count2++;
            }
        }

        // Check for final result
        if(count1> nums.length/3 && count2> nums.length/3) {
            return Arrays.asList(first,second);
        } else if(count1>nums.length/3) {
            return Arrays.asList(first);
        } else if(count2>nums.length/3) {
            return Arrays.asList(second);
        } return new ArrayList();
    }
}
