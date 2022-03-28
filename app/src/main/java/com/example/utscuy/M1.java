package com.example.utscuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class M1 extends AppCompatActivity {

    WebView webviewku;
    WebSettings websettingku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);

        webviewku = (WebView)findViewById(R.id.webView1);

        websettingku = webviewku.getSettings();
        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("https://www.niagahoster.co.id/blog/cara-install-android-studio-tutorial-lengkap/");
    //tempat ganti link
    }
}