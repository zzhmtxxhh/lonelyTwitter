package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {

    protected Date date;

    public Mood(Date date){
        this.date = date;
    }

    public Mood(){
        this.date = new Date();

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String mood_type();

}
