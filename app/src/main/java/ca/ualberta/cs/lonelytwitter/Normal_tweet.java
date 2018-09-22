package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class Normal_tweet extends Tweet {


    public Normal_tweet(String ms, ArrayList<Mood> moods) {
    }


    @Override
    public Boolean isImportant() {
        return false;
    }
}
