import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class FactorialServer {
    public static int Factorial(int n){
        if (n==1) {
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for the Client! ");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection Established! ");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int n = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("The Factorial of the number is : " + Factorial(n));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
