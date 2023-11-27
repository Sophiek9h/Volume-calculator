package com.twdc.volume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {
    TextView prismText, result;
    EditText editHeight, editArea;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        prismText = findViewById(R.id.prismText);
        result = findViewById(R.id.result);
        editHeight = findViewById(R.id.editHeight);
        editArea = findViewById(R.id.editArea);
        button2 = findViewById(R.id.button2);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String H = editHeight.getText().toString();
                String A = editArea.getText().toString();

                int h = Integer.parseInt(H);
                int a = Integer.parseInt(A);

                double volume = a*h;

                float V = Math.round(volume);

                result.setText("V = " + V + " m^3");

            }
        });

    }
}