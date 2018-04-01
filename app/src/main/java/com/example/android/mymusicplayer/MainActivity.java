package com.example.android.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the variables that will find the views
        LinearLayout layoutMusic = (LinearLayout) findViewById(R.id.layout_music);
        LinearLayout layoutPodcasts = (LinearLayout) findViewById(R.id.layout_podcasts);
        LinearLayout layoutAudiobooks = (LinearLayout) findViewById(R.id.layout_audiobooks);

        //Set a click listener on the Music view
        layoutMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Music View is clicked on.
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicIntent);
            }
        });

        //Set a click listener on the Podcasts view
        layoutPodcasts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Podcasts View is clicked on.
            @Override
            public void onClick(View view) {
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);
                startActivity(podcastsIntent);
            }
        });

        //Set a click listener on the Audiobooks view
        layoutAudiobooks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Voice Notes View is clicked on.
            @Override
            public void onClick(View view) {
                Intent audiobooksIntent = new Intent(MainActivity.this, AudiobooksActivity.class);
                startActivity(audiobooksIntent);
            }
        });
    }
}
