package com.example.screens;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Intent intent = getIntent();
        String nameValue = intent.getStringExtra("Name");
        String programValue = intent.getStringExtra("Program");

        TextView textViewName = findViewById(R.id.textViewName);
        textViewName.setText(nameValue);

        TextView textViewProgram = findViewById(R.id.textViewProgram);
        textViewProgram.setText(programValue);
    }
}
