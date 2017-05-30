package com.aprakriti.shoesstore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.aprakriti.shoesstore.Adapter.CustomeAdapter;
import com.aprakriti.shoesstore.Pojo.UserInfo;

import java.util.ArrayList;


public class UserDetails extends AppCompatActivity {
    ListView listView;
    DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_details);
        listView = (ListView) findViewById(R.id.listId);
        dbHelper = new DbHelper(UserDetails.this);
        showINfo();
    }

    public void showINfo() {
        final ArrayList<UserInfo> list = dbHelper.userInfos();
        for (int i = 0; i < list.size(); i++) {
            final UserInfo info = list.get(i);
            final CustomeAdapter customeAdapter = new CustomeAdapter(UserDetails.this, R.layout.activity_custome_adapter, list);
            listView.setAdapter(customeAdapter);
            listView.deferNotifyDataSetChanged();

        }






    }
}
