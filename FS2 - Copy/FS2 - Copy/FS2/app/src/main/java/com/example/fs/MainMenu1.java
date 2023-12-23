package com.example.fs;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainMenu1 extends AppCompatActivity {
    Button imgButton1,imgButton2,imgButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu1);

        imgButton1 =(Button)findViewById(R.id.button3);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu1.this, ViewUploadsActivity.class);
                startActivity(intent);
            }
        });

        imgButton2=(Button)findViewById(R.id.button5);
        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu1.this, com.example.fs.login2.class);
                startActivity(intent);
            }
        });
        imgButton3=(Button)findViewById(R.id.button6);
        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu1.this, com.example.fs.StudentNoticeBoard.class);
                startActivity(intent);
            }
        });
    }
    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(), com.example.fs.StartPage.class));
        finish();
    }
}