import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.SocketAddress;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QN16 extends ProxySelector {
    private final List<Proxy> proxies = new ArrayList<>();

    public QN16() {
        proxies.add(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080)));
    }

    @Override
    public List<Proxy> select(URI uri) {
        System.out.println("Selecting proxy for URI: " + uri);
        return proxies;
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        System.out.println("Connection failed to " + uri + " via proxy " + sa);
        ioe.printStackTrace();
    }

    public static void main(String[] args) {
        ProxySelector.setDefault(new QN16());
        System.out.println("✅ Custom Proxy Selector is set.");

        // Test with a URI
        try {
            URI testUri = new URI("http://example.com");
            List<Proxy> selectedProxies = ProxySelector.getDefault().select(testUri);
            System.out.println("Selected Proxies: " + selectedProxies);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
