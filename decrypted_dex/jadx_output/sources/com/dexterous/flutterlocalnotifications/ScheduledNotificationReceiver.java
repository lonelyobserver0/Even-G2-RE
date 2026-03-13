package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.google.gson.reflect.TypeToken;
import com.stub.StubApp;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ScheduledNotificationReceiver extends BroadcastReceiver {
    private static final String TAG = StubApp.getString2(9892);

    public class a extends TypeToken<NotificationDetails> {
    }

    static {
        StubApp.interface11(3011);
    }

    @Override // android.content.BroadcastReceiver
    public native void onReceive(Context context, Intent intent);
}
