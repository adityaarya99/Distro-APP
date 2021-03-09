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
        ImageList.add(R.drawable.macos);
        ImageList.add(R.drawable.linux);
        ImageList.add(R.drawable.android);
        ImageList.add(R.drawable.msdos);
        ImageList.add(R.drawable.solaris);
        ImageList.add(R.drawable.symbian);
        ImageList.add(R.drawable.ios);
        String[] operatingsystem = { "Microsoft Windows","Apple macOS","Linux OS","Google's Android OS","MS-DOS"
                ,"Solaris OS","Symbian OS"," iOS Mobile OS" };
        oslist.setAdapter(new ProgrammingAdapter(this,operatingsystem,ImageList));
    }
}