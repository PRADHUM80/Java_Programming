/*GETTERS AND SETTERS..
 * Get :- to return the value.
 * Set :- to modify the value.
 * 
 * this :-  this Keyword is used to refers to current object.
 */

public class GettersSetters {
    
    public static void main(String args[]) {
        Pencil p1 = new Pencil();  
        p1.setColor("blue");  
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}
class Pencil {
    private String color;
    private int tip;
          
            //getters.
     String getColor() {
       return this.color;
     }
      
     int getTip() {
        return this.tip;
     }

               // setters
     void setColor(String newColor) {
        this.color = newColor;
     }

     void setTip(int newTip) {
        this.tip = newTip;
     }
}