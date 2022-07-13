import java.util.Scanner;

public class Nested_if_else {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Input 3 numbers one by one: ");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();
        if (a>b && a>c){
            System.out.println(a + " is greatest");
        }
        else if(b>c){
            System.out.println(b + " is greatest");
        }
        else if(a==b && a==c && b==c){
            System.out.println("all are equal");
        }
        else{
            System.out.println(c + " is the greatest");
        }
}
    
}
