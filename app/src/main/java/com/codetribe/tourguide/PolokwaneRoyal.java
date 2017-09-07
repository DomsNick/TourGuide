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

public class PolokwaneRoyal extends AppCompatActivity {
    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);
        ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.polokwaneroyal);
        TextView desc=(TextView)findViewById(R.id.txtDescriptionL);
        desc.setText("Situated in the CBD of Polokwane, the Polokwane Royal is a luxury hotel that offers guests a high standard of accommodation and state of the art conference facilities.\n" +
                "\n" +
                "The hotel consists of 50 comfortably furnished rooms, fitted with bar fridges, TVs, air-conditioning and tea and coffee-making facilities. There are four conference rooms, equipped with audio visual media, which are able to accommodate from 80 to 350 people. Wedding and banqueting functions can also be catered for. There is also a restaurant on the premises.\n" +
                "\n" +
                "A small swimming pool is situated in a courtyard to the rear of the building, and is ideal for cooling off on hot days. There is ample secure parking on the property, which is monitored by close circuit TV.\n" +
                "\n" +
                "Conference Venues: There are four conference rooms that can accommodate 80 to 350 delegates. Facilities include state of the art audio visual media.");

       Button findUs=(Button)findViewById(R.id.btnfindus);
        Button  moreinfo=(Button)findViewById(R.id.btnmore);

        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PolokwaneRoyal.this,MapsActivity.class);
                intent.putExtra(NAME,"Polokwane Royal");
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
