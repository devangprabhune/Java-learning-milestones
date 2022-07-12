import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("type in a character ");
        char name = s.next().charAt(0);
        System.out.println("type in 3 scores ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        double avg = ((num1+num2+num3)/3);

        System.out.println(name);
        System.out.println(avg);

        char X = 88;
        char Y = 'Y';
        System.out.println("the summation of characters 88 and 'Y' is ");
        System.out.println(X+Y);

        //widening is automatic but narrowing needs to be explixitly speciied
        
    }
}