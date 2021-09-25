package com.technus.coahelper.ui.rankup;

public class SpeedUp {
    public static int minLimit (int lim){
        int newMin; //going down
        if (lim<5000)
            newMin=300; //high lvl
        else newMin = 500; // low lvl
        return (lim+newMin) / 20;
    }
    public static int maxLimit (int lim){
        int newMax; //going up
        if (lim<5000)
            newMax=300; //high lvl
        else newMax=1500; // low lvl
        int y = lim-newMax;
        return Math.max(y, 0) /20;
    }


















}
