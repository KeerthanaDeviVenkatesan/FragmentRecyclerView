package com.example.fragmentrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder>{

    private final List<Design2> ChatList;
    public Adapter2(List<Design2> ChatList){this.ChatList=ChatList;}

    @NonNull
    @Override
    public Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.design2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.ViewHolder holder, int position) {
        int image2=ChatList.get(position).getImageView2();
        String name2=ChatList.get(position).getTextView1();
        String time2=ChatList.get(position).getTextView2();
        String msg2=ChatList.get(position).getTextView3();

        holder.setData(image2,name2,time2,msg2);
    }

    @Override
    public int getItemCount() {
        return ChatList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imageView2;
        private final TextView textView1;
        private final TextView textView2;
        private final TextView textView3;

        public ViewHolder(View itemView){
            super(itemView);

            imageView2=itemView.findViewById(R.id.imageview2);
            textView1=itemView.findViewById(R.id.textview1);
            textView2=itemView.findViewById(R.id.textview2);
            textView3=itemView.findViewById(R.id.textview3);
        }

        public void setData(int image2, String name2, String time2, String msg2) {
            imageView2.setImageResource(image2);
            textView1.setText(name2);
            textView2.setText(time2);
            textView3.setText(msg2);
        }
    }
}
