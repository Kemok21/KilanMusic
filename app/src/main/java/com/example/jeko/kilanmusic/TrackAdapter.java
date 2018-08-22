package com.example.jeko.kilanmusic;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(Activity context, ArrayList<Track> tracks){
        super(context, 0, tracks);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_track, parent, false);
        }
        // Get the {@link Track} object located at this position in the list
        Track currentTrack = getItem(position);

        //Find the LinearLayout in the list_track.xml layout with the ID track_linear_layout
        LinearLayout trackLinearLayout = (LinearLayout) listItemView.findViewById(R.id.track_linear_layout);
        //Set index of the currentTrack in tag of the trackLinearLayout
        trackLinearLayout.setTag(currentTrack.getIndex());

        //Find the TextView in the list_track.xml layout with the ID title_text_view
        TextView titleTrackTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        //Get the title and name performer from the current Track object and
        //set this text on the titleTrackTextView
        titleTrackTextView.setText(currentTrack.getTitle() + " — " + currentTrack.getPerformer());

        //Find the TextView in the list_track.xml layout with the ID album_text_view
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        //Get the title album from the current Track object and
        //set this text on the genreTextView
        albumTextView.setText(currentTrack.getAlbum());

        //Find the TextView in the list_track.xml layout with the ID time_text_view
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        //Get the time from the current Track object and
        //set this text on the genreTextView
        timeTextView.setText(currentTrack.getTime());

        return listItemView;
    }
}
