package Cc;

import Kc.C0101h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class g extends b {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1206d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1191b) {
            return;
        }
        if (!this.f1206d) {
            a();
        }
        this.f1191b = true;
    }

    @Override // Cc.b, Kc.H
    public final long n(long j, C0101h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
        }
        if (this.f1191b) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        if (this.f1206d) {
            return -1L;
        }
        long n10 = super.n(j, sink);
        if (n10 != -1) {
            return n10;
        }
        this.f1206d = true;
        a();
        return -1L;
    }
}
