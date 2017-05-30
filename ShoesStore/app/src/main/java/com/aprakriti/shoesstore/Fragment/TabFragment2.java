package com.aprakriti.shoesstore.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.aprakriti.shoesstore.Adapter.FragmentAdapter;
import com.aprakriti.shoesstore.Pojo.Pojo;
import com.aprakriti.shoesstore.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class TabFragment2 extends Fragment {

    ListView mlist;
    int ctr;
    Pojo pojo;
    ImageView mImage;
    ArrayList<Pojo> data = new ArrayList<Pojo>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_fragment2, container, false);
        perform(v);
        return v;

    }

    public void perform(View v) {
        mlist = (ListView) v.findViewById(R.id.list2);


        InputStream inputStream = getResources().openRawResource(R.raw.gents);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            ctr = inputStream.read();
            while (ctr != -1) {
                byteArrayOutputStream.write(ctr);
                ctr = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Parse the data into jsonobject to get original data in form of json.
            JSONObject jObject = new JSONObject(
                    byteArrayOutputStream.toString());
            JSONObject jObjectResult = jObject.getJSONObject("Datas");
            JSONArray jArray = jObjectResult.getJSONArray("Gents");
            for (int i = 0; i < jArray.length(); i++) {

                JSONObject prodObj = jArray.getJSONObject(i);
                String id = prodObj.getString("id");
                String quality = prodObj.getString("Quality");
                String price = prodObj.getString("Price");
                String image = prodObj.getString("Image");
                String description = prodObj.getString("Description");


                pojo=new Pojo(id,quality,price,image, description);
                data.add(pojo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        FragmentAdapter fragmentAdapter= new FragmentAdapter(getActivity(),R.layout.fragment_adapter,data);
        mlist.setAdapter(fragmentAdapter);



    }

}



