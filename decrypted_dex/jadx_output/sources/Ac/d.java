package Ac;

import Kc.C0101h;
import Kc.H;
import Kc.J;
import com.stub.StubApp;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d implements H {

    /* renamed from: a, reason: collision with root package name */
    public final H f307a;

    /* renamed from: b, reason: collision with root package name */
    public final long f308b;

    /* renamed from: c, reason: collision with root package name */
    public long f309c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f310d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f311e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f313g;

    public d(e this$0, H delegate, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f313g = this$0;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f307a = delegate;
        this.f308b = j;
        this.f310d = true;
        if (j == 0) {
            d(null);
        }
    }

    public final void a() {
        this.f307a.close();
    }

    @Override // Kc.H
    public final J b() {
        return this.f307a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f312f) {
            return;
        }
        this.f312f = true;
        try {
            a();
            d(null);
        } catch (IOException e10) {
            throw d(e10);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f311e) {
            return iOException;
        }
        this.f311e = true;
        if (iOException == null && this.f310d) {
            this.f310d = false;
            e eVar = this.f313g;
            ((wc.q) eVar.f316c).responseBodyStart((j) eVar.f315b);
        }
        return this.f313g.b(this.f309c, true, false, iOException);
    }

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        String string2 = StubApp.getString2(24937);
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f312f) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        try {
            long n10 = this.f307a.n(j, sink);
            if (this.f310d) {
                this.f310d = false;
                e eVar = this.f313g;
                ((wc.q) eVar.f316c).responseBodyStart((j) eVar.f315b);
            }
            if (n10 == -1) {
                d(null);
                return -1L;
            }
            long j3 = this.f309c + n10;
            long j10 = this.f308b;
            if (j10 == -1 || j3 <= j10) {
                this.f309c = j3;
                if (j3 == j10) {
                    d(null);
                }
                return n10;
            }
            throw new ProtocolException(string2 + j10 + StubApp.getString2("24938") + j3);
        } catch (IOException e10) {
            throw d(e10);
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f307a + ')';
    }
}
