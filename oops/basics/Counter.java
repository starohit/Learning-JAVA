package oops.basics;

class Counter{
    int count=0;//will get memory each time when the instance is created
//    static int count=0; //will get memory once only , so it will increase the value of same memory's value

    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args){

        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}  