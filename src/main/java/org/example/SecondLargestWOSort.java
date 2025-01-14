package org.example;

//GFG
public class SecondLargestWOSort {

    public static void main(String[] args) {
        int[] a = {10,5,10};
        System.out.println(getSecondLargest(a));
    }

    public static int getSecondLargest(int[] arr) {
        int first = arr[0];int second = arr[1];

        for(int i=2;i<arr.length;i++) {
            if(arr[i]>first && arr[i] > second) {
                if(first>second) {
                    second = arr[i];
                } else {
                    first = arr[i];
                }
            } else if(arr[i] > first && arr[i]!=second) {
                first = arr[i];
            } else if(arr[i] > second && arr[i]!=first){
                second = arr[i];
            }
        }

        if(first>second) {
            return second;
        } else if (second > first) {
            return first;
        } else {
            return -1;
        }
    }
}
