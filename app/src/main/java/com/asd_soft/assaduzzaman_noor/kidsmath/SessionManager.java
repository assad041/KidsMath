package com.asd_soft.assaduzzaman_noor.kidsmath;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Assaduzzaman Noor on 1/9/2017.
 */
public class SessionManager {
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
    private final static String SESSION_FILE_NAME="TicTocToe";
    private final static String DIFFICULTY="Code";
    private final static String BEST="score";
    private final static String New="n_score";

    private static Context context;
    private static int pinCode;
    private static int score;

    public int getNewScore() {
        newScore=sharedPreferences.getInt(New,0);
        return newScore;
    }

    public void setNewScore(int newScore) {
        editor.putInt(New,newScore);
        editor.commit();
    }

    private static int newScore;

    public  int getScore() {
        score=sharedPreferences.getInt(BEST,0);
        return score;
    }

    public  void setScore(int score) {
        editor.putInt(BEST,score);
        editor.commit();
    }

    public int getDiff() {
        pinCode =sharedPreferences.getInt(DIFFICULTY,1);

        return pinCode;
    }

    public void setDiff(int pinCode) {
        editor.putInt(DIFFICULTY,pinCode);
        editor.commit();
    }



    public SessionManager(Context context) {
        SessionManager.context =context;
        sharedPreferences = context.getSharedPreferences(SESSION_FILE_NAME,context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
}
