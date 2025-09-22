import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class RetrieveDataFromURL {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com");  // New approach
            URL url = uri.toURL();                         // Convert to URL
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
