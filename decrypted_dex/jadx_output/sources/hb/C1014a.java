package hb;

import com.stub.StubApp;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1014a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14477a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f14478b;

    public C1014a(String name, Map map) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f14477a = name;
        this.f14478b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1014a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1014a c1014a = (C1014a) obj;
        return Ec.d.s(CollectionsKt.listOf(this.f14477a, this.f14478b), CollectionsKt.listOf(c1014a.f14477a, c1014a.f14478b));
    }

    public final int hashCode() {
        return CollectionsKt.listOf(this.f14477a, this.f14478b).hashCode();
    }

    public final String toString() {
        return StubApp.getString2(18308) + this.f14477a + StubApp.getString2(18309) + this.f14478b + StubApp.getString2(74);
    }
}
