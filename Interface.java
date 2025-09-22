import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
public class Interface{
public static void main(String[] args) {
try {
Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
while (interfaces.hasMoreElements()) {
NetworkInterface ni = interfaces.nextElement();
System.out.println("Interface Name: " + ni.getName());
}
} catch (SocketException e) {
e.printStackTrace();
}
}
}
