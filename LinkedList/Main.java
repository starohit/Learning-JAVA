package LinkedList;

import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Brian");
        names.add("June");
        System.out.println(names); // This will output [Brian, June]
        names.add(2,"kolo");
        System.out.println(names);
        names.addFirst("Rohit");
        System.out.println(names);
        names.addLast("Axle");
        System.out.println(names);
        names.remove("kolo");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
        names.set(0,"Nighteye");
        System.out.println(names);

        //iterating

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}