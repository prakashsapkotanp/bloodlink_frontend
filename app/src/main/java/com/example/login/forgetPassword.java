package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class forgetPassword extends AppCompatActivity {
private EditText passwordforgetpage;
private Button forgetpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        passwordforgetpage=findViewById(R.id.passwodforgetpage);
    }

}