package com.example.tounsia.Call;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tounsia.Home.MainActivity;
import com.example.tounsia.R;

public class Call extends AppCompatActivity {


    Button call1 , call2,  call3 , call4,call5,call6,call7;
    Intent intent;
ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call);

        call1 =  findViewById(R.id.call1);
        call2 =  findViewById(R.id.call2);
        call3 =  findViewById(R.id.call3);
        call4 =  findViewById(R.id.call4);
        call5 =  findViewById(R.id.call5);
        call6 =  findViewById(R.id.call6);
        call7 =  findViewById(R.id.call7);



        back =findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Call.this, MainActivity.class);
                startActivity(a);
            }
        });

        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 71 885 299"));
                startActivity(intent);

            }

    });
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 71 870 580"));
                startActivity(intent);

            }

        });

        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:71 892 458"));
                startActivity(intent);

            }

        });
        call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1899"));
                startActivity(intent);

            }

        });
        call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:81100300"));
                startActivity(intent);

            }

        });
        call6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:198"));
                startActivity(intent);

            }

        });
        call7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:197"));
                startActivity(intent);

            }

        });


}
    }
