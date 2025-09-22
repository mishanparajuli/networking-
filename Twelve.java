import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class Twelve {
    /**
     * This program checks if the specified protocols are supported by the virtual machine.
     * It checks for HTTP, HTTPS, FTP, and FILE protocols.
     */
    public static void main(String[] args) {
        String[] protocols = {"http", "https", "ftp"};

        for (String protocol : protocols) {
            try {
                URI uri = new URI(protocol + "://www.example.com/");
                URL url = uri.toURL();
                URLConnection connection = url.openConnection();
                connection.connect();
                System.out.println(protocol + " is supported.");
            } catch (Exception e) {
                System.out.println(protocol + " is not supported.");
            }
        }

        // FILE protocol: use a valid local file path
        try {
            URI fileUri = new URI("file:///etc/hosts"); // Adjust this path to a valid one on your OS
            URL fileUrl = fileUri.toURL();
            URLConnection fileConn = fileUrl.openConnection();
            fileConn.connect();
            System.out.println("file is supported.");
        } catch (Exception e) {
            System.out.println("file is not supported.");
        }
    }
}
