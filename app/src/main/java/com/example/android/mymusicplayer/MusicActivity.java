package com.example.android.mymusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_file_list);

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> musicFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param music_icon        The generic image that will represent a music album
         * @param artistOrAuthor    The artist of a music file, for ex. Michael Jackson
         * @param title             The title of the song, for ex. Beat It
         */
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist A", "Title 1", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist B", "Title 2", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist C", "Title 3", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist D", "Title 4", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist E", "Title 5", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist F", "Title 6", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist G", "Title 7", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist H", "Title 8", R.drawable.music_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter musicItemsAdapter = new SoundFileAdapter(this, musicFiles, R.color.background_color);
        GridView musicGridView = (GridView) findViewById(R.id.sound_file_grid);
        musicGridView.setAdapter(musicItemsAdapter);
        musicGridView.setBackgroundColor(getResources().getColor(R.color.category_color));
    }

}
