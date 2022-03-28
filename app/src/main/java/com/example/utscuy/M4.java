package com.example.utscuy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class M4 extends AppCompatActivity {

    TextView Tabview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4);

        Tabview = (TextView)findViewById(R.id.textView3);
        Tabview.setText("TabHost merupakan sebuah fitur yang ada di aplikasi baik web, desktop, maupun mobile. " +
                "TabHost ini memiliki peranan mirip seperti navbar, " +
                "bedanya tabhost lebih mudah dalam menglik karena tidak perlu menunggu loading lama dalam membuka form berikutnya yang ingin dituju. " +
                "Dan juga Tabhost tentunya lebih friendly dari pada navbar atapun menu.");
    }
}