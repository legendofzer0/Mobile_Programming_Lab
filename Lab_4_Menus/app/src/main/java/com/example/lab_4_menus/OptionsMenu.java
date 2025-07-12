package com.example.lab_4_menus;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OptionsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(this, item.getTitle() + " Clicked", Toast.LENGTH_SHORT).show();
        return true;
    }
}