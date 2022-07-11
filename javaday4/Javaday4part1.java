public class Javaday4part1{
    public static void main(String[] args){
    /*
        byte num1 = 12;
        short num2 = 12345;
        int num3 = 1223456789;
        long num4 = 123456789098765432L;

        float nbr1 = 3.1415f; // float values should end with f
        double nbr2 = 2.718281828d; // double values should end with d
        double nbr3 = 5.9721e24d; // e is used to represent to the power of 10 
    
        boolean isJavaEasy = true;
        boolean isJavaHard = false;
        boolean WillItTakeEfforts = true;
    */

        //using ASCII values to display certain characters
        char myval = 35;
        System.out.print("char value for 35 is : ");
        System.out.println(myval);

        //widening and narrowing operations
        /*
         * widening is converting 
         * small data type to larger data type eg. byte->short->int->long
         * narrowing is converting large data type to smaller type eg. long->int          
         */
        int myint = 100;
        double mydbl = myint;
        System.out.println("this is a widening operation ");
        System.out.print(myint);
        System.out.println(" is a int type ");
        System.out.print(mydbl);
        System.out.println(" is widened to double type ");

        double mydbl1 = 3673.676;
        int myint1 = (int) mydbl1;
        System.out.print(mydbl1);
        System.out.println(" is of double type");
        System.out.print(myint1);
        System.out.println(" is narrowed to int type");
        System.out.println("as it turns out, norrowing causes data loss");
    }
}