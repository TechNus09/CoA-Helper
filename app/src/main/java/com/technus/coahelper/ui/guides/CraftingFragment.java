package com.technus.coahelper.ui.guides;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.technus.coahelper.R;

import java.util.ArrayList;


public class CraftingFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Lvls> lvlsArrayList;
    LAdapter lAdapter;
    String[] lvlsTitles,xpNeeded,main_rsc_needed,alt_rsc_needed,main_rsc_boosted,alt_rsc_boosted,main_rsc_name,alt_rsc_name;
    int[] iconsId;


    public CraftingFragment() {
        // Required empty public constructor
    }

    public static CraftingFragment newInstance(String param1, String param2) {

        return new CraftingFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.crafting_fragment, container, false);
        recyclerView = v.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        lvlsArrayList = new ArrayList<Lvls>();

        lAdapter = new LAdapter(getContext(),lvlsArrayList,R.layout.crafting_list,R.id.crafting_items);
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
                ,"Lv.70 --> Lv.75"
                ,"Lv.75 --> Lv.80"
                ,"Lv.80 --> Lv.90"
                ,"Lv.90 --> Lv.95"
                ,"Lv.95 --> Lv.100"
                ,"Lv.100 --> Lv.110"
                ,"Lv.110 --> Lv.120" };
        iconsId = new int[]{
                R.drawable.accuracy_relic
                , R.drawable.guarding_relic
                , R.drawable.healing_relic
                , R.drawable.wealth_relic
                , R.drawable.power_relic
                , R.drawable.nature_relic
                , R.drawable.fire_relic
                , R.drawable.damage_relic
                , R.drawable.leeching_relic
                , R.drawable.experience_relic
                , R.drawable.cursed_relic
                , R.drawable.cursed_relic
                , R.drawable.cursed_relic
                , R.drawable.cursed_relic
                , R.drawable.cursed_relic
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
                ,getString(R.string.lvl_70_75)
                ,getString(R.string.lvl_75_80)
                ,getString(R.string.lvl_80_90)
                ,getString(R.string.lvl_90_95)
                ,getString(R.string.lvl_95_100)
                ,getString(R.string.lvl_100_110)
                ,getString(R.string.lvl_110_120)};

        main_rsc_needed = new String[]{
                "77"
                ,"68"
                ,"180"
                ,"325"
                ,"495"
                ,"1,039"
                ,"1,955"
                ,"3,692"
                ,"3,165"
                ,"4,790"
                ,"19,331"
                ,"25,774"
                ,"51,548"
                ,"309,284"
                ,"1,237,133"
        };
        main_rsc_boosted = new String[] {
                "52"
                ,"46"
                ,"120"
                ,"217"
                ,"330"
                ,"693"
                ,"1,304"
                ,"2,462"
                ,"2,110"
                ,"3,194"
                ,"12,888"
                ,"17,183"
                ,"34,366"
                ,"206,190"
                ,"824,756"
        };
        alt_rsc_needed = new String[] {
                "0"
                ,"180"
                ,"406"
                ,"721"
                ,"1,298"
                ,"1,978"
                ,"4,153"
                ,"7,818"
                ,"4,923"
                ,"6,329"
                ,"28,735"
                ,"38,313"
                ,"76,625"
                ,"459,746"
                ,"1,838,982"
        };
        alt_rsc_boosted = new String[] {
                "0"
                ,"120"
                ,"271"
                ,"481"
                ,"866"
                ,"1,319"
                ,"2,769"
                ,"5,212"
                ,"3,282"
                ,"4,220"
                ,"19,157"
                ,"25,542"
                ,"51,084"
                ,"306,498"
                ,"1,225,988"
        };
        main_rsc_name = new String[]{
                getString(R.string.accuracy_relic)
                ,getString(R.string.guarding_relic)
                ,getString(R.string.healing_relic)
                ,getString(R.string.wealth_relic)
                ,getString(R.string.power_relic)
                ,getString(R.string.nature_relic)
                ,getString(R.string.fire_relic)
                ,getString(R.string.damage_relic)
                ,getString(R.string.leeching_relic)
                ,getString(R.string.experience_relic)
                ,getString(R.string.cursed_relic)
                ,getString(R.string.cursed_relic)
                ,getString(R.string.cursed_relic)
                ,getString(R.string.cursed_relic)
                ,getString(R.string.cursed_relic)

        };
        alt_rsc_name = new String[]{
                getString(R.string.none)
                ,getString(R.string.accuracy_relic)
                ,getString(R.string.guarding_relic)
                ,getString(R.string.healing_relic)
                ,getString(R.string.wealth_relic)
                ,getString(R.string.power_relic)
                ,getString(R.string.nature_relic)
                ,getString(R.string.fire_relic)
                ,getString(R.string.damage_relic)
                ,getString(R.string.leeching_relic)
                ,getString(R.string.experience_relic)
                ,getString(R.string.experience_relic)
                ,getString(R.string.experience_relic)
                ,getString(R.string.experience_relic)
                ,getString(R.string.experience_relic)

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