package V2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7725b;

    public b(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f7724a = errorMessage;
        this.f7725b = E1.a.j(StubApp.getString2(6495), errorMessage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f7724a, ((b) obj).f7724a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7725b;
    }

    public final int hashCode() {
        return this.f7724a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(6496)), this.f7724a, StubApp.getString2(74));
    }
}
