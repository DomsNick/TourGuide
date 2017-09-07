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

public class Belabela extends AppCompatActivity {
    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);
        ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.belabela);
        TextView desc=(TextView)findViewById(R.id.txtDescriptionL);
        desc.setText("Game lodge (also known as a safari lodges) are mainly used by visitors on wildlife safaris, and are typically located in or near national parks or game reserves and offer meals and activities such as game drives, in addition to accommodation. The standard of accommodation varies considerably, from rustic bush camps, sometimes tented, to luxury lodges with the character of upmarket hotels. \n" +
                "\n" +
                "View the Map of Bela-Bela to find the Game Lodges in the location you wish to stay or view all types of accommodation in Bela-Bela.");

      Button  moreinfo=(Button)findViewById(R.id.btnmore);


        Button findUs=(Button)findViewById(R.id.btnfindus);
        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Belabela.this,MapsActivity.class);
                intent.putExtra(NAME,"Bela-Bela");
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
