package com.example.videovoewexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView video=(VideoView) findViewById(R.id.videoView);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(video);
        Uri videopath = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.animation);
        video.setMediaController(mediaController);
        video.setVideoURI(videopath);
        video.requestFocus();
        video.start();
    }
}
