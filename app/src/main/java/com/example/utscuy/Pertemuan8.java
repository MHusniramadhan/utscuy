package com.example.utscuy;

import android.os.Bundle;
import android.app.ListActivity;
//import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;

public class Pertemuan8 extends ListActivity {
    String[] perangkat = { "Activity Asus",
            "Activity Acer",
            "Activity Toshiba",
            "Activity Sony",
            "Activity Axioo",
            "Activity Dell",
            "<< Kembali"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan8);

        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, perangkat));
    }

    public void onListItemClick(ListView parent, View v, int
            urutan, long id) {
        Object detail =
                this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i = null;
        if(tampil=="<< Kembali")
        {
            i = new Intent(Pertemuan8.this,
                    M3.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this, "Anda Memilih : " + tampil, Toast.LENGTH_SHORT).show();
        }
    }
}