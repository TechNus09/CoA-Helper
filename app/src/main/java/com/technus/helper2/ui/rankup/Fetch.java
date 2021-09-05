package com.technus.helper2.ui.rankup;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

import static com.technus.helper2.ui.rankup.RankUpFragment.DB;
import static com.technus.helper2.ui.rankup.RankUpFragment.maxLimits;
import static com.technus.helper2.ui.rankup.RankUpFragment.minLimits;
import static com.technus.helper2.ui.rankup.RankUpFragment.outputResult;
import static com.technus.helper2.ui.rankup.RankUpFragment.resultOutput;
import static com.technus.helper2.ui.rankup.RankUpFragment.userName;

public class Fetch extends AsyncTask<Void,Integer,Void> {

    private final Context mContext;

    public Fetch(final Context context) {
        mContext = context;
    }


    public static String[] combat= new String[]{"Combat","1","0","0","0"};
    public static String[] mining= new String[]{"Mining","1","0","0","0"};
    public static String[] smithing= new String[]{"Smithing","1","0","0","0"};
    public static String[] woodcutting= new String[]{"Woodcutting","1","0","0","0"};
    public static String[] crafting= new String[]{"Crafting","1","0","0","0"};
    public static String[] fishing= new String[]{"Fishing","1","0","0","0"};
    public static String[] cooking= new String[]{"Cooking","1","0","0","0"};
    public static  String[][] results = new String[][]{combat,mining,smithing,woodcutting,crafting,fishing,cooking};
    public static int k;




    String[] skills={"","-mining","-smithing","-woodcutting","-crafting","-fishing","-cooking"};

        @Override
        protected Void doInBackground(Void... voids) {
            JSONParser parser = new JSONParser();
            int i,j;
            for(i=0; i<7; i++) { //loop through skills
                int rank ;
                for (j=maxLimits[i];j<=minLimits[i];j++) //loop through pages
                {
                    try {
                        URL url = new URL("https://www.curseofaros.com/highscores"+skills[i]+".json?p="+ j); // URL to Parse
                        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                        String inputLine;
                        while ((inputLine = bufferedReader.readLine()) != null) {
                            JSONArray page = (JSONArray) parser.parse(inputLine); //get page
                            int k =0;
                            for (Object player : page) { // loop through players in the page
                                k++;
                                JSONObject playerData = (JSONObject) player; //get player data
                                String name = (String) playerData.get("name"); //get player name
                                assert name != null;
                                if (name.equals(userName)) { //check if player is the user

                                    rank = 20 * j + k; //get rank
                                    Long xp = (Long) playerData.get("xp"); //get xp amount
                                    short lvl = Get.Lvl(xp); //get lvl
                                    double perc = Get.Percent(xp, lvl);//get percentage

                                    if((perc==100)||(lvl>=120)){
                                        perc=100;
                                        lvl=120;
                                    }
                                    results[i][1] = String.valueOf(lvl);
                                    results[i][2] = String.valueOf(xp);
                                    results[i][3] = String.valueOf(rank);
                                    results[i][4] = String.valueOf(perc);

                                    break;
                                }

                            }
                        }
                    } catch (IOException | ParseException e) {
                        e.printStackTrace();
                        }
                }
                publishProgress(i);
                    }

                return null;
            }


    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        int x = values[0];

        String[] outputSkills = {" Combat : 1-0% | 0 | 0 \n"," Mining : 1-0% | 0 | 0 \n" , " Smithing : 1-0% | 0 | 0 \n" , " Woodcutting : 1-0% | 0 | 0 \n" , " Crafting : 1-0% | 0 | 0 \n" , " Fishing : 1-0% | 0 | 0 \n" , " Cooking : 1-0% | 0 | 0 \n"} ;

        String outputTitle =" Skill :      LVL      |            XP            |      Rank \n";

        for (k=0;k<x+1;k++) {
            outputSkills[k] = results[k][0] + " : " + results[k][1] + "-" + results[k][4] + "%" + " | " + results[k][2] + " | " + results[k][3] + "\n" ;
            resultOutput = outputTitle +outputSkills[0]+outputSkills[1]+outputSkills[2]+outputSkills[3]+outputSkills[4]+outputSkills[5]+outputSkills[6];
            outputResult.setText(resultOutput);
        }


    }

    @Override
    protected void onPostExecute(Void unused) {
        super.onPostExecute(unused);



        if (mContext != null) {
            String playerNameTXT = userName;
            String combatLVL = results[0][1];
            String combatXP = results[0][2];
            String combatRANK = results[0][3];
            String miningLVL = results[1][1];
            String miningXP = results[1][2];
            String miningRANK = results[1][3];
            String smithingLVL = results[2][1] ;
            String smithingXP = results[2][2] ;
            String smithingRANK = results[2][3] ;
            String woodcuttingLVL = results[3][1];
            String woodcuttingXP = results[3][2];
            String woodcuttingRANK = results[3][3];
            String craftingLVL = results[4][1];
            String craftingXP = results[4][2];
            String craftingRANK = results[4][3];
            String fishingLVL = results[5][1];
            String fishingXP = results[5][2];
            String fishingRANK = results[5][3];
            String cookingLVL = results[6][1];
            String cookingXP = results[6][2];
            String cookingRANK = results[6][3];

            String[] playersNames = DB.GetNamesList();
            if (Arrays.asList(playersNames).contains(userName)){
                Boolean checkinsertdata = DB.updateUserData(playerNameTXT,combatLVL,combatXP,combatRANK,miningLVL,miningXP,miningRANK,smithingLVL,smithingXP,smithingRANK,
                        woodcuttingLVL,woodcuttingXP,woodcuttingRANK,craftingLVL,craftingXP,craftingRANK,fishingLVL,fishingXP,fishingRANK,cookingLVL,cookingXP,cookingRANK);
                Toast.makeText(mContext,userName+" Data Updated",Toast.LENGTH_SHORT).show();
            }
            else{
                Boolean checkinsertdata = DB.insertUserData(playerNameTXT,combatLVL,combatXP,combatRANK,miningLVL,miningXP,miningRANK,smithingLVL,smithingXP,smithingRANK,
                        woodcuttingLVL,woodcuttingXP,woodcuttingRANK,craftingLVL,craftingXP,craftingRANK,fishingLVL,fishingXP,fishingRANK,cookingLVL,cookingXP,cookingRANK);
                Toast.makeText(mContext,userName+" Data Registered",Toast.LENGTH_SHORT).show();
            }
        }








    }
}
