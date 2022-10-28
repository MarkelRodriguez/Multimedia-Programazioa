package com.example.kalkulagailua;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText zenb1,zenb2;
    private Button hurrengoa;
    TextView emaitza;
    public static final String EXTRA_ZBK1 = "zbk1";
    public static final String EXTRA_ZBK2 = "zbk2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zenb1 = findViewById(R.id.txtZenbakia1);
        zenb2 =  findViewById(R.id.txtZenbakia2);
        hurrengoa = findViewById(R.id.btnHurrengoa);
        emaitza = findViewById(R.id.txtEmaitza);
        hurrengoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hurrengoa();
            }
        });
    }

    private void hurrengoa() {
        String zbk1 = String.valueOf(zenb1.getText());
        String zbk2 = String.valueOf(zenb2.getText());
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_ZBK1, zbk1);
        intent.putExtra(EXTRA_ZBK2, zbk2);
        activityResultLauncher.launch(intent);
    }

    ActivityResultLauncher<Intent> activityResultLauncher= registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if (result != null && result.getResultCode() == RESULT_OK) {
                if (result.getData() != null && result.getData().getStringExtra(SecondActivity.EXTRA_REPLY) != null) {
                    // There are no request codes

                    String str = result.getData().getStringExtra(SecondActivity.EXTRA_REPLY);
                    emaitza.setText(str);
                }
            }
        }
    });
}