/*CONSTRUCTORS :-  Constructors is a special method which is invoked automatically at the time of object creation.
 * =>  Constructors have the same name as class or structure.
 * =>  Constructors dont have a return type. (Not even void).
 * =>  Constructors are only called Once, at Object Creation.
 * =>  Memory allocation happens when constructor is called.
 * TYPES :- 1. NON-PARAMETERIZED.
 *          2. PARAMETERIZED.
 *          3. COPY CONSTRUCTOR.
 */


public class Constructors {

    public static void main(String args[]) {
        // Student s1 = new Student("Pradhum"); // passing the value of constructor.
        // System.out.println(s1.name);

        // fortype.
        // Student s1 = new Student();
        // Student s2  = new Student("pradhum");
        // Student s3 = new Student(123);
        // Student s4 = new Student("Pradhum ", 46); // Errors bcz constructor doesnot access.
           // Copy type.

           Student s1 = new Student();
           s1.name = "Pradhum";
           s1.roll = 46;
           s1.password = "abcd";

           Student s2 = new Student(s1);
           s2.password = "abcd";
    }
}
 
 class Student {
    String name;
    int roll;
    String password;
      // Copy Constructors.
      Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        
      }

     // Parameterised Constructors.
    Student(String name) {  // Constructor.
      this.name = name;
    }

    // Non Prameterized.
    
     Student() {
     System.out.println("Constructor is called ...");
      }


      Student(int roll) {
        this.roll = roll;
      }
     
 }