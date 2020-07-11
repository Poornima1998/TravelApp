package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    ImageView imageView;
    TextView titleTextView;
    String country;
    int imageResourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);



        imageView=findViewById(R.id.image);
        titleTextView=findViewById(R.id.titleTextView);
        country=getIntent().getStringExtra("titleTextView");
        imageResourse=getIntent().getIntExtra("image",0);
        titleTextView.setText(country);
        imageView.setImageResource(imageResourse);
    }
}
