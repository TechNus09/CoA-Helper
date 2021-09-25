package com.technus.coahelper.ui.wiki;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.technus.coahelper.R;

import org.jetbrains.annotations.NotNull;

public class WikiFragment extends Fragment {

    String url = "https://www.curseofaros.wiki/wiki/Main_Page";
    public WebView wiki_site;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);


        View view = inflater.inflate(R.layout.fragment_wiki, container, false);
        wiki_site = view.findViewById(R.id.wiki_interface);
        wiki_site.getSettings().setJavaScriptEnabled(true);
        wiki_site.setWebViewClient(new WebViewClient());

        wiki_site.loadUrl(url);

        wiki_site.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (wiki_site != null){
                        if (wiki_site.canGoBack()) {
                            wiki_site.goBack();
                        }
                    }
                }


                return true;
            }
        });







        return view;
    }
    public boolean canGoBack() {
        return wiki_site.canGoBack();
    }
    public void goBack() {
        wiki_site.goBack();
    }






}
