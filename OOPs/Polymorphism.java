/*Polymorphism :- poly   Means   Many and  Morphism Means  Forms.
 * 1. Compile TimePolymorphism .   (Method OverLoading.)
 * 2. Run TimePolymorphism.   (Method Overriding.)
 * 
 * METHOD OVERLOADING :-   Multiple Function With The Same Name But Different Parameters. 
 * METHOD OVERRIDING :-   Parent  & Child Classes Both Contain The Same Function with a Different Definition. 
 */

public class Polymorphism {
    public static void main(String args[]) {
// Method Overloading

        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.2,(float) 2.5));
        System.out.println(calc.sum(1, 2, 3));

// Method Overloading
       
        Deer d = new Deer();
        d.eat();



    }
}

// Method Overloading

class Calculator  {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;

    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}


// Method Overloading


class Animals {
    void eat() {
        System.out.println("etas anythings");
    }
}
class Deer extends Animals {
    void eat() {
        System.out.println("eats grass");
    }
}