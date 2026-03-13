package l4;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l4.a1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1162a1 extends AbstractC1150F {

    /* renamed from: c, reason: collision with root package name */
    public volatile X0 f16347c;

    /* renamed from: d, reason: collision with root package name */
    public volatile X0 f16348d;

    /* renamed from: e, reason: collision with root package name */
    public X0 f16349e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f16350f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.W f16351g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f16352h;
    public volatile X0 j;

    /* renamed from: k, reason: collision with root package name */
    public X0 f16353k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16354l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f16355m;

    public C1162a1(C1200n0 c1200n0) {
        super(c1200n0);
        this.f16355m = new Object();
        this.f16350f = new ConcurrentHashMap();
    }

    @Override // l4.AbstractC1150F
    public final boolean n() {
        return false;
    }

    public final void o(X0 x02, boolean z2, long j) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        C1219x c1219x = c1200n0.f16548p;
        C1200n0.i(c1219x);
        c1200n0.f16545l.getClass();
        c1219x.n(SystemClock.elapsedRealtime());
        boolean z10 = x02 != null && x02.f16320d;
        q1 q1Var = c1200n0.f16543h;
        C1200n0.k(q1Var);
        if (!q1Var.f16595f.a(z10, z2, j) || x02 == null) {
            return;
        }
        x02.f16320d = false;
    }

    public final X0 p(com.google.android.gms.internal.measurement.W w10) {
        S3.D.h(w10);
        Integer valueOf = Integer.valueOf(w10.f11397a);
        ConcurrentHashMap concurrentHashMap = this.f16350f;
        X0 x02 = (X0) concurrentHashMap.get(valueOf);
        if (x02 == null) {
            String r8 = r(w10.f11398b);
            K1 k12 = ((C1200n0) this.f4728a).j;
            C1200n0.j(k12);
            X0 x03 = new X0(k12.g0(), null, r8);
            concurrentHashMap.put(valueOf, x03);
            x02 = x03;
        }
        return this.j != null ? this.j : x02;
    }

    public final X0 q(boolean z2) {
        l();
        k();
        if (!z2) {
            return this.f16349e;
        }
        X0 x02 = this.f16349e;
        return x02 != null ? x02 : this.f16353k;
    }

    public final String r(String str) {
        if (str == null) {
            return StubApp.getString2(20323);
        }
        String[] split = str.split(StubApp.getString2(1612));
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.f16539d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        c1200n0.f16539d.getClass();
        return str2.substring(0, 500);
    }

    public final void s(com.google.android.gms.internal.measurement.W w10, Bundle bundle) {
        Bundle bundle2;
        if (!((C1200n0) this.f4728a).f16539d.y() || bundle == null || (bundle2 = bundle.getBundle(StubApp.getString2(1177))) == null) {
            return;
        }
        this.f16350f.put(Integer.valueOf(w10.f11397a), new X0(bundle2.getLong(StubApp.getString2(290)), bundle2.getString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION)), bundle2.getString(StubApp.getString2(1176))));
    }

    public final void t(String str, X0 x02, boolean z2) {
        X0 x03;
        X0 x04 = this.f16347c == null ? this.f16348d : this.f16347c;
        if (x02.f16318b == null) {
            x03 = new X0(x02.f16317a, str != null ? r(str) : null, x02.f16319c, x02.f16321e, x02.f16322f);
        } else {
            x03 = x02;
        }
        this.f16348d = this.f16347c;
        this.f16347c = x03;
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.f16545l.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new Y0(this, x03, x04, elapsedRealtime, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(l4.X0 r18, l4.X0 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1162a1.u(l4.X0, l4.X0, long, boolean, android.os.Bundle):void");
    }
}
