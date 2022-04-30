package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Details extends AppCompatActivity {

    private Button fundingButton, trackStudyButton, counsellingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        fundingButton = findViewById(R.id.accessFund);
        trackStudyButton = findViewById(R.id.trackStudy);
        counsellingButton = findViewById(R.id.counselling);

        fundingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details.this, SignUp.class);
                startActivity(intent);
            }
        });
        trackStudyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details.this, SignUp.class);
                startActivity(intent);
            }
        });
        counsellingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}