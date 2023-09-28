package com.example.testappforandroidclassroomthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edtnOne, edtnTwo;
    Spinner spnspinnerOne;
    ListView lstlistOne;
    List<String> results;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnOne = findViewById(R.id.nOne);
        edtnTwo = findViewById(R.id.nTwo);
    }
}