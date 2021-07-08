package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.cityguide.Adapter.Category;
import com.example.cityguide.Adapter.CategoryAdapter;
import com.example.cityguide.Adapter.Featured;
import com.example.cityguide.Adapter.FeaturedAdapter;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView featuredRecycler, categoryRecycler;
    RecyclerView.Adapter adapter;

    Button View_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        featuredRecycler = findViewById(R.id.featured_recycler);
        categoryRecycler = findViewById(R.id.category_recycler);

        View_all = findViewById(R.id.view_all);

        View_all.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), AllCategories.class));
            }
        });

        featuredRecycler();
        categoryRecycler();

    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Featured> featuredLocation = new ArrayList<>();

        featuredLocation.add(new Featured(R.drawable.pharmacy_background,"McDonald's","bjnkntg jijijoyyy gygyhbjfn uubugg jnjntjntgjntgtnkmy"));
        featuredLocation.add(new Featured(R.drawable.pharmacy_background,"McDonald's","bjnkntg jijijoyyy gygyhbjfn uubugg jnjntjntgjntgtnkmy"));
        featuredLocation.add(new Featured(R.drawable.pharmacy_background,"McDonald's","bjnkntg jijijoyyy gygyhbjfn uubugg jnjntjntgjntgtnkmy"));

        adapter = new FeaturedAdapter(featuredLocation);
        featuredRecycler.setAdapter(adapter);

    }

    private void categoryRecycler() {

        categoryRecycler.setHasFixedSize(true);
        categoryRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Category> categories = new ArrayList<>();

        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff370785,0xffBA8FFF});

        categories.add(new Category(R.drawable.hospital3, gradient1,"Hospital"));
        categories.add(new Category(R.drawable.book, gradient1,"Education"));
        categories.add(new Category(R.drawable.hospital3, gradient1,"Hospital"));
        categories.add(new Category(R.drawable.hospital3, gradient1,"Hospital"));

        adapter = new CategoryAdapter(categories);
        categoryRecycler.setAdapter(adapter);

    }

}