package com.twdc.volume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    TextView cubeText, result;
    Button button2;
    EditText editLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cubeText =findViewById(R.id.cubeText);
        result = findViewById(R.id.result);
        editLength = findViewById(R.id.editLength);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String length = editLength.getText().toString();

                float l = Float.parseFloat(length);

                float Volume = (l * l * l);

                float V = Math.round(Volume);

                result.setText("Volume = " + V + " m^3");



            }
        });




    }
}