import java.net.InetAddress;

public class InetInfo {
    public static void main(String[] args) {
        try {
            // Get the local host address
            InetAddress address = InetAddress.getLocalHost();

            // Using various getter methods of InetAddress
            System.out.println("Host Name       : " + address.getHostName());
            System.out.println("Canonical Name  : " + address.getCanonicalHostName());
            System.out.println("Host Address    : " + address.getHostAddress());
            System.out.println("Is Loopback?    : " + address.isLoopbackAddress());
            System.out.println("Is Reachable?   : " + address.isReachable(2000)); // timeout 2 seconds
            System.out.println("Is Multicast?   : " + address.isMulticastAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
