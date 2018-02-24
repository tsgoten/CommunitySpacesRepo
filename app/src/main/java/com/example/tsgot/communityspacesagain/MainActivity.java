package com.example.tsgot.communityspacesagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

//Test
public class MainActivity extends AppCompatActivity {
    TextView status;
    Button buttonShowContacts, buttonRequestPlot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowContacts = findViewById(R.id.buttonShowContacts);
        buttonRequestPlot = findViewById(R.id.buttonRequestPlot);


    }
}
