package com.codetribe.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Animation fadein;
    ImageView imageView;
    TextView textView;
    private ProgressBar progressBar;
    private  static  int SPLASH_TIME_OUT=4000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView=(ImageView)findViewById(R.id.imageView);
        textView=(TextView)findViewById(R.id.textView);
        progressBar=(ProgressBar)findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.VISIBLE);
        progressBar.setMax(7000);

        fadein= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animate();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Categories.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);




//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                imageView.startAnimation(fadein);
//
//            }
//        });






    }

    public void animate()
    {

        fadein= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

        imageView.startAnimation(fadein);
        textView.startAnimation(fadein);
    }
}
