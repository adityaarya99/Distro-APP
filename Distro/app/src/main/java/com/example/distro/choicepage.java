package com.example.distro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class choicepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choicepage);
        LinearLayout tech1 = findViewById(R.id.tech);
        tech1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(choicepage.this, TechData.class);
                startActivity(activity);
            }
        });
     /*   LinearLayout notech = findViewById(R.id.ntech);
        notech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity1 = new Intent(choicepage.this, secondhomepage.class);
                startActivity(activity1);
            }
        });*/
    }
}