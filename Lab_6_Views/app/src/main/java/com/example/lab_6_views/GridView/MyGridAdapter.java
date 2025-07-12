package com.example.lab_6_views.GridView;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab_6_views.R;

public class MyGridAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] title;
    String[] body;
    int[] image;

    public MyGridAdapter(Activity context,String[] title,String[] body , int[] image){
        super(context, R.layout.custom_grid_items,title);
        this.title= title;
        this.body = body;
        this.image = image;
        this.context = context;
    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_grid_items,null,true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.gridTitle);
        TextView txtBody = (TextView) rowView.findViewById(R.id.gridBody);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.gridImage);

        txtTitle.setText(title[position]);
        txtBody.setText(body[position]);
        imgView.setImageResource(image[position]);

        return rowView;
    }
}
