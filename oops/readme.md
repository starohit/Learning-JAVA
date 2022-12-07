INHERITANCE

  -> Inheritance allows classes to inherit attributes and methods of other classes.
  
  Example:

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

POLYMORPHISM

  Polymorphism refers to the ability of an object to take on many forms. Polymorphism normally occurs when we have many classes that are related to each other by     inheritance.

    class Animal {
      public void animalSound() {
        System.out.println("An animal can make a sound.");
      }
    }

    class Cow extends Animal {
      public void animalSound() {
        System.out.println("A cow says: Moooo");
      }
    }

    class Cat extends Animal {
      public void animalSound() {
        System.out.println("A cat says: Meeooww");
      }
    }

    class Main {
      public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCow = new Cow();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myCow.animalSound();
        myCat.animalSound();
      }
    }
    
  NOTE:
    
    Inheritance and polymorphism are very useful for code reusability. You can reuse the attributes and methods of an existing class when you create a new class.
    
INTERFACE

  

    // create an interface
    interface Language {
      void getName(String name);
    }

    // class implements interface
    class ProgrammingLanguage implements Language {

      // implementation of abstract method
      public void getName(String name) {
        System.out.println("One of my favorite programming languages is: " + name);
      }
    }

    class Main {
      public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
      }
    }
