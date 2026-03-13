package com.even.navigate.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.stub.StubApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/even/navigate/service/NavigationForegroundService;", "Landroid/app/Service;", "<init>", "()V", "a/a", "even_navigate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class NavigationForegroundService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11136b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f11137a = StubApp.getString2(8271);

    static {
        StubApp.interface11(3051);
    }

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native void onDestroy();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i3, int i10);
}
