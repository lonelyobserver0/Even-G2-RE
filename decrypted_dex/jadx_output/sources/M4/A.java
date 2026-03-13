package M4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A extends Y implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator[] f4535a;

    public A(C0146q c0146q, C0146q c0146q2) {
        this.f4535a = new Comparator[]{c0146q, c0146q2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i3 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f4535a;
            if (i3 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i3].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i3++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            return Arrays.equals(this.f4535a, ((A) obj).f4535a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4535a);
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder("Ordering.compound("), Arrays.toString(this.f4535a), ")");
    }
}
