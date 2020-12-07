package com.example.tounsia.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.tounsia.Call.Call;
import com.example.tounsia.Demande.Demande;
import com.example.tounsia.Forum.View_Controller.ForumActivity;
import com.example.tounsia.Information.AboutRightActivity;
import com.example.tounsia.Information.AboutVilolenceActivity;
import com.example.tounsia.R;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        CardView cardView = (CardView) findViewById(R.id.call);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Call.class);
                startActivity(intent);            }
        });

        CardView cardView1 = (CardView) findViewById(R.id.chat);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForumActivity.class);
                startActivity(intent);            }
        });

        CardView cardView2 = (CardView) findViewById(R.id.about);

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutRightActivity.class);
                startActivity(intent);            }
        });
        CardView cardView3 = (CardView) findViewById(R.id.plainte);

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Demande.class);
                startActivity(intent);            }
        });

        CardView cardView4 = (CardView) findViewById(R.id.aboutv);

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutVilolenceActivity.class);
                startActivity(intent);            }
        });
    }



    public void Call() {
            Intent intent = new Intent(MainActivity.this, Call.class);
            startActivity(intent);
        }

        public void Plainte() {
            Intent intent = new Intent(MainActivity.this, Demande.class);
            startActivity(intent);
        }
        public void Chat() {
            Intent intent = new Intent(MainActivity.this, ForumActivity.class);
            startActivity(intent);
        }



    }



