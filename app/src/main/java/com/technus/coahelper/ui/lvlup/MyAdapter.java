package com.technus.coahelper.ui.lvlup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.technus.coahelper.R;

public class MyAdapter extends BaseAdapter {

    Context context;
    String[] names;
    int [] icons;

    public MyAdapter(Context context, String[] names, int[] icons) {
        this.context = context;
        this.names = names;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        TextView tvName;
        ImageView imgIcon;
    }

    public View getView(int i, View convertView, ViewGroup viewGroup) {

        View view;


        if (convertView!= null) {
            view = convertView;
        }
        else {
            view = LayoutInflater.from(context).inflate(R.layout.resource_layout,viewGroup,false);
        }


        ImageView imageView = view.findViewById(R.id.ResourceIcon);
        TextView textView = view.findViewById(R.id.tv_resource);

        imageView.setImageResource(icons[i]);
        textView.setText(names[i]);

        return view;
    }

}