package com.example.tsgot.communityspacesagain;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

//Test
public class MainActivity extends AppCompatActivity {
    TextView area;
    Button buttonShowContacts, buttonRequestPlot;
    ArrayList<Person> people = new ArrayList<>();
    public static final int PLOT_REQUESTED_EXTRA_KEY = 420;
    public static final String PLOT_REQUESTED_EXTRA_STRING = "hello";



    Person userPerson;
    String username = "username";
    int areaRequested = 0;
    CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        area = findViewById(R.id.textViewArea);
        setAReaTextView();
        buttonShowContacts = findViewById(R.id.buttonShowContacts);
        buttonRequestPlot = findViewById(R.id.buttonRequestPlot);
        userPerson = new Person(username, areaRequested, "", 5, "50999939399");
        userPerson = new Person(username, areaRequested, "", 5, "50999939399");
        people.add(new Person ("Lol",43,"Tomatoes",5,"5737573529"));
        people.add(new Person ("Fire",33,"Oranges",7,"5823847372"));
        people.add(new Person ("Water",23,"Bananas",11,"6598185682"));
        people.add(new Person ("Air",13,"Onions",2,"7691845727"));
        people.add(new Person ("Wind",53,"Potatoes",14,"57375987829"));




    }
    public void onPlotRequested(View v){
        Intent intent = new Intent(MainActivity.this, MainActivityPlotRequest.class);
        startActivityForResult(intent, PLOT_REQUESTED_EXTRA_KEY);
    }
    public void onContactsRequested(View v){
        Intent intent = new Intent(MainActivity.this, MainActivityContactList.class);
        startActivity(intent);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==PLOT_REQUESTED_EXTRA_KEY && resultCode== Activity.RESULT_OK){
            areaRequested = Integer.parseInt(data.getStringExtra(PLOT_REQUESTED_EXTRA_STRING));
            setAReaTextView();
        }
    }
    public void setAReaTextView(){
        area.setText("Area occupied " + areaRequested + " sq ft");
    }
}
