package com.example.schoolmanagementapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AttendanceActivity extends AppCompatActivity {

    EditText noteInput;
    Button btnSaveNote;
    TextView noteDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        noteInput = findViewById(R.id.noteInput);
        btnSaveNote = findViewById(R.id.btnSaveNote);
        noteDisplay = findViewById(R.id.noteDisplay);

        btnSaveNote.setOnClickListener(v -> {
            String note = noteInput.getText().toString();

            if (!note.isEmpty()) {
                noteDisplay.setText(note);
            }
        });
    }
}