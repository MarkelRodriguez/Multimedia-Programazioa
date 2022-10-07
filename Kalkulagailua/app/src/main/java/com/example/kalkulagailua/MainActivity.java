package com.example.kalkulagailua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnHurrengoa_onClick(){
         Zenb1 = (EditText)findViewById(R.id.txtZenbaki1);

    }
}