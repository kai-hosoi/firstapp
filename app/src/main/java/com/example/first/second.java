package com.example.first;


import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        Button nextButton = findViewById(R.id.btn);
        nextButton.setOnClickListener(v -> finish());

    }
}
