package Hashing.SetQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountDistincts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int[] arra = new int[n];
        System.out.println("enter the elements");
        for (int i = 0 ; i < n ; i++) {
            arra[i] = sc.nextInt();
        }
        System.out.println(CountDistinct(arra));
    }

    public static int CountDistinct(int a[]){
        Set<Integer> s = new HashSet<>();
        for (int element: a) {
            s.add(element);
        }
        return s.size();
    }
}
