import java.io.*;
import java.net.*;

public class FactorialClient {
    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 12345);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String input;
            System.out.println("Enter a number to calculate its factorial:");
            while ((input = userInput.readLine()) != null) {
                out.println(input);
                String response = in.readLine();
                if (response == null) break;
                System.out.println("Server Response: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
