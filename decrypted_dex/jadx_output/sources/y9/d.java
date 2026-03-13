package y9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final u f23557a;

    /* renamed from: b, reason: collision with root package name */
    public final u f23558b;

    /* renamed from: c, reason: collision with root package name */
    public final u f23559c;

    /* renamed from: d, reason: collision with root package name */
    public final u f23560d;

    /* renamed from: e, reason: collision with root package name */
    public final u f23561e;

    /* renamed from: f, reason: collision with root package name */
    public final u f23562f;

    /* renamed from: g, reason: collision with root package name */
    public final u f23563g;

    public d(u inactiveRouteLegLowCongestionColorType, u inactiveRouteLegModerateCongestionColorType, u inactiveRouteLegHeavyCongestionColorType, u inactiveRouteLegSevereCongestionColorType, u inactiveRouteLegUnknownCongestionColorType, u inactiveRouteLegClosureColorType, u inactiveRouteLegRestrictedRoadColorType) {
        Intrinsics.checkNotNullParameter(inactiveRouteLegLowCongestionColorType, "inactiveRouteLegLowCongestionColorType");
        Intrinsics.checkNotNullParameter(inactiveRouteLegModerateCongestionColorType, "inactiveRouteLegModerateCongestionColorType");
        Intrinsics.checkNotNullParameter(inactiveRouteLegHeavyCongestionColorType, "inactiveRouteLegHeavyCongestionColorType");
        Intrinsics.checkNotNullParameter(inactiveRouteLegSevereCongestionColorType, "inactiveRouteLegSevereCongestionColorType");
        Intrinsics.checkNotNullParameter(inactiveRouteLegUnknownCongestionColorType, "inactiveRouteLegUnknownCongestionColorType");
        Intrinsics.checkNotNullParameter(inactiveRouteLegClosureColorType, "inactiveRouteLegClosureColorType");
        Intrinsics.checkNotNullParameter(inactiveRouteLegRestrictedRoadColorType, "inactiveRouteLegRestrictedRoadColorType");
        this.f23557a = inactiveRouteLegLowCongestionColorType;
        this.f23558b = inactiveRouteLegModerateCongestionColorType;
        this.f23559c = inactiveRouteLegHeavyCongestionColorType;
        this.f23560d = inactiveRouteLegSevereCongestionColorType;
        this.f23561e = inactiveRouteLegUnknownCongestionColorType;
        this.f23562f = inactiveRouteLegClosureColorType;
        this.f23563g = inactiveRouteLegRestrictedRoadColorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23557a == dVar.f23557a && this.f23558b == dVar.f23558b && this.f23559c == dVar.f23559c && this.f23560d == dVar.f23560d && this.f23561e == dVar.f23561e && this.f23562f == dVar.f23562f && this.f23563g == dVar.f23563g;
    }

    public final int hashCode() {
        return this.f23563g.hashCode() + ((this.f23562f.hashCode() + ((this.f23561e.hashCode() + ((this.f23560d.hashCode() + ((this.f23559c.hashCode() + ((this.f23558b.hashCode() + (this.f23557a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(24678) + this.f23557a + StubApp.getString2(24679) + this.f23558b + StubApp.getString2(24680) + this.f23559c + StubApp.getString2(24681) + this.f23560d + StubApp.getString2(24682) + this.f23561e + StubApp.getString2(24683) + this.f23562f + StubApp.getString2(24684) + this.f23563g + ')';
    }
}
