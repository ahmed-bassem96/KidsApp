package com.example.kids;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Animals extends AppCompatActivity {

ImageView image;
ImageView listen;
ImageView check;
EditText input;
TextView animalName;
TextView result;
    ArrayList<String> namesOfAnimals =new ArrayList<String>(Arrays.asList("cat","lion","dog","elephant","horse"));
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        image=findViewById(R.id.imageView);
        listen=findViewById(R.id.imageView4);
        check=findViewById(R.id.imageView6);
        animalName=findViewById(R.id.NameOfImage);
        input=findViewById(R.id.inputt);
        result=findViewById(R.id.result);




    }


    public void check(View view) {



        if(input.getText().toString().equals(namesOfAnimals.get(count))){

count++;
result.setText("Great Keep Going");
            if(count==1){
                image.setImageResource(R.drawable.lion);
            }
            if(count==2){
                image.setImageResource(R.drawable.dog);
            }
            if(count==3){
                image.setImageResource(R.drawable.elephant);
            }
            if(count==4){
                image.setImageResource(R.drawable.horse);
            }
return;


        }
        else{
            result.setText("Try Again ");
            return;
        }

    }

    public void Listen(View view) {
         MediaPlayer catvoice = MediaPlayer.create(this, R.raw.cat);
        MediaPlayer lionvoice = MediaPlayer.create(this, R.raw.lion);
        MediaPlayer dogvoice = MediaPlayer.create(this, R.raw.dog);
        MediaPlayer elephantvoice = MediaPlayer.create(this, R.raw.elephant);
        MediaPlayer horsevoice = MediaPlayer.create(this, R.raw.horse);
        switch (count) {
            case 0:
                catvoice.start();
                break;
            case 1:
                lionvoice.start();
                break;
            case 2:
                dogvoice.start();
                break;
            case 3:
                elephantvoice.start();
            case 4:
                horsevoice.start();
        }}
}