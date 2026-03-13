package o0;

import android.util.SparseBooleanArray;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1436k {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f18154a;

    public C1436k(SparseBooleanArray sparseBooleanArray) {
        this.f18154a = sparseBooleanArray;
    }

    public final int a(int i3) {
        SparseBooleanArray sparseBooleanArray = this.f18154a;
        AbstractC1550k.e(i3, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1436k)) {
            return false;
        }
        C1436k c1436k = (C1436k) obj;
        int i3 = AbstractC1560u.f20190a;
        SparseBooleanArray sparseBooleanArray = this.f18154a;
        if (i3 >= 24) {
            return sparseBooleanArray.equals(c1436k.f18154a);
        }
        if (sparseBooleanArray.size() != c1436k.f18154a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            if (a(i10) != c1436k.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i3 = AbstractC1560u.f20190a;
        SparseBooleanArray sparseBooleanArray = this.f18154a;
        if (i3 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
