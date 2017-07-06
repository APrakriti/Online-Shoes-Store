package com.prakriti.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.prakriti.myapplication.DB.DbHelper;

import java.util.Date;


public class AdminLogin extends AppCompatActivity {
    EditText email, password;
    Button login;
    DbHelper dbHelper;
    TextInputLayout inputLayoutemail, inputLayoutpassword;
    String admin_name,admin_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        email = (EditText)findViewById(R.id.loginemail);
        password= (EditText) findViewById(R.id.loginPass);
        login = (Button) findViewById(R.id.btnlogin);
        inputLayoutemail =(TextInputLayout)findViewById(R.id.inputlayout_login_email);
        inputLayoutpassword=(TextInputLayout)findViewById(R.id.inputlayout_login_password);
        dbHelper = new DbHelper(AdminLogin.this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                admin_name = email.getText().toString();
                admin_password = password.getText().toString();

                    if (admin_name.equals("admin")  && admin_password.equals("admin" ) )
                    {
                        Intent intent=new Intent(AdminLogin.this, AdminUserDetails.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(AdminLogin.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }

                };
    });}


}



