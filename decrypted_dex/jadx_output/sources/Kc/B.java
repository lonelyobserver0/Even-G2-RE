package Kc;

import com.stub.StubApp;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class B implements InterfaceC0103j {

    /* renamed from: a, reason: collision with root package name */
    public final H f3773a;

    /* renamed from: b, reason: collision with root package name */
    public final C0101h f3774b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3775c;

    public B(H source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f3773a = source;
        this.f3774b = new C0101h();
    }

    public final String A(long j) {
        D(j);
        C0101h c0101h = this.f3774b;
        c0101h.getClass();
        return c0101h.J(j, Charsets.UTF_8);
    }

    public final String C(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25323)).toString());
        }
        long j3 = j == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long d8 = d((byte) 10, 0L, j3);
        C0101h c0101h = this.f3774b;
        if (d8 != -1) {
            return Lc.a.a(d8, c0101h);
        }
        if (j3 < LongCompanionObject.MAX_VALUE && F(j3) && c0101h.h(j3 - 1) == 13 && F(j3 + 1) && c0101h.h(j3) == 10) {
            return Lc.a.a(j3, c0101h);
        }
        C0101h out = new C0101h();
        long min = Math.min(32, c0101h.f3819b);
        long j10 = 0;
        c0101h.getClass();
        Intrinsics.checkNotNullParameter(out, "out");
        AbstractC0095b.f(c0101h.f3819b, 0L, min);
        if (min != 0) {
            out.f3819b += min;
            C c10 = c0101h.f3818a;
            while (true) {
                Intrinsics.checkNotNull(c10);
                long j11 = c10.f3778c - c10.f3777b;
                if (j10 < j11) {
                    break;
                }
                j10 -= j11;
                c10 = c10.f3781f;
            }
            long j12 = j10;
            long j13 = min;
            while (j13 > 0) {
                Intrinsics.checkNotNull(c10);
                C c11 = c10.c();
                int i3 = c11.f3777b + ((int) j12);
                c11.f3777b = i3;
                c11.f3778c = Math.min(i3 + ((int) j13), c11.f3778c);
                C c12 = out.f3818a;
                if (c12 == null) {
                    c11.f3782g = c11;
                    c11.f3781f = c11;
                    out.f3818a = c11;
                } else {
                    Intrinsics.checkNotNull(c12);
                    C c13 = c12.f3782g;
                    Intrinsics.checkNotNull(c13);
                    c13.b(c11);
                }
                j13 -= c11.f3778c - c11.f3777b;
                c10 = c10.f3781f;
                j12 = 0;
            }
        }
        throw new EOFException(StubApp.getString2(25321) + Math.min(c0101h.f3819b, j) + StubApp.getString2(25322) + out.f(out.f3819b).f() + Typography.ellipsis);
    }

    @Override // Kc.InterfaceC0103j
    public final void D(long j) {
        if (!F(j)) {
            throw new EOFException();
        }
    }

    public final boolean F(long j) {
        C0101h c0101h;
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25206)).toString());
        }
        if (this.f3775c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        do {
            c0101h = this.f3774b;
            if (c0101h.f3819b >= j) {
                return true;
            }
        } while (this.f3773a.n(8192L, c0101h) != -1);
        return false;
    }

    public final boolean a() {
        if (this.f3775c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        C0101h c0101h = this.f3774b;
        return c0101h.e() && this.f3773a.n(8192L, c0101h) == -1;
    }

    @Override // Kc.H
    public final J b() {
        return this.f3773a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f3775c) {
            return;
        }
        this.f3775c = true;
        this.f3773a.close();
        C0101h c0101h = this.f3774b;
        c0101h.skip(c0101h.f3819b);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(byte r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kc.B.d(byte, long, long):long");
    }

    public final void e(long j, C0101h sink) {
        C0101h c0101h = this.f3774b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            D(j);
            c0101h.getClass();
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j3 = c0101h.f3819b;
            if (j3 >= j) {
                sink.E(j, c0101h);
            } else {
                sink.E(j3, c0101h);
                throw new EOFException();
            }
        } catch (EOFException e10) {
            sink.t(c0101h);
            throw e10;
        }
    }

    @Override // Kc.InterfaceC0103j
    public final C0104k f(long j) {
        D(j);
        return this.f3774b.f(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        r14.f3819b -= r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2 A[LOOP:2: B:23:0x008c->B:31:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kc.B.h():long");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3775c;
    }

    public final int k() {
        D(4L);
        return this.f3774b.F();
    }

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25206)).toString());
        }
        if (this.f3775c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        C0101h c0101h = this.f3774b;
        if (c0101h.f3819b == 0 && this.f3773a.n(8192L, c0101h) == -1) {
            return -1L;
        }
        return c0101h.n(Math.min(j, c0101h.f3819b), sink);
    }

    public final long p() {
        D(8L);
        return this.f3774b.H();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C0101h c0101h = this.f3774b;
        if (c0101h.f3819b == 0 && this.f3773a.n(8192L, c0101h) == -1) {
            return -1;
        }
        return c0101h.read(sink);
    }

    @Override // Kc.InterfaceC0103j
    public final byte readByte() {
        D(1L);
        return this.f3774b.readByte();
    }

    @Override // Kc.InterfaceC0103j
    public final int readInt() {
        D(4L);
        return this.f3774b.readInt();
    }

    @Override // Kc.InterfaceC0103j
    public final short readShort() {
        D(2L);
        return this.f3774b.readShort();
    }

    @Override // Kc.InterfaceC0103j
    public final void skip(long j) {
        if (this.f3775c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        while (j > 0) {
            C0101h c0101h = this.f3774b;
            if (c0101h.f3819b == 0 && this.f3773a.n(8192L, c0101h) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, c0101h.f3819b);
            c0101h.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return StubApp.getString2(25320) + this.f3773a + ')';
    }

    @Override // Kc.InterfaceC0103j
    public final long u(x sink) {
        C0101h c0101h;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (true) {
            c0101h = this.f3774b;
            if (this.f3773a.n(8192L, c0101h) == -1) {
                break;
            }
            long a3 = c0101h.a();
            if (a3 > 0) {
                j += a3;
                sink.E(a3, c0101h);
            }
        }
        long j3 = c0101h.f3819b;
        if (j3 <= 0) {
            return j;
        }
        long j10 = j + j3;
        sink.E(j3, c0101h);
        return j10;
    }

    public final short v() {
        D(2L);
        return this.f3774b.I();
    }
}
