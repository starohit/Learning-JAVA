INHERITANCE

  Inheritance allows classes to inherit attributes and methods of other classes.

    class Animal {

      // field and method of the parent class
      String name;
      public void eat() {
        System.out.println("I can eat");
      }
    }

    // inherit from Animal
    class JerryTheMouse extends Animal {

      // new method in subclass
      public void display() {
        System.out.println("My name is " + name);
      }
    }

    class Main {
      public static void main(String[] args) {

        // create an object of the subclass
        JerryTheMouse labrador = new JerryTheMouse();

        // access field of superclass
        mouse.name = "Jerry, the mouse";
        mouse.display();

        // call method of superclass
        // using object of subclass
        mouse.eat();

      }
    }

ABSTRACTION

    Abstraction is a concept in object-oriented programming that lets you show only essential attributes and hides unnecessary information in your code.

    // Abstract class
    abstract class Animal {
      // Abstract method (does not have a body)
      public abstract void animalSound();
      // Regular method
      public void sleep() {
        System.out.println("Zzzz");
      }
    }

    // Subclass (inherit from Animal)
    class Cow extends Animal {
      public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cow says: Moo");
      }
    }

    class Main {
      public static void main(String[] args) {
        Cow myCow = new Cow(); // Create a Cow object
        myCow.animalSound();
        myCow.sleep();
      }
    }

