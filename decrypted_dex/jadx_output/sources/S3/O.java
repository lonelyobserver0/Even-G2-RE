package S3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.concurrent.Executor;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f6479g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static O f6480h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f6481i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6482a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f6483b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c4.h f6484c;

    /* renamed from: d, reason: collision with root package name */
    public final V3.a f6485d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6486e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6487f;

    public O(Context context, Looper looper) {
        N n10 = new N(this);
        this.f6483b = StubApp.getOrigApplicationContext(context.getApplicationContext());
        c4.h hVar = new c4.h(looper, n10);
        Looper.getMainLooper();
        this.f6484c = hVar;
        this.f6485d = V3.a.b();
        this.f6486e = DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
        this.f6487f = 300000L;
    }

    public static O a(Context context) {
        synchronized (f6479g) {
            try {
                if (f6480h == null) {
                    f6480h = new O(StubApp.getOrigApplicationContext(context.getApplicationContext()), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6480h;
    }

    public final com.google.android.gms.common.b b(L l9, H h2, String str, Executor executor) {
        String string2 = StubApp.getString2(5958);
        synchronized (this.f6482a) {
            try {
                M m4 = (M) this.f6482a.get(l9);
                com.google.android.gms.common.b bVar = null;
                if (executor == null) {
                    executor = null;
                }
                if (m4 == null) {
                    m4 = new M(this, l9);
                    m4.f6471a.put(h2, h2);
                    bVar = M.a(m4, str, executor);
                    this.f6482a.put(l9, m4);
                } else {
                    this.f6484c.removeMessages(0, l9);
                    if (m4.f6471a.containsKey(h2)) {
                        throw new IllegalStateException(string2.concat(l9.toString()));
                    }
                    m4.f6471a.put(h2, h2);
                    int i3 = m4.f6472b;
                    if (i3 == 1) {
                        h2.onServiceConnected(m4.f6476f, m4.f6474d);
                    } else if (i3 == 2) {
                        bVar = M.a(m4, str, executor);
                    }
                }
                if (m4.f6473c) {
                    return com.google.android.gms.common.b.f11174e;
                }
                if (bVar == null) {
                    bVar = new com.google.android.gms.common.b(-1);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z2) {
        L l9 = new L(str, z2);
        String string2 = StubApp.getString2(5959);
        String string22 = StubApp.getString2(5960);
        D.i(serviceConnection, StubApp.getString2(5961));
        synchronized (this.f6482a) {
            try {
                M m4 = (M) this.f6482a.get(l9);
                if (m4 == null) {
                    throw new IllegalStateException(string22.concat(l9.toString()));
                }
                if (!m4.f6471a.containsKey(serviceConnection)) {
                    throw new IllegalStateException(string2.concat(l9.toString()));
                }
                m4.f6471a.remove(serviceConnection);
                if (m4.f6471a.isEmpty()) {
                    this.f6484c.sendMessageDelayed(this.f6484c.obtainMessage(0, l9), this.f6486e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
