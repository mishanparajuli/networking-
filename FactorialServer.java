import java.io.*;
import java.net.*;

public class FactorialServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Factorial Server started...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String input;
            while ((input = in.readLine()) != null) {
                try {
                    int num = Integer.parseInt(input);
                    int fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    out.println("Factorial of " + num + " is " + fact);
                } catch (NumberFormatException e) {
                    out.println("Invalid input. Please enter a number.");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}