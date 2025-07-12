package com.example.lab_6_views.ListView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_6_views.R;

public class ListViewCustom extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_custom);
        listView=findViewById(R.id.myCustomList);

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
        MyListAdapter adapter = new MyListAdapter(this,title,body,image);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = adapter.title[position];
                String body = adapter.body[position];
                Toast.makeText(ListViewCustom.this,title+": "+body,Toast.LENGTH_SHORT).show();
            }
        });
    }
}