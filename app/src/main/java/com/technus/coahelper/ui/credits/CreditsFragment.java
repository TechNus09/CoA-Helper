package com.technus.coahelper.ui.credits;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.technus.coahelper.R;

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

        TextView credit0,credit1,credit2,credit4,credit5;
        credit0 = view.findViewById(R.id.tv_credits_0);
        credit1 = view.findViewById(R.id.tv_credits_1);
        credit2 = view.findViewById(R.id.tv_credits_2);
        credit4 = view.findViewById(R.id.tv_credits_4);
        credit5 = view.findViewById(R.id.tv_credits_5);

        String credit_text0 = "     Started with a Skiller too lazy to check the leaderboard and XP table but mostly to do the math for his lvls.\n" +
                "I might come back to improve the app if it get some positive recognition.";
        String credit_text1 = "     All the arts and data belongs to Curse Of aros, I don't own anything of it.";
        String credit_text5 = "    Note : If you gonna share the app, Please do it through the github link (helps me in tracking the download count)";

        credit0.setText(credit_text0);
        credit1.setText(credit_text1);
        credit2.setMovementMethod(LinkMovementMethod.getInstance());
        credit2.setLinkTextColor(Color.RED);
        credit4.setMovementMethod(LinkMovementMethod.getInstance());
        credit4.setLinkTextColor(Color.RED);
        credit5.setText(credit_text5);





        return view;
    }
}