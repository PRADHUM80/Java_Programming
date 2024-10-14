/* INHERITANCE :- inheritance is when properties and method of base class are passed on to a derived class.
 * TYPES :- 4.
 * 1. SINGLE LEVEL INHERITANCE.
 * 2. MULTI LEVEL INHERITANCE.
 * 3. HIERACHIAL INHERITANCE.
 * 4. HYBRID INHERITANCE.
 */

public class Inheritance {
    public static void main(String args[]) {
       Fish shark = new Fish();
       shark.eat();

       Dog dobby = new Dog();
       dobby.eat();
       dobby.legs = 4;
       System.out.println(dobby.legs);


    }
}

// Base Class.
 class Animal {
    String color;
    void  eat() {
        System.out.println("eats");
    }

    void breathe() {
       System.out.println("breathes");
    }
 }
        // MULTI LEVEL INHERITENCE .
        class Mammal extends Animal {
            int legs;
        }
        class Dog extends Mammal {
            String breed;
        }
 // Derived Class.

       class Fish extends Animal {
       int fins;

      void swim() {
        System.out.println("swims in water");     }
 }