package com.ashwin.ashwindparmar.drupalapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class ListActivity extends AppCompatActivity {

    public TextView txtSessID;
    public TextView txtSessName;
    public EditText jsonResponse;
    public ImageView myPhoto;
    public String userJSON;
    public JSONObject jsonUserObj;
    public String myPictureUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        userJSON = getIntent().getStringExtra("JSON_USER_RESPONSE");
        try {
            jsonUserObj = new JSONObject(userJSON);
            JSONObject picture = new JSONObject(jsonUserObj.getString("picture"));
            myPictureUrl = picture.getString("url");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        txtSessID = (TextView) findViewById(R.id.txtSessID);
        txtSessName = (TextView) findViewById(R.id.txtSessName);
        jsonResponse = (EditText) findViewById(R.id.jsonResponse);
        myPhoto = (ImageView) findViewById(R.id.imgPhoto);

        txtSessID.setText(getIntent().getStringExtra("SESSION_ID"));
        txtSessName.setText(getIntent().getStringExtra("SESSION_NAME"));
        jsonResponse.setText("Response here: " + myPictureUrl);

        Picasso.with(ListActivity.this).load(myPictureUrl).fit().into(myPhoto);

    }
}
