package controller;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by mikl on 18.11.16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex() {
        Ignite ignite = Ignition.start();
        ignite = Ignition.ignite();
        final IgniteCache<Integer, String> cache = ignite.cache("cacheName");
        for (int i = 0; i < 10; i++)
            cache.put(i, Integer.toString(i));
        for (int i = 0; i < 10; i++)
            System.out.println("Got [key=" + i + ", val=" + cache.get(i) + ']');
        cache.putIfAbsent(1, "1");
        cache.replace(1, "1", "2");

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
