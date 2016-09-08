package com.tes.vi.wifilistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.widget.Toast;

public class MyWifiReceiver extends BroadcastReceiver {
    public MyWifiReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String status = NetworkUtil.getConnectivityStatusString(context);

        Toast.makeText(context, status, Toast.LENGTH_LONG).show();

        if(status.equals("Wifi enabled")){

            getSSID(context);

            startActivity(context,"tes");
        }
    }

    private void startActivity(Context context,String ssid){
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //i.putExtra("ssid",ssid);
        context.startActivity(i);
    }

    public void getSSID(Context context){
        WifiManager wifiManager = (WifiManager) context.getSystemService(context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();

        String wInfo =" wifiInfo : " + wifiInfo.toString();
        String ssid = " SSID  : " + wifiInfo.getSSID();

        Toast.makeText(context, wInfo + "\n" + ssid, Toast.LENGTH_LONG).show();
        //Log.i("INFO", wInfo + "\n" + ssid);
        //startActivity(context,ssid+ "\n" + wInfo);

        //tes change before create new branch
    }
}
