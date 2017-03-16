package com.smutek.csv.writer;

import au.com.bytecode.opencsv.CSVWriter;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by damian on 16.03.17.
 */
public class CsvWriter {

    public static int writeFeed(String filename, SyndFeed feed, int id){
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(filename, true), ' ');
            List entries = feed.getEntries();
            String feedTitle = feed.getTitle();
            for (final Iterator iter = entries.iterator(); iter.hasNext(); ){
                final SyndEntry entry = (SyndEntry) iter.next();
                writer.writeNext((id + "#" + feedTitle + "#" + entry.getPublishedDate() + "#" + entry.getTitle() +
                        "#" + entry.getDescription().getValue()).split("#"));
                id++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return id;
    }

}
