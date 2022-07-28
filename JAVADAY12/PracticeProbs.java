import java.security.AllPermission;
import java.util.Scanner;

public class PracticeProbs {
    public static void main(String[] args) {
        // Scanner A = new Scanner(System.in);
        // char C = A.nextLine().charAt(0);
        // // System.out.println("OUTPUT WILL BE 1 if CAPITAL");
        // // System.out.println("0 IF SMALL &");
        // // System.out.println("-1 OTHERWISE");

        // if ((C>=65)&&(C<=90)){
        //     System.out.println("1");
        // }
        // else if((C>=97)&&(C<=122)){
        //     System.out.println("0");
        // }
        // else{
        //     System.out.println("-1");
        // }

        // Scanner Q = new Scanner(System.in);
        // int basic;
        // char grade;
        // int allow;
        // basic = Q.nextInt();
        // grade = Q.next().charAt(0);
        
        // if (grade == 'A'){
        //     allow = 1700;
        // }else if(grade == 'B'){
        //     allow = 1500;
        // }else{
        //     allow = 1300;
        // }

        // double hra = 0.2 * basic;
        // float hra1 = (float) hra;
        // double da = 0.5 * basic;
        // float da1 = (float) da;
        // double pf = 0.11 * basic;
        // float pf1 = (float) pf;        

        // float total = basic + hra1 + da1 + allow - pf1;
        // int inhand = (int) total ;
        // System.out.println(inhand);

        Scanner Q = new Scanner(System.in);
        double basic;
        char grade;
        double allow;
        basic = Q.nextInt();
        grade = Q.next().charAt(0);
        
        if (grade == 'A'){
            allow = 1700;
        }else if(grade == 'B'){
            allow = 1500;
        }else{
            allow = 1300;
        }
        
        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = 0.11 * basic;    

        double total = basic + hra + da + allow - pf;
        
        double tot1 = Math.round(total);
        int inhand = (int) tot1;
        
        System.out.println(inhand);
        
    
    }
}
