package com.example.android.mymusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_file_list);

        //Enabling UP navigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> podcastFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param podcast_icon      The generic image that will represent a podcast
         * @param artistOrAuthor    The person(s) recording the podcast, for ex. UXPodcast
         * @param title             The chapter of the podcast, for ex. #180 Mobile frustrations with Lina Hansson
         */
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, R.string.podcast_author,
                R.string.podcast_chapter_one, R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, R.string.podcast_author,
                R.string.podcast_chapter_two, R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, R.string.podcast_author,
                R.string.podcast_chapter_three, R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, R.string.podcast_author,
                R.string.podcast_chapter_four, R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, R.string.podcast_author,
                R.string.podcast_chapter_five, R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, R.string.podcast_author,
                R.string.podcast_chapter_six, R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, R.string.podcast_author,
                R.string.podcast_chapter_seven, R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, R.string.podcast_author,
                R.string.podcast_chapter_eight, R.drawable.podcasts_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter podcastItemsAdapter = new SoundFileAdapter(this, podcastFiles, R.color.background_color);
        GridView podcastGridView = (GridView) findViewById(R.id.sound_file_grid);
        podcastGridView.setAdapter(podcastItemsAdapter);
        podcastGridView.setBackgroundColor(getResources().getColor(R.color.category_color));

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
