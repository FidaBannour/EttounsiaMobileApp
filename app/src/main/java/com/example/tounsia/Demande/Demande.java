package com.example.tounsia.Demande;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.tounsia.Home.MainActivity;
import com.example.tounsia.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Demande extends AppCompatActivity {

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    RadioGroup Perso ,Perso1;
    CheckBox viol1 , viol2 ,viol3 ,viol4 ;
    EditText PersoEdit , ViolEdit , histo;
    ImageButton nexty;
    String Violence , name="", tel;
    String Personne="" ,p2="";
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demande);

        back =findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Demande.this, MainActivity.class);
                startActivity(a);
            }
        });
        Perso = (RadioGroup) findViewById(R.id.PersoGp);
        Perso1 = (RadioGroup) findViewById(R.id.PersoGp1);
        viol1 = (CheckBox) findViewById(R.id.viol1);
        viol2 = (CheckBox) findViewById(R.id.viol2);
        viol3 = (CheckBox) findViewById(R.id.viol3);
        viol4 = (CheckBox) findViewById(R.id.viol4);
        ViolEdit = (EditText) findViewById(R.id.viol5);
        PersoEdit = (EditText) findViewById(R.id.perso6);
        nexty = (ImageButton) findViewById(R.id.next);


        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists())
                {
                    name = dataSnapshot.child("username").getValue().toString();
                    tel = dataSnapshot.child("numero").getValue().toString();
                    // Log.d("valueEmail:", userDetails.child("Email").getValue());
                    // Log.d("valueuserid:", userDetails.child("userid").getValue());

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });








        nexty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInformation();
                Intent d = new Intent(Demande.this, DemandeP2.class);
                d.putExtra("VIOL",Violence);
                d.putExtra("PERSO",Personne);
                d.putExtra("NAME",name);
                d.putExtra("phoneNo",tel);

                startActivity(d);

            }
        });


    }


    void getInformation (){

        Violence = " ";
        if (viol1.isChecked()) {
            Violence = Violence + viol1.getText() + " , ";
        }
        if (viol2.isChecked()) {
            Violence = Violence + viol2.getText() + " , ";
        }
        if (viol3.isChecked()) {
            Violence = Violence + viol3.getText() + " , ";
        }
        if (viol4.isChecked()) {
            Violence = Violence + viol4.getText() + " , ";
        }

        String EditViolence =ViolEdit.getText().toString();
        Violence = Violence + EditViolence ;

        Personne =  ((RadioButton)findViewById(Perso.getCheckedRadioButtonId()))
                .getText().toString();
        //p2 =  ((RadioButton)findViewById(Perso1.getCheckedRadioButtonId()))
              //  .getText().toString();
        Personne = Personne + " "+ p2 + PersoEdit.getText().toString();


    }
}
