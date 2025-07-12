package com.example.lab_two_;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IntentResult extends AppCompatActivity {
    TextView resultText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_result);
        resultText = findViewById(R.id.IntentResult);
        String result = getIntent().getStringExtra("result");
        Log.d("Re", result);
        resultText.setText(result);

        btn = findViewById(R.id.sendButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("message","return by child");
                setResult(2,i);
                finish();
            }
        });
    }
}