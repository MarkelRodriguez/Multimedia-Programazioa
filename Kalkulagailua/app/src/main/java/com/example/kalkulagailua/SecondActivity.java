package com.example.kalkulagailua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button gehi = findViewById(R.id.btnGehi);
        Button ken = findViewById(R.id.btnKen);
        gehi.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
                int zenbaki1 = getIntent().getExtras().getInt("zbk1");
                int zenbaki2 = getIntent().getExtras().getInt("zbk2");
                int emaitza = zenbaki1 + zenbaki2;

                intent.putExtra("emaitza", emaitza);
                startActivity(intent);

            }
        });
        ken.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
                int zenbaki1 = getIntent().getExtras().getInt("zbk1");
                int zenbaki2 = getIntent().getExtras().getInt("zbk2");
                int emaitza = zenbaki1 - zenbaki2;
                intent.putExtra("emaitza", emaitza);
                startActivity(intent);
            }
        });

    }
}