import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Formatter;

public class DisplayIp {
    public static void main(String[] args) {
        try {
            // Get local IP address
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP Address: " + address.getHostAddress());

            // Get network interface associated with that IP
            NetworkInterface network = NetworkInterface.getByInetAddress(address);

            if (network == null) {
                System.out.println("Network Interface not found.");
                return;
            }

            // Get MAC address
            byte[] mac = network.getHardwareAddress();

            if (mac != null) {
                try (Formatter formatter = new Formatter()) {
                    for (int i = 0; i < mac.length; i++) {
                        formatter.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                    System.out.println("MAC Address: " + formatter.toString());
                }
            } else {
                System.out.println("MAC Address not available.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
