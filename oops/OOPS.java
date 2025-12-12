
public class OOPS {

    public static void main(String[] args) {
        // Pen utkarshPen = new Pen();
        // utkarshPen.setColour("Red");
        // System.out.println(utkarshPen.getColour());
        // Bankaccount myAcc = new Bankaccount();
        // myAcc.username = "Utkarsh Patrikar";
        // // myAcc.password = 1234;
        // myAcc.setPass(123); // used set pass setter
        // System.out.println(myAcc.getPassword()); // used getpassword getters

        // //Students class calls
        // Students S2 = new Students();
        // Students S1 = new Students("utkarsh");
        // System.out.println(S1.name);
        // // S1.setName("utkarsh");
        // Students S3 = new Students(12334);
        // Students S4 = new Students("radha", 123);
        // System.out.println(S4.name);
        // System.out.println(S4.roll);
        // System.out.println(S3.roll);
        // Students S1 = new Students();
        // S1.name = "utkarsh";
        // S1.roll = 123;
        // Students S5 = new Students(S1);
        // S5.roll = 234;
        // Students s1 = new Students();
        // s1.marks[0] = 100;
        // s1.marks[1] = 100;
        // s1.marks[2] = 200;
        // Students s2 = new Students(s1);
        // s2.name = "Archana";
        // s1.marks[2] = 100;
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(s2.marks[i]);
        // }
        //INTHERITANCE SIKHO{
        // Fish shark = new Fish();
        // shark.eat();
        // Dogs jinnee = new Dogs();
        // jinnee.legs = 4;
        // jinnee.colour = "black";
        // System.out.println(jinnee.colour);
        // System.out.println(jinnee.legs);
        // }yaha tak inheritance ka code hai bhai
        Calculator calc1 = new Calculator();
        System.out.println(calc1.sum(1, 2));
    }
}
//Polymorphism{
//Type-1 method overloading

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
//upto here polymorphism}
//yaha se hum base class aur derived class bana rahe hai{
// class animal {//this is base class
//     String colour;
//     void eat() {
//         System.out.println("eats");
//     }
//     void breaths() {
//         System.out.println("breaths");
//     }
// }
// class mamal extends animal {
//     int legs;
// }
// class Dogs extends mamal {
//     String breed;
// }
// class Fish extends animal {//this is derived class
//     int fins;
//     void swims() {
//         System.out.println("Swims in water");
//     }
// }
//} yaha tak hai inheritance
// class Bankaccount {
//     public String username;
//     private int password; // this will restrict to use the attribute in other classes
//     public void setPass(int pwd) {
//         password = pwd;
//     }
//     protected int getPassword() {
//         return this.password;
//     }
// }
// class Pen {
//     private String colour;
//     private int tip;
//     String getColour() {
//         return this.colour;
//     }
//     void setTip(int Tip) {
//         this.tip = Tip;
//     }
//     void setColour(String newColour) {
//         this.colour = newColour;
//     }
// }
// //constructors
// class Students {
//     String name;
//     int roll;
//     int marks[] = new int[3];
//     // Students(Students s1) {//this will shallow copy the attributes
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;
//     // }
//     //deep copy constructor
//     Students(Students s1) {
//         this.name = s1.name;
//         this.roll = s1.roll;
//         marks = new int[3];
//         for (int i = 0; i < marks.length; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }
//     Students() {
//         System.out.println("Constructor is called...");
//     }
//     Students(int roll) {
//         this.roll = roll;
//     }
//     Students(String name) {
//         this.name = name;
//     }
//     Students(String name, int roll) {
//         this.name = name;
//         this.roll = roll;
//     }
// }
