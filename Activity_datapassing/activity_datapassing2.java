package com.example.activity_datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras=getIntent().getExtras();
        String s=extras.getString("Value1");
        txt2=(TextView)findViewById(R.id.txt1);
        txt2.setText(txt2.getText()+" "+s);
    }
}

