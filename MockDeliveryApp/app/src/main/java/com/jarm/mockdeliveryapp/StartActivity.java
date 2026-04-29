package com.jarm.mockdeliveryapp;

import static android.app.PendingIntent.getActivity;

//import static java.security.AccessController.getContext;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;

import com.jarm.mockdeliveryapp.databinding.ActivityMainBinding;

public class StartActivity extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private static StartActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Context context = ;
        SharedPreferences sharedPref = StartActivity.this.getSharedPreferences(
                "accountdata", Context.MODE_PRIVATE);
        sharedPref.edit().putString("j","j").apply();
        boolean isloggedin = sharedPref.getBoolean("isloggedin",false);
        if (isloggedin == false) {
            Toast.makeText(StartActivity.this, "Login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(StartActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(StartActivity.this, "Main screen", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(StartActivity.this, MainScreen.class);
            startActivity(intent);
        }
        //sharedPref.edit().
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        //Intent intent = new Intent(StartActivity.this, NewActivity.class);
        //startActivity(intent);
        //Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
        //Toast.makeText(StartActivity.this, "TEST", Toast.LENGTH_SHORT).show();
    }
    //public static Context getAppContext() {
      //  return StartActivity.context;
    //}
}