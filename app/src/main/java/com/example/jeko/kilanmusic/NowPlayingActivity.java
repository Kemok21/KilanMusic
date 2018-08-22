package com.example.jeko.kilanmusic;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView main = findViewById(R.id.main);
        TextView performers = findViewById(R.id.performers);
        TextView albums = findViewById(R.id.albums);
        TextView allTracks = findViewById(R.id.all_songs);
        TextView nowPlaying = findViewById(R.id.now_playing);

        new MenuListener(NowPlayingActivity.this, main, performers, albums, allTracks, nowPlaying);

        selectTrack();

        ImageView beginning = findViewById(R.id.beginning);
        final ImageView play = findViewById(R.id.play);
        ImageView end = findViewById(R.id.end);

        if (MainActivity.listTracks.getIsPlaying()) play.setImageResource(R.drawable.pause);
        else play.setImageResource(R.drawable.play);

        beginning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int trackIndex = MainActivity.listTracks.getPlayingTrackIndex();
                if (trackIndex > 0) {
                    MainActivity.listTracks.setPlayingTrackIndex(trackIndex - 1);
                    selectTrack();
                }

            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.listTracks.getIsPlaying()) {
                    play.setImageResource(R.drawable.play);
                    MainActivity.listTracks.changIsPlaying();
                }
                else {
                    play.setImageResource(R.drawable.pause);
                    MainActivity.listTracks.changIsPlaying();
                }
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int trackIndex = MainActivity.listTracks.getPlayingTrackIndex();
                if (trackIndex < MainActivity.listTracks.size() - 1) {
                    MainActivity.listTracks.setPlayingTrackIndex(trackIndex + 1);
                    selectTrack();
                }

            }
        });

    }

    private void selectTrack() {
        TextView timerTextView = findViewById(R.id.timer_text_view);
        TextView titleTrackTextView = findViewById(R.id.title_track_text_view);
        Track track = MainActivity.listTracks.get(MainActivity.listTracks.getPlayingTrackIndex());
        timerTextView.setText(track.getTime());
        titleTrackTextView.setText(track.getTitle() + " — " + track.getPerformer());
    }
}
