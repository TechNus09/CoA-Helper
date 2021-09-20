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
                ,"Lv.30 --> Lv.35"
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
                ,"34"
                ,"4"
                ,"108"
                ,"74"
                ,"148"
                ,"665"
                ,"886"
                ,"1,772"
                ,"3,544"
                ,"7,088"
                ,"42,527"
                ,"170,106"
        };
        main_rsc_boosted1 = new String[] {
                 "149"
                ,"224"
                ,"625"
                ,"129"
                ,"33"
                ,"4"
                ,"104"
                ,"72"
                ,"143"
                ,"640"
                ,"852"
                ,"1,704"
                ,"3,408"
                ,"6,816"
                ,"40,892"
                ,"163,564"
        };
        main_rsc_boosted2 = main_rsc_boosted1;
        main_rsc_boosted3 = new String[] {
                 "143"
                ,"215"
                ,"601"
                ,"124"
                ,"32"
                ,"4"
                ,"100"
                ,"69"
                ,"137"
                ,"615"
                ,"820"
                ,"1,639"
                ,"3,277"
                ,"6,554"
                ,"39,319"
                ,"157,273"
        };
        main_rsc_boosted4 = new String[] {
                 "103"
                ,"155"
                ,"433"
                ,"90"
                ,"23"
                ,"3"
                ,"72"
                ,"50"
                ,"99"
                ,"444"
                ,"591"
                ,"1,182"
                ,"2,363"
                ,"4,726"
                ,"28,352"
                ,"113,404"
        };
        main_rsc_boosted5 = new String[] {
                 "99"
                ,"149"
                ,"417"
                ,"86"
                ,"22"
                ,"3"
                ,"70"
                ,"48"
                ,"95"
                ,"427"
                ,"568"
                ,"1,136"
                ,"2,272"
                ,"4,544"
                ,"27,261"
                ,"109,043"
        };
        main_rsc_boosted6 = main_rsc_boosted5;
        main_rsc_boosted7 = new String[] {
                 "95"
                ,"143"
                ,"401"
                ,"83"
                ,"21"
                ,"3"
                ,"67"
                ,"46"
                ,"92"
                ,"410"
                ,"547"
                ,"1,093"
                ,"2,185"
                ,"4,369"
                ,"26,213"
                ,"104,849"
        };

        alt_rsc_needed = new String[] {
                "0"
                ,"648"
                ,"927"
                ,"866"
                ,"267"
                ,"68"
                ,"49"
                ,"222"
                ,"443"
                ,"886"
                ,"1,182"
                ,"2,363"
                ,"4,726"
                ,"9,451"
                ,"56,702"
                ,"226,808"
        };
        alt_rsc_boosted1 = new String[] {
                "0"
                ,"624"
                ,"892"
                ,"833"
                ,"257"
                ,"66"
                ,"48"
                ,"214"
                ,"426"
                ,"852"
                ,"1,137"
                ,"2,273"
                ,"4,545"
                ,"9,088"
                ,"54,522"
                ,"218,085"
        };
        alt_rsc_boosted2 = alt_rsc_boosted1;
        alt_rsc_boosted3 = new String[] {
                "0"
                ,"600"
                ,"858"
                ,"801"
                ,"247"
                ,"63"
                ,"46"
                ,"206"
                ,"410"
                ,"820"
                ,"1,093"
                ,"2,185"
                ,"4,370"
                ,"8,738"
                ,"52,425"
                ,"209,697"
        };
        alt_rsc_boosted4 = new String[] {
                "0"
                ,"432"
                ,"618"
                ,"578"
                ,"178"
                ,"46"
                ,"33"
                ,"148"
                ,"296"
                ,"591"
                ,"788"
                ,"1,576"
                ,"3,151"
                ,"6,301"
                ,"37,802"
                ,"151,206"
        };
        alt_rsc_boosted5 = new String[] {
                "0"
                ,"416"
                ,"595"
                ,"556"
                ,"172"
                ,"44"
                ,"32"
                ,"143"
                ,"284"
                ,"568"
                ,"758"
                ,"1,515"
                ,"3,030"
                ,"6,059"
                ,"36,348"
                ,"145,390"
        };
        alt_rsc_boosted6 = alt_rsc_boosted5;
        alt_rsc_boosted7 = new String[] {
                "0"
                ,"400"
                ,"572"
                ,"534"
                ,"165"
                ,"42"
                ,"31"
                ,"137"
                ,"274"
                ,"547"
                ,"729"
                ,"1,457"
                ,"2,913"
                ,"5,826"
                ,"34,950"
                ,"139,798"
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