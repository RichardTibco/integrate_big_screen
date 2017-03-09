package com.thoughtworks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pyang on 09/03/2017.
 */
@RestController

public class GetDataController {
    @RequestMapping("/data")
    public List<StatItem> getData(){

        return DataMine.getInstance().getAllStatItem();
    }
}
