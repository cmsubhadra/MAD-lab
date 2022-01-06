package com.example.ex7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
        public void mymethod(View view){
            Toast.makeText(this,"You clicked the button",Toast.LENGTH_SHORT).show();
        }
    }
