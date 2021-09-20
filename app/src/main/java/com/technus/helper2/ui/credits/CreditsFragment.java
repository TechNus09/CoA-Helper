package com.technus.helper2.ui.credits;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.technus.helper2.R;

public class CreditsFragment extends Fragment {




    public CreditsFragment() {

    }

    public static CreditsFragment newInstance(String param1, String param2) {
        CreditsFragment fragment = new CreditsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_credits, container, false);

        TextView credit1,credit2,credit3,credit4;
        credit1 = view.findViewById(R.id.tv_credits_1);
        credit2 = view.findViewById(R.id.tv_credits_2);
        credit3 = view.findViewById(R.id.tv_credits_3);
        credit4 = view.findViewById(R.id.tv_credits_4);

        String credit_text1 = "    All the arts and data belongs to Curse Of aros ,I don't own anything of it. ";
        String credit_text2 = "    The guides was made with the help of 'DarkSecret's guides and  " + getString(R.string.skill_calculator)  ;
        String credit_text3 = "    If you wanna contribute or you don't want your work used here ,hit me up on : " ;
        String credit_text4 = "    Discord : TechNus09#0508 \n" + getString(R.string.github_credits) ;

        credit1.setText(credit_text1);
        credit2.setMovementMethod(LinkMovementMethod.getInstance());
        credit3.setText(credit_text3);
        credit4.setMovementMethod(LinkMovementMethod.getInstance());





        return view;
    }
}