package com.example.test.recyclerview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.test.recyclerview.R;
import com.example.test.recyclerview.adapters.TaskAdapter;
import com.example.test.recyclerview.models.Task;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView tasksList;
    TaskAdapter taskAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tasks = setTasks();
        initRecycler(tasks);
    }

    void initRecycler(List<Task> taskList){
        layoutManager = new LinearLayoutManager(this);
        taskAdapter = new TaskAdapter(taskList);
        tasksList = findViewById(R.id.tasks_recycler);
        tasksList.setAdapter(taskAdapter);
    }

    List<Task> setTasks (){
        List <Task> tasks = new ArrayList<Task>();
        tasks.add(new Task("Task 1"));
        tasks.add(new Task("Task 2"));
        tasks.add(new Task("Task 3"));
        tasks.add(new Task("Task 4"));
        tasks.add(new Task("Task 5"));
        tasks.add(new Task("Task 6"));
        tasks.add(new Task("Task 7"));
        tasks.add(new Task("Task 8"));
        return tasks;
    }
}
