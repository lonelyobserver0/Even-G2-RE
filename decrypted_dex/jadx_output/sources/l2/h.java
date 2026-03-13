package l2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.stub.StubApp;
import i2.o;
import j2.C1084b;
import j2.InterfaceC1083a;
import j2.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import s2.i;
import s2.p;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements InterfaceC1083a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f15871l = o.g(StubApp.getString2(19365));

    /* renamed from: a, reason: collision with root package name */
    public final Context f15872a;

    /* renamed from: b, reason: collision with root package name */
    public final C1608a f15873b;

    /* renamed from: c, reason: collision with root package name */
    public final p f15874c;

    /* renamed from: d, reason: collision with root package name */
    public final C1084b f15875d;

    /* renamed from: e, reason: collision with root package name */
    public final k f15876e;

    /* renamed from: f, reason: collision with root package name */
    public final b f15877f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f15878g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f15879h;
    public Intent j;

    /* renamed from: k, reason: collision with root package name */
    public SystemAlarmService f15880k;

    public h(SystemAlarmService systemAlarmService) {
        Context origApplicationContext = StubApp.getOrigApplicationContext(systemAlarmService.getApplicationContext());
        this.f15872a = origApplicationContext;
        this.f15877f = new b(origApplicationContext);
        this.f15874c = new p();
        k L10 = k.L(systemAlarmService);
        this.f15876e = L10;
        C1084b c1084b = L10.f15301h;
        this.f15875d = c1084b;
        this.f15873b = L10.f15299f;
        c1084b.a(this);
        this.f15879h = new ArrayList();
        this.j = null;
        this.f15878g = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i3) {
        o e10 = o.e();
        String str = f15871l;
        e10.b(str, String.format(StubApp.getString2(19366), intent, Integer.valueOf(i3)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.e().h(str, StubApp.getString2(19367), new Throwable[0]);
            return;
        }
        if (StubApp.getString2(19318).equals(action)) {
            String string2 = StubApp.getString2(19318);
            b();
            synchronized (this.f15879h) {
                try {
                    Iterator it = this.f15879h.iterator();
                    while (it.hasNext()) {
                        if (string2.equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra(StubApp.getString2(19361), i3);
        synchronized (this.f15879h) {
            try {
                boolean isEmpty = this.f15879h.isEmpty();
                this.f15879h.add(intent);
                if (isEmpty) {
                    f();
                }
            } finally {
            }
        }
    }

    public final void b() {
        if (this.f15878g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(StubApp.getString2(19368));
        }
    }

    @Override // j2.InterfaceC1083a
    public final void c(String str, boolean z2) {
        int i3 = 0;
        String str2 = b.f15847d;
        Intent intent = new Intent(this.f15872a, (Class<?>) SystemAlarmService.class);
        intent.setAction(StubApp.getString2(19334));
        intent.putExtra(StubApp.getString2(19316), str);
        intent.putExtra(StubApp.getString2(19335), z2);
        e(new g(i3, i3, this, intent));
    }

    public final void d() {
        o.e().b(f15871l, StubApp.getString2(19369), new Throwable[0]);
        this.f15875d.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f15874c.f20741a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f15880k = null;
    }

    public final void e(Runnable runnable) {
        this.f15878g.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock a3 = i.a(this.f15872a, StubApp.getString2(19370));
        try {
            a3.acquire();
            this.f15876e.f15299f.j(new f(this, 0));
        } finally {
            a3.release();
        }
    }
}
