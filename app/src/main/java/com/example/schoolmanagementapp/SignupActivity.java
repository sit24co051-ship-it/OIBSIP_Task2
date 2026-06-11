package com.example.schoolmanagementapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(v ->
                Toast.makeText(this,
                        "Account Created Successfully",
                        Toast.LENGTH_SHORT).show());
    }
}