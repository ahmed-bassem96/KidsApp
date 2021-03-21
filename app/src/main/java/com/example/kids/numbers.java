package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class numbers extends AppCompatActivity {

    ImageView image;
    ImageView listen;
    ImageView check;
    EditText input;
    TextView numberss;
    TextView result;
    ArrayList<String> numbersss =new ArrayList<String>(Arrays.asList("one","two","three","four","five"));
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        image=findViewById(R.id.imageView);
        listen=findViewById(R.id.imageView4);
        check=findViewById(R.id.imageView6);
        numberss=findViewById(R.id.NameOfImage);
        input=findViewById(R.id.inputt);
        result=findViewById(R.id.result);
    }

    public void check(View view) {
        if(input.getText().toString().equals(numbersss.get(count))){

            count++;
            result.setText("Great Keep Going");
            if(count==1){
                image.setImageResource(R.drawable.two);
            }
            if(count==2){
                image.setImageResource(R.drawable.three);
            }
            if(count==3){
                image.setImageResource(R.drawable.four);
            }
            if(count==4){
                image.setImageResource(R.drawable.five);
            }
            return;


        }
        else{
            result.setText("Try Again ");
            return;
        }
    }

    public void Listen(View view) {
        MediaPlayer onevoice = MediaPlayer.create(this, R.raw.one);
        MediaPlayer twovoice = MediaPlayer.create(this, R.raw.two);
        MediaPlayer threevoice = MediaPlayer.create(this, R.raw.three);
        MediaPlayer fourvoice = MediaPlayer.create(this, R.raw.four);
        MediaPlayer fivevoice = MediaPlayer.create(this, R.raw.five);
        switch (count) {
            case 0:
                onevoice.start();
                break;
            case 1:
                twovoice.start();
                break;
            case 2:
                threevoice.start();
                break;
            case 3:
                fourvoice.start();
            case 4:
                fivevoice.start();
        }
    }
}