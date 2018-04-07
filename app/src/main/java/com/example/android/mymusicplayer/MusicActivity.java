package com.example.android.mymusicplayer;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_file_list);

        //Enabling UP navigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> musicFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param music_icon        The generic image that will represent a music album
         * @param artistOrAuthor    The artist of a music file, for ex. Michael Jackson
         * @param title             The title of the song, for ex. Beat It
         */
        musicFiles.add(new SoundFile(R.drawable.music_icon, R.string.music_artist_one,
                R.string.music_song_name_one, R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, R.string.music_artist_two,
                R.string.music_song_name_two, R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, R.string.music_artist_three,
                R.string.music_song_name_three, R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, R.string.music_artist_four,
                R.string.music_song_name_four, R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, R.string.music_artist_five,
                R.string.music_song_name_five, R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, R.string.music_artist_six,
                R.string.music_song_name_six, R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, R.string.music_artist_seven,
                R.string.music_song_name_seven, R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, R.string.music_artist_eight,
                R.string.music_song_name_eight, R.drawable.music_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter musicItemsAdapter = new SoundFileAdapter(this, musicFiles, R.color.background_color);
        GridView musicGridView = (GridView) findViewById(R.id.sound_file_grid);
        musicGridView.setAdapter(musicItemsAdapter);
        musicGridView.setBackgroundColor(getResources().getColor(R.color.category_color));

    }

    //Up navigation goes back to the parent activity. This code alters the visual behavior and shows
    //the child activity moving to the right and then the parent activity shows.
    //Using "NavUtils.navigateUpFromSameTask(this);" does the opposite effect
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
