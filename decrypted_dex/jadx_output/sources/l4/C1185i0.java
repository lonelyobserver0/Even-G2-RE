package l4;

import com.stub.StubApp;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: l4.i0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1185i0 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f16461a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16462b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1191k0 f16464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1185i0(C1191k0 c1191k0, Runnable runnable, boolean z2, String str) {
        super(runnable, null);
        Objects.requireNonNull(c1191k0);
        this.f16464d = c1191k0;
        long andIncrement = C1191k0.f16490l.getAndIncrement();
        this.f16461a = andIncrement;
        this.f16463c = str;
        this.f16462b = z2;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            T t3 = ((C1200n0) c1191k0.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(20473));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1185i0 c1185i0 = (C1185i0) obj;
        boolean z2 = c1185i0.f16462b;
        boolean z10 = this.f16462b;
        if (z10 != z2) {
            return !z10 ? 1 : -1;
        }
        long j = this.f16461a;
        long j3 = c1185i0.f16461a;
        if (j < j3) {
            return -1;
        }
        if (j > j3) {
            return 1;
        }
        T t3 = ((C1200n0) this.f16464d.f4728a).f16541f;
        C1200n0.l(t3);
        t3.f16243g.c(Long.valueOf(j), StubApp.getString2(20475));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        T t3 = ((C1200n0) this.f16464d.f4728a).f16541f;
        C1200n0.l(t3);
        t3.f16242f.c(th, this.f16463c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1185i0(C1191k0 c1191k0, Callable callable, boolean z2) {
        super(callable);
        Objects.requireNonNull(c1191k0);
        this.f16464d = c1191k0;
        long andIncrement = C1191k0.f16490l.getAndIncrement();
        this.f16461a = andIncrement;
        this.f16463c = StubApp.getString2(20474);
        this.f16462b = z2;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            T t3 = ((C1200n0) c1191k0.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(20473));
        }
    }
}
