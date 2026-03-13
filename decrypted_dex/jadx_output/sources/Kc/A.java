package Kc;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class A implements InterfaceC0102i {

    /* renamed from: a, reason: collision with root package name */
    public final F f3770a;

    /* renamed from: b, reason: collision with root package name */
    public final C0101h f3771b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3772c;

    public A(F sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f3770a = sink;
        this.f3771b = new C0101h();
    }

    @Override // Kc.F
    public final void E(long j, C0101h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        this.f3771b.E(j, source);
        a();
    }

    public final InterfaceC0102i a() {
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        C0101h c0101h = this.f3771b;
        long a3 = c0101h.a();
        if (a3 > 0) {
            this.f3770a.E(a3, c0101h);
        }
        return this;
    }

    @Override // Kc.F
    public final J b() {
        return this.f3770a.b();
    }

    @Override // Kc.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        F f10 = this.f3770a;
        if (this.f3772c) {
            return;
        }
        try {
            C0101h c0101h = this.f3771b;
            long j = c0101h.f3819b;
            if (j > 0) {
                f10.E(j, c0101h);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            f10.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f3772c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // Kc.InterfaceC0102i, Kc.F, java.io.Flushable
    public final void flush() {
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        C0101h c0101h = this.f3771b;
        long j = c0101h.f3819b;
        F f10 = this.f3770a;
        if (j > 0) {
            f10.E(j, c0101h);
        }
        f10.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3772c;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i j(long j) {
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        this.f3771b.T(AbstractC0095b.i(j));
        a();
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i l(int i3) {
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        this.f3771b.S(AbstractC0095b.h(i3));
        a();
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i q(C0104k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        this.f3771b.N(byteString);
        a();
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i r(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        this.f3771b.W(string);
        a();
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final long t(H source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long n10 = source.n(8192L, this.f3771b);
            if (n10 == -1) {
                return j;
            }
            j += n10;
            a();
        }
    }

    public final String toString() {
        return StubApp.getString2(25320) + this.f3770a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        int write = this.f3771b.write(source);
        a();
        return write;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i writeByte(int i3) {
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        this.f3771b.Q(i3);
        a();
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i writeInt(int i3) {
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        this.f3771b.S(i3);
        a();
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i writeShort(int i3) {
        if (this.f3772c) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        this.f3771b.U(i3);
        a();
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f3772c) {
            this.f3771b.O(source);
            a();
            return this;
        }
        throw new IllegalStateException(StubApp.getString2(1551));
    }
}
