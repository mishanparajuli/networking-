import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 8080);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String userInput;
            System.out.println("Connected to server. Type messages:");
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput); // Send to server
                String response = in.readLine(); // Get echo
                if (response == null) break;
                System.out.println(response); // Display server response
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
