package com.technus.helper2.ui.guides;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.technus.helper2.R;

import java.util.ArrayList;


public class SmithingFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Lvls> lvlsArrayList;
    SmithingLAdapter smithingLAdapter;
    String[] lvlsTitles,xpNeeded,main_rsc_name,alt_rsc_name
            ,main_rsc_needed,alt_rsc_needed
            ,main_rsc_boosted1,alt_rsc_boosted1
            ,main_rsc_boosted2,alt_rsc_boosted2
            ,main_rsc_boosted3,alt_rsc_boosted3
            ,main_rsc_boosted4,alt_rsc_boosted4
            ,main_rsc_boosted5,alt_rsc_boosted5
            ,main_rsc_boosted6,alt_rsc_boosted6
            ,main_rsc_boosted7,alt_rsc_boosted7;

    int[] iconsId;


    public SmithingFragment() {

    }

    public static SmithingFragment newInstance(String param1, String param2) {
        return new SmithingFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.smithing_fragment, container, false);
        recyclerView = v.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        lvlsArrayList = new ArrayList<Lvls>();

        smithingLAdapter = new SmithingLAdapter(getContext(),lvlsArrayList,R.layout.smithing_list,R.id.smithing_items);
        recyclerView.setAdapter(smithingLAdapter);

        lvlsTitles = new String[] {
                "Lv.1 --> Lv.10"
                ,"Lv.10 --> Lv.20"
                ,"Lv.20 --> Lv.30"
                ,"Lv.30 --> Lv.30"
                ,"Lv.35 --> Lv.40"
                ,"Lv.40 --> Lv.45"
                ,"Lv.45 --> Lv.60"
                ,"Lv.60 --> Lv.65"
                ,"Lv.65 --> Lv.70"
                ,"Lv.70 --> Lv.80"
                ,"Lv.80 --> Lv.85"
                ,"Lv.85 --> Lv.90"
                ,"Lv.90 --> Lv.95"
                ,"Lv.95 --> Lv.100"
                ,"Lv.100 --> Lv.110"
                ,"Lv.110 --> Lv.120" };
        iconsId = new int[]{
                R.drawable.bronze_bar
                , R.drawable.iron_bar
                , R.drawable.steel_bar
                , R.drawable.crimsteel_bar
                , R.drawable.silver_bar
                , R.drawable.gold_bar
                , R.drawable.mythan_bar
                , R.drawable.cobalt_bar
                , R.drawable.cobalt_bar
                , R.drawable.varaxite_bar
                , R.drawable.varaxite_bar
                , R.drawable.varaxite_bar
                , R.drawable.varaxite_bar
                , R.drawable.varaxite_bar
                , R.drawable.varaxite_bar
                , R.drawable.varaxite_bar
        };
        xpNeeded = new String[]{
                 getString(R.string.lvl_1_10)
                ,getString(R.string.lvl_10_20)
                ,getString(R.string.lvl_20_30)
                ,getString(R.string.lvl_30_35)
                ,getString(R.string.lvl_35_40)
                ,getString(R.string.lvl_40_45)
                ,getString(R.string.lvl_45_60)
                ,getString(R.string.lvl_60_65)
                ,getString(R.string.lvl_65_70)
                ,getString(R.string.lvl_70_80)
                ,getString(R.string.lvl_80_85)
                ,getString(R.string.lvl_85_90)
                ,getString(R.string.lvl_90_95)
                ,getString(R.string.lvl_95_100)
                ,getString(R.string.lvl_100_110)
                ,getString(R.string.lvl_110_120)};
        main_rsc_needed = new String[]{
                "154"
                ,"232"
                ,"649"
                ,"134"
                ,"35"
                ,"11"
                ,"167"
                ,"74"
                ,"148"
                ,"222"
                ,"1329"
                ,"1772"
                ,"3544"
                ,"7088"
                ,"42527"
                ,"170106"
        };
        main_rsc_boosted1 = new String[] {
                "148"
                ,"223"
                ,"624"
                ,"129"
                ,"34"
                ,"11"
                ,"161"
                ,"71"
                ,"142"
                ,"213"
                ,"1278"
                ,"1704"
                ,"3408"
                ,"6815"
                ,"40891"
                ,"163563"
        };
        main_rsc_boosted2 = main_rsc_boosted1;
        main_rsc_boosted3 = new String[] {
                "143"
                ,"215"
                ,"601"
                ,"124"
                ,"32"
                ,"10"
                ,"155"
                ,"69 "
                ,"137"
                ,"206"
                ,"1231"
                ,"1641"
                ,"3281"
                ,"6563"
                ,"39377"
                ,"157506"
        };
        main_rsc_boosted4 = new String[] {
                "103"
                ,"155"
                ,"433"
                ,"89"
                ,"23"
                ,"7"
                ,"111"
                ,"49"
                ,"99"
                ,"148"
                ,"886"
                ,"1181"
                ,"2363"
                ,"4725"
                ,"28351"
                ,"113404"
        };
        main_rsc_boosted5 = new String[] {
                "100"
                ,"151"
                ,"421"
                ,"87"
                ,"23"
                ,"7"
                ,"108"
                ,"48"
                ,"96"
                ,"144"
                ,"863"
                ,"1151"
                ,"2301"
                ,"4603"
                ,"27615"
                ,"110458"
        };
        main_rsc_boosted6 = main_rsc_boosted5;
        main_rsc_boosted7 = new String[] {
                "97"
                ,"147"
                ,"411"
                ,"85"
                ,"22"
                ,"7"
                ,"106"
                ,"47"
                ,"94"
                ,"141"
                ,"841"
                ,"1122"
                ,"2243"
                ,"4486"
                ,"26916"
                ,"107662"
        };

        alt_rsc_needed = new String[] {
                "0"
                ,"649"
                ,"927"
                ,"866"
                ,"267"
                ,"208"
                ,"42"
                ,"222"
                ,"443"
                ,"296"
                ,"1772"
                ,"2363"
                ,"4726"
                ,"9451"
                ,"56702"
                ,"226808"
        };
        alt_rsc_boosted1 = new String[] {
                "0"
                ,"624"
                ,"891"
                ,"833"
                ,"257"
                ,"200"
                ,"40"
                ,"213"
                ,"426"
                ,"285"
                ,"1704"
                ,"2272"
                ,"4544"
                ,"9088"
                ,"54521"
                ,"218085"
        };
        alt_rsc_boosted2 = alt_rsc_boosted1;
        alt_rsc_boosted3 = new String[] {
                "0"
                ,"601"
                ,"858"
                ,"802"
                ,"247"
                ,"193"
                ,"39"
                ,"206"
                ,"410"
                ,"274"
                ,"1641"
                ,"2188"
                ,"4376"
                ,"8751"
                ,"52502"
                ,"210007"
        };
        alt_rsc_boosted4 = new String[] {
                "0"
                ,"433"
                ,"618"
                ,"577"
                ,"178"
                ,"139"
                ,"28"
                ,"148"
                ,"295"
                ,"197"
                ,"1181"
                ,"1575"
                ,"3151"
                ,"6301"
                ,"37801"
                ,"151205"
        };
        alt_rsc_boosted5 = new String[] {
                "0"
                ,"421"
                ,"602"
                ,"562"
                ,"173"
                ,"135"
                ,"27"
                ,"144"
                ,"288"
                ,"192"
                ,"1151"
                ,"1534"
                ,"3069"
                ,"6137"
                ,"36819"
                ,"147278"
        };
        alt_rsc_boosted6 = alt_rsc_boosted5;
        alt_rsc_boosted7 = new String[] {
                "0"
                ,"411"
                ,"587"
                ,"548"
                ,"169"
                ,"132"
                ,"27"
                ,"141"
                ,"280"
                ,"187"
                ,"1122"
                ,"1496"
                ,"2991"
                ,"5982"
                ,"35887"
                ,"143549"
        };
        main_rsc_name = new String[]{
                 getString(R.string.bronze_bar)
                ,getString(R.string.iron_bar)
                ,getString(R.string.steel_bar)
                ,getString(R.string.crimsteel_bar)
                ,getString(R.string.silver_bar)
                ,getString(R.string.gold_bar)
                ,getString(R.string.mythan_bar)
                ,getString(R.string.cobalt_bar)
                ,getString(R.string.varaxite_bar)
                ,getString(R.string.varaxite_bar)
                ,getString(R.string.varaxite_bar)
                ,getString(R.string.varaxite_bar)
                ,getString(R.string.varaxite_bar)
                ,getString(R.string.varaxite_bar)
                ,getString(R.string.varaxite_bar)
                ,getString(R.string.varaxite_bar)


        };
        alt_rsc_name = new String[]{
                 getString(R.string.none)
                ,getString(R.string.bronze_bar)
                ,getString(R.string.iron_bar)
                ,getString(R.string.steel_bar)
                ,getString(R.string.crimsteel_bar)
                ,getString(R.string.silver_bar)
                ,getString(R.string.gold_bar)
                ,getString(R.string.mythan_bar)
                ,getString(R.string.cobalt_bar)
                ,getString(R.string.cobalt_bar)
                ,getString(R.string.cobalt_bar)
                ,getString(R.string.cobalt_bar)
                ,getString(R.string.cobalt_bar)
                ,getString(R.string.cobalt_bar)
                ,getString(R.string.cobalt_bar)
                ,getString(R.string.cobalt_bar)

        };

        data();

        return v;
    }

    private void data() {
        for (int i=0;i<lvlsTitles.length;i++){

            Lvls lvls = new Lvls(lvlsTitles[i], iconsId[i],xpNeeded[i]
                    ,main_rsc_name[i],alt_rsc_name[i],main_rsc_needed[i],alt_rsc_needed[i]
                    ,main_rsc_boosted1[i],alt_rsc_boosted1[i]
                    ,main_rsc_boosted2[i],alt_rsc_boosted2[i]
                    ,main_rsc_boosted3[i],alt_rsc_boosted3[i]
                    ,main_rsc_boosted4[i],alt_rsc_boosted4[i]
                    ,main_rsc_boosted5[i],alt_rsc_boosted5[i]
                    ,main_rsc_boosted6[i],alt_rsc_boosted6[i]
                    ,main_rsc_boosted7[i],alt_rsc_boosted7[i]
            );
            lvlsArrayList.add(lvls);
        }

        smithingLAdapter.notifyDataSetChanged();

    }
}