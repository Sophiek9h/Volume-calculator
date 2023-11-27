package com.twdc.volume;

import androidx.appcompat.app.AppCompatActivity;

import android.health.connect.datatypes.units.Volume;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    EditText editText;
    TextView textView, result;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        result= findViewById(R.id.result);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = editText.getText().toString();
                 int r = Integer.parseInt(radius);

                 //V = (4/3) * pi * r^3

                double volume = (4/3) * 3.14159 * r*r*r;

                float V = Math.round(volume);

                result.setText("V = " + V + " m^3");



            }
        });





    }
}