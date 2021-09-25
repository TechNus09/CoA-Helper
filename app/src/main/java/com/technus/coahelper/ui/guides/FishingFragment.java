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
                 "Lv.1 --> Lv.5"
                ,"Lv.5 --> Lv.10"
                ,"Lv.10 --> Lv.20"
                ,"Lv.20 --> Lv.30"
                ,"Lv.30 --> Lv.40"
                ,"Lv.40 --> Lv.45"
                ,"Lv.45 --> Lv.50"
                ,"Lv.50 --> Lv.55"
                ,"Lv.55 --> Lv.60"
                ,"Lv.60 --> Lv.65"
                ,"Lv.65 --> Lv.70"
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
                , R.drawable.anchovies_goldfish
                , R.drawable.mackerel
                , R.drawable.squid
                , R.drawable.sardine
                , R.drawable.eel
                , R.drawable.anglerfish
                , R.drawable.trout
                , R.drawable.trout_jellyfish
                , R.drawable.bass
                , R.drawable.bass_bones
                , R.drawable.tuna
                , R.drawable.lobster
                , R.drawable.lobster_seaturtle
                , R.drawable.manta_ray
                , R.drawable.shark
                , R.drawable.shark_orca
                , R.drawable.shark_orca_giantsquid
                , R.drawable.shark_orca_giantsquid

        };
        xpNeeded = new String[]{
                 getString(R.string.lvl_1_5)
                ,getString(R.string.lvl_5_10)
                ,getString(R.string.lvl_10_20)
                ,getString(R.string.lvl_20_30)
                ,getString(R.string.lvl_30_40)
                ,getString(R.string.lvl_40_45)
                ,getString(R.string.lvl_45_50)
                ,getString(R.string.lvl_50_55)
                ,getString(R.string.lvl_55_60)
                ,getString(R.string.lvl_60_65)
                ,getString(R.string.lvl_65_70)
                ,getString(R.string.lvl_70_75)
                ,getString(R.string.lvl_75_80)
                ,getString(R.string.lvl_80_85)
                ,getString(R.string.lvl_85_90)
                ,getString(R.string.lvl_90_95)
                ,getString(R.string.lvl_95_100)
                ,getString(R.string.lvl_100_110)
                ,getString(R.string.lvl_110_120)};
        main_rsc_needed = new String[]{
                "23"
                ,"36"
                ,"65"
                ,"113"
                ,"139"
                ,"139"
                ,"222"
                ,"370"
                ,"672"
                ,"821"
                ,"1,453"
                ,"2,215"
                ,"2,532"
                ,"3,544"
                ,"3,731"
                ,"4,889"
                ,"6,444"
                ,"25,774"
                ,"103,095"
        };
        main_rsc_boosted = new String[] {
                "16"
                ,"24"
                ,"44"
                ,"76"
                ,"93"
                ,"93"
                ,"148"
                ,"247"
                ,"448"
                ,"547"
                ,"969"
                ,"1,477"
                ,"1,688"
                ,"2,366"
                ,"2,487"
                ,"3,259"
                ,"4,296"
                ,"17,183"
                ,"68,727"
        };
        alt_rsc_needed = new String[] {
                "0"
                ,"0"
                ,"217"
                ,"260"
                ,"452"
                ,"185"
                ,"277"
                ,"443"
                ,"886"
                ,"1,343"
                ,"2,685"
                ,"2,905"
                ,"4,430"
                ,"8,860"
                ,"7,088"
                ,"7,461"
                ,"14,922"
                ,"89,530"
                ,"358,118"
        };
        alt_rsc_boosted = new String[] {
                "0"
                ,"0"
                ,"145"
                ,"173"
                ,"301"
                ,"124"
                ,"185"
                ,"296"
                ,"591"
                ,"895"
                ,"1,790"
                ,"1,937"
                ,"2,954"
                ,"5,907"
                ,"4,726"
                ,"4,974"
                ,"9,948"
                ,"59,687"
                ,"238,745"
        };
        main_rsc_name = new String[]{
                 getString(R.string.anchovies)
                ,getString(R.string.anchovies_goldfish)
                ,getString(R.string.mackerel)
                ,getString(R.string.squid)
                ,getString(R.string.sardine)
                ,getString(R.string.eel)
                ,getString(R.string.anglerfish)
                ,getString(R.string.trout)
                ,getString(R.string.trout_jelly)
                ,getString(R.string.bass)
                ,getString(R.string.bass_bones)
                ,getString(R.string.tuna)
                ,getString(R.string.lobster)
                ,getString(R.string.lobster_sea_turtle)
                ,getString(R.string.manta_ray)
                ,getString(R.string.shark)
                ,getString(R.string.shark_orca)
                ,getString(R.string.shark_orca_giant_squid)
                ,getString(R.string.shark_orca_giant_squid)

        };
        alt_rsc_name = new String[]{
                 getString(R.string.none)
                ,getString(R.string.none)
                ,getString(R.string.anchovies_goldfish)
                ,getString(R.string.mackerel)
                ,getString(R.string.squid)
                ,getString(R.string.sardine)
                ,getString(R.string.eel)
                ,getString(R.string.anglerfish)
                ,getString(R.string.anglerfish)
                ,getString(R.string.trout_jelly)
                ,getString(R.string.trout_jelly)
                ,getString(R.string.bass_bones)
                ,getString(R.string.tuna)
                ,getString(R.string.tuna)
                ,getString(R.string.lobster_sea_turtle)
                ,getString(R.string.manta_ray)
                ,getString(R.string.manta_ray)
                ,getString(R.string.manta_ray)
                ,getString(R.string.manta_ray)
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