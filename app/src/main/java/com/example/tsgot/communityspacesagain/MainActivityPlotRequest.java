package com.example.tsgot.communityspacesagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityPlotRequest extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plot_request);

        Intent thisIntent = getIntent();
        thisIntent.getStringExtra(PLOT_REQUESTED_EXTRA_KEY);

    }
}
