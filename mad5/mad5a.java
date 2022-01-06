package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          Button clickButton=findViewById(R.id.firstbutton);
          clickButton.setOnClickListener(new View.OnClickListener(){
              public void onClick(View v)
              {
                  Toast.makeText(MainActivity.this,"You clicked the button",Toast.LENGTH_SHORT).show();

              }
          });
    }
}