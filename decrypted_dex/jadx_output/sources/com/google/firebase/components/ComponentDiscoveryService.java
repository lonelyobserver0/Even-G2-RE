package com.google.firebase.components;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ComponentDiscoveryService extends Service {
    static {
        StubApp.interface11(4332);
    }

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);
}
