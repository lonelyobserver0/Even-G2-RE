package Dc;

import Kc.C0101h;
import Kc.J;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class w implements Kc.F {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1658a;

    /* renamed from: b, reason: collision with root package name */
    public final C0101h f1659b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f1661d;

    public w(z this$0, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f1661d = this$0;
        this.f1658a = z2;
        this.f1659b = new C0101h();
    }

    @Override // Kc.F
    public final void E(long j, C0101h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = xc.b.f23179a;
        C0101h c0101h = this.f1659b;
        c0101h.E(j, source);
        while (c0101h.f3819b >= 16384) {
            a(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z2) {
        long min;
        boolean z10;
        z zVar = this.f1661d;
        synchronized (zVar) {
            try {
                zVar.f1679l.i();
                while (zVar.f1673e >= zVar.f1674f && !this.f1658a && !this.f1660c && zVar.f() == null) {
                    try {
                        zVar.l();
                    } catch (Throwable th) {
                        zVar.f1679l.l();
                        throw th;
                    }
                }
                zVar.f1679l.l();
                zVar.b();
                min = Math.min(zVar.f1674f - zVar.f1673e, this.f1659b.f3819b);
                zVar.f1673e += min;
                z10 = z2 && min == this.f1659b.f3819b;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f1661d.f1679l.i();
        try {
            z zVar2 = this.f1661d;
            zVar2.f1670b.v(zVar2.f1669a, z10, this.f1659b, min);
        } finally {
            this.f1661d.f1679l.l();
        }
    }

    @Override // Kc.F
    public final J b() {
        return this.f1661d.f1679l;
    }

    @Override // Kc.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f1661d;
        byte[] bArr = xc.b.f23179a;
        synchronized (zVar) {
            if (this.f1660c) {
                return;
            }
            boolean z2 = zVar.f() == null;
            Unit unit = Unit.INSTANCE;
            z zVar2 = this.f1661d;
            if (!zVar2.j.f1658a) {
                if (this.f1659b.f3819b > 0) {
                    while (this.f1659b.f3819b > 0) {
                        a(true);
                    }
                } else if (z2) {
                    zVar2.f1670b.v(zVar2.f1669a, true, null, 0L);
                }
            }
            synchronized (this.f1661d) {
                this.f1660c = true;
                Unit unit2 = Unit.INSTANCE;
            }
            this.f1661d.f1670b.flush();
            this.f1661d.a();
        }
    }

    @Override // Kc.F, java.io.Flushable
    public final void flush() {
        z zVar = this.f1661d;
        byte[] bArr = xc.b.f23179a;
        synchronized (zVar) {
            zVar.b();
            Unit unit = Unit.INSTANCE;
        }
        while (this.f1659b.f3819b > 0) {
            a(false);
            this.f1661d.f1670b.flush();
        }
    }
}
