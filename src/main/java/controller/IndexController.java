package controller;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteCluster;
import org.apache.ignite.Ignition;
import org.apache.ignite.cluster.ClusterMetrics;
import org.apache.ignite.cluster.ClusterNode;
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

    private static final Ignite ignite = Ignition.start("/Users/etovladislav/Desktop/apache-ignite-fabric-1.7.0-bin/examples/config/example-ignite2.xml");

    @RequestMapping("/{pidr}")
    public String getIndex(@PathVariable("pidr") String pidr) {
        IgniteCluster cluster = ignite.cluster();
        ClusterNode localNode = cluster.localNode();
        ClusterMetrics metrics = localNode.metrics();
        double cpuLoad = metrics.getCurrentCpuLoad();
        long usedHeap = metrics.getHeapMemoryUsed();
        int numberOfCores = metrics.getTotalCpus();
        int activeJobs = metrics.getCurrentActiveJobs();
        final IgniteCache<Integer, String> cache = ignite.getOrCreateCache("cacheName");
        for (int i = 0; i < 10; i++)
            System.out.println("Got [key=" + i + ", val=" + cache.get(i) + ']');
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
