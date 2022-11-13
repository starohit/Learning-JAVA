package String;

public class MakePalindrome {
    public static void main(String[] args) {
        String str = "Abcb";
        System.out.println(makePalindrome(str));
    }
    public static boolean checkPalindrome(String str){
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
    public static String makePalindrome(String base){
        String pref = "";
        int i = base.length() - 1;
        while (!checkPalindrome(pref + base)){
            pref = pref + base.charAt(i);
            i--;
        }
        return pref + base;
    }
}
