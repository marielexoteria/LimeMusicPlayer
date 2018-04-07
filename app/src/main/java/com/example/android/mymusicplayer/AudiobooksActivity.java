package com.example.android.mymusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_file_list);

        //Enabling UP navigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> audiobookFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param audiobook_icon    The generic image that will represent an audiobook
         * @param artistOrAuthor    The author of the audiobook, for ex. J.K. Rowling
         * @param title             The title of the audiobook, for ex. Harry Potter and the Sorcerer's Stone
         */
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, R.string.audiobooks_author_one,
                R.string.audiobooks_title_one, R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, R.string.audiobooks_author_two,
                R.string.audiobooks_title_two, R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, R.string.audiobooks_author_three,
                R.string.audiobooks_title_three, R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, R.string.audiobooks_author_four,
                R.string.audiobooks_title_four, R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, R.string.audiobooks_author_five,
                R.string.audiobooks_title_five, R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, R.string.audiobooks_author_six,
                R.string.audiobooks_title_six, R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, R.string.audiobooks_author_seven,
                R.string.audiobooks_title_seven, R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, R.string.audiobooks_author_eight,
                R.string.audiobooks_title_eight, R.drawable.audiobook_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter audiobookItemsAdapter = new SoundFileAdapter(this, audiobookFiles, R.color.background_color);
        final GridView audiobookGridView = (GridView) findViewById(R.id.sound_file_grid);
        audiobookGridView.setAdapter(audiobookItemsAdapter);
        audiobookGridView.setBackgroundColor(getResources().getColor(R.color.category_color));

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
