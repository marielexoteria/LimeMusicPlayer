package com.example.android.mymusicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    public static final String EXTRA_SOUND_FILE = "sound";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        //Enabling UP navigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Get the data from previous activity (selected song in the playlist) and display it
        //Help from my mentor: how to get the TextViews to display the correct sound file info
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            SoundFile file = getIntent().getExtras().getParcelable(EXTRA_SOUND_FILE);

            ImageView nowPlayingFileImage = (ImageView)findViewById(R.id.now_playing_file_image);
            nowPlayingFileImage.setImageResource(file.getNowPlayingImageID());

            TextView nowPlayingArtistOrAuthor = (TextView)findViewById(R.id.now_playing_artist_or_author);
            nowPlayingArtistOrAuthor.setText(file.getArtistOrAuthor());

            TextView nowPlayingTitle = (TextView)findViewById(R.id.now_playing_title);
            nowPlayingTitle.setText(file.getTitle());

            //As the functionality of a music player app is not required, I wanted to display toasts in case
            //a user clicks/touches on the 3 buttons that simulate a player app
            //NO FUNCIONA - NO DESPLIEGA EL TOAST DESDE QUE AGREGUÉ EL UP NAVIGATION
            LinearLayout musicControls = (LinearLayout)findViewById(R.id.music_controls);
            musicControls.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(NowPlayingActivity.this, R.string.toast_msg, Toast.LENGTH_SHORT).show();
                }
            });

        }
    }

    //UP navigation code modified to go to the previous activity (Audiobooks, Podcast or Music). This
    //code alters the visual behavior and shows the NowPlaying activity moving to the right and then
    //the Audiobooks/Podcasts/Music activity shows.
    //Using "NavUtils.navigateUpFromSameTask(this);" does the opposite effect
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
