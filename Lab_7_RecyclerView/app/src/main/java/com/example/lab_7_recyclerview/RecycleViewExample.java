package com.example.lab_7_recyclerview;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;

public class RecycleViewExample extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycle_view);
        layoutManager = new LinearLayoutManager(this);
    }
}