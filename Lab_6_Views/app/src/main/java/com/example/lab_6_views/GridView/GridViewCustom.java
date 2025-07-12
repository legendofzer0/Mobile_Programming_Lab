package com.example.lab_6_views.GridView;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_6_views.R;

public class GridViewCustom extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_custom);
        String[] title = {
                "Title 1","Title 2","Title 3","Title 4","Title 5"
        };
        String[] body = {
                "This is body 1","This is body 2","This is body 3","This is body 4","This is body 5"
        };
        int[] image = {
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher
        };
        gridView = findViewById(R.id.myCustomGrid);
        MyGridAdapter adapter = new MyGridAdapter(GridViewCustom.this,title,body,image);
        gridView.setAdapter(adapter);


    }
}