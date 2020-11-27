package com.mufhaq.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_login extends AppCompatActivity {

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    Button btnregister, btnlogin;
    EditText txtUser, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnregister = (Button) findViewById(R.id.btnRegister);
        btnlogin = (Button) findViewById(R.id.btnLogin);
        txtUser = (EditText) findViewById(R.id.txtUser);
        txtPass = (EditText) findViewById(R.id.txtPass);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), activity_register.class));
                finish();
            }
        });

        pref = getSharedPreferences("login", MODE_PRIVATE);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtUser.getText().toString().equalsIgnoreCase("admin") && txtPass.getText().toString().equalsIgnoreCase("admin")){
//                    save ke SP
                    editor = pref.edit();
                    editor.putString("username", txtUser.getText().toString());
                    editor.putString("status", "login");
                    editor.apply();
//                    menuju MainMenu
                    startActivity(new Intent(getApplicationContext(), main.class));
                    finish();
                }
            }
        });
    }
}