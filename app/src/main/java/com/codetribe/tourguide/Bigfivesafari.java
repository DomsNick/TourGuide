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

public class Bigfivesafari extends AppCompatActivity {
    public static final String NAME="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);
        ImageView imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.bigfivesafari);

        TextView desc=(TextView)findViewById(R.id.txtDescriptionL);

        desc.setText("In Africa, the big five game animals are the African lion, African elephant, Cape buffalo, African leopard, and rhinoceros.[1] The term \"big five game\" (usually capitalized or quoted as \"Big Five\") was coined by big-game hunters and refers to the five most difficult animals in Africa to hunt on foot. Subsequently the term was adopted by safari tour operators for marketing purposes.[2] The term is used in most tourist and wildlife guides that discuss African wildlife safaris. The members of the Big Five were chosen for the difficulty in hunting them and the degree of danger involved, rather than their size.[2][3]\n" +
                "\n" +
                "The big five are among the most dangerous, yet most popular species for big-game hunters to hunt.[4]\n" +
                "\n" +
                "The 1990 and later releases of South African rand banknotes feature a different big-five animal on each denomination.");


        Button  moreinfo=(Button)findViewById(R.id.btnmore);
        Button findUs=(Button)findViewById(R.id.btnfindus);
        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Bigfivesafari.this,MapsActivity.class);
                intent.putExtra(NAME,"Big Five Safari");
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
