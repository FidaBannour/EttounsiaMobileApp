package com.example.tounsia.Information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.tounsia.Home.MainActivity;
import com.example.tounsia.R;

public class Details2 extends AppCompatActivity {

    TextView storyContent;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        storyContent = findViewById(R.id.contentOfRights);
        Intent i = getIntent();
        String title = i.getStringExtra("titleOfRights");
        String content = i.getStringExtra("contentOfRights");
        // getSupportActionBar().setTitle(title);
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // set the appbar title as Story title

        // set content of the story to textview
        storyContent.setText(content);
        storyContent.setMovementMethod(new ScrollingMovementMethod());

        // enable back button to main activity or recyclerview
        // getSupportActionBar().setDisplayShowHomeEnabled(true);
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        back =findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Details2.this, MainActivity.class);
                startActivity(a);
            }
        });

    }


}
