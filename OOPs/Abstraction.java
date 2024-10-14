/*ABSTRACTION :-  Hiding All The Unnecessary Details And Showing Only The Important Parts to the User.
 * ABSTRACT Class :- 
 * Cannot Create Create An Instance of Abstract Class.
 * Can have abstraction / non abstraction Methods
 * can have construction.
 */




public class Abstraction {
    public static void main(String args[]) {
      Horse h = new Horse();
      h.eat();
      h.walk();

      Chicken c = new Chicken();
      c.eat();
      c.walk();
    }
}
abstract class Animalss {
    void eat() {
    System.out.println("animal Eats");
    }
abstract void walk();

}

class Horse extends Animalss {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animalss {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}