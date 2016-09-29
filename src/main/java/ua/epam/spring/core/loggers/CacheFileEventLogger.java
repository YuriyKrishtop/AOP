package ua.epam.spring.core.loggers;

import ua.epam.spring.core.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iurii_Kryshtop on 7/28/2016.
 */
public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    CacheFileEventLogger(String filename, int cacheSize) {
        super(filename);
        this.cacheSize = cacheSize;
        cache = new ArrayList<Event>();
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if(cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    public void destroy() {
        if(!cache.isEmpty()) {
            writeEventsFromCache();
        }
    }

    public void writeEventsFromCache() {
        for (Event e : cache) {
            super.logEvent(e);
        }
    }


}
