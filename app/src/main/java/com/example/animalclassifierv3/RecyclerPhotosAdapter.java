package com.example.animalclassifierv3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerPhotosAdapter extends RecyclerView.Adapter<RecyclerPhotosAdapter.ViewHolder> {

    Context context;
    ArrayList<PhotoClass> photos;
    RecyclerPhotosAdapter(Context context, ArrayList<PhotoClass> photos) {
        this.context = context;
        this.photos = photos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.photos_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.img.setImageResource(photos.get(position).img);
        Picasso.get().load(photos.get(position).url).into(holder.img);
        holder.caption.setText(photos.get(position).caption);
    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView caption;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.photo);
            caption = itemView.findViewById(R.id.caption);

        }
    }
}
