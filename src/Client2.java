import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",54862);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Hello");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);


        String str = bf.readLine();
        System.out.println("client: " +str);

    }
}
