package Kc;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Kc.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0098e implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3801a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3802b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3803c;

    public C0098e(InputStream input, J timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f3802b = input;
        this.f3803c = timeout;
    }

    @Override // Kc.H
    public final J b() {
        switch (this.f3801a) {
            case 0:
                return (G) this.f3802b;
            default:
                return (J) this.f3803c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.f3802b;
        switch (this.f3801a) {
            case 0:
                C0098e c0098e = (C0098e) this.f3803c;
                G g10 = (G) obj;
                g10.i();
                try {
                    c0098e.close();
                    Unit unit = Unit.INSTANCE;
                    if (g10.j()) {
                        throw g10.l(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!g10.j()) {
                        throw e10;
                    }
                    throw g10.l(e10);
                } finally {
                    g10.j();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        switch (this.f3801a) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                C0098e c0098e = (C0098e) this.f3803c;
                G g10 = (G) this.f3802b;
                g10.i();
                try {
                    long n10 = c0098e.n(j, sink);
                    if (g10.j()) {
                        throw g10.l(null);
                    }
                    return n10;
                } catch (IOException e10) {
                    if (g10.j()) {
                        throw g10.l(e10);
                    }
                    throw e10;
                } finally {
                    g10.j();
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25206)).toString());
                }
                try {
                    ((J) this.f3803c).f();
                    C M5 = sink.M(1);
                    int read = ((InputStream) this.f3802b).read(M5.f3776a, M5.f3778c, (int) Math.min(j, 8192 - M5.f3778c));
                    if (read == -1) {
                        if (M5.f3777b == M5.f3778c) {
                            sink.f3818a = M5.a();
                            D.a(M5);
                        }
                        return -1L;
                    }
                    M5.f3778c += read;
                    long j3 = read;
                    sink.f3819b += j3;
                    return j3;
                } catch (AssertionError e11) {
                    if (AbstractC0095b.g(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }

    public final String toString() {
        switch (this.f3801a) {
            case 0:
                return StubApp.getString2(25349) + ((C0098e) this.f3803c) + ')';
            default:
                return StubApp.getString2(25348) + ((InputStream) this.f3802b) + ')';
        }
    }

    public C0098e(G g10, C0098e c0098e) {
        this.f3802b = g10;
        this.f3803c = c0098e;
    }
}
