package com.example.utscuy;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent;
        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpec;
        intent = new Intent(this, M1.class);
        tabSpec = getTabHost().newTabSpec("tab1").setIndicator(
                "M1").setContent(intent);
        tabHost.addTab(tabSpec);
        intent = new Intent(this, M2.class);
        tabSpec = getTabHost().newTabSpec("tab2").setIndicator(
                "M2").setContent(intent);
        tabHost.addTab(tabSpec);
        intent = new Intent(this, M3.class);
        tabSpec = getTabHost().newTabSpec("tab3").setIndicator(
                "M3").setContent(intent);
        tabHost.addTab(tabSpec);
        intent = new Intent(this, M4.class);
        tabSpec = getTabHost().newTabSpec("tab4").setIndicator(
                "M4").setContent(intent);
        tabHost.addTab(tabSpec);
    }

}