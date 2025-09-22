import java.net.HttpURLConnection;
import java.net.URL;

public class QN19 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            String contentType = connection.getContentType();
            int contentLength = connection.getContentLength();
            String encoding = connection.getContentEncoding();

            System.out.println("Content-Type: " + contentType);
            System.out.println("Content-Length: " + contentLength);
            System.out.println("Content-Encoding: " + encoding);

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
