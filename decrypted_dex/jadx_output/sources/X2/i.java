package X2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final j f8285a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f8286b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f8287c;

    public i(j mode, Long l9, Long l10) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f8285a = mode;
        this.f8286b = l9;
        this.f8287c = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8285a == iVar.f8285a && Intrinsics.areEqual(this.f8286b, iVar.f8286b) && Intrinsics.areEqual(this.f8287c, iVar.f8287c);
    }

    public final int hashCode() {
        int hashCode = this.f8285a.hashCode() * 31;
        Long l9 = this.f8286b;
        int hashCode2 = (hashCode + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.f8287c;
        return hashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(7081) + this.f8285a + StubApp.getString2(7082) + this.f8286b + StubApp.getString2(7083) + this.f8287c + StubApp.getString2(74);
    }
}
