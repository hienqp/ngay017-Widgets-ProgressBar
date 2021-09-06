package com.hienqp.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button buttonDownload;
    ProgressBar progressBarDownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDownload = (Button) findViewById(R.id.button_TAIXUONG);
        progressBarDownload = (ProgressBar) findViewById(R.id.progressBar_TAIXUONG);

        buttonDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentProgress = progressBarDownload.getProgress();
                if (currentProgress >= progressBarDownload.getMax()) {
                    currentProgress = 0;
                }
                progressBarDownload.setProgress(currentProgress + 10);
            }
        });
    }
}