package ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.springframework.stereotype.Component;

/**
 * Created by etovladislav on 19.11.16.
 */
@Component
public class IgniteUtils {

    private static Ignite ignite = null;


    public void setIgnite(String ignite) {
        Ignition.setClientMode(true);
        this.ignite = Ignition.start(ignite);
    }

    public static Ignite getIgnite() {
        return ignite;
    }
}
