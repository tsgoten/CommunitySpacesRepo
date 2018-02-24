package com.example.tsgot.communityspacesagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

//Test
public class MainActivity extends AppCompatActivity {
    TextView status;
    Button buttonShowContacts, buttonRequestPlot;
    ArrayList<String> people = new ArrayList<>();
    public static final String PLOT_REQUESTED_EXTRA_KEY = "domaindotcom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowContacts = findViewById(R.id.buttonShowContacts);
        buttonRequestPlot = findViewById(R.id.buttonRequestPlot);



    }
    public void onPlotRequested(View v){
        Intent intent = new Intent(MainActivity.this, MainActivityPlotRequest.class);
        intent.putExtra(PLOT_REQUESTED_EXTRA_KEY, people);

    }
}
