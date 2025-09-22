import java.net.URL;

public class Qn13 {
    public static void main(String[] args) {
        try {
            // Sample URL
            String urlString = "https://www.example.com:8080/path/to/resource?name=beebee&lang=java#section1";
            URL url = new URL(urlString);

            // Display parts
            System.out.println("Full URL:       " + url);
            System.out.println("Protocol:       " + url.getProtocol());
            System.out.println("Host:           " + url.getHost());
            System.out.println("Port:           " + url.getPort());            // Returns -1 if not specified
            System.out.println("Path:           " + url.getPath());
            System.out.println("Query:          " + url.getQuery());
            System.out.println("File (path+q):  " + url.getFile());
            System.out.println("Ref (fragment): " + url.getRef());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
