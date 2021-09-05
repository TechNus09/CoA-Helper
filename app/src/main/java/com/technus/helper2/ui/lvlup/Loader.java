package com.technus.helper2.ui.lvlup;

import android.widget.EditText;
import android.database.Cursor;

import com.technus.helper2.ui.rankup.DBHelper;
import com.technus.helper2.ui.rankup.Get;
import com.technus.helper2.ui.rankup.DBHelper;


public class Loader {

    public static DBHelper DataBase;



    public static void Load(android.content.Context ctx,String username, int pos, EditText lvl_v, EditText perc_v, long new_xp){

        DataBase = new DBHelper(ctx);

        int skill_pos;
        short lvl;
        double perc;
        long xp;

        if (!username.equals("test")){
            Cursor curs = DataBase.getUserXp(username) ;
            if( curs != null && curs.moveToFirst() ){

                if (pos==1){
                    skill_pos=5;
                }
                else if (pos==2){
                    skill_pos=8;
                }
                else if (pos==3){
                    skill_pos=11;
                }
                else if (pos==4){
                    skill_pos=14;
                }
                else if (pos==5){
                    skill_pos=17;
                }
                else if (pos==6){
                    skill_pos=20;
                }
                else{
                    skill_pos=2;
                }

                xp = Long.parseLong(curs.getString(skill_pos));
                lvl = Get.Lvl(xp);
                perc = Get.Percent(xp,lvl);



                if (perc == 100) {
                    lvl += 1;
                    perc = 0;

                    if (lvl > 120) {
                        lvl = 120;
                    }
                }
                lvl_v.setText(String.valueOf(lvl));
                perc_v.setText(String.valueOf(perc));
                new_xp = xp;

            }

        }

    }















}
