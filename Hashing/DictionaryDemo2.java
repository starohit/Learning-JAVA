package Hashing;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DictionaryDemo2 {
    public static void main(String[] args) {
        Map phoneBook =  new HashMap();

        phoneBook.put("Rohit", "2178");
        phoneBook.put("Aarush", "1298");
        phoneBook.put("Raj", "1877");
        phoneBook.put("Aparna", "2001");
        phoneBook.put("Raj","3452"); //updates Raj number

        System.out.println(phoneBook);
        System.out.println(phoneBook.get("Raj"));
        System.out.println(phoneBook.get("axle"));

        System.out.println(phoneBook.values());
        System.out.println(phoneBook.size());

        phoneBook.remove("Aparna");
        System.out.println(phoneBook);
    }
}
