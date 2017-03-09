package com.thoughtworks;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by pyang on 09/03/2017.
 */
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(DateMessage message) throws Exception {
        Thread.sleep(1000);

        DataMine.getInstance().addStatItem(new StatItem(message.getCreated(), message.getCount()));
        return new Greeting("hello, " + message.getCreated() + ":" + message.getCount() +"!");
    }
}
