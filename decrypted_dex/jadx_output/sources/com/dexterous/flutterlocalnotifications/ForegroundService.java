package com.dexterous.flutterlocalnotifications;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ForegroundService extends Service {
    static {
        StubApp.interface11(3007);
    }

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i3, int i10);
}
