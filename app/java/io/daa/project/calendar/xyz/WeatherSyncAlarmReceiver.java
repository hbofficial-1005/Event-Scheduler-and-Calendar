//package io.daa.project.calendar.weather;
//
//import android.content.Context;
//import android.content.Intent;
//import android.support.v4.content.WakefulBroadcastReceiver;
//
///**
// * Broadcast receiver that triggers launching weather sync service
// */
//public class WeatherSyncAlarmReceiver extends WakefulBroadcastReceiver {
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        startWakefulService(context, new Intent(context, WeatherSyncService.class));
//    }
//}
