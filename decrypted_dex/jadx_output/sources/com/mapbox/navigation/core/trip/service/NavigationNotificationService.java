package com.mapbox.navigation.core.trip.service;

import C2.d;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.stub.StubApp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mapbox/navigation/core/trip/service/NavigationNotificationService;", "Landroid/app/Service;", "<init>", "()V", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class NavigationNotificationService extends Service {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12527c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d f12528a = new d(this, 22);

    /* renamed from: b, reason: collision with root package name */
    public final u5.d f12529b = new u5.d(1);

    static {
        StubApp.interface11(6583);
    }

    @Override // android.app.Service
    public final native void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onDestroy();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i3, int i10);
}
