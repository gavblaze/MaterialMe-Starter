package com.example.android.materialme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import static com.example.android.materialme.MainActivity.EXTRA_IMG;
import static com.example.android.materialme.MainActivity.EXTRA_INFO;
import static com.example.android.materialme.MainActivity.EXTRA_TITLE;

public class DetailActivity extends AppCompatActivity {
    private TextView mDetailTitleTextView;
    private TextView mDetailInfoTextView;
    private ImageView mDetailImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mDetailTitleTextView = findViewById(R.id.titleDetail);
        mDetailInfoTextView = findViewById(R.id.subTitleDetail);
        mDetailImageView = findViewById(R.id.sport_image_detail);



        Intent intentThatStartedThisAcitivity = getIntent();
        String title = intentThatStartedThisAcitivity.getStringExtra(EXTRA_TITLE);
        String info = intentThatStartedThisAcitivity.getStringExtra(EXTRA_INFO);
        int image_resource = intentThatStartedThisAcitivity.getIntExtra(EXTRA_IMG, 0);
        mDetailTitleTextView.setText(title);
        mDetailInfoTextView.setText(info);
        Glide.with(this).load(image_resource).into(mDetailImageView);
    }
}
