package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class alpha extends AppCompatActivity {
    ImageView image;
    ImageView listen;
    ImageView check;
    EditText input;
    TextView letterss;
    TextView result;
    TextToSpeech textToSpeech;
    ArrayList<String> letters =new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"));
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        image=findViewById(R.id.imageView);
        listen=findViewById(R.id.imageView4);
        check=findViewById(R.id.imageView6);
        letterss=findViewById(R.id.NameOfImage);
        input=findViewById(R.id.inputt);
        result=findViewById(R.id.result);
    }

    public void check(View view) {
        if(input.getText().toString().equals(letters.get(count))){

            count++;
            result.setText("Great Keep Going");
            if(count==1){
                image.setImageResource(R.drawable.b);
            }
            if(count==2){
                image.setImageResource(R.drawable.c);
            }
            if(count==3){
                image.setImageResource(R.drawable.d);
            }
            if(count==4){
                image.setImageResource(R.drawable.e);
            }

            return;
    }

        else{
        result.setText("Try Again ");
        return;
    }}

    public void Listen(View view) {
        MediaPlayer avoice = MediaPlayer.create(this, R.raw.a);
        MediaPlayer bvoice = MediaPlayer.create(this, R.raw.b);
        MediaPlayer cvoice = MediaPlayer.create(this, R.raw.c);
        MediaPlayer dvoice = MediaPlayer.create(this, R.raw.d);
        MediaPlayer evoice = MediaPlayer.create(this, R.raw.e);
        switch (count) {
            case 0:
                avoice.start();
                break;
            case 1:
                bvoice.start();
                break;
            case 2:
                cvoice.start();
                break;
            case 3:
                dvoice.start();
            case 4:
                evoice.start();
        }
    }
}