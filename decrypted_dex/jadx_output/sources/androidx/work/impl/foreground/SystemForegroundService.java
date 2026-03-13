package androidx.work.impl.foreground;

import K.m;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0447w;
import i2.o;
import j2.k;
import java.util.UUID;
import q2.C1506a;
import s2.RunnableC1595a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SystemForegroundService extends AbstractServiceC0447w {

    /* renamed from: f, reason: collision with root package name */
    public static final String f10387f = o.g("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f10388b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10389c;

    /* renamed from: d, reason: collision with root package name */
    public C1506a f10390d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f10391e;

    public final void b() {
        this.f10388b = new Handler(Looper.getMainLooper());
        this.f10391e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1506a c1506a = new C1506a(getApplicationContext());
        this.f10390d = c1506a;
        if (c1506a.j == null) {
            c1506a.j = this;
        } else {
            o.e().d(C1506a.f19917k, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0447w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
    }

    @Override // androidx.lifecycle.AbstractServiceC0447w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f10390d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        super.onStartCommand(intent, i3, i10);
        boolean z2 = this.f10389c;
        String str = f10387f;
        if (z2) {
            o.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f10390d.g();
            b();
            this.f10389c = false;
        }
        if (intent == null) {
            return 3;
        }
        C1506a c1506a = this.f10390d;
        c1506a.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C1506a.f19917k;
        k kVar = c1506a.f19918a;
        if (equals) {
            o.e().f(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            int i11 = 17;
            c1506a.f19919b.j(new m(i11, c1506a, kVar.f15298e, intent.getStringExtra("KEY_WORKSPEC_ID"), false));
            c1506a.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c1506a.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            o.e().f(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra);
            kVar.getClass();
            kVar.f15299f.j(new RunnableC1595a(kVar, fromString, 0));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        o.e().f(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = c1506a.j;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f10389c = true;
        o.e().b(str, "All commands completed.", new Throwable[0]);
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf();
        return 3;
    }
}
