package com.mobileapplication.todoapp.adapter;

import com.mobileapplication.todoapp.model.Task;

public interface OnToDoClickListener {

    void onToDoClick(Task task);

    void onToDoRadioButton(Task task);
}
