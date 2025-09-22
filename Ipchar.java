import java.net.InetAddress;

public class Ipchar {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();

            System.out.println("IP Address        : " + address.getHostAddress());
            System.out.println("Host Name         : " + address.getHostName());
            System.out.println("Is Any Local?     : " + address.isAnyLocalAddress());
            System.out.println("Is Link Local?    : " + address.isLinkLocalAddress());
            System.out.println("Is Loopback?      : " + address.isLoopbackAddress());
            System.out.println("Is Multicast?     : " + address.isMulticastAddress());
            System.out.println("Is Site Local?    : " + address.isSiteLocalAddress());
            System.out.println("Is Reachable?     : " + address.isReachable(2000)); // 2-second timeout
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
