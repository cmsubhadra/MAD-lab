package com.example.exercise10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button b1,b2,b3,b4;
    TextView result;
    int ans =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);

      b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                result.setText(Double.toString(sum));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 - number2;
                result.setText(Double.toString(sum));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 * number2;
                result.setText(Double.toString(sum));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 / number2;
                result.setText(Double.toString(sum));
            }
        });
    }
}
