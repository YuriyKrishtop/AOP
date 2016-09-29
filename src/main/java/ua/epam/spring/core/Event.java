package ua.epam.spring.core;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Iurii_Kryshtop on 7/26/2016.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat dateFormat) {
        this.id = new Random(System.currentTimeMillis()).nextInt(100000);
        this.date = date;
        this.dateFormat = dateFormat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", data=" + dateFormat.format(date) +
                '}' +
                '\n';
    }
}
