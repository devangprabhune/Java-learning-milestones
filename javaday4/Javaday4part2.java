public class Javaday4part2{
    public static void main(String[] args){
        
        String txt = "ABCDEfghij";
        int txtlen = txt.length();
        System.out.println("the length of the string is " + txtlen);
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        

        String words = "This is a java string";
        System.out.println(words.indexOf("java"));

        String name = "Devang";
        String surname = "Prabhune";
        System.out.println(name +" "+ surname);

        String num1 = "one ";
        String num2 = "two";
        System.out.println(num1.concat(num2));
        

        //using \ escape character turns a special character in a string character
        System.out.println("he said, \"My name is... \nand he vanished in the fog\"");

    }

}