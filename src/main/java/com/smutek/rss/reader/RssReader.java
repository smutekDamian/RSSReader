package com.smutek.rss.reader;

import com.smutek.csv.writer.CsvWriter;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import java.io.IOException;
import java.net.URL;

/**
 * Created by damian on 16.03.17.
 */
public class RssReader extends CsvWriter {
    private SyndFeedInput input;

    public RssReader() {
        this.input = new SyndFeedInput();
    }

    public void readAndWriteToFile(String[] sites, String filename){
        Integer id = 0;
        for (String site: sites){
            System.out.println(site + " parsing");
            try {
                SyndFeed feed = input.build(new XmlReader(new URL(site)));
                id = CsvWriter.writeFeed(filename, feed, id);
            } catch (FeedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            id++;
        }
    }

}
