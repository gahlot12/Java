import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Server{
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for clients ");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Server Says : " + str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}