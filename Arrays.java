/*Array:-  List of Elements Of The Same Type , Placed in a Contiguous Memory location.
EX:-  int = 1,2,3,4,
      string = "apple", "mango","pradhum"..
      
      int = 4 byte
      ch = 1 byte 

      array is (0 Based indexing.....)
      .


      Operations in array.
       1. Create.
       2. Input.
       3. Output.
       4. Update.


    
 */


         // 1.    Creating in array.
         // Syntax :-  dataType   arrayName [] = new dataTYpe [size].


import java.util.*;

public class Arrays {
    // Call By Value....
    // public static void Update(int marks[]) {   
    //     for(int i= 0; i<marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }
    // public static void main (String args[]) {
    //     int marks [] = {97, 98 ,99 };
    //     Update(marks);

    //     //print our marks.
    //     for(int i=0; i<marks.length ; i++) {
    //         System.out.println(marks[i] + " ");
    //     }
    //     System.out.println();
    // }

             // Linear Search....
            //  public static int LinearSearch(int numbers[], int key) {
            //     for(int i=0; i<numbers.length; i++) {
            //         if(numbers[i] == key) {
            //             return i;
            //         }
                    
            //     }
            //     return -1;
            //  }
            //  public static void main(String[] args) {
            //     int numbers[] = {2,4,6,8,10,12,14,16};

            //     int key = 10;
            //     int index = LinearSearch(numbers, key);
            //     if(index == -1) {
            //         System.out.println("not found");
            //     } else {
            //        System.out.println("key is at index : " + index); 
            //     }
            //  }
                     // Largest Number in Array....
                    //  public static int LargestNumber(int numbers[]) {
                    //     int largest= Integer.MIN_VALUE; // largest
                    //     int smallest = Integer.MAX_VALUE;

                    //     for(int i=0; i<numbers.length; i++) {
                    //         if(largest < numbers[i]) {
                    //             largest = numbers[i];
                    //         }
                    //         if(smallest > numbers[i]) {
                    //             smallest = numbers[i];
                    //         }
                    //     }
                    //     System.out.println("smallest value is : " + smallest);
                    //     return largest;
                    //  }
                    //  public static void main(String[] args) {
                    //     int numbers[] = {1, 2, 6, 3, 5};
                    //     System.out.println("largest value is : " + LargestNumber(numbers));
                    //  }
                            
                               // Binary Search......
                               /*Pseudo Code :-    1. Start = 0, End = n-1.   2. while(start <= End).  3.find Mid= (start + End)/2.
                                * 4. Compare Mid & Key.   5. Mid == key => Found, Mid > key => Left,  Mid < key => Right.
                                 */
                                 
                                //  public static int BinarySearch(int numbers[], int key) {
                                //     int start= 0 , end = numbers.length -1;
                                     
                                //     while(start <= end) {
                                //         int mid = (start + end) / 2;
                                //             //comparision
                                //         if(numbers[mid] == key) { //found
                                //             return mid;
                                //         }
                                //         if(numbers[mid] < key) { //right
                                //             start = mid+1;
                                //         } else {  //left
                                //             end = mid - 1;
                                //         }
                                //     }
                                //     return -1;
                                //  }
                                //  public static void main(String[] args) {
                                //     int numbers[] = {2, 4, 6, 8, 10, 12, 14};
                                //     int key = 14;

                                //     System.out.println("index for key is : " + BinarySearch(numbers, key));
                                //  }

                                        // Reverse An Array........
                                        // public static void Reverse(int numbers[]) {
                                        //     int first = 0, last = numbers.length - 1;
                                        //     while(first < last) {
                                        //         int temp = numbers[last];
                                        //         numbers[last]= numbers[first];
                                        //         numbers[first] = temp;
                                        //         first++;
                                        //         last--;
                                        //     }
                                        // }
                                        // public static void main(String[] args) {
                                        //     int numbers[] = {2, 4, 6, 8, 10};
                                        //     Reverse(numbers);

                                        // // print..
                                        //     for(int i=0; i<numbers.length; i++) {
                                        //         System.out.print(numbers[i] + " ");
                                        //     }
                                        //     System.out.println();
                                        // }
                                              
                                              //Pairs in Array.......
                                            //   public static void Pairs(int numbers[]) {
                                            //     int tp = 0;
                                            //     for(int i=0; i<numbers.length; i++) {
                                                   
                                            //         int curr = numbers[i]; //2,4,6,8,10
                                            //         for(int j=i+1; j<numbers.length; j++) {
                                            //             System.out.print("(" + curr + ","+ numbers[j] +") ");
                                            //             tp++;
                                            //         }
                                            //         System.out.println();
                                            //     }
                                            //     System.out.println("total pairs = " + tp);
                                            //   }
                                            //   public static void main(String[] args) {
                                            //     int numbers[] = {2, 4, 6, 8, 10};
                                            //     Pairs(numbers);
                                            //   }

                                                   // Print SubArrays....

                                                //    public static void printSubarrays(int numbers[]) {
                                                //       for(int i=0; i<numbers.length; i++) {
                                                //             int start = i;
                                                //             for(int j=i; j<numbers.length; j++) {
                                                //                   int end = j;
                                                //                   for(int k=start; k<=end; k++) { //Print.
                                                //                         System.out.println(numbers[k]+ "  "); //Subarry
                                                //                   }
                                                //                   System.out.println();
                                                //             }
                                                //             System.out.println();
                                                //       }
                                                //    }
                                                //    public static void main(String[] args) {
                                                //     int numbers[] = {2, 4, 6, 8, 10};
                                                //     printSubarrays(numbers);
                                                //    }



}
