package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mikl on 18.11.16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex(){
        return "test";
    }
}
