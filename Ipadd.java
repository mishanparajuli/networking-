import java.net.InetAddress;
public class Ipadd {
    /**
     * This program checks if the local host address is IPv4 or IPv6.
     * It prints a message indicating the type of IP address.
     */
public static void main(String[] args) {
try {
InetAddress address = InetAddress.getLocalHost();
byte[] byteAddress = address.getAddress();
if (byteAddress.length == 4) {
System.out.println("This is an IPv4 address.");
} else if (byteAddress.length == 16) {
System.out.println("This is an IPv6 address.");
} else {
System.out.println("Unknown IP address format.");
}
} catch (Exception e) {
e.printStackTrace();
}
}
}