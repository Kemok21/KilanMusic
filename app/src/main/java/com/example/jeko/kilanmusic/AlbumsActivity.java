package com.example.jeko.kilanmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

        final ArrayTracks listTrack = MainActivity.listTracks;

        TextView main = findViewById(R.id.main);
        TextView performers = findViewById(R.id.performers);
        TextView albums = findViewById(R.id.albums);
        TextView allTracks = findViewById(R.id.all_songs);
        TextView nowPlaying = findViewById(R.id.now_playing);

        new MenuListener(AlbumsActivity.this, main, performers, albums, allTracks, nowPlaying);

        PerfAlbAdapter adapter = new PerfAlbAdapter(this, listTrack.getAlbums(), false);

        ListView listView = findViewById(R.id.object_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView titleAlbumTextView = view.findViewById(R.id.perf_or_alb_text_view);
                String titleAlbum = (String) titleAlbumTextView.getText();
                listTrack.setSelectList(2, titleAlbum);
                Intent listOfTrackIntent = new Intent(AlbumsActivity.this, ListOfTrackActivity.class);
                startActivity(listOfTrackIntent);
            }
        });
    }
}
