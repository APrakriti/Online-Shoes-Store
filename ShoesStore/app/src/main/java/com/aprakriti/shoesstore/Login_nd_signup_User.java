package com.aprakriti.shoesstore;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_nd_signup_User extends AppCompatActivity {
    EditText email, password;
    Button login;
    DbHelper dbHelper;
    TextView createuser;
    TextInputLayout inputLayoutemail, inputLayoutpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        email = (EditText)findViewById(R.id.loginemail);
        password= (EditText) findViewById(R.id.loginPass);
        login = (Button) findViewById(R.id.btnlogin);
        inputLayoutemail =(TextInputLayout)findViewById(R.id.inputlayout_login_email);
        inputLayoutpassword=(TextInputLayout)findViewById(R.id.inputlayout_login_password);
        dbHelper = new DbHelper(Login_nd_signup_User.this);
        createuser = (TextView) findViewById(R.id.CreateUser);

        createuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_nd_signup_User.this, SignUpPage.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().trim().length()==0){
                    email.setError("Username is not entered");
                    email.requestFocus();
                }
                if(password.getText().toString().trim().length()==0){
                    password.setError("Password is not entered");
                    password.requestFocus();
                }
                else{
                    Intent it=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(it);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}



