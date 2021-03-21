package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {
ImageView text,logo;
Animation t,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        t= AnimationUtils.loadAnimation(this,R.anim.bottom);
//        i=AnimationUtils.loadAnimation(this,R.anim.top);
//        logo=findViewById(R.id.imageView8);
//        text=findViewById(R.id.imageView7);
//        logo.setAnimation(t);
//        text.setAnimation(i);

    }
}