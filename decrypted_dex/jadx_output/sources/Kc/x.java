package Kc;

import com.stub.StubApp;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class x implements F {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f3856a;

    /* renamed from: b, reason: collision with root package name */
    public final J f3857b;

    public x(OutputStream out, J timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f3856a = out;
        this.f3857b = timeout;
    }

    @Override // Kc.F
    public final void E(long j, C0101h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC0095b.f(source.f3819b, 0L, j);
        while (j > 0) {
            this.f3857b.f();
            C c10 = source.f3818a;
            Intrinsics.checkNotNull(c10);
            int min = (int) Math.min(j, c10.f3778c - c10.f3777b);
            this.f3856a.write(c10.f3776a, c10.f3777b, min);
            int i3 = c10.f3777b + min;
            c10.f3777b = i3;
            long j3 = min;
            j -= j3;
            source.f3819b -= j3;
            if (i3 == c10.f3778c) {
                source.f3818a = c10.a();
                D.a(c10);
            }
        }
    }

    @Override // Kc.F
    public final J b() {
        return this.f3857b;
    }

    @Override // Kc.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3856a.close();
    }

    @Override // Kc.F, java.io.Flushable
    public final void flush() {
        this.f3856a.flush();
    }

    public final String toString() {
        return StubApp.getString2(25389) + this.f3856a + ')';
    }
}
