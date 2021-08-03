package com.example.uiapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ilkSayfa extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_sayfa);

        Button infoAya = (Button) findViewById(R.id.Ayasofyainfo);
        infoAya.setOnClickListener(view -> openInfoAyasofya());
        ImageButton mapopen = findViewById(R.id.gmapsbutton);
        mapopen.setOnClickListener(view -> openMapsActivity());
        Button infomeryem = (Button) findViewById(R.id.Meryemana);
        infomeryem.setOnClickListener(view -> openInfomeryem());


    }

    public void openInfoAyasofya() {
        Intent intent = new Intent(this, InfoAyasofya.class);
        startActivity(intent);
    }
    public void openMapsActivity() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void openInfomeryem() {
        Intent intent = new Intent(this, Infomeryem.class);
        startActivity(intent);
    }

}