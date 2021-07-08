package com.example.cityguide.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cityguide.R;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedView> {

    ArrayList<Featured> featuredLocations;

    public FeaturedAdapter(ArrayList<Featured> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }

    @NonNull
    @Override
    public FeaturedView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_recycler,parent,false);
        FeaturedView featuredview = new FeaturedView(view);
        return featuredview;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedView holder, int position) {

        Featured featuredHelp = featuredLocations.get(position);

        holder.image.setImageResource(featuredHelp.getImage());
        holder.title.setText(featuredHelp.getTitle());
        holder.desc.setText(featuredHelp.getDescription());
    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }

    public static class FeaturedView extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title, desc;

        public FeaturedView(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.featurd_image);
            title = itemView.findViewById(R.id.featurd_tittle);
            desc = itemView.findViewById(R.id.featurd_desc);

        }
    }

}
