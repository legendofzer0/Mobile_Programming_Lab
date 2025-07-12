package com.example.lab_6_views.ListView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_6_views.R;

public class ListViewNormal extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        listView = findViewById(R.id.MyListView);
        String names[] = {"Ram", "Shyam", "Jenish", "Sheejan"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.list_view_items,
                R.id.text,
                names
        );
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String value = (String) adapterView.getItemAtPosition(position);
                Toast.makeText(ListViewNormal.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
