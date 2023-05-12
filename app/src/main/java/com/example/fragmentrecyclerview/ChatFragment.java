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


public class ChatFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Design2> ChatList;
    Adapter2 adapter2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        initRecyclerview();
    }

    private void initData() {

        ChatList=new ArrayList<>();
        ChatList.add(new Design2(R.drawable.image4,"Venke","10.00Am","Hai"));
        ChatList.add(new Design2(R.drawable.image5,"KK","10.10Am","How are you?"));
        ChatList.add(new Design2(R.drawable.image6,"Maha","11.00Am","Bye"));

    }
    private void initRecyclerview() {

        recyclerView= getView().findViewById(R.id.chat_recyclerview);
        layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter2=new Adapter2(ChatList);
        recyclerView.setAdapter(adapter2);

    }
}