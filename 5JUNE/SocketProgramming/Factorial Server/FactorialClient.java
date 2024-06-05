import java.net.Socket;
import java.io.*;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started");
            Socket sc = new Socket("localhost",9806);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number for finding the factorial : ");
            int number = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(sc.getOutputStream(),true);
            out.println(number);
            BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            System.out.println(in.readLine());
        } catch (Exception e) {
            
        }
    }
}