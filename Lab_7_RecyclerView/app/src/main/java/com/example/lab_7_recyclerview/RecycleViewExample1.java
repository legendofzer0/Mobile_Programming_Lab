package com.example.lab_7_recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_7_recyclerview.controller.StudentAdapter;
import com.example.lab_7_recyclerview.model.Student;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewExample1 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerView = findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        students = new ArrayList<>();
        students.add(new Student("Ram", 1));
        students.add(new Student("Shyam", 2));
        students.add(new Student("Hari", 3));
        students.add(new Student("Jenish", 4));

        StudentAdapter adapter = new StudentAdapter(students);
        recyclerView.setAdapter(adapter);
    }
}
