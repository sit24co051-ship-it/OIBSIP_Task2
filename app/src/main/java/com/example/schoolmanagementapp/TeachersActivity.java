package com.example.schoolmanagementapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TeachersActivity extends AppCompatActivity {

    EditText eventInput;
    Button btnAddEvent;
    TextView eventDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

        eventInput = findViewById(R.id.eventInput);
        btnAddEvent = findViewById(R.id.btnAddEvent);
        eventDisplay = findViewById(R.id.eventDisplay);

        btnAddEvent.setOnClickListener(v -> {
            String event = eventInput.getText().toString();

            if (!event.isEmpty()) {
                eventDisplay.setText(event);
            }
        });
    }
}