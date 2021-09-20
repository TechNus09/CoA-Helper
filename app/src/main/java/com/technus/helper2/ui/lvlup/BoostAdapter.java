package com.technus.helper2.ui.lvlup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.technus.helper2.R;

public class BoostAdapter extends BaseAdapter {

    Context context;
    int[] boostImages;

    public BoostAdapter(Context context, int[] boostImages) {
        this.context = context;
        this.boostImages = boostImages;
    }

    @Override
    public int getCount() {
        return boostImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.boost_layout,viewGroup,false);
        ImageView imageView = view.findViewById(R.id.img_boost);

        imageView.setImageResource(boostImages[i]);

        return view;
    }
}