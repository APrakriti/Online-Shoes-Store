package com.aprakriti.shoesstore;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {
    EditText name, username, password, contact, email;
    Button register;
    DbHelper dbHelper;
    String sname, susername,  spassword, semail, scontact;
    TextInputLayout inputLayoutname, inputLayoutusername, inputLayoutpassword,
            inputLayoutemail, inputLayoutcontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        name = (EditText) findViewById(R.id.signupname);
        dbHelper = new DbHelper(SignUpPage.this);
        username = (EditText) findViewById(R.id.signupUsername);
        password = (EditText) findViewById(R.id.singupPassword);
        contact = (EditText) findViewById(R.id.signupContact);
        email = (EditText) findViewById(R.id.signupemail);
        register = (Button) findViewById(R.id.btnRegister);
        inputLayoutname = (TextInputLayout) findViewById(R.id.inputlayout_name);
        inputLayoutusername = (TextInputLayout) findViewById(R.id.inputlayout_username);
        inputLayoutpassword = (TextInputLayout) findViewById(R.id.inputlayout_password);
        inputLayoutcontact = (TextInputLayout) findViewById(R.id.inputlayout_Contact);
        inputLayoutemail = (TextInputLayout) findViewById(R.id.inputlayout_email);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sname = name.getText().toString();
                susername = username.getText().toString();
                spassword = password.getText().toString();
                semail = email.getText().toString();
                scontact = contact.getText().toString();

                ContentValues cv = new ContentValues();
                cv.put("name", sname);
                cv.put( "username", susername);
                cv.put("password",spassword);
                cv.put("email",semail );
                cv.put("contact", scontact );
                dbHelper.insertuserinfo(cv);{

                if(name.getText().toString().trim().length()==0){
                    name.setError("Name is not entered");
                    name.requestFocus();
                }
                if(username.getText().toString().trim().length()==0){
                    username.setError("Username is not entered");
                    username.requestFocus();
                }
                if(password.getText().toString().trim().length()==0){
                    password.setError("Password is not  entered");
                    password.requestFocus();
                }
                if(contact.getText().toString().trim().length()==0){
                    contact.setError("Contact Number is not entered");
                    contact.requestFocus();
                }
                if(email.getText().toString().trim().length()==0){
                    email.setError("Email Address is not entered");
                    email.requestFocus();
                }
                else {

                    Intent it = new Intent(getApplicationContext(), MainActivity.class);
                    Toast.makeText(SignUpPage.this, "Saved in database", Toast.LENGTH_SHORT).show();
                    startActivity(it);
                }
            }}
        });

    }
}
