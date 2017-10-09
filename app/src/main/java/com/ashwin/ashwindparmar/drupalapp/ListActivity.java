package com.ashwin.ashwindparmar.drupalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    public TextView txtSessID;
    public TextView txtSessName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        txtSessID = (TextView) findViewById(R.id.txtSessID);
        txtSessName = (TextView) findViewById(R.id.txtSessName);

        txtSessID.setText(getIntent().getStringExtra("SESSION_ID"));
        txtSessName.setText(getIntent().getStringExtra("SESSION_NAME"));

    }
}
