package Cc;

import Kc.A;
import Kc.C0101h;
import Kc.F;
import Kc.J;
import Kc.p;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c implements F {

    /* renamed from: a, reason: collision with root package name */
    public final p f1193a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f1195c;

    public c(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f1195c = this$0;
        this.f1193a = new p(((A) this$0.f1208b).f3770a.b());
    }

    @Override // Kc.F
    public final void E(long j, C0101h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        boolean z2 = this.f1194b;
        String string2 = StubApp.getString2(1551);
        if (z2) {
            throw new IllegalStateException(string2);
        }
        if (j == 0) {
            return;
        }
        h hVar = this.f1195c;
        A a3 = (A) hVar.f1208b;
        if (a3.f3772c) {
            throw new IllegalStateException(string2);
        }
        a3.f3771b.R(j);
        a3.a();
        A a9 = (A) hVar.f1208b;
        String string22 = StubApp.getString2(4962);
        a9.r(string22);
        a9.E(j, source);
        a9.r(string22);
    }

    @Override // Kc.F
    public final J b() {
        return this.f1193a;
    }

    @Override // Kc.F, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1194b) {
            return;
        }
        this.f1194b = true;
        ((A) this.f1195c.f1208b).r(StubApp.getString2("25079"));
        h.i(this.f1195c, this.f1193a);
        this.f1195c.f1209c = 3;
    }

    @Override // Kc.F, java.io.Flushable
    public final synchronized void flush() {
        if (this.f1194b) {
            return;
        }
        ((A) this.f1195c.f1208b).flush();
    }
}
