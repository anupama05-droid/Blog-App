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

public class DeletePost extends AppCompatActivity {

    EditText e1;
    AppCompatButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_delete_post);

        e1=(EditText) findViewById(R.id.btitlebtn);
        b1=(AppCompatButton) findViewById(R.id.deletebtn);
        b2=(AppCompatButton) findViewById(R.id.backtomenubtn);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Menu.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getRecipe=e1.getText().toString();

                Toast.makeText(getApplicationContext(),"Blog Deleted",Toast.LENGTH_LONG).show();

            }
        });
    }
}