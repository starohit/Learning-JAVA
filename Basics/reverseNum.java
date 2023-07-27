import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int rev=0;
    
        while(number!=0){
            int left = number%10;
            rev = (rev*=10)+left;
            number/=10;
        }
        System.out.print(rev);
    }
}
