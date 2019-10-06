package org.learn.problems;

public class ReverseNumbers {

    public static void main(String[] args) {

        System.out.println(reverse(-123));

    }

    public static int reverse(int num){
        int temp=0;
System.out.println(Integer.MAX_VALUE+"   "+Integer.MIN_VALUE);
        while(num!=0){
        int pop = num %10;
        num/=10;
        temp = temp *10+pop;}

        return  temp;
    }
}
