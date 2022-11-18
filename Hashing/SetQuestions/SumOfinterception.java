package Hashing.SetQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfinterception {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] a = {3,6,2,8,2,6};
        int[] b = {9,2,6,4,9,3};
        System.out.println(interception(a,b));
    }
    public static int interception(int a[],int b[]){
        Set<Integer> s = new HashSet<>();
        int count=0;
        for(int x: a){
            s.add(x);
        }
        for (int x:b){
            if (s.contains(x)){
                count++;
                s.remove(x);
            }
        }
        return count;
    }
}
