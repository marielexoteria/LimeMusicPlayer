package com.example.android.mymusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_file_list);

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> podcastFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param podcast_icon      The generic image that will represent a podcast
         * @param artistOrAuthor    The person(s) recording the podcast, for ex. UXPodcast
         * @param title             The chapter of the podcast, for ex. #180 Mobile frustrations with Lina Hansson
         */
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast UX4You", "Chapter 1: What is UX?", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast UX4You", "Chapter 2: Design Thinking", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast UX4You", "Chapter 3: How to User research", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast UX4You", "Chapter 4: User journeys", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast UX4You", "Chapter 5: Analyzing information", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast UX4You", "Chapter 6: Idea generation", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast UX4You", "Chapter 7: Selling the value of UX", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast UX4You", "Chapter 8: Open forum", R.drawable.podcasts_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter podcastItemsAdapter = new SoundFileAdapter(this, podcastFiles, R.color.background_color);
        GridView podcastGridView = (GridView) findViewById(R.id.sound_file_grid);
        podcastGridView.setAdapter(podcastItemsAdapter);
        podcastGridView.setBackgroundColor(getResources().getColor(R.color.category_color));
    }

}
