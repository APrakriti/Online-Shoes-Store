package com.aprakriti.shoesstore.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.aprakriti.shoesstore.Pojo.MyOrderPojo;
import com.aprakriti.shoesstore.Pojo.OrderPojo;
import com.aprakriti.shoesstore.Pojo.UserInfo;
import com.aprakriti.shoesstore.R;

import java.util.ArrayList;
import java.util.List;


public class MyOrderAdapter extends ArrayAdapter<OrderPojo> {

    Context context;
    int layoutResourceId;
    List<OrderPojo> taskList = new ArrayList<>();

    public MyOrderAdapter(Context context, int layoutResourceId, List<OrderPojo> taskList) {
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
            holder.color = (TextView)row.findViewById(R.id.color);
            holder.size = (TextView)row.findViewById(R.id.size);
            holder.quantity = (TextView)row.findViewById(R.id.quantity);
            holder.deliveryaddress = (TextView)row.findViewById(R.id.address);
            holder.deliverydate = (TextView)row.findViewById(R.id.date);
            holder.price = (TextView)row.findViewById(R.id.price);
            holder.description = (TextView)row.findViewById(R.id.description);


            row.setTag(holder);
        }
        else
        {
            holder = (TaskHolder)row.getTag();
        }

        OrderPojo OrderPojo = taskList.get(position);
        holder.color.setText("Color:"+" "+OrderPojo.getColor());
        holder.size.setText("Size:"+" "+OrderPojo.getSize());
        holder.quantity.setText("Quantiy:"+" "+OrderPojo.getQuantity());
        holder.deliveryaddress.setText("Address:"+" "+OrderPojo.getDeliveryaddress());
        holder.deliverydate.setText("Date:"+" "+OrderPojo.getDeliverydate());

        return row;
    }

    static class TaskHolder
    {
        TextView color, size, quantity, deliveryaddress, deliverydate, price, description;


    }
}

