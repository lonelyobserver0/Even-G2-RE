package Cc;

import Ac.o;
import Kc.C0101h;
import com.stub.StubApp;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends b {

    /* renamed from: d, reason: collision with root package name */
    public long f1200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f1201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h this$0, long j) {
        super(this$0);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f1201e = this$0;
        this.f1200d = j;
        if (j == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1191b) {
            return;
        }
        if (this.f1200d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!xc.b.h(this)) {
                ((o) this.f1201e.f1211e).k();
                a();
            }
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
        long j3 = this.f1200d;
        if (j3 == 0) {
            return -1L;
        }
        long n10 = super.n(Math.min(j3, j), sink);
        if (n10 == -1) {
            ((o) this.f1201e.f1211e).k();
            ProtocolException protocolException = new ProtocolException(StubApp.getString2(24939));
            a();
            throw protocolException;
        }
        long j10 = this.f1200d - n10;
        this.f1200d = j10;
        if (j10 == 0) {
            a();
        }
        return n10;
    }
}
