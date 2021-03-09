 package com.example.distro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

 public class TechData extends AppCompatActivity {
    List<Integer> ImageList = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_data);
        RecyclerView oslist = (RecyclerView) findViewById(R.id.osystemlist);
        oslist.setLayoutManager(new LinearLayoutManager(this));
        ImageList.add(R.drawable.windows);
        ImageList.add(R.drawable.nontech);
        ImageList.add(R.drawable.logo);
        ImageList.add(R.drawable.nontech);
        ImageList.add(R.drawable.windows);
        String[] operatingsystem = { "Windows","MacOS","Linux","Ubuntu" };
        oslist.setAdapter(new ProgrammingAdapter(this,operatingsystem,ImageList));
    }
}