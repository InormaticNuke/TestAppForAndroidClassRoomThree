package com.example.testappforandroidclassroomthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edtnOne, edtTwo;
    Spinner spnspinnerOne;
    ListView lstlistOne;
    List<String> results;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnOne = findViewById(R.id.edtnOne);
        edtTwo = findViewById(R.id.edtTwo);
        spnspinnerOne = findViewById(R.id.spinnerOne);
        lstlistOne = findViewById(R.id.listOne);

        String[] operations = {"Add", "Subtract", "Multiply", "Divide"};
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,operations);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnspinnerOne.setAdapter(spinnerAdapter);

    }
}