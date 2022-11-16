package Hashing;

import java.util.HashSet;

public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(4);
        s.add(6);
        System.out.println(s);
        if (s.contains(10)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
        s.remove(6);
        System.out.println(s);
        s.isEmpty();
        s.size();
        s.clear();
        System.out.println(s);
    }
}
