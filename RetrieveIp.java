import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class RetrieveIp {
    /**
     * This program retrieves and displays the IP addresses and MAC addresses
     * of all network interfaces on the local machine.
     */
public static void main(String[] args) {
try {
Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
while (interfaces.hasMoreElements()) {
NetworkInterface ni = interfaces.nextElement();
byte[] mac = ni.getHardwareAddress();
if (mac != null) {
System.out.print("MAC Address: ");
for (int i = 0; i < mac.length; i++) {
System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
}
System.out.println();
Enumeration<InetAddress> inetAddresses = ni.getInetAddresses();
while (inetAddresses.hasMoreElements()) {
InetAddress inetAddress = inetAddresses.nextElement();
System.out.println("IP Address: " + inetAddress.getHostAddress());
}
}
}
} catch (SocketException e) {
e.printStackTrace();
}}
}