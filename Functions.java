/*Function:- Block of Code . or Reusable
 * SYNTAX:- returnType name() {
 * body...
 * return statement;
 * }
 * 
 * SYNTAX WITH PARAMETES......
 * returnTypename (type param1, type param2) {
 * Body..........
 * return statement;
 * }
 */

import java.util.*;
public class Functions {



                      //Without   Parameter passs code.....
    //  public static void printHelloWorld() {
    //     System.out.println("Hello World"); // here print 3 times of hello World then type 3times SYSO print Hello World..
    //  }
    
    //  public static void main(String[] args) {
    //     printHelloWorld();  //get print how many times are print out..
    //  }


                    // With Parameters Code .....

// public static int calculateSum(int num1, int num2) { //parameters or formal parameters.

//     int sum = num1 + num2;
//     return sum;
    //these are Function.
    
//}
    //public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //    int sum = calculateSum (a, b);  // Arguments or Actual Parameters.,,,,,,,,,,, .  *function is pass in the pranthisis .  
    //     System.out.println("Sum is : " + sum);
    //}
 

                   // Product of A And B..

    // public static int multiply(int a, int b) {
    //   int Product = a * b;
    //   return Product;
    // }
    
    // public static void main(String[] args) {
    //    int a = 3;
    //    int b = 5;
    //    int prod = multiply(a, b);
    //    System.out.println("a * b = :  "+ prod);
    // }
          
                    // FACTORIAL OF NUMBBER...

                    // public static int factorial(int n) {
                    //     int f = 1;

                    //     for(int i=1; i<=n; i++) {
                    //         f = f * i;
                    //     }
                    //     return f;  //Factorial of  n.
                    
                    // }
                    // public static void main(String[] args) {
                    //     System.out.println(factorial(4));
                    // }


                                 //BINOMIAL COEFFICCIENT....................
                                        // public static int binomialCoefficient (int n, int  r) {
                                        //     int fact_n = factorial (n);
                                        //     int fact_r = factorial (r);
                                        //     int fact_nmr = factorial (n-r);

                                        //     int binomialCoefficient = fact_n / (fact_r * fact_nmr);
                                        //     return binomialCoefficient;
                                        // }  
                                        //   public static void main(String[] args) {
                                        //     System.out.println(binomialCoefficient(5, 2));
                                        //   }
                                        //                     // Not Run.......

                //Functon OverLoading  Using Parameters.........
                
                
                            // Func to Calc sum of 2 nums..
                // public static int sum (int a, int b) {
                //     return a + b;
                // }

                //             // Func to calc sum of 3 nums.....
                //             public static int sum(int a, int b, int c) {
                //                 return a+b+c;
                //             }
                         



                //func to calc int Sum...
                // public static int sum(int a, int b) {
                //     return a+b;
                // }
                // // Func to calc Float Sum....
                // public static float sum(float a, float b) {
                //     return a+b;
                // }
                //             public static void main(String args []) {
                //                 System.out.println(sum(3, 5));
                //                 System.out.println(sum(5.5f,  9.5f));
                //             }



                // Check Prime Or Not....
                    // public static boolean isPrime(int n) {
                    //     boolean isPrime = true ;
                    //     for(int i=2; i<=n-1; i++) {
                    //         if(n%i==0) {    //completely dividng.
                    //             isPrime = false;
                    //         }
                    //     }
                    //     return isPrime;
                    // }
                    // public static void main(String[] args) {
                    //     System.out.println(isPrime(12));
                    // }


                                    //   // Prime is Optimized.......
                                    //   public static boolean isPrime(int n) {
                                    //     if(n== 2) {
                                    //         return true;
                                    //     }
                                    //     for(int i=2; i<=Math.sqrt(n); i++) {
                                    //         if(n % i == 0) {
                                    //             return false;
                                    //         }
                                    //     }
                                    //     return true;
                                    //   }

                                    //   //public static void main(String[] args) {
                                    //     //System.out.println(isPrime(47));
                                    //  // }


                                    //             // Print all Primes in a Range...    is Prime is upper wala code ..
                                    //             public static void primesInRange( int n) {
                                    //                 for(int i=2; i<=n; i++) {
                                    //                     if(isPrime(i)) { // true
                                    //                         System.out.print(i + "   ");
                                    //                     }
                                    //                 }
                                    //                 System.out.println();
                                    //             }

                                                // public static void main(String[] args) {
                                                //     primesInRange(20);  // 2 to 20.
                                                // }




                                                           //Convert From Binay To Decimal....
                                                        //    public static void binToDec(int binNum) {
                                                        //         int myNum = binNum;
                                                        //         int pow = 0;
                                                        //         int decNum = 0;

                                                        //         while(binNum > 0) {
                                                        //             int lastigit = binNum % 10;
                                                        //             decNum = decNum + (lastigit * (int)Math.pow(2,pow));

                                                        //             pow++;
                                                        //             binNum = binNum / 10;
                                                        //         }

                                                        //         System.out.println("decimal of " + myNum  +"  = " + decNum);
                                                        //    }
                                                        //            public static void main(String[] args) {
                                                        //             binToDec(100001);
                                                        //            }



                                                                            //CODE > DECIMAL TO BINARY........

                                                        // public static void decToBin(int n) {
                                                        //     int myNum = n;
                                                        //     int pow = 0;
                                                        //     int binNum = 0;

                                                        //     while(n > 0) {
                                                        //         int rem = n % 2;
                                                        //         binNum = binNum + (rem * (int)Math.pow(10, pow));
                                                        //         pow++;
                                                        //         n = n/2;
                                                        //     }
                                                        //     System.out.println("binary form of " + myNum + " = "+ binNum);
                                                        // }
                                                        // public static void main(String[] args) {
                                                        //     decToBin(15);
                                                        // }


                                                    /* Scope..
                                                     * two types : 1. Method Scope.
                                                     * 2. Block Scope.
                                                     * 3. Class Scope.
                                                     */

}




       