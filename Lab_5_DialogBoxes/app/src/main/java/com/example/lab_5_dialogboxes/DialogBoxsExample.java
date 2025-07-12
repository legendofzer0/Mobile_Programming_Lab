package com.example.lab_5_dialogboxes;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DialogBoxsExample extends AppCompatActivity {
    Button alertButton;
    Button customButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        alertButton = findViewById(R.id.button);
        customButton =findViewById(R.id.button2);

        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        customButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showCustomDialog();
            }
        });
    }

    public void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(DialogBoxsExample.this);
        builder.setTitle("Hello");
        builder.setMessage(" This is alert box");
        builder.setCancelable(true);

        builder.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("alert","Alert yes button pressed");
                        dialogInterface.cancel();
                    }
                }
        );
        builder.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("alert","Alert No button pressed");
                        dialogInterface.cancel();
                    }
                }
        );
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
    }
    public void showCustomDialog() {
        AlertDialog.Builder customDialog = new AlertDialog.Builder(DialogBoxsExample.this);
        customDialog.setTitle("Sum:");
        customDialog.setCancelable(true);

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_dialog, null);
        customDialog.setView(view);

        EditText n1 = view.findViewById(R.id.FirstNumber);
        EditText n2 = view.findViewById(R.id.SecondNumber);
        Button calculate = view.findViewById(R.id.calculate);
        TextView txtResult = view.findViewById(R.id.Result);

        AlertDialog dialogBox = customDialog.create();

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int first = Integer.parseInt(n1.getText().toString());
                    int second = Integer.parseInt(n2.getText().toString());
                    int result = first + second;
                    txtResult.setText("Result: " + result);
                } catch (NumberFormatException e) {
                    txtResult.setText("Please enter valid numbers");
                }
            }
        });

        dialogBox.show();
    }



}