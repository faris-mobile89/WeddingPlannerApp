package com.app.fyweddingplanner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.app.fyweddingplanner.models.Offers;

import app.com.fyweddingplanner.R;

public class OfferDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Offers offer = (Offers) getIntent().getExtras().getSerializable("offer");
        TextView textViewTitle = (TextView)findViewById(R.id.offerTitle);
        TextView textViewDetails = (TextView)findViewById(R.id.offerDetails);

        textViewDetails.setText(offer.getDisciption()+"");
        textViewTitle.setText(offer.getName()+"");
    }
}
