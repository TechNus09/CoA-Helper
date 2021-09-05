package com.technus.helper2.ui.wiki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.technus.helper2.R;

import org.jetbrains.annotations.NotNull;

public class WikiFragment extends Fragment {


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);


        View view = inflater.inflate(R.layout.fragment_wiki, container, false);
        WebView wiki_site = view.findViewById(R.id.wiki_interface);
        wiki_site.setWebViewClient(new WebViewClient());

        wiki_site.loadUrl("https://www.curseofaros.wiki/wiki/Main_Page");

        return view;
    }





}
