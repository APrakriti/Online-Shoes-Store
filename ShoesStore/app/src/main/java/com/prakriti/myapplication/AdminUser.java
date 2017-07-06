package com.prakriti.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AdminUser extends AppCompatActivity {
    Button admin, user;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_user);
        admin = (Button) findViewById(R.id.admin_login);
        user = (Button) findViewById(R.id.user_login);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminUser.this, AdminLogin.class);
                startActivity(i);


            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor;

                SharedPreferences sharedPreferences = getSharedPreferences("Reg",MODE_PRIVATE);
                editor = sharedPreferences.edit();
                if (sharedPreferences.contains("Email")&& sharedPreferences.contains("Password"))
                {
                    Intent i = new Intent(AdminUser.this, MainActivity.class);
                    startActivity(i);
                }
                else {

                    Intent i = new Intent(AdminUser.this, LoginPage.class);
                    startActivity(i);
                }

            }
        });}}

