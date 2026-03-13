package Kc;

import com.stub.StubApp;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Kc.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0097d implements F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f3799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f3800b;

    public C0097d(G g10, x xVar) {
        this.f3799a = g10;
        this.f3800b = xVar;
    }

    @Override // Kc.F
    public final void E(long j, C0101h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC0095b.f(source.f3819b, 0L, j);
        while (true) {
            long j3 = 0;
            if (j <= 0) {
                return;
            }
            C c10 = source.f3818a;
            Intrinsics.checkNotNull(c10);
            while (true) {
                if (j3 >= 65536) {
                    break;
                }
                j3 += c10.f3778c - c10.f3777b;
                if (j3 >= j) {
                    j3 = j;
                    break;
                } else {
                    c10 = c10.f3781f;
                    Intrinsics.checkNotNull(c10);
                }
            }
            x xVar = this.f3800b;
            G g10 = this.f3799a;
            g10.i();
            try {
                try {
                    xVar.E(j3, source);
                    Unit unit = Unit.INSTANCE;
                    if (g10.j()) {
                        throw g10.l(null);
                    }
                    j -= j3;
                } catch (IOException e10) {
                    if (!g10.j()) {
                        throw e10;
                    }
                    throw g10.l(e10);
                }
            } catch (Throwable th) {
                g10.j();
                throw th;
            }
        }
    }

    @Override // Kc.F
    public final J b() {
        return this.f3799a;
    }

    @Override // Kc.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f3800b;
        G g10 = this.f3799a;
        g10.i();
        try {
            xVar.close();
            Unit unit = Unit.INSTANCE;
            if (g10.j()) {
                throw g10.l(null);
            }
        } catch (IOException e10) {
            if (!g10.j()) {
                throw e10;
            }
            throw g10.l(e10);
        } finally {
            g10.j();
        }
    }

    @Override // Kc.F, java.io.Flushable
    public final void flush() {
        x xVar = this.f3800b;
        G g10 = this.f3799a;
        g10.i();
        try {
            xVar.flush();
            Unit unit = Unit.INSTANCE;
            if (g10.j()) {
                throw g10.l(null);
            }
        } catch (IOException e10) {
            if (!g10.j()) {
                throw e10;
            }
            throw g10.l(e10);
        } finally {
            g10.j();
        }
    }

    public final String toString() {
        return StubApp.getString2(25347) + this.f3800b + ')';
    }
}
