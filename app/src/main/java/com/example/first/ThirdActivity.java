package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    public static final String EXTRA_DATA
            = "com.example.testactivitytrasdata.DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button formButton = findViewById(R.id.btn_form);
        formButton.setOnClickListener(v -> finish());
    }
    public void sendClick(View view){
        Intent intent = new Intent(getApplication(), GetActivity.class);

        EditText editText = findViewById(R.id.edit_text);
        intent.putExtra("SEND_DATA",editText.getText().toString());

        startActivity(intent);
    }
    public void webClick(View view){
        Button webBtn = findViewById(R.id.btn_web);
        webBtn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), JumpActivity.class);
            startActivity(intent);
        });
    }
    public void displayToast(View view) {
        Toast.makeText(getApplicationContext(), "aaaaaa",
                Toast.LENGTH_SHORT).show();
    }


}