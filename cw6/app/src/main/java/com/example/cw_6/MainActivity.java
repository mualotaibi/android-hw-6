package com.example.cw_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie m = new movie("Laion","Dev Patel","lok dafes","118 min","Drama");
        movie m2 = new movie("You","ben","Jerj","2 seasons","excitement");


}