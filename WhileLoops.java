import java.util.Scanner;

import javax.naming.NamingException;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner O = new Scanner(System.in);
        System.out.print("Enter a number-> ");
        int num = O.nextInt();
        int i = 1;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a name-> ");
        String name = n.nextLine();
        while(i <= num){
            System.out.print(name+" ");
            i++;
        }
        System.out.println("");
        
    }
}
