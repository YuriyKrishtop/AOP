package ua.epam.spring.core.loggers;

import ua.epam.spring.core.Event;

/**
 * Created by Iurii_Kryshtop on 7/25/2016.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event){
        System.out.println(event);
    }
}
