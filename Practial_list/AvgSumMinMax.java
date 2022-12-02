package Practial_list;

import java.util.Scanner;

public class AvgSumMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int a=0,min=0,max=0,x;
        int n= args.length;
        System.out.println("1-sum");
        System.out.println("2-average");
        System.out.println("3-minimum");
        System.out.println("4-maximum");
        System.out.println("enter your choice:");
        choice=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a+=Integer.parseInt(args[i]);
        }
        switch (choice){
            case 1:
                System.out.println("The sum is :"+a);
                break;
            case 2:
                System.out.println("the average is :" +a/n);
                break;
            case 3:
                for (int i = 0; i < n-1; i++) {
                    x = Integer.parseInt(args[i]);
                    if(x<Integer.parseInt(args[i+1]))
                        min = x;
                    else
                        min = Integer.parseInt(args[i+1]);
                }
                System.out.println("The minimum is :" +min);
                break;
            case 4:
                for (int i = 0; i < n-1; i++) {
                    x = Integer.parseInt(args[i]);
                    if (x>Integer.parseInt(args[i+1]))
                        max = x;
                    else
                        x=Integer.parseInt(args[i+1]);
                }
                System.out.println("The maximum is :" +max);
                break;

        }
    }
}
