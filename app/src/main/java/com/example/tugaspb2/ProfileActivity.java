package com.example.tugaspb2;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import  org.w3c.dom.Text;


public class ProfileActivity extends AppCompatActivity {
    ImageView imagee;
    TextView username, pengaruh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        imagee=(ImageView)findViewById(R.id.gambar);
        username=(TextView)findViewById(R.id.textt);
        pengaruh=(TextView)findViewById(R.id.pengaruh);


        imagee.setImageResource(getIntent().getIntExtra("image", 0));
        username.setText(getIntent().getStringExtra("username"));
        pengaruh.setText(getIntent().getStringExtra("pengaruh"));
    }
}
