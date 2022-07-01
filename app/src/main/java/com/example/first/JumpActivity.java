package com.example.first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;


public class JumpActivity extends AppCompatActivity {
    private EditText edit_text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);

    }
    public void openWebsite(View view){
        edit_text = findViewById(R.id.edit_text1);
        String url = edit_text.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);


    }
    public void openLocation(View view) {
        edit_text = findViewById(R.id.edit_text2);
        String loc = edit_text.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
    }

    public void shareText(View view) {
        edit_text = findViewById(R.id.edit_text3);
        String txt = edit_text.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(txt)
                .startChooser();
    }

}
