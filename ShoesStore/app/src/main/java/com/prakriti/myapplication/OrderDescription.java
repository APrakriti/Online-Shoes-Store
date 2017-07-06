package com.prakriti.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.prakriti.myapplication.Pojo.Pojo;


public class OrderDescription extends AppCompatActivity {
    ImageView shoesorder;
    TextView orderdes, shoesid;
    Button btnorder;
    String sid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_description);

        Pojo pojo= (Pojo) getIntent().getSerializableExtra("individual");
        shoesorder = (ImageView) findViewById(R.id.imageorder);

        orderdes = (TextView) findViewById(R.id.descriptionorder);
        shoesid = (TextView) findViewById(R.id.id);
        btnorder = (Button) findViewById(R.id.buttonOrder);



        Glide.with(OrderDescription.this).load(pojo.getImage()).into(shoesorder);
        orderdes.setText("Details:"+" "+pojo.getDescription());
        sid = pojo.getId();
        shoesid.setText("Id:"+ sid);


        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OrderDescription.this, Order.class);
                i.putExtra("key", sid);
                startActivity(i);
            }
        });




    }
}
