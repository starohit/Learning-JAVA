package oops.basics.this_keyword;

public class CallingMethodUsingThis {
    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
                                            //m();//same as this.m()  compiler will convert it to ->this.m();
        this.m();
    }
}
class TestThis4{
    public static void main(String[] args){
        CallingMethodUsingThis a=new CallingMethodUsingThis();
        a.n();
    }
}
