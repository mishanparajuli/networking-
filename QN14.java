import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class QN14 {
    public static void main(String[] args) {
        try {
            String url = "https://www.example.com/query?name=John Doe";
            String encodedURL = URLEncoder.encode(url, StandardCharsets.UTF_8.toString());
            System.out.println("Encoded URL: " + encodedURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
