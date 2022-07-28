import javax.swing.plaf.synth.SynthOptionPaneUI;

import Parentclass.Myinterface;

public class OPERATORS {
    public static void main(String[] args) {
        //ternary operators
        int num1 = 100;
        int num2 = 101;
        int max = (num1>num2)?num1:num2;
        System.out.println("Max num is : " + max);

        //checking even odd with ternary operator
        int val1 = 20;
        int val2 = 21;                                     //  execute   execute
        // int EorO = ((val1%2==0)?val1:val2); //(condition) ? if true : if flase ;
        System.out.println(EorO);      


//         //creating objects
//         Parentclass Obj1 = new Parentclass();
//         ChildClass Obj2 = new ChildClass();

//         System.out.println("obj1 is instance of parent class "+ (Obj1 instanceof Parentclass));
//         System.out.println("obj1 is instance of child class "+ (obj1 instanceof ChildClass));
//         System.out.println("obj1 is instance of interface "+ (obj1 instanceof Myinterface));
//         System.out.println("obj2 is instance of parent class "+ (obj2 instanceof Parentclass));


//     }
// }
// class Parentclass{

//     interface Myinterface{

//     }

// }
// class ChildClass extends Parentclass implements Myinterface{


// }
