package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//GFG
public class UnionofArray {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1}; int[] b = {2, 2, 2, 2, 2};
        System.out.println(findUnion(a,b));
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> res = new TreeSet<>();
        for(int aa:a) {
            res.add(aa);
        }
        for(int bb : b){
            res.add(bb);
        }
        return new ArrayList<>(res);
    }
    //Optimal approach
    public static ArrayList<Integer> findUnion_1(int a[], int b[]) {
        List<Integer> res = new ArrayList<>();
        int i=0;int j=0;

        while(i<a.length-1 && j<b.length-1) {
            if(a[i]==a[i+1]) i++;
            if(a[j]==a[j+1]) j++;

            if(a[i]==a[j]) {
                res.add(a[i]);
                i++;j++;
            } else if(a[i] < a[j]) {
                res.add(a[i]);
                i++;
            } else if(a[j] < a[i]) {
                res.add(a[j]);
                j++;
            }
        }

        if(a[i] < a[j]) res.add(a[i]);
        else if(a[j] < a[i]) res.add(a[j]);
        else res.add(a[i]);return null;
    }
}
