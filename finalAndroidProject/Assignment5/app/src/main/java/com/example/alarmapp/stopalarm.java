package com.example.alarmapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class stopalarm extends BroadcastReceiver{
    public void onReceive(Context context , Intent intent){
        if(AlarmService.mediaPlayer != null){
            AlarmService.mediaPlayer.stop();
            AlarmService.mediaPlayer.release();
            AlarmService.mediaPlayer = null;
        }
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.cancel(1);
    }
}
