package ua.epam.spring.core.loggers;

import org.apache.commons.io.FileUtils;
import ua.epam.spring.core.Event;

import java.io.File;
import java.io.IOException;

/**
 * Created by Iurii_Kryshtop on 7/27/2016.
 */
public class FileEventLogger implements EventLogger {
    protected String filename;
    protected File file;
    protected boolean canWrite;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString(), canWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() {
        this.file = new File(filename);
        this.canWrite = file.canWrite();
    }
}
