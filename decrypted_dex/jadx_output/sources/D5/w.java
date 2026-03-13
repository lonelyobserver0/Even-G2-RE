package D5;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0592b0;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapView;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1466d;

    public /* synthetic */ w(MapView.OnSnapshotReady onSnapshotReady, MapboxRenderer mapboxRenderer, boolean z2) {
        this.f1463a = 1;
        this.f1465c = onSnapshotReady;
        this.f1466d = mapboxRenderer;
        this.f1464b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        switch (this.f1463a) {
            case 0:
                Context context = (Context) this.f1465c;
                q4.k kVar = (q4.k) this.f1466d;
                String string2 = StubApp.getString2(1492);
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = Ec.d.z(context).edit();
                        edit.putBoolean(StubApp.getString2("1493"), true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f1464b) {
                            notificationManager.setNotificationDelegate(StubApp.getString2(0));
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        Log.e(StubApp.getString2("493"), string2 + context.getPackageName());
                    }
                    return;
                } finally {
                    kVar.d(null);
                }
            case 1:
                MapboxRenderer.snapshot$lambda$4((MapView.OnSnapshotReady) this.f1465c, (MapboxRenderer) this.f1466d, this.f1464b);
                return;
            default:
                hb.i iVar = (hb.i) this.f1465c;
                boolean z2 = this.f1464b;
                q4.k kVar2 = (q4.k) this.f1466d;
                try {
                    FirebaseAnalytics firebaseAnalytics = iVar.f14495a;
                    if (firebaseAnalytics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics = null;
                    }
                    Boolean valueOf = Boolean.valueOf(z2);
                    C0657o0 c0657o0 = firebaseAnalytics.f12042a;
                    c0657o0.getClass();
                    c0657o0.a(new C0592b0(c0657o0, valueOf));
                    kVar2.b(null);
                    return;
                } catch (Exception e10) {
                    kVar2.a(e10);
                    return;
                }
        }
    }

    public /* synthetic */ w(Object obj, boolean z2, q4.k kVar, int i3) {
        this.f1463a = i3;
        this.f1465c = obj;
        this.f1464b = z2;
        this.f1466d = kVar;
    }
}
