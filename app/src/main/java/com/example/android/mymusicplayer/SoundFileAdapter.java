package com.example.android.mymusicplayer;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by marielbackman on 19/03/2018.
 */

public class SoundFileAdapter extends ArrayAdapter<SoundFile> {
    private static final String LOG_TAG = SoundFileAdapter.class.getSimpleName();

    /*
     * Adapter used in the custom class SoundFile.java
     * It will get the position of the current item in the ArrayList and extract the info
    */
    public SoundFileAdapter (Activity context, ArrayList<SoundFile> musicFiles) {
        super(context, 0, musicFiles);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Display icons and file info
        SoundFile currentSoundFile = getItem(position);
        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.file_icon);
        iconImageView.setImageResource(currentSoundFile.getIconID());

        TextView artistOrAuthorTextView = (TextView) listItemView.findViewById(R.id.list_artist_or_author);
        artistOrAuthorTextView.setText(currentSoundFile.getArtistOrAuthor());
        artistOrAuthorTextView.setTextColor(currentSoundFile.getTextColor());

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.list_title);
        titleTextView.setText(currentSoundFile.getTitle());

        return listItemView;

    }


}