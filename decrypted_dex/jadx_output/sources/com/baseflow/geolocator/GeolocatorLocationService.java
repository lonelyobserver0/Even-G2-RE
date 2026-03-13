package com.baseflow.geolocator;

import A2.b;
import C2.c;
import C2.h;
import C2.j;
import Xa.AbstractActivityC0364d;
import Z9.C;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.os.PowerManager;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GeolocatorLocationService extends Service {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f11088l = 0;

    /* renamed from: g, reason: collision with root package name */
    public j f11095g;

    /* renamed from: a, reason: collision with root package name */
    public final b f11089a = new b(this);

    /* renamed from: b, reason: collision with root package name */
    public boolean f11090b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f11091c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f11092d = 0;

    /* renamed from: e, reason: collision with root package name */
    public AbstractActivityC0364d f11093e = null;

    /* renamed from: f, reason: collision with root package name */
    public h f11094f = null;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f11096h = null;
    public WifiManager.WifiLock j = null;

    /* renamed from: k, reason: collision with root package name */
    public C f11097k = null;

    static {
        StubApp.interface11(2970);
    }

    public final native void a(c cVar);

    public final native void b();

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native void onDestroy();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i3, int i10);

    @Override // android.app.Service
    public final native boolean onUnbind(Intent intent);
}
