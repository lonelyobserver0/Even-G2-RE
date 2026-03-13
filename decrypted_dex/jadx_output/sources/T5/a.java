package T5;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7181a;

    /* renamed from: b, reason: collision with root package name */
    public int f7182b;

    public a(int i3) {
        this.f7182b = i3;
        this.f7181a = new int[(i3 + 31) / 32];
    }

    public final boolean a(int i3) {
        return ((1 << (i3 & 31)) & this.f7181a[i3 / 32]) != 0;
    }

    public final int b(int i3) {
        int i10 = this.f7182b;
        if (i3 >= i10) {
            return i10;
        }
        int i11 = i3 / 32;
        int i12 = (-(1 << (i3 & 31))) & this.f7181a[i11];
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f7181a;
            if (i11 == iArr.length) {
                return i10;
            }
            i12 = iArr[i11];
        }
        return Math.min(Integer.numberOfTrailingZeros(i12) + (i11 * 32), i10);
    }

    public final int c(int i3) {
        int i10 = this.f7182b;
        if (i3 >= i10) {
            return i10;
        }
        int i11 = i3 / 32;
        int i12 = (-(1 << (i3 & 31))) & (~this.f7181a[i11]);
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f7181a;
            if (i11 == iArr.length) {
                return i10;
            }
            i12 = ~iArr[i11];
        }
        return Math.min(Integer.numberOfTrailingZeros(i12) + (i11 * 32), i10);
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f7181a.clone();
        a aVar = new a();
        aVar.f7181a = iArr;
        aVar.f7182b = this.f7182b;
        return aVar;
    }

    public final boolean d(int i3, int i10) {
        if (i10 < i3 || i3 < 0 || i10 > this.f7182b) {
            throw new IllegalArgumentException();
        }
        if (i10 != i3) {
            int i11 = i10 - 1;
            int i12 = i3 / 32;
            int i13 = i11 / 32;
            int i14 = i12;
            while (i14 <= i13) {
                if ((((2 << (i14 >= i13 ? 31 & i11 : 31)) - (1 << (i14 > i12 ? 0 : i3 & 31))) & this.f7181a[i14]) != 0) {
                    return false;
                }
                i14++;
            }
        }
        return true;
    }

    public final void e() {
        int[] iArr = new int[this.f7181a.length];
        int i3 = this.f7182b;
        int i10 = (i3 - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 - i12] = Integer.reverse(this.f7181a[i12]);
        }
        int i13 = i11 * 32;
        if (i3 != i13) {
            int i14 = i13 - i3;
            int i15 = iArr[0] >>> i14;
            for (int i16 = 1; i16 < i11; i16++) {
                int i17 = iArr[i16];
                iArr[i16 - 1] = i15 | (i17 << (32 - i14));
                i15 = i17 >>> i14;
            }
            iArr[i10] = i15;
        }
        this.f7181a = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7182b == aVar.f7182b && Arrays.equals(this.f7181a, aVar.f7181a);
    }

    public final void f(int i3) {
        int[] iArr = this.f7181a;
        int i10 = i3 / 32;
        iArr[i10] = (1 << (i3 & 31)) | iArr[i10];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7181a) + (this.f7182b * 31);
    }

    public final String toString() {
        int i3 = this.f7182b;
        StringBuilder sb2 = new StringBuilder((i3 / 8) + i3 + 1);
        for (int i10 = 0; i10 < i3; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(a(i10) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
