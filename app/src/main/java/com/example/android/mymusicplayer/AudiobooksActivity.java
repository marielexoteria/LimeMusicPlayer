package com.example.android.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_file_list);

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> audiobookFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param audiobook_icon    The generic image that will represent an audiobook
         * @param artistOrAuthor    The author of the audiobook, for ex. J.K. Rowling
         * @param title             The title of the audiobook, for ex. Harry Potter and the Sorcerer's Stone
         */
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author A", "Audiobook 1", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author B", "Audiobook 2", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author C", "Audiobook 3", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author D", "Audiobook 4", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author E", "Audiobook 5", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author F", "Audiobook 6", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author G", "Audiobook 7", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author H", "Audiobook 8", R.drawable.audiobook_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter audiobookItemsAdapter = new SoundFileAdapter(this, audiobookFiles, R.color.background_color);
        final GridView audiobookGridView = (GridView) findViewById(R.id.sound_file_grid);
        audiobookGridView.setAdapter(audiobookItemsAdapter);
        audiobookGridView.setBackgroundColor(getResources().getColor(R.color.category_color));

    }

}
