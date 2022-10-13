package oops.basics.this_keyword;

public class WithoutThis {
    int rollno;
    String name;
    float fee;
    WithoutThis(int r,String n,float f){
        rollno=r;
        name=n;
        fee=f;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis3{
    public static void main(String[] args){
        WithoutThis s1=new WithoutThis(111,"ankit",5000f);
        WithoutThis s2=new WithoutThis(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
