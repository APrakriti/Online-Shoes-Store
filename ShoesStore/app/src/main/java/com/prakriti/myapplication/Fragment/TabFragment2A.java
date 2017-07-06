package com.prakriti.myapplication.Fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.prakriti.myapplication.Adapter.FragmentOrderAdapter;
import com.prakriti.myapplication.AdminUserDetails;
import com.prakriti.myapplication.DB.DbHelperAdmin;
import com.prakriti.myapplication.OrderDescription;
import com.prakriti.myapplication.Pojo.OrderPojo;
import com.prakriti.myapplication.Pojo.Pojo;
import com.prakriti.myapplication.R;

import java.util.ArrayList;


public class TabFragment2A extends Fragment {

    ListView listView;
    DbHelperAdmin dbHelperAdmin;
    ArrayList<OrderPojo> data = new ArrayList<OrderPojo>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_tab_fragment2_a, container, false);
        perform(v);
        return v;

    }




    public void perform(View v) {
        listView = (ListView) v.findViewById(R.id.list2Id);
        dbHelperAdmin = new DbHelperAdmin(getActivity());
        final ArrayList<OrderPojo> list = dbHelperAdmin.orders();
        for (int i = 0; i < list.size(); i++) {
            final OrderPojo orderPojo = list.get(i);
            final FragmentOrderAdapter fragmentOrderAdapter = new FragmentOrderAdapter(getActivity(), R.layout.fragment_order_adapter, list);
            listView.setAdapter(fragmentOrderAdapter);
            listView.deferNotifyDataSetChanged();








        }

    }
}
