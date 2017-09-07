package com.codetribe.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LimpopoArtGall extends AppCompatActivity {

    Button findus,moreinfo;
    ImageView imageView;
    public static final String NAME="";
    private TextView decription;

    Animation rotate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limpopo_art_gall);

        decription=(TextView)findViewById(R.id.txtDescriptionL);
        moreinfo=(Button)findViewById(R.id.btnmore);

        decription.setText("Limpopo’s art galleries house the historical art of the Venda, Pedi and Shangaan people, " +
                "as well as paintings, sculptures, carvings and ceramics by talented South African artists from around the province. " +
                "Look out for work influenced by cultural and artistic traditions that remain authentically South African.");

        imageView=(ImageView)findViewById(R.id.imagedes);
        imageView.setImageResource(R.drawable.limpoposartgalleries);

        findus=(Button)findViewById(R.id.btnfindus);

        //animate();

        findus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LimpopoArtGall.this,MapsActivity.class);
                intent.putExtra(NAME,"Limpopo's Art galleries");
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

    public void animate()
    {

        rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);

        imageView.startAnimation(rotate);

    }
}
