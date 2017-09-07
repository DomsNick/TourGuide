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

public class ThenorthernKrugerNationalPark extends AppCompatActivity {

    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);

        ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.thenorthernkrugernationalpark);

        TextView desc=(TextView)findViewById(R.id.txtDescriptionL);
        desc.setText("The Kruger National Park is not just about big game. In the north is the Pafuri region, a wilderness area of great natural beauty where you can discover ancient forests, brilliant birding and traces of early humankind.\n" +
                "\n" +
                "DID YOU KNOW?\n" +
                "\n" +
                "The world's oldest baobab tree, the Sunland Baobab, is over 6 000 years old.\n" +
                "\n" +
                "The northern section of the Kruger National Park is an area of unique biodiversity." +
                " It's one of the few places where fever tree forests grow side by side with forests of giant baobabs. " +
                "The trees line the banks of the Limpopo and Luvuvhu rivers: the slim, pale, luminescent green trunks of the fever trees glimmering between the massive dark brown trunks of the baobabs.\n" +
                "\n" +
                "When you stay at Pafuri Wilderness Camp, one of the Kruger National Park's private lodges," +
                " you're in the ancestral lands of the Makuleke people, who, in partnership with Wilderness Safaris, " +
                "act as custodians of this wildly beautiful area. Local staff are trained and encouraged by experienced rangers and service staff from all over South Africa.\n");

        Button  moreinfo=(Button)findViewById(R.id.btnmore);


        Button findUs=(Button)findViewById(R.id.btnfindus);
        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThenorthernKrugerNationalPark.this,MapsActivity.class);
                intent.putExtra(NAME,"The northern Kruger National Park");
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
