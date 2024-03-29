package com.example.tsgot.communityspacesagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityContactList extends MainActivity {

    ListView contactListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contact_list);

        contactListView = findViewById(R.id.contactList);

        myAdapter = new CustomAdapter(this, R.layout.list_view, people);
        contactListView.setAdapter(myAdapter);
        contactListView.setClickable(false);

    }
}
