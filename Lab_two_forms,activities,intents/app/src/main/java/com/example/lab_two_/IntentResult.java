package com.example.lab_two_;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntentResult extends AppCompatActivity {
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_result);
        resultText = findViewById(R.id.IntentResult);
        String result = getIntent().getStringExtra("result");
        Log.d("Re", result);
        resultText.setText(result);
    }
}