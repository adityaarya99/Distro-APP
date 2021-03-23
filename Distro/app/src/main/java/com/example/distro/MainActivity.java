package com.example.distro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bProceed;
    EditText etFirstName, etLastName, etEmail, etPassword ,etConfirmPassword;
    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bProceed = findViewById(R.id.proceedButton);
        etFirstName = findViewById(R.id.firstName);
        etLastName = findViewById(R.id.lastName);
        etEmail = findViewById(R.id.email);
        etPassword = findViewById(R.id.password);
        etConfirmPassword = findViewById(R.id.confirmpassword);


        LinearLayout activitytwo = findViewById(R.id.haveanaccount);
        activitytwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(activity);
            }
        });

        // handle the PROCEED button
        bProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // store the returned value of the dedicated function which checks
                // whether the entered data is valid or if any fields are left blank.
                isAllFieldsChecked = CheckAllFields();

                // the boolean variable turns to be true then
                // only the user must be proceed to the activity2
                if (isAllFieldsChecked) {
                    Intent i = new Intent(MainActivity.this, choicepage.class);
                    startActivity(i);
                }
            }
        });
    }

    private boolean CheckAllFields()
        {
            if (etFirstName.length() == 0) {
                etFirstName.setError("This field is required");
                return false;
            }

            if (etLastName.length() == 0) {
                etLastName.setError("This field is required");
                return false;
            }

            if (etEmail.length() == 0) {
                etEmail.setError("Email is required");
                return false;
            }

            if (etPassword.length() == 0) {
            etPassword.setError("Password is required");
            return false;
        } else if (etPassword.length() < 8) {
            etPassword.setError("Password must be minimum 8 characters");
            return false;
        }
            if (etConfirmPassword.length() == 0) {
                etConfirmPassword.setError("Password is required");
                return false;
            } else if (etConfirmPassword.length() < 8) {
                etConfirmPassword.setError("Password must be minimum 8 characters");
                return false;
            }
            // after all validation return true.
            return true;

    }
}
