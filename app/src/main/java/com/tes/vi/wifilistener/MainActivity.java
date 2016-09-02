package com.tes.vi.wifilistener;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_hello = (TextView)findViewById(R.id.tv_hello);

        //String ssid = getIntent().getExtras().getString("ssid");
        //tv_hello.setText(ssid);
    }


}
