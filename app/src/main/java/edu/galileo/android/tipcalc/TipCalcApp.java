package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by Pame on 25/06/2016.
 */
public class TipCalcApp extends Application {
    private  final static String ABOUT_URL = "https://www.youtube.com/watch?v=RjmtVwgWqTY";
    private  final static String FACE = "https://www.facebook.com";

    public String getAboutUrl() {
        return ABOUT_URL;
    }

    public String getFACE() {
        return FACE;
    }
}
