package sb;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.stub.StubApp;
import f4.C0879c;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1637b {

    /* renamed from: a, reason: collision with root package name */
    public final C0879c f20931a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f20932b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20933c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f20934d;

    /* renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f20935e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f20936f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f20937g;

    /* renamed from: h, reason: collision with root package name */
    public final no.nordicsemi.android.ble.v f20938h;

    /* renamed from: i, reason: collision with root package name */
    public long f20939i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final long f20940k;

    public C1637b(C0879c finalizationListener) {
        Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
        this.f20931a = finalizationListener;
        this.f20932b = new WeakHashMap();
        this.f20933c = new HashMap();
        this.f20934d = new HashMap();
        this.f20935e = new ReferenceQueue();
        this.f20936f = new HashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f20937g = handler;
        no.nordicsemi.android.ble.v vVar = new no.nordicsemi.android.ble.v(this, 2);
        this.f20938h = vVar;
        this.f20939i = 65536L;
        this.f20940k = 3000L;
        handler.postDelayed(vVar, 3000L);
    }

    public final void a(long j, Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        f();
        c(j, instance);
    }

    public final long b(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        f();
        if (d(instance)) {
            throw new IllegalArgumentException(Xa.h.p(StubApp.getString2(23263), instance.getClass(), StubApp.getString2(23264)).toString());
        }
        long j = this.f20939i;
        this.f20939i = 1 + j;
        c(j, instance);
        return j;
    }

    public final void c(long j, Object obj) {
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(23266)).toString());
        }
        HashMap hashMap = this.f20933c;
        if (hashMap.containsKey(Long.valueOf(j))) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(23265)).toString());
        }
        WeakReference weakReference = new WeakReference(obj, this.f20935e);
        this.f20932b.put(obj, Long.valueOf(j));
        hashMap.put(Long.valueOf(j), weakReference);
        this.f20936f.put(weakReference, Long.valueOf(j));
        this.f20934d.put(Long.valueOf(j), obj);
    }

    public final boolean d(Object obj) {
        f();
        return this.f20932b.containsKey(obj);
    }

    public final Object e(long j) {
        f();
        WeakReference weakReference = (WeakReference) this.f20933c.get(Long.valueOf(j));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void f() {
        if (this.j) {
            Log.w(StubApp.getString2(23267), StubApp.getString2(23268));
        }
    }
}
