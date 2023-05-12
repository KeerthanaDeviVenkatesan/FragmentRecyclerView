package com.example.fragmentrecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Design1> HomeList;
    Adapter1 adapter1;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniData();
       initRecyclerview();

    }



   public void iniData() {

        HomeList=new ArrayList<>();
        HomeList=new ArrayList<>();
        HomeList.add(new Design1(R.drawable.image2,"Venke"));
        HomeList.add(new Design1(R.drawable.image1,"KK"));
        HomeList.add(new Design1(R.drawable.image3,"Maha"));
        initRecyclerview();

    }
   public void initRecyclerview() {
        recyclerView=getView().findViewById(R.id.home_recyclerview);
        layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter1=new Adapter1(HomeList);
        recyclerView.setAdapter(adapter1);




    }
}