package com.example.jeko.kilanmusic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView main = null;
        TextView performers = findViewById(R.id.performers);
        TextView albums = findViewById(R.id.albums);
        TextView allTracks = findViewById(R.id.all_songs);
        TextView nowPlaying = findViewById(R.id.now_playing);

        new MenuListener(MainActivity.this, main, performers, albums, allTracks, nowPlaying);
    }
    protected static ArrayTracks listTracks = new ArrayTracks();

//    /**
//     * Method for set onClick listener in activity for Intents
//     * @param activity contextActivity
//     * @param main for intent MainActivity
//     * @param performers for intent PerformersActivity
//     * @param albums for intent AlbumsActivity
//     * @param allTracks for intent ListOfTrackActivity
//     * @param nowPlaying for intent NowPlayingActivity
//     */
//    public void menuListener(Context activity, TextView main, TextView performers, TextView albums, TextView allTracks, TextView nowPlaying) {
//
//        if (main != null) {
//            main.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent mainIntent = new Intent(activity, MainActivity.class);
//                    startActivity(mainIntent);
//                }
//            });
//        }
//
//        performers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent performersIntent = new Intent(activity, PerformersActivity.class);
//                startActivity(performersIntent);
//            }
//        });
//
//        albums.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent albumsIntent = new Intent(activity, AlbumsActivity.class);
//                startActivity(albumsIntent);
//            }
//        });
//
//        allTracks.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listTracks.setSelectList(0, null);
//                Intent allTrackIntent = new Intent(activity, ListOfTrackActivity.class);
//                startActivity(allTrackIntent);
//            }
//        });
//
//        nowPlaying.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent nowPlayingIntent = new Intent(activity, NowPlayingActivity.class);
//                startActivity(nowPlayingIntent);
//            }
//        });
//    }

}
