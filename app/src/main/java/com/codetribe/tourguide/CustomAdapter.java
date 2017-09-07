package com.codetribe.tourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CodeTribe on 2017/08/15.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {


    Context context;
    List<CardCategory> cardCategoryList;

    public CustomAdapter(Context context, List<CardCategory> cardCategoryList) {
        this.context = context;
        this.cardCategoryList = cardCategoryList;
    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.catergory_layout,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, final int position) {

        CardCategory cardCategory = cardCategoryList.get(position);

        holder.image.setImageResource(cardCategory.getImages());
        holder.description.setText(cardCategory.getName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position==0)
                {
                    Intent intent = new Intent(context,LimpopoArtGall.class);
                    context.startActivity(intent);

                }else if(position==1)
                {
                    Intent intent = new Intent(context,Ancientmapungubwe.class);
                    context.startActivity(intent);

                }else if(position==2)
                {
                    Intent intent = new Intent(context,MeropaCasino.class);
                    context.startActivity(intent);

                }else if(position==3)
                {
                    Intent intent = new Intent(context,PolokwaneRoyal.class);
                    context.startActivity(intent);

                }else if(position==4)
                {
                    Intent intent = new Intent(context,Belabela.class);
                    context.startActivity(intent);

                }else if(position==5)
                {
                    Intent intent = new Intent(context,Bigfivesafari.class);
                    context.startActivity(intent);

                }else if(position==6)
                {
                    Intent intent = new Intent(context,Bolivialodge.class);
                    context.startActivity(intent);

                }else if(position==7)
                {
                    Intent intent = new Intent(context,FusionBoutiqueHotel.class);
                    context.startActivity(intent);

                }else if(position==8)
                {
                    Intent intent = new Intent(context,ThenorthernKrugerNationalPark.class);
                    context.startActivity(intent);

                }else if(position==9)
                {
                    Intent intent = new Intent(context,Thewaterberg.class);
                    context.startActivity(intent);

                }else if(position==10)
                {
                    Intent intent = new Intent(context,TownLodgePolokwane.class);
                    context.startActivity(intent);

                }else {
                    Intent intent = new Intent(context,WelgevondenprivateGamereserve.class);
                    context.startActivity(intent);


                }

            }
        });

    }

    @Override
    public int getItemCount() {

        return cardCategoryList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView description;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            image=(ImageView)itemView.findViewById(R.id.imagelist);
            description=(TextView)itemView.findViewById(R.id.txtname);
            cardView=(CardView)itemView.findViewById(R.id.cardview);

        }
    }
}
