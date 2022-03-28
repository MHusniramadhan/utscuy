package com.example.utscuy;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;

public class M3 extends ListActivity {
    String[] perangkat = {"Pertemuan 5", "Pertemuan 8"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3);
        setListAdapter(new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, perangkat));
    }

    public void onListItemClick(ListView parent, View v, int urutan, long id) {
        Object detail = this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i = null;
        if (tampil == "Pertemuan 5") {
            i = new
                    Intent(M3.this, Pertemuan5.class);
            startActivity(i);
        } else if (tampil == "Pertemuan 8") {
            i = new
                    Intent(M3.this, Pertemuan8.class);
            startActivity(i);
        }
    }
}