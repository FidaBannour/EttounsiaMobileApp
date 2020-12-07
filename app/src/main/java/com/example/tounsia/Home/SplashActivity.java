package com.example.tounsia.Home;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.tounsia.R;

import static android.content.ContentValues.TAG;

//import com.beingdev.magicprint.usersession.UserSession;

public class SplashActivity extends Activity {

    //to get user session data
   // private UserSession session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       // session =new UserSession(SplashActivity.this);

     // Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);


      //  appname.setTypeface(typeface);

        YoYo.with(Techniques.FadeIn)
                .duration(3000)
                .playOn(findViewById(R.id.logo));


     //   desc.setTypeface(typeface);


        int SPLASH_TIME_OUT = 6000;
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                @Override
                public void run() {
                    // This method will be executed once the timer is over
                    // Start your app main activity


                    Log.i(TAG, "I am here");

                    startActivity(new Intent(SplashActivity.this,WelcomeActivity.class));

                }
            }, SPLASH_TIME_OUT);
        }
    }
