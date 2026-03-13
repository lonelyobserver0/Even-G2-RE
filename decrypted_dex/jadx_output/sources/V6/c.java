package V6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Long f7763a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f7764b;

    public c(b bVar) {
        this.f7763a = (Long) bVar.f7761b;
        this.f7764b = (Long) bVar.f7762c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f7764b, cVar.f7764b) && Intrinsics.areEqual(this.f7763a, cVar.f7763a);
    }

    public final int hashCode() {
        Long l9 = this.f7763a;
        int hashCode = (l9 != null ? l9.hashCode() : 0) * 31;
        Long l10 = this.f7764b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
