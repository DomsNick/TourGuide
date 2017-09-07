package com.codetribe.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.logging.Handler;

public class Categories extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter customAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);



        recyclerView=(RecyclerView)findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<CardCategory> list = new ArrayList<>();

        CardCategory cardCategory1=new CardCategory();
        CardCategory cardCategory2=new CardCategory();
        CardCategory cardCategory3=new CardCategory();
        CardCategory cardCategory4=new CardCategory();
        CardCategory cardCategory5=new CardCategory();
        CardCategory cardCategory6=new CardCategory();
        CardCategory cardCategory7=new CardCategory();
        CardCategory cardCategory8=new CardCategory();
        CardCategory cardCategory9=new CardCategory();
        CardCategory cardCategory10=new CardCategory();
        CardCategory cardCategory11=new CardCategory();
        CardCategory cardCategory12=new CardCategory();


        cardCategory1.setName("Limpopo's Art Galleries");
        cardCategory1.setImages(R.drawable.limpoposartgalleries);

        cardCategory2.setName("Ancient mapungubwe");
        cardCategory2.setImages(R.drawable.ancientmapungubwe);

        cardCategory3.setName("Meropa Casino");
        cardCategory3.setImages(R.drawable.meropacasino);

        cardCategory4.setName("Polokwane Royal");
        cardCategory4.setImages(R.drawable.polokwaneroyal);

        cardCategory5.setName("Bela Bela");
        cardCategory5.setImages(R.drawable.belabela);

        cardCategory6.setName("Big Five");
        cardCategory6.setImages(R.drawable.bigfivesafari);

        cardCategory7.setName("Bolivia Lodge");
        cardCategory7.setImages(R.drawable.bolivialodge);

        cardCategory8.setName("Fusion Boutique Hotel");
        cardCategory8.setImages(R.drawable.fusionboutiquehotel);

        cardCategory9.setName("The northern Kruger National Park");
        cardCategory9.setImages(R.drawable.thenorthernkrugernationalpark);

        cardCategory10.setName("The waterberg");
        cardCategory10.setImages(R.drawable.thewaterberg);

        cardCategory11.setName("Town Lodge Polokwane");
        cardCategory11.setImages(R.drawable.townlodgepolokwane);

        cardCategory12.setName("Welgevonden Private Game Reserve");
        cardCategory12.setImages(R.drawable.welvondenprivategamereserve);

        list.add(cardCategory1);
        list.add(cardCategory2);
        list.add(cardCategory3);
        list.add(cardCategory4);
        list.add(cardCategory5);
        list.add(cardCategory6);
        list.add(cardCategory7);
        list.add(cardCategory8);
        list.add(cardCategory9);
        list.add(cardCategory10);
        list.add(cardCategory11);
        list.add(cardCategory12);

        customAdapter = new CustomAdapter(this,list);

        recyclerView.setAdapter(customAdapter);







    }
}
