package com.example.test.recyclerview.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.test.recyclerview.R;
import com.example.test.recyclerview.models.Task;

public class TaskViewHolder extends RecyclerView.ViewHolder {

    private TextView title;

    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.vh_task_title);

    }

    public void onBind (Task task){
        title.setText(task.title);
    }
}
