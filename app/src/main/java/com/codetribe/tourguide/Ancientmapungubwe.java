package com.codetribe.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CodeTribe on 2017/08/15.
 */

public class Ancientmapungubwe  extends AppCompatActivity {
    private TextView description;
    private Button findUs;
    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);

        final ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.ancientmapungubwe);
        description=(TextView)findViewById(R.id.txtDescriptionL);
        description.setText("The Kingdom of Mapungubwe (1075–1220) was a pre-colonial state in Southern Africa located at the confluence of the Shashe and Limpopo rivers, south of Great Zimbabwe.\n" +
                " The name is derived from either Venda or Shona. The name may mean \"Hill of Jackals\"[1] - see below. \n" +
                "The kingdom was the first stage in a development that would culminate in the creation of the Kingdom of Zimbabwe in the 13th century,\n" +
                " and with gold trading links to Rhapta and Kilwa Kisiwani on the African east coast. The Kingdom of Mapungubwe lasted about 80 years, \n" +
                "and at its height its population was about 5000 people. The Mapungubwe Collection is a museum collection of artifacts found at the archaeological site \n" +
                "and is housed in the Mapungubwe Museum in Pretoria.");

        findUs=(Button)findViewById(R.id.btnfindus);
        Button  moreinfo=(Button)findViewById(R.id.btnmore);

        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Ancientmapungubwe.this,MapsActivity.class);
                intent.putExtra(NAME,"Ancient Mapungubwe");
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
