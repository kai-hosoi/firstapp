package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button formButton = findViewById(R.id.btn_form);
        formButton.setOnClickListener(v -> finish());
    }
    public void displayToast(View view) {
        Toast.makeText(getApplicationContext(), "aaaaaa",
                Toast.LENGTH_SHORT).show();
    }

}