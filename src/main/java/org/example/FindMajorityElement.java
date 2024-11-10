package org.example;

//Problem - 169
public class FindMajorityElement {
    // Moore's voting algorithm
    public static void main(String[] args) {
        int a[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] a) {
        int result = a[0]; int count=1;
        for(int i=1;i<a.length;i++) {

            if(count==0) {
                result = a[i];
            }

            if(result == a[i]) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }
}
