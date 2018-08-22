package com.example.jeko.kilanmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListOfTrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

        ArrayList<Track> listTrack = MainActivity.listTracks;

        if (MainActivity.listTracks.getSelectList() == 1) {
            listTrack = MainActivity.listTracks.getPerformerTracks();
        } else if (MainActivity.listTracks.getSelectList() == 2) {
            listTrack = MainActivity.listTracks.getAlbumTracks();
        }

        TextView main = findViewById(R.id.main);
        TextView performers = findViewById(R.id.performers);
        TextView albums = findViewById(R.id.albums);
        TextView allTracks = findViewById(R.id.all_songs);
        TextView nowPlaying = findViewById(R.id.now_playing);

        new MenuListener(ListOfTrackActivity.this, main, performers, albums, allTracks, nowPlaying);

        TrackAdapter adapter = new TrackAdapter(this, listTrack);

        ListView listView = findViewById(R.id.object_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.listTracks.setPlayingTrackIndex((int) view.getTag());
                Intent playingIntent = new Intent(ListOfTrackActivity.this, NowPlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
