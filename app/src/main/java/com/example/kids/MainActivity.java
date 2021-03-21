package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 Animation t;
 ImageView alpha,animal,num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= AnimationUtils.loadAnimation(this,R.anim.bottom);
        alpha=findViewById(R.id.imageView2);
        animal=findViewById(R.id.imageView3);
        num=findViewById(R.id.imageView5);
        alpha.setAnimation(t);
        animal.setAnimation(t);
        num.setAnimation(t);
    }

    public void AnimalsActivity(View view) {
        Intent intent = new Intent(this,Animals.class);
        startActivity(intent);
    }

    public void numbers(View view) {
        Intent intent = new Intent(this,numbers.class);
        startActivity(intent);
    }

    public void alpha(View view) {
        Intent intent = new Intent(this,alpha.class);
        startActivity(intent);
    }
}