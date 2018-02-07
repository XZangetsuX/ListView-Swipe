package com.example.laptop.tarea2swipelistview;

/**
 * Created by LS12DOCENTE on 26/01/2018.
 */

public class list {
    private String title=null,subtitle =null;

    public list(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
