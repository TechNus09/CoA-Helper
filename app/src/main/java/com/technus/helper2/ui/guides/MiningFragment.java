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

public class MiningFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Lvls> lvlsArrayList;
    MiningLAdapter miningLAdapter;
    String[] lvlsTitles,xpNeeded,main_rsc_needed,alt_rsc_needed,
            main_rsc_boosted1,alt_rsc_boosted1,
            main_rsc_boosted2,alt_rsc_boosted2,
            main_rsc_boosted3,alt_rsc_boosted3,
            main_rsc_name,alt_rsc_name;
    int[] iconsId;


    public MiningFragment() {
        // Required empty public constructor
    }

    public static MiningFragment newInstance(String param1, String param2) {
        return new MiningFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.mining_fragment, container, false);
        recyclerView = v.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        lvlsArrayList = new ArrayList<Lvls>();

        miningLAdapter = new MiningLAdapter(getContext(),lvlsArrayList,R.layout.mining_list,R.id.mining_items);
        recyclerView.setAdapter(miningLAdapter);

        lvlsTitles = new String[] {
                "Lv.1 --> Lv.10"
                ,"Lv.10 --> Lv.15"
                ,"Lv.15 --> Lv.20"
                ,"Lv.20 --> Lv.25"
                ,"Lv.25 --> Lv.30"
                ,"Lv.30 --> Lv.40"
                ,"Lv.40 --> Lv.45"
                ,"Lv.45 --> Lv.50"
                ,"Lv.50 --> Lv.55"
                ,"Lv.55 --> Lv.60"
                ,"Lv.60 --> Lv.70"
                ,"Lv.70 --> Lv.75"
                ,"Lv.75 --> Lv.80"
                ,"Lv.80 --> Lv.90"
                ,"Lv.90 --> Lv.95"
                ,"Lv.95 --> Lv.100"
                ,"Lv.100 --> Lv.110"
                ,"Lv.110 --> Lv.120" };
        iconsId = new int[]{
                R.drawable.tin_ore
                , R.drawable.iron_ore
                , R.drawable.salt
                , R.drawable.coal
                , R.drawable.silver_ore
                , R.drawable.crimsteel_ore
                , R.drawable.gold_ore
                , R.drawable.pink_salt
                , R.drawable.mythan_ore
                , R.drawable.sandstone
                , R.drawable.cobalt_ore
                , R.drawable.varaxium
                , R.drawable.black_salt
                , R.drawable.black_salt
                , R.drawable.black_salt
                , R.drawable.black_salt
                , R.drawable.black_salt
                , R.drawable.black_salt

        };
        xpNeeded = new String[]{
                getString(R.string.lvl_1_10)
                ,getString(R.string.lvl_10_15)
                ,getString(R.string.lvl_15_20)
                ,getString(R.string.lvl_20_25)
                ,getString(R.string.lvl_25_30)
                ,getString(R.string.lvl_30_40)
                ,getString(R.string.lvl_40_45)
                ,getString(R.string.lvl_45_50)
                ,getString(R.string.lvl_50_55)
                ,getString(R.string.lvl_55_60)
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
                ,"22"
                ,"28"
                ,"38"
                ,"65"
                ,"149"
                ,"174"
                ,"277"
                ,"426"
                ,"504"
                ,"2769"
                ,"2462"
                ,"3544"
                ,"21264"
                ,"28351"
                ,"56702"
                ,"340212"
                ,"1360847"
        };
        main_rsc_boosted1 = new String[] {
                "73"
                ,"21"
                ,"27"
                ,"36"
                ,"62"
                ,"142"
                ,"166"
                ,"264"
                ,"406"
                ,"480"
                ,"2637"
                ,"2345"
                ,"3375"
                ,"20251"
                ,"27001"
                ,"54002"
                ,"324011"
                ,"1296045"
        };
        main_rsc_boosted2 = new String[] {
                "51"
                ,"15"
                ,"19"
                ,"25"
                ,"43"
                ,"99"
                ,"116"
                ,"185"
                ,"284"
                ,"336"
                ,"1846"
                ,"1641"
                ,"2363"
                ,"14176"
                ,"18901"
                ,"37801"
                ,"226808"
                ,"907231"
        };
        main_rsc_boosted3 = new String[] {
                "50"
                ,"14"
                ,"18"
                ,"25"
                ,"42"
                ,"96"
                ,"112"
                ,"179"
                ,"275"
                ,"325"
                ,"1786"
                ,"1588"
                ,"2286"
                ,"13719"
                ,"18291"
                ,"36582"
                ,"219492"
                ,"877966"
        };

        alt_rsc_needed = new String[] {
                 "0"
                ,"108"
                ,"44"
                ,"55"
                ,"76"
                ,"385"
                ,"198"
                ,"347"
                ,"554"
                ,"852"
                ,"3021"
                ,"3692"
                ,"4923"
                ,"29533"
                ,"39377"
                ,"78753"
                ,"472517"
                ,"1890065"
        };
        alt_rsc_boosted1 = new String[] {
                "0"
                ,"103"
                ,"42"
                ,"52"
                ,"72"
                ,"367"
                ,"189"
                ,"330"
                ,"528"
                ,"811"
                ,"2877"
                ,"3516"
                ,"4689"
                ,"28127"
                ,"37502"
                ,"75003"
                ,"450016"
                ,"1800062"
        };
        alt_rsc_boosted2 = new String[] {
                 "0"
                ,"72"
                ,"29"
                ,"37"
                ,"51"
                ,"257"
                ,"132"
                ,"231"
                ,"369"
                ,"568"
                ,"2014"
                ,"2461"
                ,"3282"
                ,"19689"
                ,"26251"
                ,"52502"
                ,"315011"
                ,"1260043"
        };
        alt_rsc_boosted3 = new String[] {
                "0"
                ,"70"
                ,"28"
                ,"35"
                ,"49"
                ,"248"
                ,"128"
                ,"224"
                ,"357"
                ,"550"
                ,"1949"
                ,"2382"
                ,"3176"
                ,"19054"
                ,"25405"
                ,"50808"
                ,"304850"
                ,"1219397"
        };

        main_rsc_name = new String[]{
                 getString(R.string.tin_ore)
                ,getString(R.string.iron_ore)
                ,getString(R.string.salt)
                ,getString(R.string.coal)
                ,getString(R.string.silver_ore)
                ,getString(R.string.crimsteel_ore)
                ,getString(R.string.gold_ore)
                ,getString(R.string.pink_salt)
                ,getString(R.string.mythan_ore)
                ,getString(R.string.sandstone)
                ,getString(R.string.cobalt_ore)
                ,getString(R.string.varaxium)
                ,getString(R.string.black_salt)
                ,getString(R.string.black_salt)
                ,getString(R.string.black_salt)
                ,getString(R.string.black_salt)
                ,getString(R.string.black_salt)
                ,getString(R.string.black_salt)

        };
        alt_rsc_name = new String[]{
                 getString(R.string.none)
                , getString(R.string.tin_ore)
                ,getString(R.string.iron_ore)
                ,getString(R.string.salt)
                ,getString(R.string.coal)
                ,getString(R.string.silver_ore)
                ,getString(R.string.crimsteel_ore)
                ,getString(R.string.gold_ore)
                ,getString(R.string.pink_salt)
                ,getString(R.string.mythan_ore)
                ,getString(R.string.sandstone)
                ,getString(R.string.cobalt_ore)
                ,getString(R.string.varaxium)
                ,getString(R.string.varaxium)
                ,getString(R.string.varaxium)
                ,getString(R.string.varaxium)
                ,getString(R.string.varaxium)
                ,getString(R.string.varaxium)

        };

        data();

        return v;
    }

    private void data() {
        for (int i=0;i<lvlsTitles.length;i++){

            Lvls lvls = new Lvls(lvlsTitles[i], iconsId[i],xpNeeded[i],main_rsc_name[i],alt_rsc_name[i], main_rsc_needed[i],alt_rsc_needed[i],main_rsc_boosted1[i],alt_rsc_boosted1[i],main_rsc_boosted2[i],alt_rsc_boosted2[i],main_rsc_boosted3[i],alt_rsc_boosted3[i] );
            lvlsArrayList.add(lvls);
        }

        miningLAdapter.notifyDataSetChanged();

    }
}