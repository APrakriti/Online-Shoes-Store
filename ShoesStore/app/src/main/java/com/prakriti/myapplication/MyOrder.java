package com.prakriti.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import com.prakriti.myapplication.Adapter.MyOrderAdapter;
import com.prakriti.myapplication.DB.DbHelperAdmin;
import com.prakriti.myapplication.Pojo.OrderPojo;

import java.util.ArrayList;

public class MyOrder extends AppCompatActivity {

    ListView listView;
    DbHelperAdmin dbHelperAdmin;
    String scolor, ssize, squantity, sprice, sdate,sadd, sdescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        listView = (ListView) findViewById(R.id.my_order);
        dbHelperAdmin = new DbHelperAdmin(MyOrder.this);
        showINfo();
    }

    public void showINfo() {
        final ArrayList<OrderPojo> list = dbHelperAdmin.orders();
        for (int i = 0; i < list.size(); i++) {
            final OrderPojo myOrderPojo = list.get(i);
            final MyOrderAdapter myOrderAdapter = new MyOrderAdapter(MyOrder.this, R.layout.my_order_adapter, list);
            listView.setAdapter(myOrderAdapter);
            listView.deferNotifyDataSetChanged();

        }






    }
}
