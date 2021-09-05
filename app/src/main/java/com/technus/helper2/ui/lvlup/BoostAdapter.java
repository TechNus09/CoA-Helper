package com.technus.helper2.ui.lvlup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.technus.helper2.R;

public class BoostAdapter extends BaseAdapter {

    Context context;
    String[] boostNames;

    public BoostAdapter(Context context, String[] boostNames) {
        this.context = context;
        this.boostNames = boostNames;
    }

    @Override
    public int getCount() {
        return boostNames.length;
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
        TextView textView = view.findViewById(R.id.tv_boost);

        textView.setText(boostNames[i]);

        return view;
    }
}