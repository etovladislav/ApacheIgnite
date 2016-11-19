package controller;

import ignite.IgniteUtils;
import org.apache.ignite.IgniteCache;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by etovladislav on 18.11.16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex(@PathVariable("someVar") String someVar) {
        final IgniteCache<Integer, String> cache = IgniteUtils.getIgnite().getOrCreateCache("cacheName");
        cache.put(0, someVar);

        System.out.println("Got [key=" + 0 + ", val=" + cache.get(0) + ']');
        return "test";
    }

    @RequestMapping("/generateModels")
    @ResponseStatus(HttpStatus.OK)
    public void generateModels(@RequestParam("count") Integer count) {

    }
}