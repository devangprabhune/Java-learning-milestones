public class JavaProjectTwo {
    public static void main(String[] args){
        
        System.out.print("The output of 4*8 is ");
        System.out.println(4*8);
        int MyNum = 15; // vairable decalaration -> type varName = value
        System.out.println(MyNum*2);
        
        final char ltr = 'a'; // final keyword throwa error upon variable value being changed further
        System.out.println("character value is "+ltr);
        
        final String name = "Devang ";
        final String surname = "Prabhune";
        System.out.println(name + surname);

        int num1 = 1;
        int num2 = 3;
        System.out.println("concatenation of int values is " + num1 + num2);
        System.out.print("the addition is ");
        System.out.println(num1+num2);
        

        //multiple variable declaration of same type in a single line
        int nbr1, nbr2, nbr3, nbr4;
        nbr1 = nbr2 = nbr3 = nbr4 = 1000;
        int a=1, b=2, c=3, d=4; //value assignment on same line
        System.out.println(nbr1*a + nbr2/b + nbr3*c + nbr4/d);
    }  
}
