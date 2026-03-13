package Z9;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public int[] f9084a;

    public H(int i3) {
        this.f9084a = new int[]{i3};
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            H h2 = (H) obj;
            int[] iArr = this.f9084a;
            int i3 = iArr[0];
            if (i3 == 12) {
                int[] iArr2 = h2.f9084a;
                if (iArr2[0] == 12) {
                    return (iArr.length <= 1 || iArr2.length <= 1) ? iArr.length == iArr2.length : iArr[1] == iArr2[1];
                }
            }
            if (i3 == h2.f9084a[0]) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f9084a;
        int i3 = iArr[0];
        return (i3 != 12 || iArr.length <= 1) ? i3 : iArr[1] ^ i3;
    }

    public final String toString() {
        return Arrays.toString(this.f9084a);
    }

    public H(int i3, int i10) {
        this.f9084a = new int[]{i3, i10};
    }
}
