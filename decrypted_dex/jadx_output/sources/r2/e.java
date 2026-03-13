package r2;

import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f20299a;

    /* renamed from: b, reason: collision with root package name */
    public int f20300b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f20300b != eVar.f20300b) {
            return false;
        }
        return this.f20299a.equals(eVar.f20299a);
    }

    public final int hashCode() {
        return AbstractC1856e.c(this.f20300b) + (this.f20299a.hashCode() * 31);
    }
}
