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


public class CookingFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Lvls> lvlsArrayList;
    LAdapter lAdapter;
    String[] lvlsTitles,xpNeeded,main_rsc_needed,alt_rsc_needed,main_rsc_boosted,alt_rsc_boosted,main_rsc_name,alt_rsc_name;
    int[] iconsId;



    public CookingFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static CookingFragment newInstance(String param1, String param2) {

        return new CookingFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.cooking_fragment, container, false);
        recyclerView = v.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        lvlsArrayList = new ArrayList<Lvls>();

        lAdapter = new LAdapter(getContext(),lvlsArrayList,R.layout.cooking_list,R.id.cooking_items);
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
                R.drawable.cooked_anchovies
                , R.drawable.cooked_mackerel
                , R.drawable.cooked_squid
                , R.drawable.cooked_sardine
                , R.drawable.cooked_eel
                , R.drawable.cooked_anglerfish
                , R.drawable.cooked_trout
                , R.drawable.cooked_bass
                , R.drawable.cooked_tuna
                , R.drawable.cooked_lobster
                , R.drawable.cooked_sea_turtle
                , R.drawable.cooked_manta_ray
                , R.drawable.cooked_shark
                , R.drawable.cooked_orca
                , R.drawable.cooked_giant_squid
                , R.drawable.cooked_giant_squid
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
                ,"1,108"
                ,"2,462"
                ,"2,215"
                ,"2,532"
                ,"2,727"
                ,"3,731"
                ,"5,251"
                ,"6,301"
                ,"20,495"
                ,"81,979"
        };
        main_rsc_boosted = new String[] {
                "52"
                ,"44"
                ,"76"
                ,"93"
                ,"93"
                ,"148"
                ,"739"
                ,"1,641"
                ,"1,477"
                ,"1,688"
                ,"1,818"
                ,"2,487"
                ,"3,501"
                ,"4,201"
                ,"13,664"
                ,"54,653"
        };
        alt_rsc_needed = new String[] {
                "0"
                ,"324"
                ,"260"
                ,"452"
                ,"185"
                ,"277"
                ,"1,329"
                ,"4,430"
                ,"3,282"
                ,"4,430"
                ,"5,063"
                ,"5,453"
                ,"7,461"
                ,"10,501"
                ,"37,802"
                ,"151,206"
        };
        alt_rsc_boosted = new String[] {
                "0"
                ,"216"
                ,"174"
                ,"302"
                ,"124"
                ,"185"
                ,"886"
                ,"2,954"
                ,"2,188"
                ,"2,954"
                ,"3,376"
                ,"3,635"
                ,"4,974"
                ,"7,001"
                ,"25,201"
                ,"100,804"
        };
        main_rsc_name = new String[]{
                getString(R.string.cooked_anchovies)
                ,getString(R.string.cooked_mackerel)
                ,getString(R.string.cooked_squid)
                ,getString(R.string.cooked_sardine)
                ,getString(R.string.cooked_eel)
                ,getString(R.string.cooked_anglerfish)
                ,getString(R.string.cooked_trout)
                ,getString(R.string.cooked_bass)
                ,getString(R.string.cooked_tuna)
                ,getString(R.string.cooked_lobster)
                ,getString(R.string.cooked_sea_turtle)
                ,getString(R.string.cooked_manta_ray)
                ,getString(R.string.cooked_shark)
                ,getString(R.string.cooked_orca)
                ,getString(R.string.cooked_giant_squid)
                ,getString(R.string.cooked_giant_squid)

        };
        alt_rsc_name = new String[]{
                getString(R.string.none)
                ,getString(R.string.cooked_anchovies)
                ,getString(R.string.cooked_mackerel)
                ,getString(R.string.cooked_squid)
                ,getString(R.string.cooked_sardine)
                ,getString(R.string.cooked_eel)
                ,getString(R.string.cooked_anglerfish)
                ,getString(R.string.cooked_trout)
                ,getString(R.string.cooked_bass)
                ,getString(R.string.cooked_tuna)
                ,getString(R.string.cooked_lobster)
                ,getString(R.string.cooked_sea_turtle)
                ,getString(R.string.cooked_manta_ray)
                ,getString(R.string.cooked_shark)
                ,getString(R.string.cooked_orca)
                ,getString(R.string.cooked_orca)
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