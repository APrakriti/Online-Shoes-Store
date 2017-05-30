package com.aprakriti.shoesstore.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.aprakriti.shoesstore.Pojo.OrderPojo;
import com.aprakriti.shoesstore.Pojo.UserInfo;
import com.aprakriti.shoesstore.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentOrderAdapter extends ArrayAdapter<OrderPojo> {

    Context context;
    int layoutResourceId;
    List<OrderPojo> taskList = new ArrayList<>();

    public FragmentOrderAdapter(Context context, int layoutResourceId, List<OrderPojo> taskList) {
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
            holder.email = (TextView)row.findViewById(R.id.email);
            holder.color = (TextView)row.findViewById(R.id.color);
            holder.size = (TextView)row.findViewById(R.id.size);
            holder.quantity = (TextView)row.findViewById(R.id.quantity);
            holder.deliveryaddress = (TextView)row.findViewById(R.id.deliveryaddresss);


            row.setTag(holder);
        }
        else
        {
            holder = (TaskHolder)row.getTag();
        }

        OrderPojo orderPojo = taskList.get(position);
        holder.name.setText("Name:"+" "+orderPojo.getName());
        holder.email.setText("Email:"+" "+orderPojo.getEmail());
        holder.color.setText("Color:"+" "+orderPojo.getColor());
        holder.size.setText("Size:"+" "+orderPojo.getSize());
        holder.quantity.setText("Quantity:"+" "+orderPojo.getQuantity());
        holder.deliveryaddress.setText("Delivery Address:"+" "+orderPojo.getDeliveryaddress());

        return row;
    }

    static class TaskHolder
    {
        TextView name, email, color, size, quantity, deliveryaddress ;


    }
}

