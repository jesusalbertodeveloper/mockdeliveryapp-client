package com.jarm.mockdeliveryapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // In onCreate or button click
        CommentService service = apiservicee.getClient("http://localhost:8080/")
                .create(CommentService.class);

        Comment comment = new Comment("My Title", "Comment body", "John Doe");
        Call<Comment> call = service.createComment(comment);

        call.enqueue(new Callback<Comment>() {
            @Override
            public void onResponse(Call<Comment> call, Response<Comment> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Success: " + response.body().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Comment> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

//startofrequest
        //private APIService apiService;

        //@Override
        //protected void onCreate(Bundle savedInstanceState) {
           // super.onCreate(savedInstanceState);
           // setContentView(R.layout.activity_main);

            /*// Create API service
            Retrofit retrofit = APIClient.getClient();
            apiService = retrofit.create(APIService.class);

            // Execute request (GET example)
            Call<String> call = apiService.getPosts();
            call.enqueue(new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        String jsonResponse = response.body();
                        Log.d("Retrofit", jsonResponse);
                    }
                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {
                    Log.e("Retrofit", "Error: " + t.getMessage());
                }
            });*/
       // }
   // }
        //endofrequest
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //Configuration.
        setContentView(R.layout.main_screen);
        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentt = new Intent(view.getContext(),ProfileActivity.class);
                startActivity(intentt);
            }
        };
        LinearLayout ll = findViewById(R.id.bottom_tabs1);
        TextView tt = ll.findViewById(R.id.tab_profile1);
        //TextView tt1 = ll.fi1);
        tt.setOnClickListener(l);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        Configuration conf = getResources().getConfiguration();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Toast.makeText(this, Integer.toString(width) + Integer.toString(height), Toast.LENGTH_SHORT).show();
       // layoutParams.height = 00;
        Toolbar t3 = findViewById(R.id.toolbar3);
       // t3.setLayoutParams(layoutParams);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerView2);

        // Sample data
        List<recommendedoffer> recommendedofferListt = new ArrayList<>();

        recommendedofferListt.add(new recommendedoffer("B1","B1","B1","B1","B1",90.7));
        recommendedofferListt.add(new recommendedoffer("B2","B2","B2","B2","B2",200));
        recommendedofferListt.add(new recommendedoffer("B1","B1","B1","B1","B1",90.5));
        recommendedofferListt.add(new recommendedoffer("B1","B1","B1","B1","B1",200));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        // Set LayoutManager
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        VerticalSpaceItemDecoration dividerItemDecoration = new VerticalSpaceItemDecoration(5);
        recyclerView.addItemDecoration(dividerItemDecoration);
        // Set Adapter
        recommendedofferadapter adapter = new recommendedofferadapter(recommendedofferListt);
        recyclerView.setAdapter(adapter);

       //2nd RecyclerView
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this);
        layoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        // Set LayoutManager
        recyclerView2.setLayoutManager(layoutManager2);
        layoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        VerticalSpaceItemDecoration dividerItemDecoration2 = new VerticalSpaceItemDecoration(5);
        recyclerView2.addItemDecoration(dividerItemDecoration2);

        // Set Adapter
        recommendedofferadapter adapter1 = new recommendedofferadapter(recommendedofferListt);
        recyclerView2.setAdapter(adapter1);

    }
}