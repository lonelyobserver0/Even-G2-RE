package Jc;

import Kc.A;
import Kc.AbstractC0095b;
import Kc.C0100g;
import Kc.C0101h;
import Kc.C0104k;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final A f3526a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f3527b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3528c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3529d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3530e;

    /* renamed from: f, reason: collision with root package name */
    public final C0101h f3531f;

    /* renamed from: g, reason: collision with root package name */
    public final C0101h f3532g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3533h;
    public a j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f3534k;

    /* renamed from: l, reason: collision with root package name */
    public final C0100g f3535l;

    public i(A sink, Random random, boolean z2, boolean z10, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f3526a = sink;
        this.f3527b = random;
        this.f3528c = z2;
        this.f3529d = z10;
        this.f3530e = j;
        this.f3531f = new C0101h();
        this.f3532g = sink.f3771b;
        this.f3534k = new byte[4];
        this.f3535l = new C0100g();
    }

    public final void a(int i3, C0104k c0104k) {
        if (this.f3533h) {
            throw new IOException(StubApp.getString2(1551));
        }
        int e10 = c0104k.e();
        if (e10 > 125) {
            throw new IllegalArgumentException(StubApp.getString2(25319));
        }
        C0101h c0101h = this.f3532g;
        c0101h.Q(i3 | 128);
        c0101h.Q(e10 | 128);
        byte[] bArr = this.f3534k;
        Intrinsics.checkNotNull(bArr);
        this.f3527b.nextBytes(bArr);
        c0101h.O(bArr);
        if (e10 > 0) {
            long j = c0101h.f3819b;
            c0101h.N(c0104k);
            C0100g c0100g = this.f3535l;
            Intrinsics.checkNotNull(c0100g);
            c0101h.v(c0100g);
            c0100g.d(j);
            android.support.v4.media.session.b.C(c0100g, bArr);
            c0100g.close();
        }
        this.f3526a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.j;
        if (aVar == null) {
            return;
        }
        aVar.close();
    }

    public final void d(int i3, C0104k data) {
        Intrinsics.checkNotNullParameter(data, "data");
        boolean z2 = this.f3533h;
        String string2 = StubApp.getString2(1551);
        if (z2) {
            throw new IOException(string2);
        }
        C0101h buffer = this.f3531f;
        buffer.N(data);
        int i10 = i3 | 128;
        if (this.f3528c && data.f3821a.length >= this.f3530e) {
            a aVar = this.j;
            if (aVar == null) {
                aVar = new a(this.f3529d, 0);
                this.j = aVar;
            }
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            C0101h c0101h = aVar.f3475c;
            if (c0101h.f3819b != 0) {
                throw new IllegalArgumentException(StubApp.getString2(353));
            }
            if (aVar.f3474b) {
                ((Deflater) aVar.f3476d).reset();
            }
            long j = buffer.f3819b;
            Cc.f fVar = (Cc.f) aVar.f3477e;
            fVar.E(j, buffer);
            fVar.flush();
            if (c0101h.p(c0101h.f3819b - r11.f3821a.length, b.f3478a)) {
                long j3 = c0101h.f3819b - 4;
                C0100g v2 = c0101h.v(AbstractC0095b.f3798a);
                try {
                    v2.a(j3);
                    CloseableKt.closeFinally(v2, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(v2, th);
                        throw th2;
                    }
                }
            } else {
                c0101h.Q(0);
            }
            buffer.E(c0101h.f3819b, c0101h);
            i10 = i3 | 192;
        }
        long j10 = buffer.f3819b;
        C0101h c0101h2 = this.f3532g;
        c0101h2.Q(i10);
        if (j10 <= 125) {
            c0101h2.Q(((int) j10) | 128);
        } else if (j10 <= 65535) {
            c0101h2.Q(254);
            c0101h2.U((int) j10);
        } else {
            c0101h2.Q(255);
            c0101h2.T(j10);
        }
        byte[] bArr = this.f3534k;
        Intrinsics.checkNotNull(bArr);
        this.f3527b.nextBytes(bArr);
        c0101h2.O(bArr);
        if (j10 > 0) {
            C0100g c0100g = this.f3535l;
            Intrinsics.checkNotNull(c0100g);
            buffer.v(c0100g);
            c0100g.d(0L);
            android.support.v4.media.session.b.C(c0100g, bArr);
            c0100g.close();
        }
        c0101h2.E(j10, buffer);
        A a3 = this.f3526a;
        if (a3.f3772c) {
            throw new IllegalStateException(string2);
        }
        C0101h c0101h3 = a3.f3771b;
        long j11 = c0101h3.f3819b;
        if (j11 > 0) {
            a3.f3770a.E(j11, c0101h3);
        }
    }
}
