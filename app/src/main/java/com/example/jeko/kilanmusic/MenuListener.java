package com.example.jeko.kilanmusic;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MenuListener {
    public MenuListener(final Context activity, TextView main, TextView performers, TextView albums, TextView allTracks, TextView nowPlaying) {
        if (main != null) {
            main.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mainIntent = new Intent(activity, MainActivity.class);
                    activity.startActivity(mainIntent);
                }
            });
        }

        performers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent performersIntent = new Intent(activity, PerformersActivity.class);
                activity.startActivity(performersIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(activity, AlbumsActivity.class);
                activity.startActivity(albumsIntent);
            }
        });

        allTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.listTracks.setSelectList(0, null);
                Intent allTrackIntent = new Intent(activity, ListOfTrackActivity.class);
                activity.startActivity(allTrackIntent);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(activity, NowPlayingActivity.class);
                activity.startActivity(nowPlayingIntent);
            }
        });
    }
}
