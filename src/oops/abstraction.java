
public class abstraction {

    public static void main(String[] args) {
        // lion l = new lion();
        // l.changeColor();
        // System.out.println(l.color);
    }
}

interface Chess {

    void moves();
}

class Queen implements Chess {

    public void moves() {
        System.out.println("up,right,digonal and left");
    }
}

class Rook implements Chess {

    public void moves() {
        System.out.println("up,right,left,down");
    }
}

// abstract class animal {
//     String color;
//     animal() {
//         color = "black";
//     }
//     void eats() {
//         System.out.println("hey this is animal class");
//     }
//     abstract void walk();
// }
// class lion extends animal {
//     void changeColor() {
//         color = "yellow";
//     }
//     void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }
// class chicken extends animal {
//     void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }
