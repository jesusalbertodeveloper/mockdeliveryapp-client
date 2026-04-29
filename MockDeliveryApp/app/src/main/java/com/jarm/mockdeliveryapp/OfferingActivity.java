package com.jarm.mockdeliveryapp;

import static android.view.View.VISIBLE;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jarm.mockdeliveryapp.databinding.ActivityOfferingBinding;

import java.util.ArrayList;
import java.util.List;

public class OfferingActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityOfferingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String offeringname = extras.getString("offeringname");
            double offeringprice = extras.getDouble("offeringprice");
        }
        setContentView(R.layout.offering_activity);
        RecyclerView recyclerView3 = findViewById(R.id.toppingitemrecyclerview);


        // Sample data
        List<toppingitem> toppingitemList = new ArrayList<>();

        //toppingitemList.add(new toppingitem("dd","3","3",90.4));
        //toppingitemList.add(new toppingitem("ddo","3","4",98.5));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // Set LayoutManager
        recyclerView3.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        VerticalSpaceItemDecoration dividerItemDecoration = new VerticalSpaceItemDecoration(0);
        recyclerView3.addItemDecoration(dividerItemDecoration);
        // Set Adapter
        toppingitemadapter adapter = new toppingitemadapter(toppingitemList);
        recyclerView3.setAdapter(adapter);
        ViewGroup.LayoutParams layoutt = recyclerView3.getLayoutParams();
        if (!toppingitemList.isEmpty()) {
            recyclerView3.setVisibility(VISIBLE);
            Toolbar toolbarr = findViewById(R.id.toppinglisttitlebar);
            toolbarr.setVisibility(VISIBLE);
        }
        for (toppingitem itemm : toppingitemList) {
            layoutt.height = layoutt.height + 69;
        }
        recyclerView3.setLayoutParams(layoutt);
        RecyclerView recyclerView33 = findViewById(R.id.recyclerview33);
        List<reviewitem> reviewitemList = new ArrayList<>();
        reviewitemList.add(new reviewitem("3","f",2,"01/01/2001","Test"));
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        layoutManager1.setOrientation(LinearLayoutManager.VERTICAL);
        // Set LayoutManager
        recyclerView33.setLayoutManager(layoutManager1);
        layoutManager1.setOrientation(LinearLayoutManager.VERTICAL);
        VerticalSpaceItemDecoration dividerItemDecoration1 = new VerticalSpaceItemDecoration(0);
        recyclerView33.addItemDecoration(dividerItemDecoration1);
        // Set Adapter
        reviewitemadapter adapter1 = new reviewitemadapter(reviewitemList);
        recyclerView33.setAdapter(adapter1);
        //ViewGroup.LayoutParams layoutt = recyclerView33.getLayoutParams();
        //if (!toppingitemList.isEmpty()) {
          //  recyclerView3.setVisibility(VISIBLE);
           // Toolbar toolbarr = findViewById(R.id.toppinglisttitlebar);
           // toolbarr.setVisibility(VISIBLE);
        //}
        //for (toppingitem itemm : toppingitemList) {
          //  layoutt.height = layoutt.height + 69;
        //}
    }
}