import java.util.*;
public class Strings {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }

    
    
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;

    }


    public static String substring(String str, int si, int ei) {
        String substr = " ";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }



    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(" ");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i) ));   // Main line of Convert Uppercase.

            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }



              public static String compress(String str) {
                String newStr = " ";

                for(int i=0; i<str.length(); i++) {
                    Integer count = 1;
                    while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                        count++;
                        i++;
                    }
                    newStr += str.charAt(i);
                    if(count > 1) {
                        newStr += count.toString();
                    }
                }

                return newStr;
              }



    
    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");  
       
       
        // // Strings are IMMUTABLE.
        
        
        
        // Scanner sc = new Scanner(System.in);
        // String name;
        
        
        // name = sc.nextLine(); // here Next= Single Word , NextLine = hole Word.
        // System.out.println(name);

        
        
        // String fullName = "Pradhum Kumar";
       
       
        // System.out.println(fullName.length()); //here .length() = Function. ,,,  SPACE V COUNT HOTA HAI.


       
       
       
        //CONCATENATION :- ADD TWO STRING.

        // String firstName = "Pradhum";
        // String lastName = " Kumar";
        // String fullName = firstName + " " + lastName;
        // // System.out.println(fullName.charAt(0)); // .charAt  is Function count the position.
        

        // printLetters(fullName);

        
        
        
        // String str = "racecar";
        // System.out.println(isPalindrome(str));

              
        
        //STRING COMPARISIONS.
        // String s1 = " Pradhum";
        // String s2 = " Pradhum";
        // String s3 = new String("Pradhum");

        // if(s1 == s2) {
        //     System.out.println("Strings Are Equal");
        // }
        // else {
        //     System.out.println("String Are Not Equal");
        // }
        // if(s1 == s3) {
        //     System.out.println("Strings Are Equal");
        // }
        // else {
        //     System.out.println("String Are Not Equal");
        // }
        // if(s1.equals(s3)) {   //.equals = function
        //     System.out.println("Strings Are Equal");
        // }else {
        //     System.out.println("String Are Not Equal");
        // }


      //SUBSTRING...
        //  String str = "HelloWorld";
        //  System.out.println(substring(str, 0, 5));
     


      // LARGEST STRING..
    //   String fruits[] = {"apple", "mango", "banana"};

    //   String largest = fruits[0];
    //   for(int i=1; i<fruits.length; i++) {
    //     if(largest.compareTo(fruits[i]) < 0) {
    //         largest = fruits[i];

    //     }
    //   }

    //       System.out.println(largest);



    // STRING BUILDER.
        //  StringBuilder sb = new StringBuilder(" ");  // empty initalised.
        //  for(char ch='a'; ch<='z'; ch++) {
        //     sb.append(ch);
        //  }

        //  System.out.println(sb);


        // CONVERT UPPERCASE....
        // String str = "hi i am pradhum";
        // System.out.println(toUpperCase(str));

           //STRING COMPRESSIONS.
               String str = "aaabbcccdd";
               System.out.println(compress(str));


    }
}
