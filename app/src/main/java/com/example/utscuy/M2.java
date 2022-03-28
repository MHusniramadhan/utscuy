package com.example.utscuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class M2 extends AppCompatActivity {
    TextView output;
    EditText masukan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);

        masukan = (EditText)findViewById(R.id.edit1);
        output = (TextView)findViewById(R.id.textView2);
    }

    public void tampil(View V) {
        String kalimat = masukan.getText().toString();
        output.setText("kalimatnya adalah :"+kalimat);
    }
}