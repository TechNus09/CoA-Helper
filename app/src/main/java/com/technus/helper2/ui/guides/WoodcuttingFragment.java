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


public class WoodcuttingFragment extends Fragment {


    RecyclerView recyclerView;
    ArrayList<Lvls> lvlsArrayList;
    LAdapter lAdapter;
    String[] lvlsTitles,xpNeeded,main_rsc_needed,alt_rsc_needed,main_rsc_boosted,alt_rsc_boosted,main_rsc_name,alt_rsc_name;
    int[] iconsId;



    public WoodcuttingFragment() {
        // Required empty public constructor
    }

    public static WoodcuttingFragment newInstance(String param1, String param2) {
        return new WoodcuttingFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.woodcutting_fragment, container, false);
        recyclerView = v.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        lvlsArrayList = new ArrayList<Lvls>();

        lAdapter = new LAdapter(getContext(),lvlsArrayList,R.layout.woodcutting_list,R.id.woodcutting_items);
        recyclerView.setAdapter(lAdapter);

        lvlsTitles = new String[] {
                "Lv.1 --> Lv.5"
                ,"Lv.5 --> Lv.10"
                ,"Lv.10 --> Lv.20"
                ,"Lv.20 --> Lv.30"
                ,"Lv.30 --> Lv.40"
                ,"Lv.40 --> Lv.50"
                ,"Lv.50 --> Lv.60"
                ,"Lv.60 --> Lv.70"
                ,"Lv.70 --> Lv.80"
                ,"Lv.80 --> Lv.90"
                ,"Lv.90 --> Lv.95"
                ,"Lv.95 --> Lv.100"
                ,"Lv.100 --> Lv.110"
                ,"Lv.110 --> Lv.120" };
        iconsId = new int[]{
                R.drawable.pine_log
                , R.drawable.dead_log
                , R.drawable.birch_log
                , R.drawable.applewood
                , R.drawable.willow_log
                , R.drawable.oak_log
                , R.drawable.chestnut_log
                , R.drawable.maple_log
                , R.drawable.olive_log
                , R.drawable.olive_log
                , R.drawable.palm_wood
                , R.drawable.palm_wood
                , R.drawable.palm_wood
                , R.drawable.palm_wood
                , R.drawable.palm_wood
        };
        xpNeeded = new String[]{
                getString(R.string.lvl_1_5)
                ,getString(R.string.lvl_5_10)
                ,getString(R.string.lvl_10_20)
                ,getString(R.string.lvl_20_30)
                ,getString(R.string.lvl_30_40)
                ,getString(R.string.lvl_40_50)
                ,getString(R.string.lvl_50_60)
                ,getString(R.string.lvl_60_70)
                ,getString(R.string.lvl_70_80)
                ,getString(R.string.lvl_80_90)
                ,getString(R.string.lvl_90_95)
                ,getString(R.string.lvl_95_100)
                ,getString(R.string.lvl_100_110)
                ,getString(R.string.lvl_110_120)};
        main_rsc_needed = new String[]{
                "23"
                ,"27"
                ,"65"
                ,"113"
                ,"149"
                ,"438"
                ,"1278"
                ,"2769"
                ,"7384"
                ,"20446"
                ,"27261"
                ,"54522"
                ,"327127"
                ,"1308506"
        };
        main_rsc_boosted = new String[] {
                "16"
                ,"18"
                ,"44"
                ,"76"
                ,"100"
                ,"292"
                ,"852"
                ,"1846"
                ,"4923"
                ,"13631"
                ,"18174"
                ,"36348"
                ,"218085"
                ,"872338"
        };
        alt_rsc_needed = new String[] {
                "0"
                ,"54"
                ,"1162"
                ,"2260"
                ,"3452"
                ,"4594"
                ,"51749"
                ,"65112"
                ,"711075"
                ,"829533"
                ,"939377"
                ,"978753"
                ,"1472517"
                ,"11890065"
        };
        alt_rsc_boosted = new String[] {
                "0"
                ,"36"
                ,"775"
                ,"1507"
                ,"2302"
                ,"3063"
                ,"34500"
                ,"43408"
                ,"474050"
                ,"553022"
                ,"626252"
                ,"652502"
                ,"981678"
                ,"7926710"
        };
        main_rsc_name = new String[]{
                getString(R.string.pine_log)
               ,getString(R.string.dead_log)
               ,getString(R.string.birch_log)
               ,getString(R.string.apple_wood)
               ,getString(R.string.willow_log)
               ,getString(R.string.oak_log)
               ,getString(R.string.chestnut_log)
               ,getString(R.string.maple_log)
               ,getString(R.string.olive_log)
               ,getString(R.string.palm_wood)
               ,getString(R.string.palm_wood)
               ,getString(R.string.palm_wood)
               ,getString(R.string.palm_wood)
               ,getString(R.string.palm_wood)

        };
        alt_rsc_name = new String[]{
                getString(R.string.none)
                ,getString(R.string.dead_log)
                ,getString(R.string.birch_log)
                ,getString(R.string.apple_wood)
                ,getString(R.string.willow_log)
                ,getString(R.string.oak_log)
                ,getString(R.string.chestnut_log)
                ,getString(R.string.maple_log)
                ,getString(R.string.olive_log)
                ,getString(R.string.olive_log)
                ,getString(R.string.olive_log)
                ,getString(R.string.olive_log)
                ,getString(R.string.olive_log)
                ,getString(R.string.olive_log)
        };







        data();

        return v;
    }

    private void data() {
        for (int i=0;i<lvlsTitles.length;i++){

            Lvls lvls = new Lvls(lvlsTitles[i],xpNeeded[i], iconsId[i],main_rsc_name[i],alt_rsc_name[i], main_rsc_needed[i],main_rsc_boosted[i],alt_rsc_needed[i],alt_rsc_boosted[i] );
            lvlsArrayList.add(lvls);
        }

        lAdapter.notifyDataSetChanged();

    }
}