import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class QN18 {
    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);

        try {
            URI uri = new URI("https://www.example.com");

            
            HttpCookie cookie = new HttpCookie("name", "value");
            cookieManager.getCookieStore().add(uri, cookie);

        
            CookieStore cookieStore = cookieManager.getCookieStore();
            List<HttpCookie> cookies = cookieStore.get(uri);

            for (HttpCookie c : cookies) {
                System.out.println("Cookie: " + c);
                System.out.println("  Name: " + c.getName());
                System.out.println("  Value: " + c.getValue());
                System.out.println("  Domain: " + c.getDomain());
                System.out.println("  Path: " + c.getPath());
                System.out.println("  Max Age: " + c.getMaxAge());
                System.out.println("  Secure: " + c.getSecure());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
