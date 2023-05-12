package com.example.fragmentrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.ViewHolder> {

    private final List<Design1> HomeList;

    public Adapter1(List<Design1> HomeList){this.HomeList=HomeList;}


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.design1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter1.ViewHolder holder, int position) {

        int image1=HomeList.get(position).getImageview1();
        String name=HomeList.get(position).getTextview1();

        holder.setData(image1,name);

    }

    @Override
    public int getItemCount() {
        return HomeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imageView1;
        private final TextView textView1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView1=itemView.findViewById(R.id.imageView1);
            textView1=itemView.findViewById(R.id.textview1);
        }

        public void setData(int image1, String name) {

            imageView1.setImageResource(image1);
            textView1.setText(name);

        }
    }
}
