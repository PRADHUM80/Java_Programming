import java.util.*;
public class Assisgnment2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        //Average Of 3 Number...
        //int A = sc.nextInt();
        //int B = sc.nextInt();
       // int C = sc.nextInt();
        //int average = (A+B+C) / 3 ;
        //System.out.println("average is: "+average);


        //Area Of A Square..
        //int side = sc.nextInt();
        //int area = side * side;
        //System.out.println("area of square : "+ area);
       

        //Bill Of Items With GST...
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser ;
        System.out.println("Bill is : "+total);

          // Add on with 18% GST..
          float newtoal = total + (0.18f * total);
          System.out.println("Bill with 18% GST : "+ newtoal);

    }
}
