import java.net.InetAddress;

public class Myip {
    public static void main(String[] args) {
        try {
            // Get local host address
            InetAddress ip = InetAddress.getLocalHost();

            // Display IP address
            System.out.println("IP Address of this system is: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error retrieving IP address: " + e.getMessage());
        }
    }
}
