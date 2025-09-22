import java.net.HttpURLConnection;
import java.net.URL;
public class QN23 {
public static void main(String[] args) {
try {
URL url = new URL("https://www.example.com");
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");
connection.setConnectTimeout(5000); // 5 seconds
connection.setReadTimeout(5000); // 5 seconds
connection.connect();
int responseCode = connection.getResponseCode();
System.out.println("Response Code: " + responseCode);
connection.disconnect();
} catch (Exception e) {
e.printStackTrace();
}
}
}