package com.thoughtworks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pyang on 09/03/2017.
 */
@Controller
@RequestMapping("/chart")
public class PaintChart {
    @RequestMapping(value = "/show")
    public String paintChart() {
        return "chart";
    }
}
