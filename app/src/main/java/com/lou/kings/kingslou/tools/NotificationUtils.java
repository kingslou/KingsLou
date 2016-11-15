package com.lou.kings.kingslou.tools;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.lou.kings.kingslou.App;
import com.lou.kings.kingslou.MessageActivity;
import com.lou.kings.kingslou.R;
import com.lou.kings.kingslou.webview.WebViewActivity;

/**
 * 通知栏工具类
 * Created by YiMuTian on 2016/7/6.
 */
public class NotificationUtils {

    public static void showNotificationWithText(String title, String content, int mId) {

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(App.getAppInstance())
                .setSmallIcon(R.drawable.common_ic_googleplayservices)
                .setContentTitle(title)
                .setContentText(content);
        NotificationManager mNotificationManager =
                (NotificationManager) App.getAppInstance().getSystemService(App.getAppInstance().NOTIFICATION_SERVICE);
        // mId allows you to update the notification later on.
        mNotificationManager.notify(mId, mBuilder.build());
    }

    public static void createNotification(int nId, int iconRes, String title, String body) {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(
                App.getAppInstance()).setSmallIcon(iconRes)
                .setContentTitle(title)
                .setContentText(body);
        NotificationManager mNotificationManager =
                (NotificationManager) App.getAppInstance().getSystemService(App.getAppInstance().NOTIFICATION_SERVICE);
        // mId allows you to update the notification later on.
        mNotificationManager.notify(nId, mBuilder.build());
    }

    public static void cancelNotification(int nId) {
        NotificationManager notificationManager =
                (NotificationManager) App.getAppInstance().getSystemService(App.getAppInstance().NOTIFICATION_SERVICE);
        notificationManager.cancel(nId);
    }

    public static void pendIntentNotification() {
        // First let's define the intent to trigger when notification is selected
        // Start out by creating a normal intent (in this case to open an activity)
        Intent intent = new Intent(App.getAppInstance(), WebViewActivity.class);
        // Next, let's turn this into a PendingIntent using
        //   public static PendingIntent getActivity(Context context, int requestCode,
        //       Intent intent, int flags)
        int requestID = (int) System.currentTimeMillis(); //unique requestID to differentiate between various notification with same NotifId
        int flags = PendingIntent.FLAG_CANCEL_CURRENT; // cancel old intent and create new one
        PendingIntent pIntent = PendingIntent.getActivity(App.getAppInstance(), requestID, intent, flags);
        // Now we can attach this to the notification using setContentIntent
        Notification noti =
                new NotificationCompat.Builder(App.getAppInstance())
                        .setSmallIcon(R.drawable.common_ic_googleplayservices)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!")
                        .setContentIntent(pIntent)
                        .addAction(R.drawable.common_ic_googleplayservices, "Share", pIntent)
                        .addAction(R.drawable.common_ic_googleplayservices, "Ignore", pIntent).build();

        // Hide the notification after its selected
        //        noti.setAutoCancel(true);
        NotificationManager mNotificationManager =
                (NotificationManager) App.getAppInstance().getSystemService(App.getAppInstance().NOTIFICATION_SERVICE);
        // mId allows you to update the notification later on.
        mNotificationManager.notify(0, noti);
    }
}
