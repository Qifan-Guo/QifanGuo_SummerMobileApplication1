package com.qifan.qifanguo_summermobileapplication1;

import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class NotificationActivity extends BaseActivity{
    String Channel_ID="100";

    @OnClick (R.id.smallNotification)
    public void showToast(View view){
        NotificationCompat.Builder mBuilder=new NotificationCompat.Builder(this,Channel_ID)
                .setSmallIcon(R.drawable.newmail)
                .setContentTitle("small-notification")
                .setContentText("Hello World")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);
        NotificationManagerCompat notificationManager=NotificationManagerCompat.from(this);
        notificationManager.notify(200,mBuilder.build());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        ButterKnife.bind(this);


    }
}
