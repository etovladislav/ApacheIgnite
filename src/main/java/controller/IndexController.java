package controller;

import ignite.IgniteUtils;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by mikl on 18.11.16.
 */
@Controller
public class IndexController {

    @RequestMapping("/{someVar}")
    public String getIndex(@PathVariable("someVar") String someVar) {
        final IgniteCache<Integer, String> cache = IgniteUtils.getIgnite().getOrCreateCache("cacheName");
        cache.put(0, someVar);
        System.out.println("Got [key=" + 0 + ", val=" + cache.get(0) + ']');
        return "test";
    }

    @RequestMapping("/brat")
    @ResponseStatus(HttpStatus.OK)
    public void getBrat() {
        Ignite ignite = Ignition.ignite();
        final IgniteCache<Integer, String> cache = ignite.cache("cacheName");
        for (int i = 0; i < 10; i++)
            System.out.println("Got brat [key=" + i + ", val=" + cache.get(i) + ']');
    }
}