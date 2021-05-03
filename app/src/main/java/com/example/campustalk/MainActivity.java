package com.example.campustalk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEmail;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmail = findViewById(R.id.login_email);
        mPassword = findViewById(R.id.login_password);

        findViewById(R.id.login_signup).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.login_success).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.sign_logout).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.sign_find).setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {

    }
}