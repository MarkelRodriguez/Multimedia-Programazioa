package com.example.kalkulagailua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "Emaitza";
    int emaitza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button gehi = findViewById(R.id.btnGehi);
        Button ken = findViewById(R.id.btnKen);

        //eragiketa 0 = bider


        ken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eragiketa(0);
                returnReply();
            }

        });

        gehi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eragiketa(1);
                returnReply();
            }
        });
    }

    private void eragiketa(int i) {



        Intent intent = getIntent();
        String zenbakia1 = intent.getStringExtra(MainActivity.EXTRA_ZBK1);

        String zenbakia2 = intent.getStringExtra(MainActivity.EXTRA_ZBK2);

        switch(i)
        {

            case 0:emaitza = Integer.parseInt(zenbakia1) - Integer.parseInt(zenbakia2);
                break;
            case 1:emaitza = Integer.parseInt(zenbakia1) + Integer.parseInt(zenbakia2);
                break;
        }

    }
    public void returnReply(){
        Intent replyintent = new Intent();
        replyintent.putExtra(EXTRA_REPLY,String.valueOf(emaitza));
        setResult(RESULT_OK,replyintent);
        finish();
    }
}