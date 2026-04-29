package com.jarm.mockdeliveryapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 setContentView(R.layout.create_or_edit_review);
        /*RecyclerView recyclerView3 = findViewById(R.id.searchresults);

        // Sample data
        List<offeringitem> offeringitemList = new ArrayList<>();

        offeringitemList.add(new offeringitem("dd","3","3","4","Fecha de publicacion\nj","Fecha de publicacion\nj","d",34.5));
        offeringitemList.add(new offeringitem("dd","3","3","3","r","r","d",34.5));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // Set LayoutManager
        recyclerView3.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        VerticalSpaceItemDecoration dividerItemDecoration = new VerticalSpaceItemDecoration(0);
        recyclerView3.addItemDecoration(dividerItemDecoration);
        // Set Adapter
        offeringitemadapter adapter = new offeringitemadapter(offeringitemList);
        recyclerView3.setAdapter(adapter);*/
    }
}