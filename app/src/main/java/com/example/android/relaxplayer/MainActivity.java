package com.example.android.relaxplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setup the onclick listeners to the buttons by using findViewById method.
        Button birds = (Button) findViewById(R.id.buttonSunnyBirds);
        Button storm = (Button) findViewById(R.id.buttonAfterTheStorm);
        Button nocturnal = (Button) findViewById(R.id.buttonNocturnal);
        Button myLibrary = (Button) findViewById(R.id.buttonMyLibrary);

        birds.setOnClickListener(this);
        storm.setOnClickListener(this);
        nocturnal.setOnClickListener(this);
        myLibrary.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent startScreen;
        // By clicking on a button an appropriate intent will start.
        switch (v.getId()) {
            case R.id.buttonSunnyBirds:
                startScreen = new Intent(this, Birds.class);
                startActivity(startScreen);
                break;
            case R.id.buttonAfterTheStorm:
                startScreen = new Intent(this, Storm.class);
                startActivity(startScreen);
                break;
            case R.id.buttonNocturnal:
                startScreen = new Intent(this, Nocturnal.class);
                startActivity(startScreen);
                break;
            case R.id.buttonMyLibrary:
                startScreen = new Intent(this, Mylibrary.class);
                startActivity(startScreen);
                break;
            default:
                break;
        }
    }
}
