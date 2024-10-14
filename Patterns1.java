public class Patterns1 {
    
    public static void main(String args []) {


        // Print the Pattern.....
        for(int line=1 ; line<=4; line++) {

            for(int star=1; star<=line; star++) {

                System.out.print("*");
            }
            System.out.println();
        }

        // Print The INVERTED-STAR Pattern...
            
        // int n= 4;
        // for(int line=1; line<=n; line++) {
        //     for(int star=1; star=n-line+1; star++) {
        //         System.out.print("*");

        //     } 
        //     System.out.println();
        // }

        // Print HALF-PYRAMID Pattern.......

           //int n =4;
           
        //    for(int line=1; line<=n; line++) {
        //     //numbers print..
        //     for(int number=1; number<=line; number++) {

        //         System.out.print(number);
        //     }
        //     System.out.println();
        //    }

           // Print CHARACTER Pattern........

           int n = 4;
           char ch = 'A';

           for(int line=1; line<=n; line++) {

            for(int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
             System.out.println();
           }

    }
}
