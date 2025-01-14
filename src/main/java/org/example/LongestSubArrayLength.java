package org.example;

import java.util.HashMap;

public class LongestSubArrayLength {
    public static void main(String[] args) {
        int a[] = {94,-33,-13,40,-82,94,-33,-13,40,-82};
        System.out.println(longestSubarray(a,52));
    }

    public static int longestSubarray(int[] arr, int k) {
        int total=0; int length=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            total = total+arr[i];

            if(!map.containsKey(total)) {
            map.put(total,i);}

            if(total == k) {
                length = Math.max(length,i)+1;
            } else if(map.containsKey(total-k)) {
                length = Math.max(length,i- map.get(total-k));
            }
        }
        return length;
    }
}
