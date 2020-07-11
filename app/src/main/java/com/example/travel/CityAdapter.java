package com.example.travel;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityAdapter extends RecyclerView.Adapter<com.example.travel.CityAdapter.ViewHolder>  {



        private ArrayList<CityItem> cityItems;
        private Context context;
        private CityDB CityDB;

        public CityAdapter(ArrayList<CityItem> cityItems, Context context){
            this.cityItems = cityItems;
            this.context = context;
        }

        @NonNull
        @Override
        public com.example.travel.CityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            CityDB = new CityDB(context);
            //Create table first
            SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
            boolean firstStart = prefs.getBoolean("firstStart",true);
            if(firstStart){
                createTableOnFirstStart();
            }

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cityitem,
                    parent,false);
            return new com.example.travel.CityAdapter.ViewHolder(view);
        }



        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final CityItem cityItem= cityItems.get(position);

            readCursorData(cityItem,holder);
            holder.imageView1.setImageResource(cityItem.getImageResourse1());
            holder.title1TextView.setText(cityItem.getTitle1());
            holder.countryNameTextView.setText(cityItem.getCountryname());
            holder.populationTextView.setText(cityItem.getPopulation());
            holder.airportTextView.setText(cityItem.getAirport());

            holder.relative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {   //set on click for cities list
                    Intent intent = new Intent(context,CityDetails.class);
                    intent.putExtra("image1",cityItem.getImageResourse1());
                    intent.putExtra("title1TextView",cityItem.getTitle1());
                    intent.putExtra("countryNameTextView",cityItem.getCountryname());
                    intent.putExtra("populationTextView",cityItem.getPopulation());
                    intent.putExtra("airportTextView",cityItem.getAirport());



                    context.startActivity(intent);
                }
            });
        }



        @Override
        public int getItemCount() {
            return cityItems.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            ImageView imageView1;
            TextView title1TextView;
            TextView countryNameTextView;
            TextView populationTextView;
            TextView airportTextView;
            RelativeLayout relative;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView1 = itemView.findViewById(R.id.imageView1);
                title1TextView= itemView.findViewById(R.id.title1TextView);
                countryNameTextView = itemView.findViewById(R.id.countryNameTextView);
                populationTextView=itemView.findViewById(R.id.populationTextView);
                airportTextView = itemView.findViewById(R.id.airportTextView);
                relative = itemView.findViewById(R.id.relative);


            }
        }

        private void createTableOnFirstStart(){
            CityDB.insertEmpty();

            SharedPreferences prefs= context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstStart",false);
            editor.apply();
        }
        private void readCursorData(CityItem cityItem, com.example.travel.CityAdapter.ViewHolder viewHolder) {
            Cursor cursor = CityDB.read_all_data(cityItem.getKey_id());
            SQLiteDatabase db = CityDB.getReadableDatabase();

            }



    }
