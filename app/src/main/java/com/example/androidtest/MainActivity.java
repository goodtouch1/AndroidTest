package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();


    final DatabaseReference ledstatus1 = myRef.child("kirmizi").child("status");

    final DatabaseReference ledstatus2 = myRef.child("sari").child("status");

    final DatabaseReference ledstatus3 = myRef.child("yesil").child("status");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}