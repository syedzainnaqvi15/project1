package com.syedzain.myburger2.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.syedzain.myburger2.Models.RecipeModel;
import com.syedzain.myburger2.R;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder> {
    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    ArrayList<RecipeModel>list;
    Context context;

    public ArrayList<RecipeModel> getList() {
        return list;
    }

    public void setList(ArrayList<RecipeModel> list) {
        this.list = list;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyleview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        RecipeModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());
        switch (position){
            case 0:

holder.imageView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(context, "image one is clicked", Toast.LENGTH_SHORT).show();
    }
});
holder.textView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(context, "add your feature", Toast.LENGTH_SHORT).show();
    }
});
break;
            case 1:

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "image two", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "add your desire feature", Toast.LENGTH_SHORT).show();
                    }
                });

                break;



            default:
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public viewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);


        }
    }
}
