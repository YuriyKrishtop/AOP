/**
 * Created by Iurii_Kryshtop on 7/26/2016.
 */

package ua.epam.spring.core.loggers;

import ua.epam.spring.core.Event;

public interface EventLogger {
    void logEvent(Event event);
}
