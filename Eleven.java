import java.net.URL;
import java.net.URLConnection;

public class Eleven {
    public static void main(String[] args) {
        String[] protocols = {"http", "https", "ftp"};

        // Check http, https, ftp protocols
        for (String protocol : protocols) {
            try {
                URL url = new URL(protocol + "://www.example.com/");
                URLConnection connection = url.openConnection();
                connection.connect();
                System.out.println(protocol + " is supported.");
            } catch (Exception e) {
                System.out.println(protocol + " is not supported.");
            }
        }

        // Check file protocol separately using a known file path
        try {
            // Corrected file URL format
            URL fileUrl = new URL("file:///home/mebipin/Documents/6th sem/net/file.txt");
            URLConnection fileConn = fileUrl.openConnection();
            fileConn.connect();
            System.out.println("file is supported.");
        } catch (Exception e) {
            System.out.println("file is not supported.");
        }
    }
}
