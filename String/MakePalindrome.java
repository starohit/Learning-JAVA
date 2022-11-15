package String;

public class MakePalindrome {
    public static void main(String[] args) {
        String str = "bcba";
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

        return true;
    }
    public static String makePalindrome(String base){
        String pref = "";
        String suff = "";
        int j = 0;
        int i = base.length() - 1;
        while (!checkPalindrome(pref + base)){
            pref = pref + base.charAt(i);
            i--;
        }
        //return pref + base;
        while (!checkPalindrome(base + suff)){
            suff = base.charAt(j) + suff;
            j++;
        }
        //return base + suff;
        if(suff.length()<pref.length()){
            return base + suff;
        }
        return pref + base;
    }
}
