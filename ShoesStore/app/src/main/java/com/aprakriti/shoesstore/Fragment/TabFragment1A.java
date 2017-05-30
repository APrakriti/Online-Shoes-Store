package com.aprakriti.shoesstore.Fragment;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.aprakriti.shoesstore.Adapter.FragmentAAdapter;
import com.aprakriti.shoesstore.DbHelper;
import com.aprakriti.shoesstore.Pojo.UserInfo;
import com.aprakriti.shoesstore.R;
import java.util.ArrayList;

public class TabFragment1A extends Fragment {

    ListView listView;
    DbHelper dbHelper;
    ArrayList<UserInfo> data = new ArrayList<UserInfo>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_tab_fragment1_a, container, false);
        perform(v);
        return v;

    }

    public void perform(View v) {
        listView = (ListView) v.findViewById(R.id.listId);
        dbHelper = new DbHelper(getActivity());
        final ArrayList<UserInfo> list = dbHelper.userInfos();
        for (int i = 0; i < list.size(); i++) {
            final UserInfo info = list.get(i);
            final FragmentAAdapter fragmentAAdapter = new FragmentAAdapter(getActivity(), R.layout.fragment_a_adapter, list);
            listView.setAdapter(fragmentAAdapter);
            listView.deferNotifyDataSetChanged();

        }

    }
}
