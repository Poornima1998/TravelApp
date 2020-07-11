package com.example.travel.ui.country;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.travel.CountryAdapter;
import com.example.travel.CountryItem;
import com.example.travel.R;


import java.util.ArrayList;

public class CountryFragment extends Fragment {

    private ArrayList<CountryItem> countryItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_country, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CountryAdapter(countryItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        countryItems.add(new CountryItem(R.drawable.iceland, "Iceland","0","0"));
        countryItems.add(new CountryItem(R.drawable.itali, "Italy","1","0"));
        countryItems.add(new CountryItem(R.drawable.japan, "Japan","2","0"));
        countryItems.add(new CountryItem(R.drawable.mexico, "Mexico","3","0"));
        countryItems.add(new CountryItem(R.drawable.morocco, "Morocco","4","0"));
        countryItems.add(new CountryItem(R.drawable.nepal, "Nepal","5","0"));
        countryItems.add(new CountryItem(R.drawable.newzealand, "Newzealand","6","0"));
        countryItems.add(new CountryItem(R.drawable.norway, "Norway","7","0"));
        countryItems.add(new CountryItem(R.drawable.peru, "New Peru","8","0"));
        countryItems.add(new CountryItem(R.drawable.philippines, "Philippines","9","0"));
        countryItems.add(new CountryItem(R.drawable.spain, "Spain","10","0"));
        countryItems.add(new CountryItem(R.drawable.switzerland, "Switzerland","11","0"));
        countryItems.add(new CountryItem(R.drawable.thailand, "Thailand","12","0"));
        countryItems.add(new CountryItem(R.drawable.turkey, "Turkey","13","0"));
        countryItems.add(new CountryItem(R.drawable.greece, "Greece","14","0"));
        countryItems.add(new CountryItem(R.drawable.chilie, "New Chile","15","0"));


        return root;
    }
}