package com.example.lab_7_recyclerview.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_7_recyclerview.R;
import com.example.lab_7_recyclerview.model.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    private final List<Student> studentList;

    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }
    public static class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView name, roll;

        public StudentViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.studentName);
            roll = itemView.findViewById(R.id.studentRoll);
        }
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_student, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.name.setText("Name: " + student.getName());
        holder.roll.setText("Roll No: " + student.getRoll());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

}
