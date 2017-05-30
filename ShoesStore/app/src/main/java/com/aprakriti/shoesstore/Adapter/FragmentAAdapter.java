package com.aprakriti.shoesstore.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aprakriti.shoesstore.Pojo.Pojo;
import com.aprakriti.shoesstore.Pojo.UserInfo;
import com.aprakriti.shoesstore.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;


public class FragmentAAdapter extends ArrayAdapter<UserInfo> {

    Context context;
    int layoutResourceId;
    List<UserInfo> taskList = new ArrayList<>();

    public FragmentAAdapter(Context context, int layoutResourceId, List<UserInfo> taskList) {
        super(context, layoutResourceId, taskList);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.taskList = taskList;
    }
    public void FragmentAdapter(){

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
        holder.name.setText("Name:"+" "+userInfo.getName());
        holder.username.setText("Username:"+" "+userInfo.getUsername());
        holder.password.setText("Password:"+" "+userInfo.getPassword());
        holder.contact.setText("Contact:"+" "+userInfo.getContact());
        holder.email.setText("Email:"+" "+userInfo.getEmail());

        return row;
    }

    static class TaskHolder
    {
        TextView name, username, password, contact, email;


    }
}

