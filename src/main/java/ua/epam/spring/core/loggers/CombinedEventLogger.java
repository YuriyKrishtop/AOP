package ua.epam.spring.core.loggers;

import ua.epam.spring.core.Event;

import java.util.Collection;

/**
 * Created by Iurii_Kryshtop on 7/29/2016.
 */
public class CombinedEventLogger implements EventLogger {
    private Collection<EventLogger> collectionLogger;

    public CombinedEventLogger(Collection<EventLogger> collectionLogger) {
        this.collectionLogger = collectionLogger;
    }

    public void logEvent(Event event) {
        for (EventLogger eventLogger : collectionLogger) {
            eventLogger.logEvent(event);
        }
    }
}
