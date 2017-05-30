package com.aprakriti.shoesstore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.aprakriti.shoesstore.Adapter.FragmentAdapter;
import com.aprakriti.shoesstore.Pojo.Pojo;


import java.util.ArrayList;

public class FragmentActivity extends AppCompatActivity {
    ListView l;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_fragment3);
        l= (ListView) findViewById(R.id.list3);

        ArrayList<Pojo> list = new ArrayList<>();
        FragmentAdapter adapter = new FragmentAdapter(this, R.layout.fragment_adapter, list);
        l.setAdapter(adapter);
        l.deferNotifyDataSetChanged();
    }
}
