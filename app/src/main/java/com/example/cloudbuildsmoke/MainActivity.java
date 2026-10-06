package com.example.cloudbuildsmoke;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        text.setText("EMAS Cloud Build Smoke - 2026-10-06");
        text.setTextSize(24);
        text.setPadding(32, 64, 32, 32);
        setContentView(text);
    }
}
