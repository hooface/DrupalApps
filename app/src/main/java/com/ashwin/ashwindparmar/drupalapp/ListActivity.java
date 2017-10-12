package com.ashwin.ashwindparmar.drupalapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class ListActivity extends AppCompatActivity {

    public EditText etUsername;
    public EditText etEmail;
    public ImageView ivProfileUrl;

    public String jsonResponseString;
    public String userJSON;
    public JSONObject jsonUserObj;
    public String myPictureUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etEmail = (EditText) findViewById(R.id.etEmail);
        ivProfileUrl = (ImageView) findViewById(R.id.ivProfileUrl);

        try {
            jsonResponseString = getIntent().getStringExtra("JSON_RESPONSE");
            UserProfile userProfile = new UserProfile(jsonResponseString);

            etUsername.setText(userProfile.getMail());
            etEmail.setText(userProfile.getMail());
            Picasso.with(ListActivity.this).load(userProfile.getPictureUrl()).fit().into(ivProfileUrl);

        } catch (JSONException e) {
            Toast.makeText(ListActivity.this, "JSONException: " + e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (RuntimeException e) {
            Toast.makeText(ListActivity.this, "RuntimeException: " + e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (Exception e) {
            Toast.makeText(ListActivity.this, "Exception: " + e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }
}
