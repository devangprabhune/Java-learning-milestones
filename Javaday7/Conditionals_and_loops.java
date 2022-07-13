import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Conditionals_and_loops {
    public static void main(String[] args) {
        int a=10,b=15;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        boolean m = ((a%2==0)&&(b%2==0));
        boolean n = ((a>b) || (a<b));
        System.out.println(m);
        System.out.println(n);

        double p = 55.5;
        int q = 55;
        p = p%10;
        q = q%10;
        System.out.println(p+" "+q);

        //loops 
        float x,y;
        Scanner s = new Scanner(System.in);
        System.out.println("input first float ");
        x = s.nextFloat();
        System.out.println("input second float ");
        y = s.nextFloat();

        if(x<y){
            System.out.println(x + " is smaller than "+ y);
        }
        else{
            System.out.println(x + " is greater than "+ y);
        }

        System.out.print("input another number: ");
 
        int x1;
        x1 = s.nextInt();
        if (x1==0){
            System.out.println(x1 + " is neither even nor odd");
        }
        else if (x1%2 != 0) {
            System.out.println(x1 + " is odd");
        }
        else{
            System.out.println(x1 + " is even");
        }
        }
}
