package com.example.android.mymusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

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
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Michael Jackson", "Beat it", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "A band of bitches", "Mambo en trompeta", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Juan Luis Guerra", "Fogaraté", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Earth, Wind & Fire", "Beijo", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Erasure", "Breath of life", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Otros Aires", "El amor que se baila", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Bajofondo Tango Club", "Montserrat", R.drawable.music_image_now_playing));
        musicFiles.add(new SoundFile(R.drawable.music_icon, "Rita Indiana y sus misterios", "El blú del ping pong", R.drawable.music_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter musicItemsAdapter = new SoundFileAdapter(this, musicFiles, R.color.background_color);
        GridView musicGridView = (GridView) findViewById(R.id.sound_file_grid);
        musicGridView.setAdapter(musicItemsAdapter);
        musicGridView.setBackgroundColor(getResources().getColor(R.color.category_color));
    }

}
