 package com.example.distro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TechData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_data);
        RecyclerView oslist = (RecyclerView) findViewById(R.id.oslist);
        oslist.setLayoutManager(new LinearLayoutManager(this));
        String[] operatingsystem = { "Windows","MacOS","Linux","Ubuntu" };
        oslist.setAdapter(new ProgrammingAdapter(operatingsystem));
    }
}