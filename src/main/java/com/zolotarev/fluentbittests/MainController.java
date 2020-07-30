package com.zolotarev.fluentbittests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    private static Logger logger = LoggerFactory.getLogger("testLogger");

    @GetMapping("hello")
    public String printHelloWorld() {
        for (int i =0;i<10;i++){
            logger.warn("Message hello {}",i);
        }
        return "hello";
    }
    @GetMapping("buy")
    public String printBuyWorld(){
        for (int i =0;i<10;i++){
            logger.warn("Message buy {}",i);
        }
        return "buy";
    }
}
