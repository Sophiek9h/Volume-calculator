package com.twdc.volume;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    TextView cylinderText, result;
    EditText editHeight, editRadius;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinderText = findViewById(R.id.cylinderText);
        result = findViewById(R.id.result);
        editHeight = findViewById(R.id.editHeight);
        editRadius = findViewById(R.id.editRadius);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String H = editHeight.getText().toString();
                String R = editRadius.getText().toString();

                int h = Integer.parseInt(H);
                int r = Integer.parseInt(R);

                double volume = 3.14159 * (r^2) * h;

                float V = Math.round(volume);

                result.setText("V = " + V + " m^3");

            }
        });


    }
}