package com.codetribe.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CodeTribe on 2017/08/15.
 */

public class MeropaCasino extends AppCompatActivity {
    TextView desc;
    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);
        ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.meropacasino);

        desc=(TextView)findViewById(R.id.txtDescriptionL);
        desc.setText("The Meropa Casino & Entertainment World rises up like an ancient African palace under modern skies. Palm trees wave as you enter a world of fun and entertainment. This Polokwane casino and entertainment complex offers a tempting choice of clubs, conference venues, coffee shops and restaurants.\n" +
                "\n" +
                "Part of the well established Sun International group, the Meropa Casino & Entertainment World boasts a pleasant and spacious hotel set in landscaped gardens. The décor here is Afro-chic – tall pots, enormous pillars and archways, domed roofs.\n" +
                "\n" +
                "Children really love the Meropa Casino & Entertainment World's Wild World outdoor area, with WildThingZ the definite highlight.\n" +
                "\n" +
                "The first of its kind on the continent, this incredible multi-species enclosure contains a bird and reptile park as well as a butterfly park and insectarium.");

       Button findUs=(Button)findViewById(R.id.btnfindus);
        Button  moreinfo=(Button)findViewById(R.id.btnmore);

        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MeropaCasino.this,MapsActivity.class);
                intent.putExtra(NAME,"Meropa Casino");
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
