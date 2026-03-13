package V2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7730a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7731b;

    public e(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f7730a = errorMessage;
        this.f7731b = E1.a.j(StubApp.getString2(6501), errorMessage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f7730a, ((e) obj).f7730a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7731b;
    }

    public final int hashCode() {
        return this.f7730a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(6502)), this.f7730a, StubApp.getString2(74));
    }
}
