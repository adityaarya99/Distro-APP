 package com.example.distro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

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











            /*ALert Dialog    */

        /*  AlertDialog alertDialog = new AlertDialog.Builder(this)

                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Are you sure to Exit")
                .setMessage("Exiting will call finish() method")
                //set positive button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                //set negative button
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                    }
                })
                .show();*/

    }
}