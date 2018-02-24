package com.example.tsgot.communityspacesagain;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityPlotRequest extends MainActivity {

    EditText editTextAreaRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plot_request);

        final Intent thisIntent = getIntent();
        thisIntent.getStringExtra(PLOT_REQUESTED_EXTRA_KEY);


        editTextAreaRequest = findViewById(R.id.editText);
        editTextAreaRequest.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_DONE) {
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(editTextAreaRequest.getWindowToken(), 0);
                    finish();
                    return true;

                }
                return false;
            }
        });
    }

}
