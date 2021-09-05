package com.technus.helper2.ui.rankup;

public class SpeedUp {
    public static int minLimit (int lim){
        int newMin;
        if (lim<5000)
            newMin=300;
        else newMin = 500;
        return (lim+newMin) / 20;
    }
    public static int maxLimit (int lim){
        int newMax;
        if (lim<5000)
            newMax=300;
        else newMax=1000;
        int y = lim-newMax;
        return Math.max(y, 0) /20;
    }


















}
