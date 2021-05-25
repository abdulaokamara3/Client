import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",54280);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Hello");
        pr.flush();
    }
}
