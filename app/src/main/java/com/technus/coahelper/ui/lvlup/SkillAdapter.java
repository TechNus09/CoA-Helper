package com.technus.coahelper.ui.lvlup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.technus.coahelper.R;

public class SkillAdapter extends BaseAdapter {

    Context context;
    String[] skillNames;
    int [] skillIcons;

    public SkillAdapter(Context context, String[] skillNames, int[] skillIcons) {
        this.context = context;
        this.skillNames = skillNames;
        this.skillIcons = skillIcons;
    }

    @Override
    public int getCount() {
        return skillNames.length;
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

        view = LayoutInflater.from(context).inflate(R.layout.skill_layout,viewGroup,false);
        ImageView imageView = view.findViewById(R.id.ImageIcon);
        TextView textView = view.findViewById(R.id.tv);

        imageView.setImageResource(skillIcons[i]);
        textView.setText(skillNames[i]);

        return view;
    }
}