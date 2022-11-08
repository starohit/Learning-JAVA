import java.util.Arrays;
import java.util.Hashtable;

public class MultiValueDict {
    public static void main(String[] args) {
        Hashtable<String,String[]> MyDict = new Hashtable<String,String[]>();

        MyDict.put("Greet", new String[]{"Hey", "hello", "namaste"});
        MyDict.put("Animals", new String[]{"lion", "tiger", "cat"});

        System.out.println("Greeting ways:" + Arrays.toString(MyDict.get("Greet")));
    }
    //get meaning method
}
