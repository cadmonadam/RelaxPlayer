package com.example.android.relaxplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by Adam Cadmon on 2017. 05. 15..
 */

public class Mylibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylibrary);

        // Find the play button that will start the selected song on Nowplaying screen.
        ImageView play = (ImageView) findViewById(R.id.play);

        //Set a click listener on the play button.
        play.setOnClickListener(new View.OnClickListener() {
            //The code will be executed when the play button is clicked on.
            @Override
            public void onClick(View view) {
                Intent startScreen = new Intent(Mylibrary.this, Nowplaying.class);
                //Start the new activity - Nowplaying.
                startActivity(startScreen);
            }

        });
    }
}
