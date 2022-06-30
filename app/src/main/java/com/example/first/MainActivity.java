package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;


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

        Button toastButton = findViewById(R.id.btn_toast);
        String toastMessage = "あめでとうございます！！";
        // lambda式
        toastButton.setOnClickListener( v -> {
            Toast toast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
            toast.show();
        });

        Button snackButton = findViewById(R.id.btn_snack);
        // lambda式
        snackButton.setOnClickListener( v ->
               Snackbar.make(v, "メッセージ", Snackbar.LENGTH_SHORT).show());

        Button formButton = findViewById(R.id.btn_form);
        formButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), ThirdActivity.class);
            startActivity(intent);
        });
    }
    }


