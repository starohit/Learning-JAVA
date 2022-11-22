package oops.polymorphism;

class B1
{
    B1 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class B1");
    }
}


// B2 is the child class of B1
class B2 extends B1
{
    @Override
    B2 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class B2");
    }
}

// B3 is the child class of B2
class B3 extends B2
{
    @Override
    B3 foo()
    {
        return this;
    }

    @Override
    void print()
    {
        System.out.println("Inside the class B3");
    }
}

public class CovariantExample2
{
    // main method
    public static void main(String[] args)
    {
        B1 b1 = new B1();

        b1.foo().print();

        B2 b2 = new B2();

        b2.foo().print();

        B3 b3 = new B3();

        b3.foo().print();

    }
}
