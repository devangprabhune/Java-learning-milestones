import java.util.Scanner;
public class HackerrankIfElse{

    public static void main(String[] args) {    
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
            if(n%2==1){
                System.out.println("Weird");
            }else if((n%2==0)&&(2<=n)&&(n<=5)){
                System.out.println("Not Weird");    
            }else if((n%2==0)&&(6<=n)&&(n<=20)){
                System.out.println("Weird");
            }else if((n%2==0)&&(n>20)){
                System.out.println("Not Weird");
            }
        
        String g;
        Scanner scn = new Scanner(System.in);
        System.out.println("integer is ");
        int i = scn.nextInt();
        System.out.println("double is ");
        Double d = scn.nextDouble();
        System.out.print("string is ");
        g = scn.nextLine();
        String sg = scn.nextLine();
        
        System.out.println("String: " + sg);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
       
    }
}