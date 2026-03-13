package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractServiceC0447w extends Service implements InterfaceC0444t {

    /* renamed from: a, reason: collision with root package name */
    public final a5.c f9932a = new a5.c(this);

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        return (C0446v) this.f9932a.f9282b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        a5.c cVar = this.f9932a;
        cVar.getClass();
        cVar.H(EnumC0438m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        a5.c cVar = this.f9932a;
        cVar.getClass();
        cVar.H(EnumC0438m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a5.c cVar = this.f9932a;
        cVar.getClass();
        cVar.H(EnumC0438m.ON_STOP);
        cVar.H(EnumC0438m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i3) {
        a5.c cVar = this.f9932a;
        cVar.getClass();
        cVar.H(EnumC0438m.ON_START);
        super.onStart(intent, i3);
    }
}
