import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowKeyword {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("You are not eligible to drive");
        }
        else{
            System.out.println("You are eligible to drive");
        }
    }

    public static void method() throws FileNotFoundException{
        FileReader file = new FileReader("C:\\Users\\kunal gahlot\\Desktop\\tasks\\JAVA\\4JUNE\\thro.java");
        BufferedReader fileInput = new BufferedReader(file);
        
        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        // System.out.println("The Java throw keyword is used to throw an exception explicitly.");
        // System.out.println("We can also define our own set of conditions and throw an exception explicitly using throw keyword. For example, we can throw ArithmeticException if we divide a number by another number.");
        // validate(17);

        try{
            method();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();  
        }


        System.out.println("Normal flow of the main function");


    }
}
