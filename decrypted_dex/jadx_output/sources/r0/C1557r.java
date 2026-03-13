package r0;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: r0.r, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1557r {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f20184b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20185a;

    public C1557r(Handler handler) {
        this.f20185a = handler;
    }

    public static C1556q b() {
        C1556q c1556q;
        ArrayList arrayList = f20184b;
        synchronized (arrayList) {
            try {
                c1556q = arrayList.isEmpty() ? new C1556q() : (C1556q) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1556q;
    }

    public final C1556q a(int i3, Object obj) {
        C1556q b2 = b();
        b2.f20183a = this.f20185a.obtainMessage(i3, obj);
        return b2;
    }

    public final boolean c(Runnable runnable) {
        return this.f20185a.post(runnable);
    }

    public final void d(int i3) {
        AbstractC1550k.c(i3 != 0);
        this.f20185a.removeMessages(i3);
    }

    public final boolean e(int i3) {
        return this.f20185a.sendEmptyMessage(i3);
    }
}
