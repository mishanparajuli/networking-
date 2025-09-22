import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class QN15 {
    public static void main(String[] args) {
        try {
            String encodedURL = "https%3A%2F%2Fwww.example.com%2Fquery%3Fname%3DJohn%2BDoe";
            String decodedURL = URLDecoder.decode(encodedURL, StandardCharsets.UTF_8.toString());
            System.out.println("Decoded URL: " + decodedURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
