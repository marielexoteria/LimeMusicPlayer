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

        //Testing to change the bg color in the GridView
        GridView musicView = (GridView) findViewById(R.id.sound_file_grid);
        musicView.setBackgroundColor(getResources().getColor(R.color.category_color));

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> musicFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param music_icon is the generic image that will represent a music album
         * @param artistOrAuthor is the artist of a music file, for ex. Michael Jackson
         * @param title is the title of the song, for ex. Beat It
         * @param info_text is the color of the song artist and title to display when the GridView displays the list of songs
         */
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist A", "Title 1", R.color.info_text));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist B", "Title 2", R.color.info_text));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist C", "Title 3", R.color.info_text));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist D", "Title 4", R.color.info_text));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist E", "Title 5", R.color.info_text));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist F", "Title 6", R.color.info_text));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist G", "Title 7", R.color.info_text));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Artist H", "Title 8", R.color.info_text));

        //Creating a GridView to display the tracks - child views
        SoundFileAdapter musicItemsAdapter = new SoundFileAdapter(this, musicFiles);
        GridView musicGridView = (GridView) findViewById(R.id.sound_file_grid);
        musicGridView.setAdapter(musicItemsAdapter);

    }

}
