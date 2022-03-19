import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5001);
            Socket client = server.accept();

            DataOutputStream os = new DataOutputStream(client.getOutputStream());

            os.writeBytes("Hello client\n");
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}