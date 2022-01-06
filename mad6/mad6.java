package com.example.ex6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bu1=findViewById(R.id.button1);
        final TextView text1=findViewById(R.id.text1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("Hai ALL");
            }
        });
    }
}