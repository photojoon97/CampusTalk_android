package com.example.campustalk;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    private Button mBtn;
    private EditText mSNameText, mSNumberText, mSubjectText, mEmailText, mPasswordText, mConfirmPasswordText, mPhoneText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_register);
        mBtn = findViewById(R.id.complete_btn);
        mSNameText = findViewById(R.id.sName);
        mSNumberText = findViewById(R.id.sNumber);
        mSubjectText = findViewById(R.id.Subject);
        mEmailText = findViewById(R.id.Email);
        mPasswordText = findViewById(R.id.Password);
        mConfirmPasswordText = findViewById(R.id.ConfirmPassword);
        mPhoneText = findViewById(R.id.Phone);


    }
}