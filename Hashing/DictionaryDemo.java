package Hashing;

import java.util.Hashtable;
import java.util.Dictionary;

public class DictionaryDemo {
    public static void main(String[] args) {
        Dictionary<String,String> phoneBook = new Hashtable<>();

        phoneBook.put("Rohit", "2178");
        phoneBook.put("Aarush", "1298");
        phoneBook.put("Raj", "1877");
        phoneBook.put("Aparna", "2001");
        phoneBook.put("Raj","3452"); //updates Raj number

        System.out.println(phoneBook);
        System.out.println(phoneBook.get("Raj"));
        System.out.println(phoneBook.get("axle"));

        System.out.println(((Hashtable)phoneBook).values());
        System.out.println(phoneBook.size());

        phoneBook.remove("Aparna");
        System.out.println(phoneBook);
    }
}
