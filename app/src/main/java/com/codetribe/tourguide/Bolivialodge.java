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

public class Bolivialodge extends AppCompatActivity {

    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);
        ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.bolivialodge);
        TextView desc=(TextView)findViewById(R.id.txtDescriptionL);

        desc.setText("Bolivia Lodge is an award-winning, 3-Star Convention Centre offering 15 function venues and 106 en-suite rooms, ranging from luxurious to budget.  Based in Polokwane, in S.A's Limpopo Province, we are conveniently situated close to Polokwane's largest Mall, the airport and the Polokwane CBD.   \n" +
                "Bolivia Lodge is only 600m from Mall of the North, 9km from Polokwane International Airport, 6km from Polokwane's CBD and a 5 minute drive from Peter Mokaba Stadium.");

        Button  moreinfo=(Button)findViewById(R.id.btnmore);


        Button findUs=(Button)findViewById(R.id.btnfindus);
        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Bolivialodge.this,MapsActivity.class);
                intent.putExtra(NAME,"Bolivia Lodge");
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
