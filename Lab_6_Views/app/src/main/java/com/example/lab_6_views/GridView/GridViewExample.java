package com.example.lab_6_views.GridView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_6_views.R;

public class GridViewExample extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_example);

        gridView = findViewById(R.id.myGrid);
        String names[] = {"Ram", "Shyam", "Jenish", "Sheejan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.gridview_items,R.id.gridItem,names);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position);
                Toast.makeText(GridViewExample.this,value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}