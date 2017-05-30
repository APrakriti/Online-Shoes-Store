package com.aprakriti.shoesstore;

import android.content.Intent;
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
                Intent i = new Intent(AdminUser.this, Login_nd_signup_User.class);
                startActivity(i);
            }
        });}}
       /* admin = (Button) findViewById(R.id.admin_login);
        user = (Button) findViewById(R.id.user_login);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminUser.this , AdminLogin.class);
                startActivity(i);
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminUser.this, Login_nd_signup_User.class);
                startActivity(i);
            }
        });
    }
}*/
