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
import com.aprakriti.shoesstore.R;
import com.bumptech.glide.Glide;


import java.util.ArrayList;
import java.util.List;


public class FragmentAdapter extends ArrayAdapter<Pojo> {

    Context context;
    int layoutResourceId;
    List<Pojo> taskList = new ArrayList<>();

    public FragmentAdapter(Context context, int layoutResourceId, List<Pojo> taskList) {
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
            holder.id = (TextView)row.findViewById(R.id.id);
            holder.quality = (TextView)row.findViewById(R.id.quality);
            holder.price = (TextView)row.findViewById(R.id.price);
            holder.description = (TextView)row.findViewById(R.id.description);
            holder.imageView = (ImageView) row.findViewById(R.id.imageview);

            row.setTag(holder);
        }
        else
        {
            holder = (TaskHolder)row.getTag();
        }

        Pojo pojo = taskList.get(position);
        holder.id.setText("Id:"+" "+pojo.getId());
        holder.quality.setText("Quality:"+" "+pojo.getQuality());
        holder.price.setText("Price:"+" "+ pojo.getPrice());
        holder.price.setText("Description:"+" "+ pojo.getDescription());


        //Glide.with(context).load("https://developer.android.com/_static/images/android/touchicon-180.png").into(holder.imageView);
        //Picasso.with(context).load("https://developer.android.com/_static/images/android/touchicon-180.png").into(holder.imageView);
        Glide.with(getContext()).load(pojo.getImage()).into(holder.imageView);


        return row;
    }

    static class TaskHolder
    {
        TextView price, id, quality , description;
        ImageView imageView;

    }
}

