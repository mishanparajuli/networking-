import java.net.InetAddress;
import java.net.NetworkInterface;
public class RetrieveMACFromIP {
public static void main(String[] args) {
try {
InetAddress address = InetAddress.getByName("127.0.0.1"); // replace with the desired IP
NetworkInterface network = NetworkInterface.getByInetAddress(address);
byte[] mac = network.getHardwareAddress();
if (mac != null) {
System.out.print("MAC Address: ");
for (int i = 0; i < mac.length; i++) {
System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
}
System.out.println();
} else {
System.out.println("MAC Address not available.");
}
} catch (Exception e) {
e.printStackTrace();
}
}
}