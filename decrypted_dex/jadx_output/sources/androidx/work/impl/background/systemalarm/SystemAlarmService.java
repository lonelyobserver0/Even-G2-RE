package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0447w;
import i2.o;
import java.util.HashMap;
import java.util.WeakHashMap;
import l2.h;
import s2.i;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SystemAlarmService extends AbstractServiceC0447w {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10380d = o.g("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public h f10381b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10382c;

    public final void b() {
        this.f10382c = true;
        o.e().b(f10380d, "All commands completed in dispatcher", new Throwable[0]);
        String str = i.f20723a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = i.f20724b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                o.e().h(i.f20723a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0447w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f10381b = hVar;
        if (hVar.f15880k != null) {
            o.e().d(h.f15871l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            hVar.f15880k = this;
        }
        this.f10382c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0447w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f10382c = true;
        this.f10381b.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        super.onStartCommand(intent, i3, i10);
        if (this.f10382c) {
            o.e().f(f10380d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f10381b.d();
            h hVar = new h(this);
            this.f10381b = hVar;
            if (hVar.f15880k != null) {
                o.e().d(h.f15871l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                hVar.f15880k = this;
            }
            this.f10382c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f10381b.a(intent, i10);
        return 3;
    }
}
