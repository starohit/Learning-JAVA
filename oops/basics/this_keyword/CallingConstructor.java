package oops.basics.this_keyword;

public class CallingConstructor {
    CallingConstructor(){System.out.println("hello a");}
    CallingConstructor(int x){                                   //In this we are calling default constructor from parameterized,
        this();                                                         //we can also do vise-versa
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String[] args){
        CallingConstructor a=new CallingConstructor(10);
    }
}
