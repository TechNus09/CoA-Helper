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
                ,"2,769"
                ,"2,462"
                ,"3,544"
                ,"21,264"
                ,"28,351"
                ,"56,702"
                ,"340,212"
                ,"1,360,847"
        };
        main_rsc_boosted1 = new String[] {
                "74"
                ,"21"
                ,"27"
                ,"37"
                ,"62"
                ,"142"
                ,"166"
                ,"264"
                ,"406"
                ,"480"
                ,"2,638"
                ,"2,345"
                ,"3,376"
                ,"20,252"
                ,"27,001"
                ,"54,002"
                ,"324,012"
                ,"1,296,045"
        };
        main_rsc_boosted2 = new String[] {
                "52"
                ,"15"
                ,"19"
                ,"26"
                ,"44"
                ,"100"
                ,"116"
                ,"185"
                ,"284"
                ,"336"
                ,"1,846"
                ,"1,642"
                ,"2,363"
                ,"14,176"
                ,"18,901"
                ,"37,802"
                ,"226,808"
                ,"907,232"
        };
        main_rsc_boosted3 = new String[] {
                "49"
                ,"14"
                ,"18"
                ,"25"
                ,"42"
                ,"95"
                ,"111"
                ,"176"
                ,"271"
                ,"320"
                ,"1,759"
                ,"1,564"
                ,"2,251"
                ,"13,501"
                ,"18,001"
                ,"36,002"
                ,"216,008"
                ,"864,030"
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
                ,"3,021"
                ,"3,692"
                ,"4,923"
                ,"29,533"
                ,"39,377"
                ,"78,753"
                ,"472,517"
                ,"1,890,065"
        };
        alt_rsc_boosted1 = new String[] {
                "0"
                ,"103"
                ,"42"
                ,"53"
                ,"73"
                ,"367"
                ,"189"
                ,"331"
                ,"528"
                ,"812"
                ,"2,878"
                ,"3,517"
                ,"4,689"
                ,"28,127"
                ,"37,502"
                ,"75,003"
                ,"450,017"
                ,"1,800,062"
        };
        alt_rsc_boosted2 = new String[] {
                 "0"
                ,"72"
                ,"30"
                ,"37"
                ,"51"
                ,"257"
                ,"132"
                ,"232"
                ,"370"
                ,"568"
                ,"2,014"
                ,"2,462"
                ,"3,282"
                ,"19,689"
                ,"26,252"
                ,"52,502"
                ,"315,012"
                ,"1,260,044"
        };
        alt_rsc_boosted3 = new String[] {
                "0"
                ,"69"
                ,"28"
                ,"35"
                ,"49"
                ,"245"
                ,"126"
                ,"221"
                ,"352"
                ,"541"
                ,"1,919"
                ,"2,345"
                ,"3,126"
                ,"18,752"
                ,"25,002"
                ,"50,002"
                ,"300,011"
                ,"1,200,042"
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