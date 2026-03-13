package Ac;

import Kc.C0101h;
import Kc.F;
import Kc.J;
import com.stub.StubApp;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c implements F {

    /* renamed from: a, reason: collision with root package name */
    public final F f301a;

    /* renamed from: b, reason: collision with root package name */
    public final long f302b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f303c;

    /* renamed from: d, reason: collision with root package name */
    public long f304d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f306f;

    public c(e this$0, F delegate, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f306f = this$0;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f301a = delegate;
        this.f302b = j;
    }

    @Override // Kc.F
    public final void E(long j, C0101h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f305e) {
            throw new IllegalStateException(StubApp.getString2(1551));
        }
        long j3 = this.f302b;
        if (j3 != -1 && this.f304d + j > j3) {
            StringBuilder m4 = AbstractC1482f.m(j3, StubApp.getString2(24937), StubApp.getString2(24938));
            m4.append(this.f304d + j);
            throw new ProtocolException(m4.toString());
        }
        try {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f301a.E(j, source);
            this.f304d += j;
        } catch (IOException e10) {
            throw d(e10);
        }
    }

    public final void a() {
        this.f301a.close();
    }

    @Override // Kc.F
    public final J b() {
        return this.f301a.b();
    }

    @Override // Kc.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f305e) {
            return;
        }
        this.f305e = true;
        long j = this.f302b;
        if (j != -1 && this.f304d != j) {
            throw new ProtocolException(StubApp.getString2(24939));
        }
        try {
            a();
            d(null);
        } catch (IOException e10) {
            throw d(e10);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f303c) {
            return iOException;
        }
        this.f303c = true;
        return this.f306f.b(this.f304d, false, true, iOException);
    }

    public final void e() {
        this.f301a.flush();
    }

    @Override // Kc.F, java.io.Flushable
    public final void flush() {
        try {
            e();
        } catch (IOException e10) {
            throw d(e10);
        }
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f301a + ')';
    }
}
