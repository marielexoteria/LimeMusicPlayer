package com.example.android.mymusicplayer;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    public static final String EXTRA_SOUND_FILE = "sound";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // Get the data from previous activity (selected song in the playlist) and display it
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView myTextView = (TextView)findViewById(R.id.artist_or_author);
            myTextView.setText(extras.getString("Artist X"));
        }
        SoundFile file = getIntent().getExtras().getParcelable(EXTRA_SOUND_FILE);

    }

}
