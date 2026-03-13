package com.google.firebase.sessions;

import H5.b0;
import android.app.Service;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Messenger;
import com.stub.StubApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "H5/b0", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f12071a = new HandlerThread(StubApp.getString2(12602));

    /* renamed from: b, reason: collision with root package name */
    public b0 f12072b;

    /* renamed from: c, reason: collision with root package name */
    public Messenger f12073c;

    static {
        StubApp.interface11(4352);
    }

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native void onDestroy();
}
