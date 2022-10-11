package com.example.implicitintends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText link,location,share;
    private Button btnLink, btnLocation, btnShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        link = findViewById(R.id.txtLink);
        location = findViewById(R.id.txtLocation);
        share = findViewById(R.id.txtShare);
        btnLink = findViewById(R.id.btnLink);
        btnLocation = findViewById(R.id.btnLocation);
        btnShare = findViewById(R.id.btnShare);
        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLink_Click();
            }


        });
        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLocation_Click();
            }
        });
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnShare_Click();
            }
        });


    }
    public void  btnLink_Click(){
        Uri url = Uri.parse(link.getText().toString());

        Intent intent = new Intent(Intent.ACTION_VIEW, url);
        startActivity(intent);
    }

    public void  btnLocation_Click(){

    }

    public void  btnShare_Click(){

    }
}