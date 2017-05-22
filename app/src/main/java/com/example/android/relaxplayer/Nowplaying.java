package com.example.android.relaxplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by Adam Cadmon on 2017. 05. 15..
 */
// Because this screen is just a demonstration no additional changes was necessary.
public class Nowplaying extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);
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
