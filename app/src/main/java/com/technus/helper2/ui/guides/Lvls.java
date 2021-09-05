package com.technus.helper2.ui.guides;

public class Lvls {

    String lvl ;
    int icon;
    String xpNeeded,mainRscName,altRscName,mainRscNormal,altRscNormal
            ,mainRscBoost1,altResBoost1,mainRscBoost2,altResBoost2,mainRscBoost3,altResBoost3
            ,mainRscBoost4,altResBoost4,mainRscBoost5,altResBoost5,mainRscBoost6,altResBoost6
            ,mainRscBoost7,altResBoost7;
    boolean visibility;

    public Lvls(String lvl, int icon, String xpNeeded, String mainRscName, String altRscName,
                String mainRscNormal, String altRscNormal, String mainRscBoost1, String altResBoost1
            , String mainRscBoost2, String altResBoost2, String mainRscBoost3, String altResBoost3) {
        this.lvl = lvl;
        this.icon = icon;
        this.xpNeeded = xpNeeded;
        this.mainRscName = mainRscName;
        this.altRscName = altRscName;
        this.mainRscNormal = mainRscNormal;
        this.altRscNormal = altRscNormal;
        this.mainRscBoost1 = mainRscBoost1;
        this.altResBoost1 = altResBoost1;
        this.mainRscBoost2 = mainRscBoost2;
        this.altResBoost2 = altResBoost2;
        this.mainRscBoost3 = mainRscBoost3;
        this.altResBoost3 = altResBoost3;
    }

    public Lvls(String lvl, int icon, String xpNeeded, String mainRscName, String altRscName
            , String mainRscNormal, String altRscNormal
            , String mainRscBoost1, String altResBoost1, String mainRscBoost2, String altResBoost2
            , String mainRscBoost3, String altResBoost3, String mainRscBoost4, String altResBoost4
            , String mainRscBoost5, String altResBoost5, String mainRscBoost6, String altResBoost6
            , String mainRscBoost7, String altResBoost7) {
        this.lvl = lvl;
        this.icon = icon;
        this.xpNeeded = xpNeeded;
        this.mainRscName = mainRscName;
        this.altRscName = altRscName;
        this.mainRscNormal = mainRscNormal;
        this.altRscNormal = altRscNormal;
        this.mainRscBoost1 = mainRscBoost1;
        this.altResBoost1 = altResBoost1;
        this.mainRscBoost2 = mainRscBoost2;
        this.altResBoost2 = altResBoost2;
        this.mainRscBoost3 = mainRscBoost3;
        this.altResBoost3 = altResBoost3;
        this.mainRscBoost4 = mainRscBoost4;
        this.altResBoost4 = altResBoost4;
        this.mainRscBoost5 = mainRscBoost5;
        this.altResBoost5 = altResBoost5;
        this.mainRscBoost6 = mainRscBoost6;
        this.altResBoost6 = altResBoost6;
        this.mainRscBoost7 = mainRscBoost7;
        this.altResBoost7 = altResBoost7;
    }

    public Lvls(String lvl, String xpNeeded, int icon, String mainRscName, String altRscName, String mainRscNormal, String mainRscBoost1, String altRscNormal, String altResBoost1) {
        this.lvl = lvl;
        this.icon = icon;
        this.xpNeeded = xpNeeded;
        this.mainRscName = mainRscName;
        this.altRscName = altRscName;
        this.mainRscNormal = mainRscNormal;
        this.altRscNormal = altRscNormal;
        this.mainRscBoost1 = mainRscBoost1;
        this.altResBoost1 = altResBoost1;
        this.visibility = false;
    }

    public Lvls(String lvl,String xpNeeded, int icon) {
        this.lvl = lvl;
        this.icon = icon;
        this.xpNeeded = "XP : "+xpNeeded;
        this.visibility = false;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }
}
