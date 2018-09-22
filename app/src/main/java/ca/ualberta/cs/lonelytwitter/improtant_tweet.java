package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class improtant_tweet extends Tweet {


    public improtant_tweet(String ms, ArrayList<Mood> moods) {
    }

    @Override
    public Boolean isImportant() {
        return true;
    }
}
