package V2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7727b;

    public c(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f7726a = errorMessage;
        this.f7727b = E1.a.j(StubApp.getString2(6497), errorMessage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f7726a, ((c) obj).f7726a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7727b;
    }

    public final int hashCode() {
        return this.f7726a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(6498)), this.f7726a, StubApp.getString2(74));
    }
}
