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


public class FishingFragment extends Fragment {


    RecyclerView recyclerView;
    ArrayList<Lvls> lvlsArrayList;
    LAdapter lAdapter;
    String[] lvlsTitles,xpNeeded,main_rsc_needed,alt_rsc_needed,main_rsc_boosted,alt_rsc_boosted,main_rsc_name,alt_rsc_name;
    int[] iconsId;


    public FishingFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FishingFragment newInstance(String param1, String param2) {

        return new FishingFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fishing_fragment, container, false);
        recyclerView = v.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        lvlsArrayList = new ArrayList<Lvls>();

        lAdapter = new LAdapter(getContext(),lvlsArrayList,R.layout.fishing_list,R.id.fishing_items);
        recyclerView.setAdapter(lAdapter);

        lvlsTitles = new String[] {
                "Lv.1 --> Lv.10"
                ,"Lv.10 --> Lv.20"
                ,"Lv.20 --> Lv.30"
                ,"Lv.30 --> Lv.40"
                ,"Lv.40 --> Lv.45"
                ,"Lv.45 --> Lv.50"
                ,"Lv.50 --> Lv.60"
                ,"Lv.60 --> Lv.70"
                ,"Lv.70 --> Lv.75"
                ,"Lv.75 --> Lv.80"
                ,"Lv.80 --> Lv.85"
                ,"Lv.85 --> Lv.90"
                ,"Lv.90 --> Lv.95"
                ,"Lv.95 --> Lv.100"
                ,"Lv.100 --> Lv.110"
                ,"Lv.110 --> Lv.120" };
        iconsId = new int[]{
                R.drawable.anchovies
                , R.drawable.mackerel
                , R.drawable.squid
                , R.drawable.sardine
                , R.drawable.eel
                , R.drawable.anglerfish
                , R.drawable.trout
                , R.drawable.bass
                , R.drawable.tuna
                , R.drawable.lobster
                , R.drawable.sea_turtle
                , R.drawable.manta_ray
                , R.drawable.shark
                , R.drawable.orca
                , R.drawable.giant_squid
                , R.drawable.giant_squid
        };
        xpNeeded = new String[]{
                 getString(R.string.lvl_1_10)
                ,getString(R.string.lvl_10_20)
                ,getString(R.string.lvl_20_30)
                ,getString(R.string.lvl_30_40)
                ,getString(R.string.lvl_40_45)
                ,getString(R.string.lvl_45_50)
                ,getString(R.string.lvl_50_60)
                ,getString(R.string.lvl_60_70)
                ,getString(R.string.lvl_70_75)
                ,getString(R.string.lvl_75_80)
                ,getString(R.string.lvl_80_85)
                ,getString(R.string.lvl_85_90)
                ,getString(R.string.lvl_90_95)
                ,getString(R.string.lvl_95_100)
                ,getString(R.string.lvl_100_110)
                ,getString(R.string.lvl_110_120)};
        main_rsc_needed = new String[]{
                "77"
                ,"65"
                ,"113"
                ,"139"
                ,"139"
                ,"222"
                ,"1042"
                ,"2274"
                ,"2215"
                ,"2532"
                ,"2727"
                ,"3731"
                ,"4889"
                ,"6444"
                ,"25774"
                ,"10309"
        };
        main_rsc_boosted = new String[] {
                 "52"
                ,"44"
                ,"76"
                ,"93"
                ,"93"
                ,"148"
                ,"695"
                ,"1516"
                ,"1477"
                ,"1688"
                ,"1818"
                ,"2487"
                ,"3259"
                ,"4296"
                ,"17183"
                ,"6873"
        };
        alt_rsc_needed = new String[] {
                "0"
                ,"324"
                ,"260"
                ,"630"
                ,"185"
                ,"277"
                ,"1329"
                ,"4028"
                ,"2905"
                ,"4430"
                ,"5063"
                ,"7088"
                ,"7461"
                ,"14922"
                ,"89530"
                ,"358118"
        };
        alt_rsc_boosted = new String[] {
                "0"
                ,"216"
                ,"174"
                ,"420"
                ,"123"
                ,"185"
                ,"886"
                ,"2685"
                ,"1937"
                ,"2954"
                ,"3376"
                ,"4725"
                ,"4974"
                ,"9948"
                ,"59687"
                ,"238745"
        };
        main_rsc_name = new String[]{
                getString(R.string.anchovies)
                ,getString(R.string.mackerel)
                ,getString(R.string.squid)
                ,getString(R.string.sardine)
                ,getString(R.string.eel)
                ,getString(R.string.anglerfish)
                ,getString(R.string.trout)
                ,getString(R.string.bass)
                ,getString(R.string.tuna)
                ,getString(R.string.lobster)
                ,getString(R.string.sea_turtle)
                ,getString(R.string.manta_ray)
                ,getString(R.string.shark)
                ,getString(R.string.orca)
                ,getString(R.string.giant_squid)
                ,getString(R.string.giant_squid)

        };
        alt_rsc_name = new String[]{
                getString(R.string.none)
                ,getString(R.string.anchovies)
                ,getString(R.string.mackerel)
                ,getString(R.string.squid)
                ,getString(R.string.sardine)
                ,getString(R.string.eel)
                ,getString(R.string.anglerfish)
                ,getString(R.string.trout)
                ,getString(R.string.bass)
                ,getString(R.string.tuna)
                ,getString(R.string.lobster)
                ,getString(R.string.sea_turtle)
                ,getString(R.string.manta_ray)
                ,getString(R.string.shark)
                ,getString(R.string.orca)
                ,getString(R.string.orca)
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