package com.mufhaq.myapps;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ControlClass extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
        if (sharedPreferences.getString("username", "").isEmpty() || sharedPreferences.getString("username", "").equalsIgnoreCase("")){
            startActivity(new Intent(getApplicationContext(), activity_login.class));
            finish();
        }else {
            startActivity(new Intent(getApplicationContext(), main.class));
            finish();
        }
    }
}
