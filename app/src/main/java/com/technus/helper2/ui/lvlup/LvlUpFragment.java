package com.technus.helper2.ui.lvlup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.technus.helper2.R;
import java.util.Arrays;

import static com.technus.helper2.ui.lvlup.Calculate.barXp;
import static com.technus.helper2.ui.lvlup.Calculate.fishXp;
import static com.technus.helper2.ui.lvlup.Calculate.foodXp;
import static com.technus.helper2.ui.lvlup.Calculate.logXp;
import static com.technus.helper2.ui.lvlup.Calculate.mobXp;
import static com.technus.helper2.ui.lvlup.Calculate.oreXp;
import static com.technus.helper2.ui.lvlup.Calculate.relicXp;

import com.technus.helper2.ui.rankup.DBHelper;

public class LvlUpFragment extends Fragment {
    String[] skillsNames = {"Combat","Mining","Smithing","Woodcutting","Crafting","Fishing","Cooking"};
    int[] skillsIcons = {R.drawable.combat,R.drawable.mining,R.drawable.smithing,R.drawable.woodcutting,R.drawable.crafting,
            R.drawable.fishing,R.drawable.cooking};

    String[] logsNames = {"Pine Log","Dead Log","Birch Log","Applewood","Willow Log","Oak Log","Chestnut Log","Maple Log","Olive Log","Palm Wood"};
    int[] logsIcons = {R.drawable.pine_log,R.drawable.dead_log,R.drawable.birch_log,R.drawable.applewood,
            R.drawable.willow_log,R.drawable.oak_log,R.drawable.chestnut_log,R.drawable.maple_log,
            R.drawable.olive_log,R.drawable.palm_wood};

    String[] relicsNames = {"Accuracy Relic","Guarding Relic","Healing Relic","Wealth Relic","Power Relic","Nature Relic","Fire Relic","Damage Relic","Leeching Relic","Experience Relic","Cursed Relic"};
    int[] relicsIcons = {R.drawable.accuracy_relic,R.drawable.guarding_relic,R.drawable.healing_relic,R.drawable.wealth_relic,
            R.drawable.power_relic,R.drawable.nature_relic,R.drawable.fire_relic,R.drawable.damage_relic,
            R.drawable.leeching_relic,R.drawable.experience_relic,R.drawable.cursed_relic};


    String[] oresNames = {"Tin Ore","Copper Ore","Iron Ore","Salt","Coal","Silver Ore","Crimsteel ore","Gold ore","Pink Salt","Mythan Ore","Sandstone","Cobalt Ore","Varaxium","Black Salt"};
    int[] oresIcons = {R.drawable.tin_ore,R.drawable.copper_ore,R.drawable.iron_ore,R.drawable.salt,
            R.drawable.coal,R.drawable.silver_ore,R.drawable.crimsteel_ore,R.drawable.gold_ore,
            R.drawable.pink_salt,R.drawable.mythan_ore,R.drawable.sandstone,R.drawable.cobalt_ore,
            R.drawable.varaxium,R.drawable.black_salt};

    String[] barsNames = {"Bronze Bar","Iron Bar","Steel Bar","Crimsteel Bar","Silver Bar","Gold Bar","Mythan Bar","Cobalt Bar","Varaxite Bar"};
    int[]barsIcons = {R.drawable.bronze_bar,R.drawable.iron_bar,R.drawable.steel_bar,R.drawable.crimsteel_bar,
            R.drawable.silver_bar,R.drawable.gold_bar,R.drawable.mythan_bar,R.drawable.cobalt_bar,
            R.drawable.varaxite_bar};


    String[] fishsNames = {"Anchovies","Goldfish","Mackerel","Squid","Sardine","Eel","Anglerfish","Trout","Jellyfish","Bass","Herringbone","Tuna","Lobster","Sea Turtle","Manta Ray","Shark","Orca","Giant Squid"};
    int[] fishsIcons = {R.drawable.anchovies,R.drawable.goldfish,R.drawable.mackerel,R.drawable.squid,
            R.drawable.sardine,R.drawable.eel,R.drawable.anglerfish,R.drawable.trout,
            R.drawable.jellyfish,R.drawable.bass, R.drawable.herringbone,R.drawable.tuna,
            R.drawable.lobster,R.drawable.sea_turtle,R.drawable.manta_ray,R.drawable.shark,
            R.drawable.orca,R.drawable.giant_squid};

    String[] foodsNames = {"Cooked Anchovies","Cooked Mackerel","Cooked Squid","Cooked Sardine","Cooked Eel","Cooked Anglerfish","Cooked Trout","Cooked Bass","Cooked Tuna","Cooked Lobster","Cooked Sea Turtle",
            "Cooked Manta Ray","Cooked Shark","Cooked Orca","Cooked Giant Squid"};
    int[] foodsIcons = {R.drawable.cooked_anchovies,R.drawable.cooked_mackerel,R.drawable.cooked_squid,R.drawable.cooked_sardine,
            R.drawable.cooked_eel,R.drawable.cooked_anglerfish,R.drawable.cooked_trout,R.drawable.cooked_bass,
            R.drawable.cooked_tuna,R.drawable.cooked_lobster,R.drawable.cooked_sea_turtle,R.drawable.cooked_manta_ray,
            R.drawable.cooked_shark,R.drawable.cooked_orca,R.drawable.cooked_giant_squid};

    String[] mobsNames = {"Bat","Slime","Fishing Spider","Mushroom","Forest Spider","Forest Bat","Snow Bat","Ice Slime","Snowman","Ice Spider","Skeletal Snake","Cave Spider",
            "Skeletal Bat","Sapphire Scarab","Cave Bat","Scorpion","Ice Fiend","Raptor","Ruby Scarab","Shadow Fiend","Forest Fiend","Desert Raptor","Rock Fiend","Giant Hornet",
            "Luminant Slime","Ancient Bat","Ice Raptor","Arosite Scarab","Spectral Flame","Shadow Flame","Cactus Soldier","Phantom Flame","Spectral Fiend","Phantom Fiend",
            "Ancient Cyclops","Anubis","Magnetite Scarab","Golemite Bat","Golemite Fiend","Poltergeist","Elite Anubis","Baby Dragon","Gold Snake",
            "Brown Snake","Purple Snake","Sandstone Golem","Cursed Totem","War Bat","Rock Demon","Spinus","Ancient War Bat","Ice Demon","Shadow demon","Reanimated Soul",
            "Golem","Umbra","Mummy"};
    int[] mobsIcons = {R.drawable.bat,R.drawable.slime,R.drawable.fishing_spider,R.drawable.mashroom,
            R.drawable.forest_spider,R.drawable.forest_bat,R.drawable.snow_bat, R.drawable.ice_slime,
            R.drawable.snowman,R.drawable.ice_spider,R.drawable.skeletal_snake,R.drawable.cave_spider,
            R.drawable.skeletal_bat,R.drawable.sapphire_scarab,R.drawable.cave_bat,R.drawable.scorpion,
            R.drawable.ice_fiend,R.drawable.raptor,R.drawable.ruby_scarab,R.drawable.shadow_fiend,
            R.drawable.forest_fiend,R.drawable.desert_raptor, R.drawable.rock_fiend,R.drawable.giant_hornet,
            R.drawable.luminant_slime,R.drawable.ancient_bat,R.drawable.ice_raptor,R.drawable.arosite_scarab,
            R.drawable.spectral_flame,R.drawable.shadow_flame,R.drawable.cactus_soldier,R.drawable.phantom_flame,
            R.drawable.spectral_fiend,R.drawable.phantom_fiend,R.drawable.ancient_cyclops,R.drawable.anubis,
            R.drawable.magnetite_scarab,R.drawable.golemite_bat,R.drawable.golemite_fiend,R.drawable.poltergeist,
            R.drawable.elite_anubis,R.drawable.baby_dragon,R.drawable.gold_snake,R.drawable.brown_snake,
            R.drawable.purple_snake,R.drawable.sandstone_golem,R.drawable.cursed_totem,
            R.drawable.war_bat,R.drawable.rock_demon,R.drawable.spinus,R.drawable.ancient_war_bat,
            R.drawable.ice_demon,R.drawable.shadow_demon,R.drawable.reanimated_soul,R.drawable.golem,
            R.drawable.umbra,R.drawable.mummy};





    String[] mob_boostsNames = {"NoBoost","+5%","+10%","+50%","+55%","+60%"};

    String[] mining_boostsNames = {"NoBoost","+5%","+50%","+55%"};
    String[] smithing_boostsNames = {"NoBoost","+4%","+8%","+50%","+54%","+58%"};
    String[] woodcutting_boostsNames = {"NoBoost","+50%"};
    String[] crafting_boostsNames = {"NoBoost","+50%",};
    String[] fishing_boostsNames = {"NoBoost","+50%"};
    String[] cooking_boostsNames = {"NoBoost","+50%"};
    String[] temp_boostsNames = {};
    String[] boostsNames = {"NoBoost","+4%","+5%","+8%","+10%","+50%","+54%","+55%","+58%","+60%"};
    Double[] boostsValues = {1.0,1.04,1.05,1.0816,1.1025,1.5,1.56,1.575,1.6224,1.65375};

    String[] saved_names ;

    int currentLvl,targetLvl;
    double currentPerc,targetPerc,boost_value;
    long resource_xp;
    String resource_name,result1,result2;
    public EditText currLvl,tarLvl,currPerc,tarPerc;
    Button btnCalcul,btnLoad;
    TextView tvResult1,tvResult2;

    public static DBHelper DataB;

    public long need_xp;

    public String saved_user = "test";



    public  LvlUpFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_lvlup, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {



        DataB = new DBHelper(getContext());

        Spinner resourceSpinner = view.findViewById(R.id.spinner2);

        Spinner boostSpinner = view.findViewById(R.id.spinner3);
        MyAdapter mob_adapter = new MyAdapter(getContext(),mobsNames,mobsIcons);//
        MyAdapter log_Adapter = new MyAdapter(getContext(),logsNames,logsIcons);
        MyAdapter relic_adapter = new MyAdapter(getContext(),relicsNames,relicsIcons);
        MyAdapter ore_adapter = new MyAdapter(getContext(),oresNames,oresIcons);
        MyAdapter bar_adapter = new MyAdapter(getContext(),barsNames,barsIcons);
        MyAdapter fish_adapter = new MyAdapter(getContext(),fishsNames,fishsIcons);
        MyAdapter food_adapter = new MyAdapter(getContext(),foodsNames,foodsIcons);

        resourceSpinner.setAdapter(log_Adapter);
        BoostAdapter mob_boost_adapter = new BoostAdapter(getContext(),mob_boostsNames);
        BoostAdapter mining_boost_adapter = new BoostAdapter(getContext(),mining_boostsNames);
        BoostAdapter smithing_boost_adapter = new BoostAdapter(getContext(),smithing_boostsNames);
        BoostAdapter woodcutting_boost_adapter = new BoostAdapter(getContext(),woodcutting_boostsNames);
        BoostAdapter crafting_boost_adapter = new BoostAdapter(getContext(),crafting_boostsNames);
        BoostAdapter fishing_boost_adapter = new BoostAdapter(getContext(),fishing_boostsNames);
        BoostAdapter cooking_boost_adapter = new BoostAdapter(getContext(),cooking_boostsNames);
        boostSpinner.setAdapter(mining_boost_adapter);

        Spinner skillsSpinner = view.findViewById(R.id.spinner);
        SkillAdapter skill_Adapter = new SkillAdapter(getContext(),skillsNames,skillsIcons);
        skillsSpinner.setAdapter(skill_Adapter);
        skillsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                if (pos==0){
                    resourceSpinner.setAdapter(mob_adapter);
                    boostSpinner.setAdapter(mob_boost_adapter);
                    temp_boostsNames=mob_boostsNames;
                    Loader.Load(getContext(),saved_user,pos,currLvl,currPerc,need_xp);
                }
                else if (pos==1){
                    resourceSpinner.setAdapter(ore_adapter);
                    boostSpinner.setAdapter(mining_boost_adapter);
                    temp_boostsNames=mining_boostsNames;
                    Loader.Load(getContext(),saved_user,pos,currLvl,currPerc,need_xp);
                }
                else if (pos==2){
                    resourceSpinner.setAdapter(bar_adapter);
                    boostSpinner.setAdapter(smithing_boost_adapter);
                    temp_boostsNames=smithing_boostsNames;
                    Loader.Load(getContext(),saved_user,pos,currLvl,currPerc,need_xp);
                }
                else if (pos==3){
                    resourceSpinner.setAdapter(log_Adapter);
                    boostSpinner.setAdapter(woodcutting_boost_adapter);
                    temp_boostsNames=woodcutting_boostsNames;
                    Loader.Load(getContext(),saved_user,pos,currLvl,currPerc,need_xp);
                }
                else if (pos==4){
                    resourceSpinner.setAdapter(relic_adapter);
                    boostSpinner.setAdapter(crafting_boost_adapter);
                    temp_boostsNames=crafting_boostsNames;
                    Loader.Load(getContext(),saved_user,pos,currLvl,currPerc,need_xp);
                }
                else if (pos==5){
                    resourceSpinner.setAdapter(fish_adapter);
                    boostSpinner.setAdapter(fishing_boost_adapter);
                    temp_boostsNames=fishing_boostsNames;
                    Loader.Load(getContext(),saved_user,pos,currLvl,currPerc,need_xp);
                }
                else if (pos==6){
                    resourceSpinner.setAdapter(food_adapter);
                    boostSpinner.setAdapter(cooking_boost_adapter);
                    temp_boostsNames=cooking_boostsNames;
                    Loader.Load(getContext(),saved_user,pos,currLvl,currPerc,need_xp);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        resourceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                int x = skillsSpinner.getSelectedItemPosition();
                if (x==0){
                    resource_xp=mobXp[i];
                    resource_name=mobsNames[i];
                }
                else if (x==1){
                    resource_xp=oreXp[i];
                    resource_name=oresNames[i];

                }
                else if (x==2){
                    resource_xp=barXp[i];
                    resource_name=barsNames[i];
                }
                else if (x==3){
                    resource_xp=logXp[i];
                    resource_name=logsNames[i];
                }
                else if (x==4){
                    resource_xp=relicXp[i];
                    resource_name=relicsNames[i];
                }
                else if (x==5){
                    resource_xp=fishXp[i];
                    resource_name=fishsNames[i];
                }
                else if (x==6){
                    resource_xp=foodXp[i];
                    resource_name=foodsNames[i];
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        boostSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                int x = boostSpinner.getSelectedItemPosition();
                String y = temp_boostsNames[x];
                int i;
                for (i=0;i<boostsNames.length;i++){
                    if (y.equals(boostsNames[i])){
                        boost_value=boostsValues[i];
                        break;
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        currLvl =   view.findViewById(R.id.currentLvl);
        currPerc =  view.findViewById(R.id.currentPerc);
        tarLvl =    view.findViewById(R.id.targetLvl);
        tarPerc =   view.findViewById(R.id.targetPerc);
        btnCalcul = view.findViewById(R.id.btnCalcul);
        tvResult1 = view.findViewById(R.id.tvResult1);
        tvResult2 = view.findViewById(R.id.tvResult2);

        currPerc.setText("0");
        tarPerc.setText("0");


        btnLoad = view.findViewById(R.id.btnLoad);

        btnLoad.setOnClickListener(v -> {
            saved_names= DataB.GetNamesList();


            // setup the alert builder
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setTitle("Saved Usernames");

            // add a list
            builder.setItems(saved_names, (dialog, pos) -> {

                saved_user = saved_names[pos];
                if (!saved_user.equals("test")){
                    Loader.Load(getContext(),saved_user,pos,currLvl,currPerc,need_xp);
                }



            });
            AlertDialog dialog = builder.create();
            dialog.show();
        });




        btnCalcul.setOnClickListener(v -> {

            String temp1 = currLvl.getText().toString();
            try {
                currentLvl=Integer.parseInt(temp1);
            }catch(NumberFormatException ex){
                currentLvl=1;
                showToast("lvl must be between 1 and 120");
            }
            String temp2 = currPerc.getText().toString();
            try {
                currentPerc=Float.parseFloat(temp2);
            }catch (NumberFormatException ex){
                currentPerc=0;
                showToast("% must be between 0.0 and 100.0");
            }
            String temp3 = tarLvl.getText().toString();
            try {
                targetLvl=Integer.parseInt(temp3);
            }catch (NumberFormatException ex){
                targetLvl=1;
                showToast("lvl must be between 1 and 120");
            }
            String temp4 = tarPerc.getText().toString();
            try {
                targetPerc=Float.parseFloat(temp4);
            }catch (NumberFormatException ex){
                targetPerc=0;
                showToast("% must be between 0.0 and 100.0");
            }


            need_xp = Calculate.GetXp(currentLvl,currentPerc,targetLvl,targetPerc);
            long rsc_xp;
            //double temp00 = Math.floor(resource_xp*boost_value);
            if (boost_value == 1.0816){
                rsc_xp = (long) Math.floor(resource_xp*boost_value) + 1;
            }
            else{
                rsc_xp = (long) Math.floor(resource_xp*boost_value);
            }

            Toast.makeText(getContext(),String.valueOf(rsc_xp),Toast.LENGTH_SHORT).show();
            long need_rsc = (need_xp/ rsc_xp) + 1;
            long need_inv = need_rsc/36;
            long need_half_inv = need_rsc/18;
            long need_fish_inv = need_rsc/35;
            boolean boolMob = Arrays.asList(mobsNames).contains(resource_name);
            boolean boolHalfInv = (Arrays.asList(relicsNames).contains("Experience Relic") || Arrays.asList(relicsNames).contains("Cursed Re-ic") || Arrays.asList(foodsNames).contains(resource_name));
            boolean boolFish = (Arrays.asList(fishsNames).contains(resource_name)) ;
            result1=("you need "+need_rsc+" of "+resource_name+"s");
            if (boolMob){
                result2=("  ");
            }
            else if (boolHalfInv){
                result2=("( "+need_half_inv+" inventories )");
            }
            else if (boolFish){
                result2=("( "+need_fish_inv+" inventories )");
            }
            else{
                result2=("( "+need_inv+" inventories )");
            }
            tvResult1.setText(result1);
            tvResult2.setText(result2);
        });


    }



    @Override
    public void onPause() {
        super.onPause();

    }

    public void showToast(String text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }
}