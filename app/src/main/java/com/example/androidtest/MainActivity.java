package com.example.androidtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    String durum;

    final DatabaseReference ledstatus1 = myRef.child("kirmizi").child("status");

    final DatabaseReference ledstatus2 = myRef.child("sari").child("status");

    final DatabaseReference ledstatus3 = myRef.child("yesil").child("status");


    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.text);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                        String durum = (String) snapshot.child(String.valueOf(ledstatus1)).getValue(); //Gelen Veriyi okuma
                }
                if ("on" == durum) {

                }


            }

            @Override
            public void onCancelled(@NonNull  DatabaseError error) {

            }
        });

    }
}