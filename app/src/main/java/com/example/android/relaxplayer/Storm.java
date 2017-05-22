package com.example.android.relaxplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Adam Cadmon on 2017. 05. 15..
 */

public class Storm extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storm);
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

    //Inflating the menu bar on the current screen.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    //Creating appropriate intents for the menu items.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handling item selection
        switch (item.getItemId()) {
            case R.id.action_home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_birds:
                intent = new Intent(this, Birds.class);
                startActivity(intent);
                return true;
            case R.id.action_storm:
                intent = new Intent(this, Storm.class);
                startActivity(intent);
                return true;
            case R.id.action_nocturnal:
                intent = new Intent(this, Nocturnal.class);
                startActivity(intent);
                return true;
            case R.id.action_library:
                intent = new Intent(this, Mylibrary.class);
                startActivity(intent);
                return true;
            case R.id.action_now_playing:
                intent = new Intent(this, Nowplaying.class);
                startActivity(intent);
                return true;
            case R.id.action_download:
                intent = new Intent(this, Download.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
