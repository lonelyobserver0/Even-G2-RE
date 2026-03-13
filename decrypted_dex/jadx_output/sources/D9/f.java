package D9;

import Qb.I;
import Qb.L0;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final L0 f1512a;

    /* renamed from: b, reason: collision with root package name */
    public final Vb.f f1513b;

    public f(L0 job, Vb.f scope) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f1512a = job;
        this.f1513b = scope;
    }

    public final I a() {
        return this.f1513b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f1512a, fVar.f1512a) && Intrinsics.areEqual(this.f1513b, fVar.f1513b);
    }

    public final int hashCode() {
        return this.f1513b.hashCode() + (this.f1512a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(1555) + this.f1512a + StubApp.getString2(1556) + this.f1513b + ')';
    }
}
