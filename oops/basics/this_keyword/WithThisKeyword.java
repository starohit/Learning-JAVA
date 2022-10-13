package oops.basics.this_keyword;

public class WithThisKeyword {
    int rollno;
    String name;
    float fee;
    WithThisKeyword(int rollno,String name,float fee){
        this.rollno=rollno;                    //better approach
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis2{
    public static void main(String[] args){
        WithThisKeyword s1=new WithThisKeyword(111,"ankit",5000f);
        WithThisKeyword s2=new WithThisKeyword(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
