package Dc;

import Kc.C0101h;
import Kc.H;
import Kc.J;
import com.stub.StubApp;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class x implements H {

    /* renamed from: a, reason: collision with root package name */
    public final long f1662a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1663b;

    /* renamed from: c, reason: collision with root package name */
    public final C0101h f1664c;

    /* renamed from: d, reason: collision with root package name */
    public final C0101h f1665d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f1667f;

    public x(z this$0, long j, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f1667f = this$0;
        this.f1662a = j;
        this.f1663b = z2;
        this.f1664c = new C0101h();
        this.f1665d = new C0101h();
    }

    public final void a(long j) {
        byte[] bArr = xc.b.f23179a;
        this.f1667f.f1670b.p(j);
    }

    @Override // Kc.H
    public final J b() {
        return this.f1667f.f1678k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        z zVar = this.f1667f;
        synchronized (zVar) {
            this.f1666e = true;
            C0101h c0101h = this.f1665d;
            j = c0101h.f3819b;
            c0101h.skip(j);
            zVar.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (j > 0) {
            a(j);
        }
        this.f1667f.a();
    }

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        Throwable th;
        boolean z2;
        long j3;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(StubApp.getString2(25206), Long.valueOf(j)).toString());
        }
        while (true) {
            z zVar = this.f1667f;
            synchronized (zVar) {
                zVar.f1678k.i();
                try {
                    if (zVar.f() != null) {
                        th = zVar.f1681n;
                        if (th == null) {
                            EnumC0053b f10 = zVar.f();
                            Intrinsics.checkNotNull(f10);
                            th = new F(f10);
                        }
                    } else {
                        th = null;
                    }
                    if (this.f1666e) {
                        throw new IOException(StubApp.getString2("25165"));
                    }
                    C0101h c0101h = this.f1665d;
                    long j11 = c0101h.f3819b;
                    z2 = false;
                    if (j11 > j10) {
                        j3 = c0101h.n(Math.min(j, j11), sink);
                        long j12 = zVar.f1671c + j3;
                        zVar.f1671c = j12;
                        long j13 = j12 - zVar.f1672d;
                        if (th == null && j13 >= zVar.f1670b.f1633s.a() / 2) {
                            zVar.f1670b.C(zVar.f1669a, j13);
                            zVar.f1672d = zVar.f1671c;
                        }
                    } else {
                        if (!this.f1663b && th == null) {
                            zVar.l();
                            z2 = true;
                        }
                        j3 = -1;
                    }
                    zVar.f1678k.l();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    zVar.f1678k.l();
                    throw th2;
                }
            }
            if (!z2) {
                if (j3 != -1) {
                    a(j3);
                    return j3;
                }
                if (th == null) {
                    return -1L;
                }
                throw th;
            }
            j10 = 0;
        }
    }
}
