package Dc;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f1669a;

    /* renamed from: b, reason: collision with root package name */
    public final r f1670b;

    /* renamed from: c, reason: collision with root package name */
    public long f1671c;

    /* renamed from: d, reason: collision with root package name */
    public long f1672d;

    /* renamed from: e, reason: collision with root package name */
    public long f1673e;

    /* renamed from: f, reason: collision with root package name */
    public long f1674f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1675g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1676h;

    /* renamed from: i, reason: collision with root package name */
    public final x f1677i;
    public final w j;

    /* renamed from: k, reason: collision with root package name */
    public final y f1678k;

    /* renamed from: l, reason: collision with root package name */
    public final y f1679l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0053b f1680m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f1681n;

    public z(int i3, r connection, boolean z2, boolean z10, wc.s sVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f1669a = i3;
        this.f1670b = connection;
        this.f1674f = connection.f1634t.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1675g = arrayDeque;
        this.f1677i = new x(this, connection.f1633s.a(), z10);
        this.j = new w(this, z2);
        this.f1678k = new y(this);
        this.f1679l = new y(this);
        if (sVar == null) {
            if (!h()) {
                throw new IllegalStateException(StubApp.getString2(25208));
            }
        } else {
            if (h()) {
                throw new IllegalStateException(StubApp.getString2(25207));
            }
            arrayDeque.add(sVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean i3;
        byte[] bArr = xc.b.f23179a;
        synchronized (this) {
            x xVar = this.f1677i;
            if (!xVar.f1663b && xVar.f1666e) {
                w wVar = this.j;
                if (wVar.f1658a || wVar.f1660c) {
                    z2 = true;
                    i3 = i();
                    Unit unit = Unit.INSTANCE;
                }
            }
            z2 = false;
            i3 = i();
            Unit unit2 = Unit.INSTANCE;
        }
        if (z2) {
            c(EnumC0053b.f1554g, null);
        } else {
            if (i3) {
                return;
            }
            this.f1670b.h(this.f1669a);
        }
    }

    public final void b() {
        w wVar = this.j;
        if (wVar.f1660c) {
            throw new IOException(StubApp.getString2(25165));
        }
        if (wVar.f1658a) {
            throw new IOException(StubApp.getString2(25209));
        }
        if (this.f1680m != null) {
            IOException iOException = this.f1681n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0053b enumC0053b = this.f1680m;
            Intrinsics.checkNotNull(enumC0053b);
            throw new F(enumC0053b);
        }
    }

    public final void c(EnumC0053b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            r rVar = this.f1670b;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            rVar.f1615A.v(this.f1669a, statusCode);
        }
    }

    public final boolean d(EnumC0053b enumC0053b, IOException iOException) {
        byte[] bArr = xc.b.f23179a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f1677i.f1663b && this.j.f1658a) {
                return false;
            }
            this.f1680m = enumC0053b;
            this.f1681n = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.f1670b.h(this.f1669a);
            return true;
        }
    }

    public final void e(EnumC0053b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f1670b.A(this.f1669a, errorCode);
        }
    }

    public final synchronized EnumC0053b f() {
        return this.f1680m;
    }

    public final w g() {
        synchronized (this) {
            try {
                if (!this.f1676h && !h()) {
                    throw new IllegalStateException(StubApp.getString2("25210"));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.j;
    }

    public final boolean h() {
        boolean z2 = (this.f1669a & 1) == 1;
        this.f1670b.getClass();
        return true == z2;
    }

    public final synchronized boolean i() {
        if (this.f1680m != null) {
            return false;
        }
        x xVar = this.f1677i;
        if (xVar.f1663b || xVar.f1666e) {
            w wVar = this.j;
            if (wVar.f1658a || wVar.f1660c) {
                if (this.f1676h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(wc.s r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = xc.b.f23179a
            monitor-enter(r2)
            boolean r0 = r2.f1676h     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            if (r4 != 0) goto L10
            goto L18
        L10:
            Dc.x r3 = r2.f1677i     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            goto L39
        L18:
            r2.f1676h = r1     // Catch: java.lang.Throwable -> L16
            java.util.ArrayDeque r0 = r2.f1675g     // Catch: java.lang.Throwable -> L16
            r0.add(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r4 == 0) goto L25
            Dc.x r3 = r2.f1677i     // Catch: java.lang.Throwable -> L16
            r3.f1663b = r1     // Catch: java.lang.Throwable -> L16
        L25:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L16
            r2.notifyAll()     // Catch: java.lang.Throwable -> L16
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            if (r3 != 0) goto L38
            Dc.r r3 = r2.f1670b
            int r4 = r2.f1669a
            r3.h(r4)
        L38:
            return
        L39:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Dc.z.j(wc.s, boolean):void");
    }

    public final synchronized void k(EnumC0053b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f1680m == null) {
            this.f1680m = errorCode;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
