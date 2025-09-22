
import java.net.Socket;
public class QN25 {
public static void main(String[] args) {
try {
Socket socket = new Socket("www.example.com", 80);
System.out.println("Remote Address: " + socket.getInetAddress());
System.out.println("Remote Port: " + socket.getPort());
System.out.println("Local Address: " + socket.getLocalAddress());
System.out.println("Local Port: " + socket.getLocalPort());
socket.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}