package com.example.schoolmanagementapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentsActivity extends AppCompatActivity {

    EditText taskInput;
    Button btnAddTask;
    TextView taskDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        taskInput = findViewById(R.id.taskInput);
        btnAddTask = findViewById(R.id.btnAddTask);
        taskDisplay = findViewById(R.id.taskDisplay);

        btnAddTask.setOnClickListener(v -> {
            String task = taskInput.getText().toString();

            if (!task.isEmpty()) {
                taskDisplay.setText(task);
            }
        });
    }
}