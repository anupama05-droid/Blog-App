package com.anupama.blogapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    AppCompatButton bn1,bn2,bn3,bn4,bn5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        bn1=(AppCompatButton) findViewById(R.id.addbtn);
        bn2=(AppCompatButton) findViewById(R.id.searchbtn);
        bn3=(AppCompatButton) findViewById(R.id.dltbtn);
        bn4=(AppCompatButton) findViewById(R.id.viewbtn);
        bn5=(AppCompatButton) findViewById(R.id.logoutbtn);

        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preference=getSharedPreferences("logapp",MODE_PRIVATE);
                SharedPreferences.Editor editor=preference.edit();
                editor.clear();
                editor.apply();
                Intent in5=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in5);
            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(getApplicationContext(), ViewBlog.class);
                startActivity(in4);
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(), DeletePost.class);
                startActivity(in3);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),SearchPost.class);
                startActivity(in2);
            }
        });
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(), AddPost.class);
                startActivity(in1);
            }
        });
    }
}