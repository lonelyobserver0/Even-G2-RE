package o0;

import android.util.SparseBooleanArray;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o0.F, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1409F {

    /* renamed from: a, reason: collision with root package name */
    public final C1436k f18029a;

    static {
        new SparseBooleanArray();
        AbstractC1550k.g(!false);
        AbstractC1560u.E(0);
    }

    public C1409F(C1436k c1436k) {
        this.f18029a = c1436k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1409F) {
            return this.f18029a.equals(((C1409F) obj).f18029a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18029a.hashCode();
    }
}
