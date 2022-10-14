package com.example.kalkulagailua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button hurrengoa = findViewById(R.id.btnHurrengoa);


        hurrengoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                startActivityForResult(intent, 0);

                EditText Zenb1 = findViewById(R.id.txtZenbaki1);
                int zenbakia1 = Integer.parseInt(Zenb1.getText().toString());
                EditText Zenb2 =  findViewById(R.id.txtZenbaki1);
                int zenbakia2 = Integer.parseInt(Zenb2.getText().toString());

                intent.putExtra("zbk1",zenbakia1);
                intent.putExtra("zbk2",zenbakia2);
                int emaitza = getIntent().getExtras().getInt("emaitza");


                startActivity(intent);

            }





        });


    }

}