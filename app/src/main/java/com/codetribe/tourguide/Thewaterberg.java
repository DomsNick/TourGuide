package com.codetribe.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by CodeTribe on 2017/08/15.
 */

public class Thewaterberg extends AppCompatActivity {

    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);

        ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.thewaterberg);

        Button findUs=(Button)findViewById(R.id.btnfindus);
        Button  moreinfo=(Button)findViewById(R.id.btnmore);

        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Thewaterberg.this,MapsActivity.class);
                intent.putExtra(NAME,"The waterberg");
                startActivity(intent);
            }
        });
        moreinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);

            }
        });

    }
}
