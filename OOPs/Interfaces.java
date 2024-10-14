/*INTERFACES :- Interfaces is a Blueprint of a class.
 * All Mthods are public,abstract, & without implementation.
 * Used to achieve total abstraction.
 * Variables in the interfaces are final, public and static.
 */



public class Interfaces {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
    }
}


interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal(in all 4 dirn)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down , left , right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down , left , right, daigonal(by 1 steps)");
    }
}
