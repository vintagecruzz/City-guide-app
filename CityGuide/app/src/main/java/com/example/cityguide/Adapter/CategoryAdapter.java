package com.example.cityguide.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cityguide.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryView> {

    ArrayList<Category> categories;

    public CategoryAdapter(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.catergories_card, parent, false);
        CategoryView categoryview = new CategoryView(view);
        return categoryview;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryView holder, int position) {

        Category categoryHelp = categories.get(position);

        holder.background.setBackground(categoryHelp.getBackground());
        holder.image.setImageResource(categoryHelp.getImage());
        holder.title.setText(categoryHelp.getTitle());
    }

    public int getItemCount() {
        return categories.size();
    }

    public static class CategoryView extends RecyclerView.ViewHolder {

        LinearLayout background;
        TextView title;
        ImageView image;

        public CategoryView(@NonNull View itemView) {
            super(itemView);

            background = itemView.findViewById(R.id.category_background);
            title = itemView.findViewById(R.id.category_title);
            image = itemView.findViewById(R.id.category_image);

        }

    }

}