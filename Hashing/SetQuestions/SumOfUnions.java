package Hashing.SetQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfUnions {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] a = {3,6,2,8,2,6};
        int[] b = {9,2,6,4,9};
        System.out.println(union(a,b));
    }
    public static int union(int[] a,int[] b){
        Set<Integer> s = new HashSet<>();
        for (int x:a) {
            s.add(x);
        }
        for (int x:b) {
            s.add(x);
        }
        return s.size();
    }
}
