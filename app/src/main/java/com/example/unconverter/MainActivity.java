package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button convertBtn;
    private TextView resultText;
    private EditText kgValue;
    private EditText kgValue1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertBtn = findViewById(R.id.convert);
        resultText = findViewById(R.id.result);
        kgValue = findViewById(R.id.kgValue);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hi Click Listener Worked", Toast.LENGTH_SHORT).show();
                 String s = kgValue.getText().toString();
                 int kg= Integer.parseInt(s);
                 double pound = kg*2.205;
                 resultText.setText("The value in pounds is "+pound);
            }
        });
    }
}