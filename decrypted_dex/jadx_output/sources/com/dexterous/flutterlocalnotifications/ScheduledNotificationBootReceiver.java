package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.stub.StubApp;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ScheduledNotificationBootReceiver extends BroadcastReceiver {
    static {
        StubApp.interface11(3009);
    }

    @Override // android.content.BroadcastReceiver
    public native void onReceive(Context context, Intent intent);
}
