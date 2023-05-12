package com.example.fragmentrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter3 extends RecyclerView.Adapter<Adapter3.ViewHolder> {

    public final List<Design3> CallList;
    public Adapter3(List<Design3> CallList){this.CallList=CallList;}


    @NonNull
    @Override
    public Adapter3.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.design3,parent,false);
        return new Adapter3.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter3.ViewHolder holder, int position) {

        int image3=CallList.get(position).getImageView3();
        String name3=CallList.get(position).getTextView1();
        String time3=CallList.get(position).getTextView2();

        holder.setData(image3,name3,time3);


    }

    @Override
    public int getItemCount() {
        return CallList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imageView3;
        private final TextView textView1;
        private final TextView textView2;

        public ViewHolder(View itemView){
            super(itemView);

            imageView3=itemView.findViewById(R.id.imageView3);
            textView1=itemView.findViewById(R.id.textview1);
            textView2=itemView.findViewById(R.id.textview2);
        }

        public void setData(int image3, String name3, String time3) {
            imageView3.setImageResource(image3);
            textView1.setText(name3);
            textView2.setText(time3);
        }
    }
}
