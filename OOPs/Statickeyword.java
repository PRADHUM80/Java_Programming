/*Static Keyword :- static keyword in java is used to share the same varable or method of a given class.;;
Properties,
Function,
Blocks,
Nested classes,.................

SUPER KEYWORD   :-   super keyword is used to refer immediate parent class object.
-:  to access parent's properties.
-:  to access parent's function.
-:  to access parents  constructor. 

 * 
 */




public class Statickeyword {
    public static void main(String args[]) {
        Students s1 = new Students();
        s1.schoolName = "SIET";

        Students s2 = new Students();
        System.out.println(s2.schoolName);

        Students s3 = new Students();
        s3.schoolName = "KIIT";
    }
}

class Students {
    static int returnPercentage(int math, int phy, int chem) {   // static used for all  student create marks.
        return (math + phy + chem) / 3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name =name;
    }
    String getName() {
       return this.name;
    }
}