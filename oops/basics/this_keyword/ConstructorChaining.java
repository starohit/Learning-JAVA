package oops.basics.this_keyword;

public class ConstructorChaining {
    int rollno;
    String name,course;
    float fee;
    ConstructorChaining(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    ConstructorChaining(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
    public static void main(String[] args){
        ConstructorChaining s1=new ConstructorChaining(111,"ankit","java");
        ConstructorChaining s2=new ConstructorChaining(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }
}
