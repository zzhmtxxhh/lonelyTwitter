package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {
    protected  String message;
    protected   Date date;
    private ArrayList<Mood> Moods;

    public Tweet() {
    }

    public Tweet(String message,Date date,ArrayList<Mood> Moods){
        this.message = message;
        this.date = date;
        this.Moods = Moods;
    }
    public Tweet(String message, ArrayList<Mood> Moods){
        this.message = message;
        this.date = new Date();
        this.Moods = Moods;
    }


    public  void setMessage(String message) throws Toolongtweet_exception{
        if (this.message.length()>140){
            throw new Toolongtweet_exception();
        }
        this.message = message;
    }


    public void setDate(Date date){
        this.date = date;

    }
    public String getMessage(){
        return this.message;
    }
    public Date getDate(){
        return this.date;
    }
    public ArrayList<Mood> getMoods() {
        return Moods;
    }

    public void setMoods(ArrayList<Mood> moods) {
        Moods = moods;
    }

    public void add_mood(Mood mood){
        this.Moods.add(mood);
    }

    public abstract Boolean isImportant();
}
