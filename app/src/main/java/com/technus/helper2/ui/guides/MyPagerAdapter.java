package com.technus.helper2.ui.guides;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;

import org.jetbrains.annotations.NotNull;

public class MyPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {


    public MyPagerAdapter(@NonNull FragmentManager fragmentManager,@NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public @NotNull Fragment createFragment(int pos) {

        switch (pos){
            case 1 :
                return new MiningFragment();
            case 2 :
                return new SmithingFragment();
            case 3 :
                return new WoodcuttingFragment();
            case 4 :
                return new CraftingFragment();
            case 5 :
                return new FishingFragment();
            case 6 :
                return new CookingFragment();

        }
        return new AlchemyFragment();
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
