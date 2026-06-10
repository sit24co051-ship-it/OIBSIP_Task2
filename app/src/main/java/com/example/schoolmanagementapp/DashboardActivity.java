package com.example.schoolmanagementapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button btnStudents, btnTeachers, btnAttendance, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnStudents = findViewById(R.id.btnStudents);
        btnTeachers = findViewById(R.id.btnTeachers);
        btnAttendance = findViewById(R.id.btnAttendance);
        btnLogout = findViewById(R.id.btnLogout);

        btnStudents.setOnClickListener(v ->
                startActivity(new Intent(this, StudentsActivity.class))
        );

        btnTeachers.setOnClickListener(v ->
                startActivity(new Intent(this, TeachersActivity.class))
        );

        btnAttendance.setOnClickListener(v ->
                startActivity(new Intent(this, AttendanceActivity.class))
        );

        btnLogout.setOnClickListener(v -> {
            Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}