package com.example.myapplication.tute_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText pass, user;
    Button select, update, delete, singin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user= findViewById(R.id.user);
        pass= findViewById(R.id.pass);
        select= findViewById(R.id.select);
        singin= findViewById(R.id.singin);
    }
}
