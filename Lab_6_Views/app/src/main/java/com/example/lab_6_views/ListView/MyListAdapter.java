package com.example.lab_6_views.ListView;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab_6_views.R;

public class MyListAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] title;
    String[] body;
    int[] image ;
    public MyListAdapter(Activity context, String[] title, String[] body , int[] image){
        super(context, R.layout.custom_list_items,title);
        this.context=context;
        this.title = title;
        this.body = body;
        this.image =image;
    }
    public View getView(int position, View view , ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_list_items,null,true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.title);
        TextView txtBody = (TextView) rowView.findViewById(R.id.body);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.image);

        txtTitle.setText(title[position]);
        txtBody.setText(body[position]);
        imgView.setImageResource(image[position]);

        return rowView;
    }
}
