package oops.basics.this_keyword;

public class ProvingThis {
    void m(){
        System.out.println(this);//prints same reference ID
    }
    public static void main(String[] args){
        ProvingThis obj=new ProvingThis();
        System.out.println(obj);//prints the reference ID
        obj.m();
    }
}
