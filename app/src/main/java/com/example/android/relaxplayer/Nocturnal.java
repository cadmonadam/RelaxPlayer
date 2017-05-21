package com.example.android.relaxplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Adam Cadmon on 2017. 05. 15..
 */

public class Nocturnal extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nocturnal);

        // Setup the onclick listeners to the buttons by using findViewById method.
        Button download = (Button) findViewById(R.id.button_download);
        ImageView play = (ImageView) findViewById(R.id.play);


        download.setOnClickListener(this);
        play.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent startScreen;
        // By clicking on a button an appropriate intent will start.
        switch (v.getId()) {
            case R.id.button_download:
                startScreen = new Intent(this, Download.class);
                startActivity(startScreen);
                break;
            case R.id.play:
                startScreen = new Intent(this, Nowplaying.class);
                startActivity(startScreen);
                break;
            default:
                break;
        }
    }
}
