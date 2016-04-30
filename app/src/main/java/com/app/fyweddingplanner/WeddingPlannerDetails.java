package com.app.fyweddingplanner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.app.fyweddingplanner.models.Offers;
import com.app.fyweddingplanner.models.WeddingPlanner;

import app.com.fyweddingplanner.R;

public class WeddingPlannerDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding_planner_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WeddingPlanner allWeddingPlanner = (WeddingPlanner) getIntent().getExtras().getSerializable("offer");
        TextView textViewTitle = (TextView)findViewById(R.id.offerTitle);
        TextView textViewDetails = (TextView)findViewById(R.id.offerDetails);
        TextView textViewtextView8 = (TextView)findViewById(R.id.textView8);

        textViewDetails.setText(allWeddingPlanner.getDescription());
        textViewTitle.setText(allWeddingPlanner.getName()+"");
        textViewtextView8.setText(allWeddingPlanner.getpService()+"");
    }

}
