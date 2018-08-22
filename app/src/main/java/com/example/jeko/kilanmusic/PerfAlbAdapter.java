package com.example.jeko.kilanmusic;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PerfAlbAdapter extends ArrayAdapter<Track> {

    /** Resource of drawable */
    boolean isPerformer;

    public PerfAlbAdapter(Activity context, ArrayList<Track> tracks, boolean performer) {
        super(context, 0, tracks);
        isPerformer = performer;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Track} object located at this position in the list
        Track currentTrack = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID perf_or_alb_text_view
        TextView perfOrAlbTextView = listItemView.findViewById(R.id.perf_or_alb_text_view);
        //Find the TextView in the list_item.xml layout with the ID perf_or_genre_text_view
        TextView perfOrGenreTextView = listItemView.findViewById(R.id.perf_or_genre_text_view);
        //Find the TextView in the list_item.xml layout with the ID genre_text_view
        TextView genreTextView = listItemView.findViewById(R.id.genre_text_view);
        //Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = listItemView.findViewById(R.id.image);

        if (isPerformer) {
            //Get the name performer from the current Track object and
            //set this text on the perfOrAlbTextView
            perfOrAlbTextView.setText(currentTrack.getPerformer());

            //Get genre from the current Track object and
            //set this text on the perfOrGenreTextView
            perfOrGenreTextView.setText(currentTrack.getGenre());

            //Set image on the imageView
            imageView.setImageResource(R.drawable.performer);
        } else {
            //Get title the album from the current Track object and
            //set this text on the perfOrAlbTextView
            perfOrAlbTextView.setText(currentTrack.getAlbum());

            //Get the performer from the current Track object and
            //set this text on the perfOrGenreTextView
            perfOrGenreTextView.setText(currentTrack.getPerformer());

            //Get the genre from the current Track object and
            //set this text on the genreTextView
            genreTextView.setText(currentTrack.getGenre());
        }

        return listItemView;
    }
}
