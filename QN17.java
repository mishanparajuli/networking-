import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;

public class QN17 {
    public static void main(String[] args) {
        // Define a simple cookie policy: block .gov domains
        CookiePolicy policy = (uri, cookie) -> !uri.getHost().endsWith(".gov");

        // Create a CookieManager using the custom policy
        CookieManager cookieManager = new CookieManager(null, policy);
        CookieHandler.setDefault(cookieManager);

        System.out.println("Simple Cookie Policy is set.");

        try {
            URI uriGov = new URI("http://example.gov");
            URI uriCom = new URI("http://example.com");

            HttpCookie cookie = new HttpCookie("user", "beebee");

            if (policy.shouldAccept(uriGov, cookie)) {
                cookieManager.getCookieStore().add(uriGov, cookie);
                System.out.println("Cookie accepted for .gov");
            } else {
                System.out.println("Cookie blocked for .gov");
            }

            if (policy.shouldAccept(uriCom, cookie)) {
                cookieManager.getCookieStore().add(uriCom, cookie);
                System.out.println("Cookie accepted for .com");
            } else {
                System.out.println("Cookie blocked for .com");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
