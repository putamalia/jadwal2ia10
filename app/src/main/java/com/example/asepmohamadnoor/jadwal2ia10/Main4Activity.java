package com.example.asepmohamadnoor.jadwal2ia10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button mSenin, mSelasa, mRabu, mKamis, mJumat, mSabtu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mSenin = (Button) findViewById(R.id.senin);
        mSenin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, SeninActivity.class);
                startActivity(i);

            }
        });

        mSelasa = (Button) findViewById(R.id.selasa);
        mSelasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, SelasaActivity.class);
                startActivity(i);

            }
        });

        mRabu = (Button) findViewById(R.id.rabu);
        mRabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, RabuActivity.class);
                startActivity(i);

            }
        });

        mKamis = (Button) findViewById(R.id.kamis);
        mKamis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, KamisActivity.class);
                startActivity(i);

            }
        });

        mJumat = (Button) findViewById(R.id.jumat);
        mJumat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, JumatActivity.class);
                startActivity(i);

            }
        });

        mSabtu = (Button) findViewById(R.id.sabtu);
        mSabtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, SabtuActivity.class);
                startActivity(i);
            }
        });
    }
}
