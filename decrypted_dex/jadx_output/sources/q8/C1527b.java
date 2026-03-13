package q8;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m8.G;

/* renamed from: q8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1527b {

    /* renamed from: a, reason: collision with root package name */
    public final List f20084a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20085b;

    /* renamed from: c, reason: collision with root package name */
    public final G f20086c;

    public C1527b(List acceptedRoutes, List ignoredRoutes, G setRoutesInfo) {
        Intrinsics.checkNotNullParameter(acceptedRoutes, "acceptedRoutes");
        Intrinsics.checkNotNullParameter(ignoredRoutes, "ignoredRoutes");
        Intrinsics.checkNotNullParameter(setRoutesInfo, "setRoutesInfo");
        this.f20084a = acceptedRoutes;
        this.f20085b = ignoredRoutes;
        this.f20086c = setRoutesInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1527b)) {
            return false;
        }
        C1527b c1527b = (C1527b) obj;
        return Intrinsics.areEqual(this.f20084a, c1527b.f20084a) && Intrinsics.areEqual(this.f20085b, c1527b.f20085b) && Intrinsics.areEqual(this.f20086c, c1527b.f20086c);
    }

    public final int hashCode() {
        return this.f20086c.hashCode() + E1.a.g(this.f20084a.hashCode() * 31, 31, this.f20085b);
    }

    public final String toString() {
        return StubApp.getString2(22317) + this.f20084a + StubApp.getString2(22318) + this.f20085b + StubApp.getString2(22319) + this.f20086c + ')';
    }
}
