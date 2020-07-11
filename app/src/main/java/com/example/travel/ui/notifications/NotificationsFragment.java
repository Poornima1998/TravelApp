package com.example.travel.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travel.CityAdapter;
import com.example.travel.CityItem;
import com.example.travel.R;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {


    private ArrayList<CityItem> cityItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CityAdapter(cityItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        cityItems.add(new CityItem(R.drawable.iceland, "kalutara","Sri lanka","0","Population: 7","Nearest Airport : Katunayaka"));
        cityItems.add(new CityItem(R.drawable.iceland, "panadura","Sri lanka","1","1000","sssss"));
        cityItems.add(new CityItem(R.drawable.a2, "homagama","Sri lanka","2","27","kdsdsaka"));
        cityItems.add(new CityItem(R.drawable.a1, "pitipana","Sri lanka","3","560","katunsdadsayaka"));
        cityItems.add(new CityItem(R.drawable.iceland, "London","England","4","660","ffsfdyaka"));
        cityItems.add(new CityItem(R.drawable.a4, "johannesburg","Africa","5","88880","sdsftunayaka"));
        cityItems.add(new CityItem(R.drawable.iceland, "Milan","Italy","6","88880","sdsftunayaka"));
        cityItems.add(new CityItem(R.drawable.a4, "Delhi","India","7","88880","sdsftunayaka"));



        return root;
    }
}
