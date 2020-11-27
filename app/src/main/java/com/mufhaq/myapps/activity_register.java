package com.mufhaq.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_register extends AppCompatActivity {

    Button btnregister;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnlogin = (Button) findViewById(R.id.btnLogin);
        btnregister = (Button) findViewById(R.id.btnRegister);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), activity_login.class));
                finish();
            }
        });
    }

//    Disable Back Button Press
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if(keyCode==KeyEvent.KEYCODE_BACK)
//            Toast.makeText(getApplicationContext(), "back press",
//                    Toast.LENGTH_LONG).show();
//
//        return false;
//        // Disable back button..............
//    }
}