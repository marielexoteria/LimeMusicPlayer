package com.example.android.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the variables that will find the views
        LinearLayout layoutMusic = (LinearLayout) findViewById(R.id.layout_music);
        LinearLayout layoutPodcasts = (LinearLayout) findViewById(R.id.layout_podcasts);
        LinearLayout layoutAudiobooks = (LinearLayout) findViewById(R.id.layout_audiobooks);

        //Setting the layouts' OnClickListeners to "this"
        //Suggestion to improve the code from the 2nd review of the project. Inspired by
        //https://stackoverflow.com/questions/4987670/using-switch-statement-to-handle-button-clicks/4987721#4987721
        layoutMusic.setOnClickListener(this);
        layoutPodcasts.setOnClickListener(this);
        layoutAudiobooks.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.layout_music:
                //Start Music activity
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicIntent);
                break;

            case R.id.layout_podcasts:
                //Start Podcasts activity
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);
                startActivity(podcastsIntent);
                break;

            case R.id.layout_audiobooks:
                //Start Audiobooks activity
                Intent audiobooksIntent = new Intent(MainActivity.this, AudiobooksActivity.class);
                startActivity(audiobooksIntent);
                break;
            }
        }

}