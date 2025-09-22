import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceFactoryAndGetters {
    public static void main(String[] args) {
        try {
            // Replace "eth0" wlp3s0 with your actual interface name
            NetworkInterface ni = NetworkInterface.getByName("wlp3s0");

            if (ni != null) {
                System.out.println("Display Name: " + ni.getDisplayName());
                System.out.println("Name: " + ni.getName());

                Enumeration<InetAddress> inetAddresses = ni.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    System.out.println("InetAddress: " + inetAddress);
                }
            } else {
                System.out.println("Network Interface not found.");
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
