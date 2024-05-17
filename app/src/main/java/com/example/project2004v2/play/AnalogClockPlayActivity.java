package com.example.project2004v2.play;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.project2004v2.AnalogClockActivity;
import com.example.project2004v2.R;

public class AnalogClockPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analog_clock_play);

        Button btnGoBack = findViewById(R.id.btn_go_back);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnalogClockPlayActivity.this, AnalogClockActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
