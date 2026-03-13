package V2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7729b;

    public d(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f7728a = errorMessage;
        this.f7729b = E1.a.j(StubApp.getString2(6499), errorMessage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f7728a, ((d) obj).f7728a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7729b;
    }

    public final int hashCode() {
        return this.f7728a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(6500)), this.f7728a, StubApp.getString2(74));
    }
}
