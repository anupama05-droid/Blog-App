package com.anupama.blogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
    AppCompatButton bn1,bn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.age);
        ed3=(EditText) findViewById(R.id.emailid);
        ed4=(EditText) findViewById(R.id.mobno);
        ed5=(EditText) findViewById(R.id.username);
        ed6=(EditText) findViewById(R.id.password);
        ed7=(EditText) findViewById(R.id.confirmpass);
        bn1=(AppCompatButton) findViewById(R.id.signbtn);
        bn2=(AppCompatButton) findViewById(R.id.backtologinbtn);


        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getName=ed1.getText().toString();
                String getAge=ed2.getText().toString();
                String getEmailid=ed3.getText().toString();
                String getMobno=ed4.getText().toString();
                String getUserName=ed5.getText().toString();
                String getPassword=ed6.getText().toString();
                String getConfirmPass=ed7.getText().toString();
                Toast.makeText(getApplicationContext(),getName+" "+getAge+" "+getEmailid+" "+getMobno+" "+getUserName+" "+getPassword+" "+getConfirmPass,Toast.LENGTH_LONG).show();
            }
        });
    }
}