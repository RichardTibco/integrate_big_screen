package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyang on 09/03/2017.
 */
public class DataMine {

    private static DataMine instance = new DataMine();



    private List<StatItem> stats = new ArrayList<StatItem>();

    private DataMine() {
        stats.add(new StatItem("2017-1-1","1"));
        stats.add(new StatItem("2017-2-10","3"));
        stats.add(new StatItem("2017-2-11","1"));
        stats.add(new StatItem("2017-3-3","2"));
    }

    public static DataMine getInstance() {

        return DataMine.instance;

    }

    public List<StatItem> getAllStatItem() {
        return stats;
    }

    public void addStatItem(StatItem item) {
        stats.add(item);
    }
}
