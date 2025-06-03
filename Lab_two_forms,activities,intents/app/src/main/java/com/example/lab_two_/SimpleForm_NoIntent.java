package com.example.lab_two_;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleForm_NoIntent extends AppCompatActivity {

    EditText editName,editEmail;
    RadioGroup radioGroupGender;
    Spinner spinnerCountry;
    CheckBox checkTerm;
    Button btnSubmit;
    TextView resultView;

    String[] countries = {"Nepal", "India", "China", "USA", "UK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        spinnerCountry = findViewById(R.id.spinnerCountry);
        checkTerm = findViewById(R.id.checkTerms);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        btnSubmit = findViewById(R.id.btnSubmit);
        resultView =  findViewById(R.id.result);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,countries);
        adapter.setDropDownViewResource(com.google.android.material.R.layout.support_simple_spinner_dropdown_item);
        spinnerCountry.setAdapter(adapter);

        btnSubmit.setOnClickListener(view -> {
            String name = editName.getText().toString();
            String email = editEmail.getText().toString();
            int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
            RadioButton selectedGender = findViewById(selectedGenderId);
            String gender = selectedGender != null ? selectedGender.getText().toString() : "Not selected";
            String country = spinnerCountry.getSelectedItem().toString();

            if (!checkTerm.isChecked()) {
                Toast.makeText(this, "You must accept terms.", Toast.LENGTH_SHORT).show();
                return;
            }
            String result = "Name: " + name +
                    "\nEmail: " + email +
                    "\nGender: " + gender +
                    "\nCountry: " + country;
            resultView.setText(result);
        });
    }
}