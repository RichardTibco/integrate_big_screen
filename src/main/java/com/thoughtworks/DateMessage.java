package com.thoughtworks;

/**
 * Created by pyang on 09/03/2017.
 */
public class DateMessage {
    private String created;

    private String count;

    public DateMessage() {
    }

    public DateMessage(String created, String count) {
        this.created = created;
        this.count = count;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
