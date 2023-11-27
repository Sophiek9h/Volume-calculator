package com.twdc.volume;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<shape> {

    private ArrayList<shape> shapesArrayList;

    Context context;

    public MyCustomAdapter(ArrayList<shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    //view Holder
    private static class MyViewHolder{
        ImageView shape;
        TextView shapeName;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        shape shapes = getItem(position);

        MyViewHolder myViewHolder;

        if (convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.shapeName);
            myViewHolder.shape = (ImageView) convertView.findViewById(R.id.shape);

            convertView.setTag(myViewHolder);



        }else{

            myViewHolder = (MyViewHolder) convertView.getTag();


        }

        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shape.setImageResource(shapes.getShape());

        return convertView;



    }
}
