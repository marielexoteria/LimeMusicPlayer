package com.example.android.mymusicplayer;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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
            LinearLayout musicControls = (LinearLayout)findViewById(R.id.music_controls);
            musicControls.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(NowPlayingActivity.this, "Just a mockup - for now ;)", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
