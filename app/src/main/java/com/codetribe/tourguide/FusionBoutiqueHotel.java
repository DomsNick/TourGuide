
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

public class FusionBoutiqueHotel extends AppCompatActivity {

    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);

        ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.fusionboutiquehotel);
        TextView desc=(TextView)findViewById(R.id.txtDescriptionL);
        desc.setText("True to its superior five-star status, a stay at this unique establishment is characterized by a unison of personalized attention, plush interiors and a striking infusion of art reflective of a shrine to the extraordinary. It is a space where over-the-top-drama enters into a comfortable play with signature minimalism for an exceptional presentation.\n" +
                "Step into a world where art, cuisine, texture and comfort prevail to form the perfect visual feast. 5 Star Luxury Accommodation in Polokwane.");
        Button  moreinfo=(Button)findViewById(R.id.btnmore);

        Button findUs=(Button)findViewById(R.id.btnfindus);
        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FusionBoutiqueHotel.this,MapsActivity.class);
                intent.putExtra(NAME,"Fusion Boutique Hotel");
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
