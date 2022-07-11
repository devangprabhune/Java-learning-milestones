public class JavaDay5{
    
    int x = 1010; //instance variables 
    float pi = 3.141592f; //instance variables

    //creating a function outside main method
    public void mul(){
        int a = 432;
        int b = 223;
        int c = a*b;
        System.out.println("the product is " + c);
    }



//static variables
//need not be accessed by creating new object
//accessed by classsName.varName or by simply using it's variable name

public static int planets;
public static String name;
public static float e;
    //driver code
    public static void main(String[] args) {
        //creating class objects
        
        JavaDay5 obj1 = new JavaDay5();
        System.out.println(obj1.x);

        JavaDay5 obj2 = new JavaDay5();
        System.out.println(obj2.pi);

        //calling the method outside the main method using object
        JavaDay5 obj3 = new JavaDay5(); //creating new object
        obj3.mul();

        JavaDay5.planets = 9;
        JavaDay5.name = "solar system";
        System.out.println(JavaDay5.name + " has " + planets + " planets.");
        
        JavaDay5.e = 2.7182818f;
        System.out.println(JavaDay5.e + " is the value of constant \"e\"");
         

    }
}