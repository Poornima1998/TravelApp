package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class CityDetails extends AppCompatActivity {

    ImageView imageView1;
    TextView title1TextView;
    TextView populationTextView;
    TextView airportTextView;
    String city;
    int imageResourse1;
    String population;
    String airport;

    //weather
    TextView view_temp;
    TextView view_desc;
    ImageView view_weather;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citydetails);


        imageView1=findViewById(R.id.image1);
        title1TextView=findViewById(R.id.title1TextView);
        populationTextView=findViewById(R.id.populationTextView);
        airportTextView=findViewById(R.id.airportTextView);
        city=getIntent().getStringExtra("title1TextView");
        imageResourse1=getIntent().getIntExtra("image1",0);
        population=getIntent().getStringExtra("populationTextView");
        airport=getIntent().getStringExtra("airportTextView");
        title1TextView.setText(city);
        imageView1.setImageResource(imageResourse1);
        populationTextView.setText(population);
        airportTextView.setText(airport);




    }

    @Override
    protected void onStart(){
        super.onStart();   //appcompactactivity kiyana class eken extend karanna
        Log.i("city","onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("city","onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("city","onPause");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("city","onDestroy");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("city","onStop");

    }
    //airport map button
    public void goAirport(View view){

        Intent intent = new Intent(CityDetails.this, MapsActivity.class);
        startActivity(intent);
    }









}
