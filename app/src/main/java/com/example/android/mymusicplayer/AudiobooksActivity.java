package com.example.android.mymusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_file_list);

        //Testing to change the bg color in the GridView
        GridView audiobooksView = (GridView) findViewById(R.id.sound_file_grid);
        audiobooksView.setBackgroundColor(getResources().getColor(R.color.category_color));

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> audiobookFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param audiobook_icon is the generic image that will represent an audiobook
         * @param artistOrAuthor is the author of the audiobook
         * @param title is the title of the audiobook
         * @param info_text is the color of the book's artist and title to display when the GridView displays the list of audiobooks
         */
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author A", "Audiobook 1", R.color.info_text));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author B", "Audiobook 2", R.color.info_text));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author C", "Audiobook 3", R.color.info_text));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author D", "Audiobook 4", R.color.info_text));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author E", "Audiobook 5", R.color.info_text));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author F", "Audiobook 6", R.color.info_text));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author G", "Audiobook 7", R.color.info_text));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Author H", "Audiobook 8", R.color.info_text));

        //Creating a GridView to display the tracks - child views
        SoundFileAdapter audiobookItemsAdapter = new SoundFileAdapter(this, audiobookFiles);
        GridView audiobookGridView = (GridView) findViewById(R.id.sound_file_grid);
        audiobookGridView.setAdapter(audiobookItemsAdapter);
    }

}
