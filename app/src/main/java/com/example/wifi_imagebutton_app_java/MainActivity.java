package com.example.wifi_imagebutton_app_java;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
    private boolean wifiState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);

        if (!wifiState) {
            wifiManager.setWifiEnabled(true);
            wifiState = true;
            imageButton.setImageResource(R.drawable.on);
        } else {
            wifiManager.setWifiEnabled(false);
            wifiState = false;
            imageButton.setImageResource(R.drawable.off);
        }
    }
}