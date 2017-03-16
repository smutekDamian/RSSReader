package com.smutek.rss;


import com.smutek.rss.reader.RssReader;

/**
 * Created by damian on 16.03.17.
 */
public class Main {
    public static void main(String[] args){
        String[] sites = {
                "http://feeds.bbci.co.uk/news/rss.xml",
                "http://www.bankier.pl/rss/wiadomosci.xml",
                "http://www.money.pl/rss/main.xml",
                "http://www.money.pl/rss/news_z_kraju.xml",
                "http://www.money.pl/rss/news_ze_swiata.xml",
                "http://www.polsatnews.pl/rss/wszystkie.xml"
        };
        RssReader reader = new RssReader();
        String filepath = "/home/damian/Pulpit/test.csv";
        reader.readAndWriteToFile(sites, filepath);
    }
}
