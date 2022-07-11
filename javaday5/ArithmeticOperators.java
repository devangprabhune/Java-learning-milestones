import java.util.Scanner;

public class ArithmeticOperators{
    public static void main(String[] args) {
        // use ctrl+K+C to comment entire selected block of code 
        //and ctrl+K+U to uncomment that code block
        int a = 10;
        int b = 3; 
        int c = a+b;
        int d = a/b;
        float e = a/b; //even if e is of float type, the variables 
                       //a and b are of int type so the output won't be accurate. 
                       //you'll have to use float/double type of variable itself 
        int f = a*b;

        float g = a/b*5; // in case of equal precedence operators in same line, the evaluation goes from left to right operators
        //therefore a/b will be before an then that will be multiplied by 5
        float h = a/(b*5); // use brackets for seperate execution

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        

// Scanner is used to take input where 's' is a variable of type Scanner
// the () after new Scanner() is used to specify where to fetch the input from
// System.in is used to fetch input from console

        Scanner s = new Scanner(System.in);
        int x,y;
        System.out.print("enter first number: ");
        x = s.nextInt();//s.nextInt() takes the input from user
        System.out.print("enter second number: "); 
        y = s.nextInt();//and stores it in the mentioned variable
        double z = x%y;
        System.out.println("the remainder of "+ x + "/" + y + " is " + z);
        
        int m,n;
        Scanner inp = new Scanner(System.in);
        m = inp.nextInt();
        n = inp.nextInt();
        int o = m+n;
        System.out.println("addition is " + o);
                
        // //taking input of other datatypes use the .next_type()
        double p = inp.nextDouble();
        double q = inp.nextDouble();
        double r = p/(q*p);
        System.out.println ("the value of the operation is " + r);

        Scanner sc = new Scanner(System.in);
        char ltr = sc.next().charAt(0); //use charAt(index); after .next(index) this takes the input as string 
        //and will fetch the character at mentioned index number
        System.out.println("entered character is " + ltr);
        
        //String str = sc.next();
        //System.out.println("the string is " + str); //.next will only fetch the first word of the string input
        // to fetch more words, retype the .next() below
        // to fetch the entire line, use the sc.nextLine(); snytax
        String str1 = sc.nextLine();
        System.out.println("the input string is " + "'" + str1 + "'"  );
        System.out.println(str1.toUpperCase());
        System.out.println(str1 + " is the entered string");

    }
}