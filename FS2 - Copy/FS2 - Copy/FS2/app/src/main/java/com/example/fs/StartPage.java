package com.example.fs;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class StartPage extends Activity {
    Button imgButton1,imgButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        FirebaseAuth.getInstance().signOut();//logout

        imgButton1 =(Button)findViewById(R.id.teacher);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, com.example.fs.login1.class);
                startActivity(intent);
            }
        });

        imgButton2=(Button)findViewById(R.id.student);
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, com.example.fs.login.class);
                startActivity(intent);
            }
        });
    }
}