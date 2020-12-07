package com.example.tounsia.Information;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tounsia.Home.MainActivity;
import com.example.tounsia.R;

public class Details extends AppCompatActivity {
    TextView storyContent;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        storyContent = findViewById(R.id.contentOfViolence);
        Intent i = getIntent();
        String title = i.getStringExtra("titleOfViolence");
        String content = i.getStringExtra("contentOfViolence");
       // getSupportActionBar().setTitle(title);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // set the appbar title as Story title

        // set content of the story to textview
        storyContent.setText(content);
        storyContent.setMovementMethod(new ScrollingMovementMethod());

        // enable back button to main activity or recyclerview
      // getSupportActionBar().setDisplayShowHomeEnabled(true);
       //




        back =findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Details.this, MainActivity.class);
                startActivity(a);
            }
        });

    }


}

