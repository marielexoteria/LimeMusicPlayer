package com.example.android.mymusicplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by marielbackman on 19/03/2018.
 */

public class SoundFileAdapter extends ArrayAdapter<SoundFile> {

    //Resource ID for the background color of each grid item.
    private int mItemBgColor;

    /*
     * Variable that will get the context in order to start an activity.
     * Used to open the Now Playing view when a user clicks on the Play button on each grid item.
     */
    private Context activityContext;

    /*
     * Adapter used in the custom class SoundFile.java.
     * It will get the position of the current item in the ArrayList and extract the info.
     *
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     * itemColor gets the background color used in each grid item on list_item.xml.
     * @param context        The current context. Used to inflate the layout file.
     * @param musicFiles     A List of SoundFile objects to display in a list.
     * @param itemBgColor      The background color of an item displayed on list_item.xml
    */
    public SoundFileAdapter (Activity context, ArrayList<SoundFile> musicFiles, int itemBgColor) {

        /*
         * Here, we initialize the ArrayAdapter's internal storage for the context and the list.
         the second argument is used when the ArrayAdapter is populating a single TextView.
         Because this is a custom adapter for three TextViews, the adapter is not
         going to use this second argument, so it can be any value. Here, we used 0.
        */
        super(context, 0, musicFiles);
        mItemBgColor = itemBgColor;
        activityContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Display icons and file info.
        final SoundFile currentSoundFile = getItem(position);
        ImageView iconImageView = (ImageView) gridItemView.findViewById(R.id.file_icon);
        iconImageView.setImageResource(currentSoundFile.getIconID());

        TextView artistOrAuthorTextView = (TextView) gridItemView.findViewById(R.id.list_artist_or_author);
        artistOrAuthorTextView.setText(currentSoundFile.getArtistOrAuthor());

        TextView titleTextView = (TextView) gridItemView.findViewById(R.id.list_title);
        titleTextView.setText(currentSoundFile.getTitle());

       //Setting the background color for each grid item.
        LinearLayout playFile = gridItemView.findViewById(R.id.layout_items);
        int color = ContextCompat.getColor(getContext(), mItemBgColor);
        playFile.setBackgroundColor(color);

        //Opening the Now Playing activity upon clicking anywhere in the grid item.
        playFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(activityContext, NowPlayingActivity.class);
                nowPlayingIntent.putExtra(NowPlayingActivity.EXTRA_SOUND_FILE, currentSoundFile);
                activityContext.startActivity(nowPlayingIntent);
            }
        });

        return gridItemView;

    }



}