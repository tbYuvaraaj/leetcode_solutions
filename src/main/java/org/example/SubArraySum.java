package org.example;

import java.util.HashMap;

//Subarray Sum Equals K
//Problem 560
public class SubArraySum {

    public static void main(String[] args) {
        int a[]={1,1,1};
        System.out.println(subarraySums(a,2));
    }

    // Brute force approach
    public static int subarraySum(int[] nums, int k) {
        int arrayCount=0;

        for(int i=0;i< nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++) {
                sum = sum+nums[j];

                if(k==sum) {
                    arrayCount++;
                }
            }
        }
        return arrayCount;
    }

    // Optimal approach using hashmap
    // identify the subarray which is having total-k
    public static int subarraySums(int[] nums, int k) {
        HashMap<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);
        int total = 0, count = 0;

        for (int n : nums) {
            total += n;

            if (subNum.containsKey(total - k)) {
                count += subNum.get(total - k);
            }

            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
        }

        return count;
    }
}
