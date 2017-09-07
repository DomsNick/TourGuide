package com.codetribe.tourguide;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        Intent intent=MapsActivity.this.getIntent();
        String limpopname = intent.getStringExtra(LimpopoArtGall.NAME);
        String anceName=intent.getStringExtra(Ancientmapungubwe.NAME);
        String meropaName=intent.getStringExtra(MeropaCasino.NAME);
        String plkRoName=intent.getStringExtra(PolokwaneRoyal.NAME);
        String belaName=intent.getStringExtra(Belabela.NAME);
        String bigfiveName=intent.getStringExtra(Bigfivesafari.NAME);
        String boliviaName=intent.getStringExtra(Bolivialodge.NAME);
        String fusionName=intent.getStringExtra(FusionBoutiqueHotel.NAME);
        String krugerName=intent.getStringExtra(ThenorthernKrugerNationalPark.NAME);
        String waterName=intent.getStringExtra(Thewaterberg.NAME);
        String townName=intent.getStringExtra(TownLodgePolokwane.NAME);
        String privateName=intent.getStringExtra(WelgevondenprivateGamereserve.NAME);



        if(!limpopname.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-23.9052392, 29.4592216);
            mMap.addMarker(new MarkerOptions().position(sydney).title(limpopname));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!anceName.equalsIgnoreCase(""))
        {

            LatLng sydney = new LatLng(-22.2418971, 29.470572);
            mMap.addMarker(new MarkerOptions().position(sydney).title(anceName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!meropaName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-23.9044900, 29.4688500);
            mMap.addMarker(new MarkerOptions().position(sydney).title(meropaName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!plkRoName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-23.90559, 29.45905);
            mMap.addMarker(new MarkerOptions().position(sydney).title(plkRoName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!belaName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-24.845059,28.240967);
            mMap.addMarker(new MarkerOptions().position(sydney).title(belaName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!bigfiveName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-25.6475148,28.1103059);
            mMap.addMarker(new MarkerOptions().position(sydney).title(bigfiveName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!boliviaName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-23.879427, 29.515511);
            mMap.addMarker(new MarkerOptions().position(sydney).title(boliviaName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!fusionName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-23.919471, 29.456104);
            mMap.addMarker(new MarkerOptions().position(sydney).title(fusionName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!krugerName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-23.8214244,31.445617900000002);
            mMap.addMarker(new MarkerOptions().position(sydney).title(krugerName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!waterName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-20.466659, 16.648155);
            mMap.addMarker(new MarkerOptions().position(sydney).title(waterName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else if(!townName.equalsIgnoreCase(""))
        {


            LatLng sydney = new LatLng(-23.852187,29.501408);
            mMap.addMarker(new MarkerOptions().position(sydney).title(townName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }else
        {

            LatLng sydney = new LatLng(-24.203356,27.9014291);
            mMap.addMarker(new MarkerOptions().position(sydney).title(privateName));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }





    }
}
