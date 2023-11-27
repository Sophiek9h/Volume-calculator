package com.twdc.volume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<shape> shapesArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapesArrayList = new ArrayList<>();

        shape s1 = new shape(R.drawable.cube, "Cube");
        shape s2 = new shape(R.drawable.cylinder, "Cylinder");
        shape s3 = new shape(R.drawable.prism, "Prism");
        shape s4 = new shape(R.drawable.sphere, "Sphere");
        shape s5 = new shape(R.drawable.cuboid, "Cuboid");
        shape s6 = new shape(R.drawable.torus, "Torus");

        shapesArrayList.add(s1);
        shapesArrayList.add(s2);
        shapesArrayList.add(s3);
        shapesArrayList.add(s4);
        shapesArrayList.add(s5);
        shapesArrayList.add(s6);


        MyCustomAdapter adapter = new MyCustomAdapter(shapesArrayList, getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (adapter.getItem(position).getShapeName().equals("Sphere")){
                    Intent i = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(i);
                } else if (adapter.getItem(position).getShapeName().equals("Cube")) {
                    Intent i = new Intent(getApplicationContext(), Cube.class);
                    startActivity(i);
                } else if (adapter.getItem(position).getShapeName().equals("Cylinder")) {
                    Intent i = new Intent(getApplicationContext(), Cylinder.class);
                    startActivity(i);
                } else if (adapter.getItem(position).getShapeName().equals("Prism")) {
                    Intent i = new Intent(getApplicationContext(), Prism.class);
                    startActivity(i);
                }

            }
        });




    }
}