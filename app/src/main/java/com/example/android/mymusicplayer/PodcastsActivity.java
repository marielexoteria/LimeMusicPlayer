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
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast A", "Chapter 1", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast B", "Chapter 2", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast C", "Chapter 3", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast D", "Chapter 4", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast E", "Chapter 5", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast F", "Chapter 6", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast G", "Chapter 7", R.drawable.podcasts_image_now_playing));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast H", "Chapter 8", R.drawable.podcasts_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter podcastItemsAdapter = new SoundFileAdapter(this, podcastFiles, R.color.background_color);
        GridView podcastGridView = (GridView) findViewById(R.id.sound_file_grid);
        podcastGridView.setAdapter(podcastItemsAdapter);
        podcastGridView.setBackgroundColor(getResources().getColor(R.color.category_color));
    }

}
