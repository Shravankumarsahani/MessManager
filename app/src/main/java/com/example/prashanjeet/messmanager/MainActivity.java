package com.example.prashanjeet.messmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button studentLogin,adminLogin,signUp,managerLogin;
    public TextView welcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // test
        studentLogin =(Button)findViewById(R.id.studentLogin);
        adminLogin = (Button)findViewById(R.id.adminLogin);
        //managerLogin = (Button)findViewById(R.id.manager);
        signUp = (Button)findViewById(R.id.signUp);
        welcomeMessage = (TextView)findViewById(R.id.welcomeMessage);
        studentLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent  = new  Intent(MainActivity.this,StudentLogin.class);
                startActivity(intent);
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent  = new  Intent(MainActivity.this,StudentSignUp.class);
                startActivity(intent);
            }
        });
        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent  = new  Intent(MainActivity.this ,AdminVerify.class);
                startActivity(intent);
            }
        });
    }
}
