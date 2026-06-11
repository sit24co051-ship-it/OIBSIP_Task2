package com.example.schoolmanagementapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText emailInput, passwordInput;
    Button loginButton, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginButton = findViewById(R.id.loginButton);
        btnSignup = findViewById(R.id.btnSignup);

        loginButton.setOnClickListener(v -> {

            String email = emailInput.getText().toString();
            String password = passwordInput.getText().toString();

            if (email.equals("admin") && password.equals("1234")) {

                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);

            } else {

                Toast.makeText(
                        LoginActivity.this,
                        "Invalid Login!",
                        Toast.LENGTH_SHORT
                ).show();

            }
        });

        btnSignup.setOnClickListener(v -> {

            Intent intent = new Intent(
                    LoginActivity.this,
                    SignupActivity.class
            );

            startActivity(intent);

        });
    }
}