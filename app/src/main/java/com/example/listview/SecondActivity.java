package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.texti);
        ImageView imageView = findViewById(R.id.imageview);


        Intent i = getIntent();
        String product = i.getStringExtra("content");
        int img = i.getIntExtra("imagename",0);
        imageView.setImageResource(img);
        textView.setText(product);
    }
}
