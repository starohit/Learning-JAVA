import java.util.Hashtable;
import java.util.Scanner;

public class MyDictionary {
    public static void main(String[] args) {
        Hashtable<String, String> Meanings = new Hashtable<String, String>();

        Meanings.put("Abstraction"," The process of hiding characteristics from something in order to reduce it to essential characteristics");
        Meanings.put("Interface", " A blueprint used to specify behaviour of a class");
        Meanings.put("polymorphism","  quality of existing in different forms");

        System.out.println("\n" + Meanings);

        System.out.println("\n"+Meanings.get("Interface"));

        }
}

