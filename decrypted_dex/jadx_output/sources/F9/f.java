package F9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2340a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2341b;

    public f(String type, String announcement) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        this.f2340a = type;
        this.f2341b = announcement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f2340a, fVar.f2340a) && Intrinsics.areEqual(this.f2341b, fVar.f2341b);
    }

    public final int hashCode() {
        return this.f2341b.hashCode() + (this.f2340a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2190));
        sb2.append(this.f2340a);
        sb2.append(StubApp.getString2(2191));
        return Xa.h.s(sb2, this.f2341b, ')');
    }
}
