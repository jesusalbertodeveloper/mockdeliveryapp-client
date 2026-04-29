package com.jarm.mockdeliveryapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.jarm.mockdeliveryapp.databinding.LoginScreendBinding;

public class LoginActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private LoginScreendBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.login_screen);
        Button loginbutton = findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainScreen.class));
            }
        });
Button forgotpasswordbutton = findViewById(R.id.button9);
forgotpasswordbutton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
setContentView(R.layout.password_reset_first_screen);
    }
});
    }
}