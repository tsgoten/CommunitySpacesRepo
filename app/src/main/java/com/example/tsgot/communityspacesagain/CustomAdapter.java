package com.example.tsgot.communityspacesagain;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by tsgot on 2/24/2018.
 */

public class CustomAdapter extends ArrayAdapter<Person> {

    Context context;
    List list;

    public CustomAdapter(@NonNull Context context, int resource, List<Person> objects) {
        super(context, resource);
        this.context = context;
        list = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater;
        layoutInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        return view;
    }
}
