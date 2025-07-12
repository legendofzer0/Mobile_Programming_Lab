package com.example.lab_3_fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Button showFragement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showFragement = findViewById(R.id.FragButton);
        showFragement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyFragment fragment = new MyFragment();
                FragmentManager manager =getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.FragmentContainer,fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
