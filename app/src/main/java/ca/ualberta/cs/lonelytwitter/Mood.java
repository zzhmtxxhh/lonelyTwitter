package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {

    private Date timestamp;

    public Mood (Date timestamp){
        this.timestamp = timestamp;
    }

    public Mood(){
        this.timestamp = new Date();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public abstract String mood_msn();
}
