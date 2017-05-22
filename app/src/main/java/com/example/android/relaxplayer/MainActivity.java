package com.example.android.relaxplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup the onclick listeners to the buttons by using findViewById method.
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
        // By clicking on a certain button an appropriate intent will start. Previously all of the activities had been created in AndroidManifest.xml
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
