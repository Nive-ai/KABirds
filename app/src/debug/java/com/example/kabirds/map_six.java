package com.example.kabirds;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class map_six extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_six);
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

        float zoomLevel = 8.0f; //This goes up to 21


        // Add a marker in Sydney and move the camera
        LatLng Wilpattu
                = new LatLng(8.357263, 80.071026);
        mMap.addMarker(new MarkerOptions().position(Wilpattu).title("Wilpattu National Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Wilpattu,zoomLevel));





        LatLng dehe
                = new LatLng(6.857768, 79.876200);
        mMap.addMarker(new MarkerOptions().position(dehe).title("Dehiwala Zoological Garden"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dehe,zoomLevel));




    }
}
