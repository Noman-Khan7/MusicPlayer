package com.example.noman.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play_b = (Button) findViewById(R.id.play_button);
        Button reset_b = (Button) findViewById(R.id.reset_button);
        Button pause_b = (Button) findViewById(R.id.pause_button);
     mediaPlayer=MediaPlayer.create(this,R.raw.s);

        // Set a click listener on that View
        play_b.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on.
            @Override
            public void onClick(View view) {
mediaPlayer.start();
                //
            }
        }); reset_b.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.reset();
                //
            }
        });
        pause_b.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pause button is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                //
            }
        });
    }
}
