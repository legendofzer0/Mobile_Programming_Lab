package com.example.lab_two_;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class Simple_Form_Intent extends AppCompatActivity {

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
        setContentView(R.layout.activity_simple_form_intent);

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        spinnerCountry = findViewById(R.id.spinnerCountry);
        checkTerm = findViewById(R.id.checkTerms);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        btnSubmit = findViewById(R.id.btnSubmit);
        resultView =  findViewById(R.id.result);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,countries);
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
            Intent intent = new Intent(this,IntentResult.class);
            intent.putExtra("result",result);
            startActivity(intent);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data ){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 2){
            String msg = data.getStringExtra("message");
            Log.d("TAG", "onActivityResult: ");
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
        }
    }
}