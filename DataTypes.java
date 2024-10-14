public class DataTypes {
    public static void main(String args[]) {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = false;
        
        int number = 25;
        //long
        //double
        //float
        short n = 240;
    }
}
/*
 * DATA TYPES IN JAVA ....
 * 1. Primitive Data Type.
 * 2. Non Primitive Data Type.
 * PRIMITIVE DATA TYPE:-
 * BYTE = (-128 to 128) 1byte
 * SHORT = 2byte [        ]
 * CHAR =2 bytes ['a' To 'z' '@' '%']
 * BOOLEAN = 1 bytes,  (TRUE OR FALSE)
 * INT = 4bytes,   (-2B TO 2B)
 * LONG = 8 bytes, 
 * FLOAT = 4bytes
 * DOUBLE = 8bytes
 * 
 * NON PRIMITIVE DATA TYPE:-
 * STRING,
 * ARRAY, 
 * CLASS, 
   OBJECT, 
   INTERFACE.   ETC
 * 
 */

  /*TYPE CONVERSION
       Types COnversion When :-
        * A.) Type Compatible.
         B.)Destination Type > Source Type.


         Byte -> Short -> Int -> Float -> Long -> Double
        */


        /*TYPE CASTING...
         * int marks = (int)(99.99f)
         */


         /*TYPE PROMOTION IN EXPRESSIONS.......
          * 1. Java Automatically Promotes Each Byte,Short,or Char Operand to int When Evaluating An Expression.
            2. If One Operand Is Long, Float, Or Double The Whole Expression Is Promoted To Long, Float, Or Double Respectively.
          */