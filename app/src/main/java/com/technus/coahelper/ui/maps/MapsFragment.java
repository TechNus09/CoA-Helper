package com.technus.coahelper.ui.maps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.technus.coahelper.R;

import org.jetbrains.annotations.NotNull;

public class MapsFragment extends Fragment {
    TabLayout tabLayout;
    ViewPager2 pager2;
    PagerAdapter adapter;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_maps, container, false);

        tabLayout = view.findViewById(R.id.tabLayout);
        pager2 = view.findViewById(R.id.maps_container);

        FragmentManager fm = getChildFragmentManager();
        adapter = new PagerAdapter(fm,getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Bright\n leaf"));
        tabLayout.addTab(tabLayout.newTab().setText("Abandoned\n Mine"));
        tabLayout.addTab(tabLayout.newTab().setText("Shadow\n Dungeon"));
        tabLayout.addTab(tabLayout.newTab().setText("HrPvP"));
        tabLayout.addTab(tabLayout.newTab().setText("Bat Cave"));
        tabLayout.addTab(tabLayout.newTab().setText("Battleground"));

        tabLayout.addTab(tabLayout.newTab().setText("Wintermist"));
        tabLayout.addTab(tabLayout.newTab().setText("Frozen\n Tunnel"));
        tabLayout.addTab(tabLayout.newTab().setText("Ancient\n Prison"));
        tabLayout.addTab(tabLayout.newTab().setText("Cyclops's\n Room"));


        tabLayout.addTab(tabLayout.newTab().setText("Varaxite"));
        tabLayout.addTab(tabLayout.newTab().setText("Umbra's\n Lair"));
        tabLayout.addTab(tabLayout.newTab().setText("Golem's\ntemple"));

        tabLayout.addTab(tabLayout.newTab().setText("Desert"));
        tabLayout.addTab(tabLayout.newTab().setText("Pyramid"));
        tabLayout.addTab(tabLayout.newTab().setText("Chests's\n Room"));
        tabLayout.addTab(tabLayout.newTab().setText("?????"));









        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                pager2.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {

                tabLayout.selectTab(tabLayout.getTabAt(position));

            }
        });










        return view;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




    }
}
