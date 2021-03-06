package com.technus.coahelper.ui.maps;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.technus.coahelper.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GolemTemple#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GolemTemple extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GolemTemple() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GolemTempleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GolemTemple newInstance(String param1, String param2) {
        GolemTemple fragment = new GolemTemple();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.golem_temple_map, container, false);

        SubsamplingScaleImageView imageView = view.findViewById(R.id.gt_map);
        imageView.setImage(ImageSource.resource(R.drawable.golem_s_temple));
        imageView.setDoubleTapZoomScale((float) 0.7);

        return view;
    }
}