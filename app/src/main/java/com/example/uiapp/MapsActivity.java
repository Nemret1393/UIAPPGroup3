package com.example.uiapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.uiapp.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Add a marker in Sydney and move the camera
        LatLng topkapi = new LatLng(41.0115389109235, 28.983376362686368);
        LatLng meryemana = new LatLng(41.038701572088655, 28.942813077344237);
        LatLng sultanahmet = new LatLng(41.00555531597452, 28.976781611307214);
        LatLng hpenisulaCam = new LatLng(41.01456, 28.97310);
        mMap.addMarker(new MarkerOptions().position(topkapi).title("Topkapı Palace"));
        mMap.addMarker(new MarkerOptions().position(meryemana).title("Vlaherna Meryem Ana Church"));
        mMap.addMarker(new MarkerOptions().position(sultanahmet).title("Sultanahmet Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hpenisulaCam,13f));
    }
}