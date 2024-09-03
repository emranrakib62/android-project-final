package com.example.navigationdrawyer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class FirstFragment extends Fragment {


public static String WEB_URL="https://www.dse.com.bd/latest_share_price_scroll_l.php";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView=inflater.inflate(R.layout.fragment_first, container, false);

        WebView webView=myView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("WEB_URL");


        return myView;
    }
}