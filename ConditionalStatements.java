// CONDITIONAL STATEMENTS....
/*
 * 1. If Else
 * 2. Else if
 * 3. Ternary Operator
 * 4. Switch
 */

import java.util.*;
public class ConditionalStatements {
    public static void main(String args[]) {
             //1. if Else...........
        // int age = 22;
        // if(age >= 18){
        //     System.out.println("adult : drive, vote");
        // }
        // else {
        //     System.out.println("not adult");
        // }

            //2. Else if..............
    // int age = 13;

    // if(age >= 18) {
    //     System.out.println("adult");
    // }
      
    // else if (age >= 13  && age < 18) {
    //     System.out.println("teenager");
    // }
    // else {
    //     System.out.println("child");
    // }


            //3. TERNARY OPERATOR..
     /*
      * variable = Condition ? Statement1 : Statement2;
      Eg:- String Type = (5%2 == 0) ? "Even" : "Odd";
      */

    // int number = 4;
    //   String type = ((number % 2) == 0 ) ? "Even" : "Odd";
    //   System.out.println(type);
    //     // code Pass or Not. Checkup......
    //   int marks = 67;
    //   String result = marks >= 33 ? "Pass" : "Fail";
    //   System.out.println(result);

           //4. SWITCH STATEMENT.......
           /*
            * SYNTAX:-  Switch(variable){
            case1 :
            case2 :
            case3 :
            default :
            }
          
          */

        //   int number = 6;
        //   switch(number) {
        //     case 1 : System.out.println("Samosa");
        //     break;
        //     case 2 : System.out.println("burger");
        //     break;
        //     case 3 : System.out.println("Mango Shake");
        //     break;
        //     default : System.out.println("we realize we are dreaming");
        //   }

        // code Calculator...

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("eneter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                       break;
            case '-' : System.out.println(a-b);
                       break;
            case '*' : System.out.println(a*b);
                       break;
            case '/' : System.out.println(a/b);
                       break;
            case '%' :System.out.println(a%b);
                       break;
            default : System.out.println("Wrong Operator");                                                      
        }
    }
}
