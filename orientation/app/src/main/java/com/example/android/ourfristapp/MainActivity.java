package com.example.android.ourfristapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textViewDisplay;
    Button buttonChangeText;
    EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewDisplay = findViewById(R.id.textViewDisplay);
        buttonChangeText = findViewById(R.id.buttonChangeText);
        editTextName = findViewById(R.id.editTextName);
    }

    public void ChangeText(View view) {
        Toast.makeText(this, "Your Name is: " + editTextName.getText().toString().trim(), Toast.LENGTH_SHORT).show();
    }
}