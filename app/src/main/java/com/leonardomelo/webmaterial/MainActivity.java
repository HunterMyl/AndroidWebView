package com.leonardomelo.webmaterial;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl("https://material-eddf1.firebaseapp.com/inicio");
        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
    }
}
