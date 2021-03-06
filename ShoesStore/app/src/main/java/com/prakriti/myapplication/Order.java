package com.prakriti.myapplication;

import android.content.ContentValues;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.prakriti.myapplication.DB.DbHelperAdmin;
import com.prakriti.myapplication.Pojo.OrderPojo;
import com.prakriti.myapplication.Pojo.Pojo;


public class Order extends AppCompatActivity {
    EditText name,email,deliveryadd, quantiy;
    Button btnorder;
    TextView id;
    RadioButton radiobtn_color, radiobtnsize;
    RadioGroup radio_color, radio_size;
    Spinner  spinner_day, spinner_month;
    String day[]= {"1", "2", "3", "4","5","6","7","8","9", "10"};
    String month[]= {"Jan", "Feb", "Mar", "Apr","May","Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    DbHelperAdmin dbHelperAdmin;
    String sname, semail,  scolor, ssize, squantity, sorderdate, sdeliveryaddress, sId;
    TextInputLayout inputLayoutname, inputLayoutcolor, inputLayoutsize,
            inputLayoutemail,inputLayoutdeliverydate,inputLayoutquantiy, inputLayoutdeiveryadd;
    String sDay, smonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        dbHelperAdmin = new DbHelperAdmin(Order.this);
        sId =getIntent().getStringExtra("key");

        Toast.makeText(this, sId, Toast.LENGTH_SHORT).show();

        //OrderPojo pojo= (OrderPojo) getIntent().getSerializableExtra("individual");
        id = (TextView) findViewById(R.id.id);
        name = (EditText) findViewById(R.id.ordername);

        email = (EditText) findViewById(R.id.orderemail);
        radio_color = (RadioGroup) findViewById(R.id.radio_color);
        radio_size = (RadioGroup) findViewById(R.id.radio_size);
        spinner_day = (Spinner) findViewById(R.id.spinner_day);
        spinner_month = (Spinner) findViewById(R.id.spinner_month);
        deliveryadd = (EditText) findViewById(R.id.orderDeliveryaddress);
        quantiy = (EditText) findViewById(R.id.orderquantiy);
        btnorder = (Button) findViewById(R.id.btnorder);
        inputLayoutname = (TextInputLayout) findViewById(R.id.inputlayout_order_name);
        inputLayoutcolor = (TextInputLayout) findViewById(R.id.inputlayout_order_color);
        inputLayoutsize = (TextInputLayout) findViewById(R.id.inputlayout_size);
        inputLayoutemail = (TextInputLayout) findViewById(R.id.inputlayout_order_email);
        inputLayoutdeiveryadd = (TextInputLayout) findViewById(R.id.inputlayout_order_deliveryaddress);
        inputLayoutquantiy = (TextInputLayout) findViewById(R.id.inputlayout_order_quantity);






        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sDay=(String)spinner_day.getSelectedItem();
                smonth = (String)spinner_month.getSelectedItem();


                Toast.makeText(Order.this, sDay, Toast.LENGTH_SHORT).show();



                int selectedId = radio_color.getCheckedRadioButtonId();
                int selectedId1 = radio_size.getCheckedRadioButtonId();
                radiobtn_color = (RadioButton) findViewById(selectedId);
                radiobtnsize = (RadioButton) findViewById(selectedId1);



                sname = name.getText().toString();
                semail = email.getText().toString();
                scolor = radiobtn_color.getText().toString();
                ssize = radiobtnsize.getText().toString();
                sorderdate = sDay + smonth;
                squantity = quantiy.getText().toString();
                sdeliveryaddress = deliveryadd.getText().toString();
                {
                    if(name.getText().toString().trim().length()==0){
                        name.setError("Name is not entered");
                        name.requestFocus();
                    }
                    if(email.getText().toString().trim().length()==0){
                        email.setError("Email is not entered");
                        email.requestFocus();
                    }
                    if(deliveryadd.getText().toString().trim().length()==0){
                        deliveryadd.setError("Address is not  entered");
                        deliveryadd.requestFocus();
                    }
                    if(quantiy.getText().toString().trim().length()==0){
                        quantiy.setError("Quantity is not entered");
                        quantiy.requestFocus();
                    }

                    else {

                      ContentValues cv = new ContentValues();
                        cv.put("shoesid", sId);
                        cv.put("name", sname);
                        cv.put("email", semail);
                        cv.put("color",scolor);
                        cv.put("size",ssize );
                        cv.put("quantity", squantity );
                        cv.put("delivery_date", sorderdate);
                        cv.put("delivery_address", sdeliveryaddress );
                        dbHelperAdmin.insertuserorder(cv);

                        Toast.makeText(Order.this, "Your Order is forwarded", Toast.LENGTH_SHORT).show();
                    }
                }}
        });
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, day);
        arrayAdapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner_day.setAdapter(arrayAdapter2);

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, month);
        arrayAdapter3.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner_month.setAdapter(arrayAdapter3);

      //  Pojo pojo= (Pojo) getIntent().getSerializableExtra("individual");
        //id.setText("Id:"+" "+pojo.getId());



    }

    }


