package oops.polymorphism.overloading;

public class AmbiguityInTypePromotion {
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    public static void main(String[] args){
        AmbiguityInTypePromotion obj=new AmbiguityInTypePromotion();
        obj.sum(20378L,20);//now ambiguity
    }
}
//will through error if I remove L
