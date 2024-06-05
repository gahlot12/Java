import java.io.IOException;

public class ThrowsKeyword {
    void m() throws IOException {
        throw new IOException("device error");
    }
    void n() throws IOException {
        m();
    }
    void p(){  
        try{  
         n();  
        }catch(Exception e){System.out.println("exception handled");}  
       }  
    public static void main(String[] args) {
        System.out.println("The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception. So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.");
        ThrowsKeyword obj = new ThrowsKeyword();
        obj.p();  
        System.out.println("normal flow...");  
    }
}
