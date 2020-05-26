package com.foods.retrofitdemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.foods.retrofitdemo.Model.Model;
import com.foods.retrofitdemo.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
    Context context;
    ArrayList<Model>arrayList;


    public DataAdapter(Context context, ArrayList<Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.layout_file,parent,false);
        return new DataViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        Model model=arrayList.get(position);

        holder.tvId.setText(model.getId());
        Picasso.get().load(model.getImg()).into(holder.imageView);
        holder.tvName.setText(model.getName());



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class DataViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvId;
        ImageView imageView;
        TextView tvName;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId=itemView.findViewById(R.id.tvID);
            imageView=itemView.findViewById(R.id.imageView);
            tvName=itemView.findViewById(R.id.tvName);
        }
    }
}
