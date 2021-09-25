package com.technus.coahelper.ui.rankup;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.technus.coahelper.R;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class RankUpFragment extends Fragment {


    public static String userName;
    public static  String resultOutput;
    String strLimit;
    String initResultOutput=" Skill :      LVL      |            XP            |      Rank \n" +
            " Combat : 1-0% | 0 | 0 \n" +
            " Mining : 1-0% | 0 | 0 \n" +
            " Smithing : 1-0% | 0 | 0 \n" +
            " Woodcutting : 1-0% | 0 | 0 \n" +
            " Crafting : 1-0% | 0 | 0 \n" +
            " Fishing : 1-0% | 0 | 0 \n" +
            " Cooking : 1-0% | 0 | 0 \n";

    public static int limit;
    int lim;
    public static int[] minLimits ={0,0,0,0,0,0,0};
    public static int[] maxLimits ={0,0,0,0,0,0,0};
    EditText ipUserName;
    EditText ipLimit;
    public static DBHelper DB;
    public static TextView outputResult;
    Button btnSearch,btnHelp,btnView,btnDelete;
    String helpTxt = "*Make sure to write your in-game name correctly.\n" +
            "*Search limit must be greater than 0.\n" +
            "*Search limit is the max rank limit the app will search for, if the data of one of the skills remain 0 that mean your rank is lower than the limit, try to set it bigger.\n" +
            "*The app check the players names one by one , the lower your rank is ,the longer the search will be(10s for each 1000 ranks).\n"+
            "*The search will become way faster for the second time and go on, so for the first time searching for someone enter a big search limit and let it take its time.\n"+
            "*The second time you search for someone , u don't need to enter a search limit.\n"+
            "*The app extract the data from the official website, if the app doesn't work:\n"+
            "     **Check your internet connection.\n"+
            "     **Check if the website is working.\n"+
            "     **Check for new updates on github.com/TechNus09/RankUp/releases/.\n"+
            "Note:The website Leaderboard update itself every few minutes (around 5mn) so its data will have 5mn delay than the in-game data.";
    String helpTxt1 = "* Username : Enter your Username correctly.\n" +
            "* Limit : Enter your lowest rank (If you don't know it, enter a big number like 50000, delete and increase it until u get your full data).\n" +
            "* View : View the recent stored Data of the given Username.\n" +
            "* Delete : Delete the stored data of the given Username (In case some skills weren't updated).\n" +
            "* The lowest your levels the longer the search will be.\n" +
            "* The first search will be so slow, but afterward it will become way faster.\n" +
            "* If the CoA website is down, the results might be incorrect.\n" ;



    public RankUpFragment(){

    }


    @Override
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rankup, container, false);

        ipUserName = view.findViewById(R.id.ipUserName);
        ipLimit =  view.findViewById(R.id.ipLimit);
        if (savedInstanceState != null){
            String name = savedInstanceState.getString("user_name");
            String number = savedInstanceState.getString("limit");

            ipUserName.setText(name);
            ipLimit.setText(number);
        }



        return view;
    }


    @Override
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {




        ///////////

        DB = new DBHelper(getContext());
        Cursor resTest = DB.getUserData("TestTest");
        if(resTest.getCount()==0){
            DB.insertUserData("TestTest","999","999","999","999","999","999",
                    "999","999","999","999", "999","999","999",
                    "999","999","999","999","999","999","999","999");
        }



        outputResult =  view.findViewById(R.id.outputResult);
        btnSearch = view.findViewById(R.id.btnSearch);
        btnHelp =  view.findViewById(R.id.btnHelp);
        btnView=  view.findViewById(R.id.btnView);
        btnDelete=  view.findViewById(R.id.btnDelete);




        //show help instructs
        btnHelp.setOnClickListener(v -> CreateAlertDialog());


        // search for player data
        btnSearch.setOnClickListener(v -> {


            outputResult.setText(initResultOutput);

            try { //Registered Name Search
                userName = ipUserName.getText().toString().trim();

            } catch (NullPointerException ex) {
                showToast("please enter a UserName");
                return;
            }
            if (userName.equals("")) {
                showToast("please enter a UserName");
            }


            String[] playersNames = DB.GetNamesList();
            if (Arrays.asList(playersNames).contains(userName)){
                Cursor res = DB.getUserData(userName);
                int[] ranks= {0,0,0,0,0,0,0};
                int i;
                while(res.moveToNext()){
                    for (i=3;i<22;i=i+3) {
                        int temp = Integer.parseInt(res.getString(i));
                        ranks[(i/3)-1]=temp;
                    }
                }
                int j;
                for (j=0;j<7;j++){
                    minLimits[j]=SpeedUp.minLimit(ranks[j]);
                    maxLimits[j]=SpeedUp.maxLimit(ranks[j]);
                }
                //showToast("Searching...");
                Fetch process = new Fetch(getContext());
                process.execute();
                Toast.makeText(getContext(), "Searching and Updating "+userName+" Data.", Toast.LENGTH_SHORT).show();



//
            }
            else{ //Fresh Search
                try {
                    userName = ipUserName.getText().toString().trim();

                } catch (NullPointerException ex) {
                    showToast("please enter a UserName");
                    return;
                }
                if (userName.equals("")) {
                    showToast("please enter a UserName");
                }
                try {
                    strLimit = ipLimit.getText().toString().trim();
                    lim = Integer.parseInt(strLimit);
                    limit = (lim / 20) + 1;
                } catch (NumberFormatException ex) {
                    showToast("please enter a valid number");
                    return;
                }

                int i;
                for (i=0;i<7;i++){
                    minLimits[i]=limit;
                    maxLimits[i]=0;
                }
                //showToast("Searching...");
                Fetch process = new Fetch(getContext());
                process.execute();

                Toast.makeText(getContext(), "Searching and Registering "+userName+" Data.", Toast.LENGTH_SHORT).show();


            }

        });

        //display username's data
        btnView.setOnClickListener(v -> {

            try {
                userName = ipUserName.getText().toString().trim();

            } catch (NullPointerException ex) {
                showToast("please enter a UserName");
                return;
            }

            Cursor res = DB.getUserData(userName);
            if ((userName == null) || (userName.equals(""))){
                Toast.makeText(getContext(), "Please Enter a UserName", Toast.LENGTH_SHORT).show();
            }
            else if(res.getCount()==0){
                Toast.makeText(getContext(), "Username Not Registered", Toast.LENGTH_SHORT).show();
            }
            else if (res.getCount()!=0){
                StringBuilder buffer = new StringBuilder();
                while(res.moveToNext()){
                    buffer.append("PlayerName :").append(res.getString(0)).append("\n");
                    buffer.append("  ----------------------- ").append("\n");
                    buffer.append("Combat lvl :").append(res.getString(1)).append("\n");
                    buffer.append("Combat xp :").append(res.getString(2)).append("\n");
                    buffer.append("Combat rank :").append(res.getString(3)).append("\n");
                    buffer.append("  ----------------------- ").append("\n");
                    buffer.append("Mining lvl :").append(res.getString(4)).append("\n");
                    buffer.append("Mining xp :").append(res.getString(5)).append("\n");
                    buffer.append("Mining rank :").append(res.getString(6)).append("\n");
                    buffer.append("  ----------------------- ").append("\n");
                    buffer.append("Smithing lvl :").append(res.getString(7)).append("\n");
                    buffer.append("Smithing xp :").append(res.getString(8)).append("\n");
                    buffer.append("Smithing rank :").append(res.getString(9)).append("\n");
                    buffer.append("  ----------------------- ").append("\n");
                    buffer.append("Woodcutting lvl :").append(res.getString(10)).append("\n");
                    buffer.append("Woodcutting xp :").append(res.getString(11)).append("\n");
                    buffer.append("Woodcutting rank :").append(res.getString(12)).append("\n");
                    buffer.append("  ----------------------- ").append("\n");
                    buffer.append("Crafting lvl :").append(res.getString(13)).append("\n");
                    buffer.append("Crafting xp :").append(res.getString(14)).append("\n");
                    buffer.append("Crafting rank :").append(res.getString(15)).append("\n");
                    buffer.append("  ----------------------- ").append("\n");
                    buffer.append("Fishing lvl :").append(res.getString(16)).append("\n");
                    buffer.append("Fishing xp :").append(res.getString(17)).append("\n");
                    buffer.append("Fishing rank :").append(res.getString(18)).append("\n");
                    buffer.append("  ----------------------- ").append("\n");
                    buffer.append("Cooking lvl :").append(res.getString(19)).append("\n");
                    buffer.append("Cooking xp :").append(res.getString(20)).append("\n");
                    buffer.append("Cooking rank :").append(res.getString(21)).append("\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setCancelable(true);
                builder.setTitle(userName+"'s Data");
                builder.setMessage(buffer.toString());
                builder.show();
            }

        });

        //deleting username's data
        btnDelete.setOnClickListener(v -> {

            try {
                userName = ipUserName.getText().toString().trim();

            } catch (NullPointerException ex) {
                showToast("please enter a UserName");
                return;
            }
            DB.deleteUserData(userName);
        });









    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private void CreateAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle("how to use me");
        builder.setMessage(helpTxt1);
        builder.show();
    }

    public void showToast(String text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }
}