package com.technus.helper2.ui.guides;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.technus.helper2.R;

public class GuidesFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager2 pager2;
    MyPagerAdapter adapter;


    public GuidesFragment() {

    }

    public static GuidesFragment newInstance(String param1, String param2) {
        return new GuidesFragment();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_guides, container, false);

        tabLayout = view.findViewById(R.id.tabLayout);
        pager2 = view.findViewById(R.id.guides_container);

        FragmentManager fm = getChildFragmentManager();
        adapter = new MyPagerAdapter(fm,getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Alchemy"));
        tabLayout.addTab(tabLayout.newTab().setText("Mining"));
        tabLayout.addTab(tabLayout.newTab().setText("Smithing"));
        tabLayout.addTab(tabLayout.newTab().setText("Woodcutting"));
        tabLayout.addTab(tabLayout.newTab().setText("Crafting"));
        tabLayout.addTab(tabLayout.newTab().setText("Fishing"));
        tabLayout.addTab(tabLayout.newTab().setText("Cooking"));



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
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}