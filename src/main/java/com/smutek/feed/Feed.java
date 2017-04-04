package com.smutek.feed;

/**
 * Created by damian on 04.04.17.
 */
public class Feed {
    private String name;
    private String rssUrl;

    public Feed(String name, String rssUrl) {
        this.name = name;
        this.rssUrl = rssUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRssUrl() {
        return rssUrl;
    }

    public void setRssUrl(String rssUrl) {
        this.rssUrl = rssUrl;
    }
}
