/*LOOPS.../**
 * 3 TYPES OF LOOPS IN (JAVA)..
 * 1.  While Loop
 * 2.  For Loop
 * 3.  Do While Loop
 */

import java.util.*;
public class Loops {
    public static void main(String args[]) {

    //1. While Loop .
        //Syntax:-     while(Condition) {
                       // Do Somethings......
                    //}

    // int counter = 0;
    // while (counter <10) {
    //     System.out.println("Hello World");
    //     counter ++;
    // }     
      //print 1 to 10
    // int counter = 1;
    // while(counter <= 10) {
    //     System.out.println(counter);
    //     counter ++ ;
    // }   

         //print number from 1 to n by user...

        // Scanner sc = new Scanner (System.in);
        // int range = sc.nextInt();
        // int counter = 1;

        //   while (counter <= range) {
        //     System.out.println(counter );
        //     counter ++;
        //   }

                //Print Sum of 1st n Natural Number........
    
                // Scanner sc = new Scanner (System.in);
                // int n = sc.nextInt();
                // int sum = 0;


                // int i=1;
                // while(i <= n) {
                //     sum += i;
                //     i++;

                // }   
                // System.out.println("Sum is : "+ sum);             

    

    /* 2. FOR LOOP..
         * SYNTAX:-  for(initialisation; condition; updation){
         * Do somethings..
         * }
         */

         //int i = 1;  .... yha nhe likhne se v chlega..
        //  for(int i=1; i<=10; i++) {
        //      System.out.println("Hello World");
        //  }

                        //Q.  Print Square Pattern....
            //    for(int line = 1; line<=4; line++) {
            //     System.out.println("****");
            //    }

                            //Q. Print Reverse of a Number....
                                //    int n = 10899;

                                //    while (n > 0) {
                                //     int lastDigit = n % 10;
                                //     System.out.print(lastDigit + " ");
                                //     n= n/10;
                                    
                                //    }
                                //    System.out.println();
                                    
                                         //Q.  Reverse The Given Number...
                                                int n = 10899;
                                                int rev = 0;

                                                while(n > 0) {
                                                    int lastDigit = n % 10 ;
                                                    rev = (rev * 10) + lastDigit;
                                                    n = n/10;

                                                }
                                                System.out.println(rev);

    //3. do-while Loop..
    /*
     * SYNTAX:-   do {
     * .....Do Somthings.
     * } while(condition);
     */
    
     int counter = 1;
     do {
         System.out.println("Hello World");
         counter ++;
     } while(counter <= 10);
                
                   //Q. Prime number or Not.....
                     
    }
}
