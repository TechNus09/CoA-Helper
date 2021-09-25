package com.technus.coahelper.ui.guides;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.technus.coahelper.R;

import java.util.ArrayList;

public class SmithingLAdapter extends RecyclerView.Adapter<SmithingLAdapter.MyViewHolder> {

    Context context;
    ArrayList<Lvls> lvlsArrayList;
    int id,id1;

    public SmithingLAdapter(Context context, ArrayList<Lvls> lvlsArrayList, int id, int id1) {
        this.context = context;
        this.lvlsArrayList = lvlsArrayList;
        this.id = id ;
        this.id1 = id1;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(id,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Lvls lvls = lvlsArrayList.get(position);
        holder.text.setText(lvls.lvl);
        holder.xp.setText(lvls.xpNeeded);
        holder.img.setImageResource(lvls.icon);
        holder.main_name.setText(lvls.mainRscName);
        holder.alt_name.setText(lvls.altRscName);
        holder.main_qtty.setText(lvls.mainRscNormal);
        holder.alt_qtty.setText(lvls.altRscNormal);
        holder.main_qtty_boosted1.setText(lvls.mainRscBoost1);
        holder.alt_qtty_boosted1.setText(lvls.altResBoost1);
        holder.main_qtty_boosted2.setText(lvls.mainRscBoost2);
        holder.alt_qtty_boosted2.setText(lvls.altResBoost2);
        holder.main_qtty_boosted3.setText(lvls.mainRscBoost3);
        holder.alt_qtty_boosted3.setText(lvls.altResBoost3);
        holder.main_qtty_boosted4.setText(lvls.mainRscBoost4);
        holder.alt_qtty_boosted4.setText(lvls.altResBoost4);
        holder.main_qtty_boosted5.setText(lvls.mainRscBoost5);
        holder.alt_qtty_boosted5.setText(lvls.altResBoost5);
        holder.main_qtty_boosted6.setText(lvls.mainRscBoost6);
        holder.alt_qtty_boosted6.setText(lvls.altResBoost6);
        holder.main_qtty_boosted7.setText(lvls.mainRscBoost7);
        holder.alt_qtty_boosted7.setText(lvls.altResBoost7);

        boolean isVisible = lvls.visibility;
        holder.constraintLayout.setVisibility(isVisible ? View.VISIBLE : View.GONE);


    }


    @Override
    public int getItemCount() {
        return lvlsArrayList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text;
        TextView xp;
        TextView main_name,alt_name;
        TextView main_qtty,alt_qtty,main_qtty_boosted1,alt_qtty_boosted1,main_qtty_boosted2,alt_qtty_boosted2,
                main_qtty_boosted3,alt_qtty_boosted3,main_qtty_boosted4,alt_qtty_boosted4,main_qtty_boosted5,
                alt_qtty_boosted5,main_qtty_boosted6,alt_qtty_boosted6,main_qtty_boosted7,alt_qtty_boosted7;
        ImageView img;

        ConstraintLayout constraintLayout,lvlItem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.list_text_view);
            img = itemView.findViewById(R.id.list_img_view);
            xp = itemView.findViewById(R.id.item_xp);
            main_name = itemView.findViewById(R.id.main_rsc_name) ;
            alt_name = itemView.findViewById(R.id.alt_rsc_name) ;
            main_qtty = itemView.findViewById(R.id.main_rsc_qtty) ;
            alt_qtty = itemView.findViewById(R.id.alt_rsc_qtty) ;
            main_qtty_boosted1 = itemView.findViewById(R.id.main_rsc_qtty_boosted_1) ;
            alt_qtty_boosted1 = itemView.findViewById(R.id.alt_rsc_qtty_boosted_1) ;
            main_qtty_boosted2 = itemView.findViewById(R.id.main_rsc_qtty_boosted_2) ;
            alt_qtty_boosted2 = itemView.findViewById(R.id.alt_rsc_qtty_boosted_2) ;
            main_qtty_boosted3 = itemView.findViewById(R.id.main_rsc_qtty_boosted_3) ;
            alt_qtty_boosted3 = itemView.findViewById(R.id.alt_rsc_qtty_boosted_3) ;
            main_qtty_boosted4 = itemView.findViewById(R.id.main_rsc_qtty_boosted_4) ;
            alt_qtty_boosted4 = itemView.findViewById(R.id.alt_rsc_qtty_boosted_4) ;
            main_qtty_boosted5 = itemView.findViewById(R.id.main_rsc_qtty_boosted_5) ;
            alt_qtty_boosted5 = itemView.findViewById(R.id.alt_rsc_qtty_boosted_5) ;
            main_qtty_boosted6 = itemView.findViewById(R.id.main_rsc_qtty_boosted_6) ;
            alt_qtty_boosted6 = itemView.findViewById(R.id.alt_rsc_qtty_boosted_6) ;
            main_qtty_boosted7 = itemView.findViewById(R.id.main_rsc_qtty_boosted_7) ;
            alt_qtty_boosted7 = itemView.findViewById(R.id.alt_rsc_qtty_boosted_7) ;
            constraintLayout = itemView.findViewById(R.id.resources_data);
            lvlItem = itemView.findViewById(id1);


            lvlItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Lvls lvls = lvlsArrayList.get(getAdapterPosition());
                    lvls.setVisibility(!lvls.isVisibility());
                    notifyItemChanged(getAdapterPosition());
                }
            });



        }
    }







}
