package com.technus.coahelper.ui.maps;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;

import org.jetbrains.annotations.NotNull;

public class PagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {


    public PagerAdapter(@NonNull FragmentManager fragmentManager,@NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public @NotNull Fragment createFragment(int pos) {

        switch (pos){
            case 1 :
                return new AbandonedMine();
            case 2 :
                return new ShadowDungeon();
            case 3 :
                return new HrPvP() ;
            case 4 :
                return new BatCave() ;
            case 5 :
                return new Battleground() ;

            case 6 :
                return new Wintermist() ;
            case 7 :
                return new FrozenTunnel() ;
            case 8 :
                return new AncientPrison() ;
            case 9 :
                return new CyclopsRoom() ;

            case 10 :
                return new Varaxite() ;
            case 11 :
                return new UmabrasLair() ;
            case 12 :
                return new GolemTemple() ;

            case 13 :
                return new Desert() ;
            case 14 :
                return new Pyramid() ;
            case 15 :
                return new ChestsRoom() ;
            case 16 :
                return new UnknownIsland();
        }
        return new BrightLeaf();
    }

    @Override
    public int getItemCount() {
        return 17;
    }
}
