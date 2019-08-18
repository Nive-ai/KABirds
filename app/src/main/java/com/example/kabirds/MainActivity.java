package com.example.kabirds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button peacockBtn;
    private Button parrotBtn;
    private Button junglefowlBtn;
    private Button eagleBtn;
    private Button owlBtn;
    private Button ostritchBtn;
    private Button cuckooBtn;
    private Button penguinBtn;
    private Button lovebirdBtn;
    private Button crowBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peacockBtn = (Button) findViewById(R.id.bird1);
        peacockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPeacock();
            }
        });

        parrotBtn = (Button) findViewById(R.id.bird2);
        parrotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openParrot();
            }
        });

        junglefowlBtn = (Button) findViewById(R.id.bird3);
        junglefowlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJunglefowl();
            }
        });

        eagleBtn = (Button) findViewById(R.id.bird4);
        eagleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEagle();
            }
        });

        owlBtn = (Button) findViewById(R.id.bird5);
        owlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOwl();
            }
        });

        ostritchBtn = (Button) findViewById(R.id.bird6);
        ostritchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOstrich();
            }
        });

        cuckooBtn = (Button) findViewById(R.id.bird7);
        cuckooBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCuckoo();
            }
        });

        penguinBtn = (Button) findViewById(R.id.bird8);
        penguinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPenguin();
            }
        });

        lovebirdBtn = (Button) findViewById(R.id.bird9);
        lovebirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLovebird();
            }
        });

        crowBtn = (Button) findViewById(R.id.bird10);
        crowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCrow();
            }
        });


    }
    public void openPeacock(){
        Intent intent = new Intent(this, activityOne.class);
        startActivity(intent);
    }
    public void openParrot(){
        Intent intent = new Intent(this, activityTwo.class);
        startActivity(intent);
    }
    public void openJunglefowl(){
        Intent intent = new Intent(this, activityThree.class);
        startActivity(intent);
    }
    public void openEagle(){
        Intent intent = new Intent(this, activityFour.class);
        startActivity(intent);
    }
    public void openOwl(){
        Intent intent = new Intent(this, activityFive.class);
        startActivity(intent);
    }
    public void openOstrich(){
        Intent intent = new Intent(this, activitySix.class);
        startActivity(intent);
    }
    public void openCuckoo(){
        Intent intent = new Intent(this, activitySeven.class);
        startActivity(intent);
    }
    public void openPenguin(){
        Intent intent = new Intent(this, activityEight.class);
        startActivity(intent);
    }
    public void openLovebird(){
        Intent intent = new Intent(this, activityNine.class);
        startActivity(intent);
    }
    public void openCrow(){
        Intent intent = new Intent(this, activityTen.class);
        startActivity(intent);
    }

}
