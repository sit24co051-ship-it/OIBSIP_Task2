package com.example.schoolmanagementapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AttendanceActivity extends AppCompatActivity {

    Button btnP1, btnA1, btnP2, btnA2, btnP3, btnA3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        btnP1 = findViewById(R.id.btnP1);
        btnA1 = findViewById(R.id.btnA1);

        btnP2 = findViewById(R.id.btnP2);
        btnA2 = findViewById(R.id.btnA2);

        btnP3 = findViewById(R.id.btnP3);
        btnA3 = findViewById(R.id.btnA3);

        btnP1.setOnClickListener(v ->
                Toast.makeText(this, "Arun Present", Toast.LENGTH_SHORT).show()
        );

        btnA1.setOnClickListener(v ->
                Toast.makeText(this, "Arun Absent", Toast.LENGTH_SHORT).show()
        );

        btnP2.setOnClickListener(v ->
                Toast.makeText(this, "Priya Present", Toast.LENGTH_SHORT).show()
        );

        btnA2.setOnClickListener(v ->
                Toast.makeText(this, "Priya Absent", Toast.LENGTH_SHORT).show()
        );

        btnP3.setOnClickListener(v ->
                Toast.makeText(this, "Rahul Present", Toast.LENGTH_SHORT).show()
        );

        btnA3.setOnClickListener(v ->
                Toast.makeText(this, "Rahul Absent", Toast.LENGTH_SHORT).show()
        );
    }
}