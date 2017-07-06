package com.prakriti.myapplication.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.prakriti.myapplication.Pojo.UserInfo;
import com.prakriti.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class CustomeAdapter extends ArrayAdapter<UserInfo> {

    Context context;
    int layoutResourceId;
    List<UserInfo> taskList = new ArrayList<>();
    int i=0;

    public CustomeAdapter(Context context, int layoutResourceId, List<UserInfo> taskList) {
        super(context, layoutResourceId, taskList);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.taskList = taskList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        TaskHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new TaskHolder();
            holder.name = (TextView)row.findViewById(R.id.name);
            holder.username = (TextView)row.findViewById(R.id.username);
            holder.password = (TextView)row.findViewById(R.id.password);
            holder.contact = (TextView)row.findViewById(R.id.contact);
            holder.email = (TextView)row.findViewById(R.id.email);


            row.setTag(holder);
        }
        else
        {
            holder = (TaskHolder)row.getTag();
        }

        UserInfo userInfo = taskList.get(position);
        holder.name.setText(userInfo.getName());
        holder.username.setText(userInfo.getUsername());
        holder.password.setText(userInfo.getPassword());
        holder.contact.setText(userInfo.getContact());
        holder.email.setText(userInfo.getEmail());


        return row;
    }

    static class TaskHolder
    {
        TextView name, username, password, contact, email;
    }
}

