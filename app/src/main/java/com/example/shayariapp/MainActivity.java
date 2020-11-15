package com.example.shayariapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView quote;
        quote=findViewById(R.id.txtview);

        Button btn1=findViewById(R.id.btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String sharetext= quote.getText().toString();
               Intent i=new Intent();
               i.setAction(Intent.ACTION_SEND);
               i.setType("text/plain");
               i.putExtra(Intent.EXTRA_TEXT,sharetext);
               startActivity(i);

            }
        });
    }
}