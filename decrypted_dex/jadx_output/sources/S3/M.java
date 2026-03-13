package S3;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class M implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6471a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f6472b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6473c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f6474d;

    /* renamed from: e, reason: collision with root package name */
    public final L f6475e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f6476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f6477g;

    public M(O o5, L l9) {
        this.f6477g = o5;
        this.f6475e = l9;
    }

    public static com.google.android.gms.common.b a(M m4, String str, Executor executor) {
        try {
            Intent a3 = m4.f6475e.a(m4.f6477g.f6483b);
            m4.f6472b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(W3.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                O o5 = m4.f6477g;
                boolean d8 = o5.f6485d.d(o5.f6483b, str, a3, m4, 4225, executor);
                m4.f6473c = d8;
                if (d8) {
                    m4.f6477g.f6484c.sendMessageDelayed(m4.f6477g.f6484c.obtainMessage(1, m4.f6475e), m4.f6477g.f6487f);
                    com.google.android.gms.common.b bVar = com.google.android.gms.common.b.f11174e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar;
                }
                m4.f6472b = 2;
                try {
                    O o10 = m4.f6477g;
                    o10.f6485d.c(o10.f6483b, m4);
                } catch (IllegalArgumentException unused) {
                }
                com.google.android.gms.common.b bVar2 = new com.google.android.gms.common.b(16);
                StrictMode.setVmPolicy(vmPolicy);
                return bVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (E e10) {
            return e10.f6454a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6477g.f6482a) {
            try {
                this.f6477g.f6484c.removeMessages(1, this.f6475e);
                this.f6474d = iBinder;
                this.f6476f = componentName;
                Iterator it = this.f6471a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f6472b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6477g.f6482a) {
            try {
                this.f6477g.f6484c.removeMessages(1, this.f6475e);
                this.f6474d = null;
                this.f6476f = componentName;
                Iterator it = this.f6471a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f6472b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
