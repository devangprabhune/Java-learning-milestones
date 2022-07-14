import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        char ltr = SC.next().charAt(0);
        if((ltr>=65)&&(ltr<=90)){
            System.out.println(1);            
        }
        else if((ltr>=97)&&(ltr<=122)){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }

    }
    
}
