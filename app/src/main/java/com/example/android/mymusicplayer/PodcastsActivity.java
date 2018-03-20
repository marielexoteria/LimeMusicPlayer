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

        //Testing to change the bg color in the GridView
        GridView podcastsView = (GridView) findViewById(R.id.sound_file_grid);
        podcastsView.setBackgroundColor(getResources().getColor(R.color.category_color));

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> podcastFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param podcast_icon is the generic image that will represent a podcast
         * @param artistOrAuthor is the person(s) recording the podcast
         * @param title is the chapter of the podcast
         * @param info_text is the color of the podcast artist and title to display when the GridView displays the list of podcasts
         */
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast A", "Chapter 1", R.color.info_text));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast B", "Chapter 2", R.color.info_text));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast C", "Chapter 3", R.color.info_text));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast D", "Chapter 4", R.color.info_text));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast E", "Chapter 5", R.color.info_text));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast F", "Chapter 6", R.color.info_text));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast G", "Chapter 7", R.color.info_text));
        podcastFiles.add(new SoundFile(R.drawable.podcasts_icon, "Podcast H", "Chapter 8", R.color.info_text));

        //Creating a GridView to display the tracks - child views
        SoundFileAdapter podcastItemsAdapter = new SoundFileAdapter(this, podcastFiles);
        GridView podcastGridView = (GridView) findViewById(R.id.sound_file_grid);
        podcastGridView.setAdapter(podcastItemsAdapter);
    }

}
