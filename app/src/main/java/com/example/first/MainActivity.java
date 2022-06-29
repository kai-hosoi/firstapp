package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextButton = findViewById(R.id.btn);
        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), SubActivity.class);
            startActivity(intent);
        });
    }
}

