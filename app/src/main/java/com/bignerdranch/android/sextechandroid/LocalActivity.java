package com.bignerdranch.android.sextechandroid;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import android.widget.VideoView;

import java.io.IOException;

/**
 * Created by michael on 25/3/18.
 */
public class LocalActivity extends AppCompatActivity {

    Uri uri;
    VideoView video;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        // Create tabs using XML

        video = (VideoView)findViewById(R.id.myVideo);
        uri =Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.vr);
        video.setVideoURI(uri);
        video.start();






    }



}
