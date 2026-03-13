package T5;

import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f7183a;

    /* renamed from: b, reason: collision with root package name */
    public int f7184b;

    /* renamed from: c, reason: collision with root package name */
    public int f7185c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7186d;

    public b(int i3, int i10) {
        if (i3 < 1 || i10 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(6159));
        }
        this.f7183a = i3;
        this.f7184b = i10;
        int i11 = (i3 + 31) / 32;
        this.f7185c = i11;
        this.f7186d = new int[i11 * i10];
    }

    public final void a(int i3, int i10) {
        int i11 = (i3 / 32) + (i10 * this.f7185c);
        int[] iArr = this.f7186d;
        iArr[i11] = (1 << (i3 & 31)) ^ iArr[i11];
    }

    public final boolean b(int i3, int i10) {
        return ((this.f7186d[(i3 / 32) + (i10 * this.f7185c)] >>> (i3 & 31)) & 1) != 0;
    }

    public final int[] c() {
        int length = this.f7186d.length - 1;
        while (length >= 0 && this.f7186d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i3 = this.f7185c;
        int i10 = length / i3;
        int i11 = (length % i3) * 32;
        int i12 = 31;
        while ((this.f7186d[length] >>> i12) == 0) {
            i12--;
        }
        return new int[]{i11 + i12, i10};
    }

    public final Object clone() {
        int i3 = this.f7183a;
        int i10 = this.f7184b;
        int i11 = this.f7185c;
        int[] iArr = (int[]) this.f7186d.clone();
        b bVar = new b();
        bVar.f7183a = i3;
        bVar.f7184b = i10;
        bVar.f7185c = i11;
        bVar.f7186d = iArr;
        return bVar;
    }

    public final a d(a aVar, int i3) {
        int i10 = this.f7183a;
        if (aVar.f7182b < i10) {
            aVar = new a(i10);
        } else {
            int length = aVar.f7181a.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVar.f7181a[i11] = 0;
            }
        }
        int i12 = i3 * this.f7185c;
        for (int i13 = 0; i13 < this.f7185c; i13++) {
            aVar.f7181a[(i13 * 32) / 32] = this.f7186d[i12 + i13];
        }
        return aVar;
    }

    public final int[] e() {
        int[] iArr;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            iArr = this.f7186d;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f7185c;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) * 32;
        while ((iArr[i10] << (31 - i3)) == 0) {
            i3++;
        }
        return new int[]{i13 + i3, i12};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7183a == bVar.f7183a && this.f7184b == bVar.f7184b && this.f7185c == bVar.f7185c && Arrays.equals(this.f7186d, bVar.f7186d);
    }

    public final void f() {
        a aVar = new a(this.f7183a);
        a aVar2 = new a(this.f7183a);
        int i3 = (this.f7184b + 1) / 2;
        for (int i10 = 0; i10 < i3; i10++) {
            aVar = d(aVar, i10);
            int i11 = (this.f7184b - 1) - i10;
            aVar2 = d(aVar2, i11);
            aVar.e();
            aVar2.e();
            int[] iArr = aVar2.f7181a;
            int[] iArr2 = this.f7186d;
            int i12 = this.f7185c;
            System.arraycopy(iArr, 0, iArr2, i10 * i12, i12);
            int[] iArr3 = aVar.f7181a;
            int[] iArr4 = this.f7186d;
            int i13 = this.f7185c;
            System.arraycopy(iArr3, 0, iArr4, i11 * i13, i13);
        }
    }

    public final void g() {
        int i3 = this.f7184b;
        int i10 = this.f7183a;
        int i11 = (i3 + 31) / 32;
        int[] iArr = new int[i11 * i10];
        for (int i12 = 0; i12 < this.f7184b; i12++) {
            for (int i13 = 0; i13 < this.f7183a; i13++) {
                if (((this.f7186d[(i13 / 32) + (this.f7185c * i12)] >>> (i13 & 31)) & 1) != 0) {
                    int i14 = (i12 / 32) + (((i10 - 1) - i13) * i11);
                    iArr[i14] = iArr[i14] | (1 << (i12 & 31));
                }
            }
        }
        this.f7183a = i3;
        this.f7184b = i10;
        this.f7185c = i11;
        this.f7186d = iArr;
    }

    public final void h(int i3, int i10) {
        int i11 = (i3 / 32) + (i10 * this.f7185c);
        int[] iArr = this.f7186d;
        iArr[i11] = (1 << (i3 & 31)) | iArr[i11];
    }

    public final int hashCode() {
        int i3 = this.f7183a;
        return Arrays.hashCode(this.f7186d) + (((((((i3 * 31) + i3) * 31) + this.f7184b) * 31) + this.f7185c) * 31);
    }

    public final void i(int i3, int i10, int i11, int i12) {
        if (i10 < 0 || i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(6162));
        }
        if (i12 < 1 || i11 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(6161));
        }
        int i13 = i11 + i3;
        int i14 = i12 + i10;
        if (i14 > this.f7184b || i13 > this.f7183a) {
            throw new IllegalArgumentException(StubApp.getString2(6160));
        }
        while (i10 < i14) {
            int i15 = this.f7185c * i10;
            for (int i16 = i3; i16 < i13; i16++) {
                int[] iArr = this.f7186d;
                int i17 = (i16 / 32) + i15;
                iArr[i17] = iArr[i17] | (1 << (i16 & 31));
            }
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f7183a + 1) * this.f7184b);
        for (int i3 = 0; i3 < this.f7184b; i3++) {
            for (int i10 = 0; i10 < this.f7183a; i10++) {
                sb2.append(b(i10, i3) ? StubApp.getString2(6163) : StubApp.getString2(6127));
            }
            sb2.append(StubApp.getString2(3692));
        }
        return sb2.toString();
    }
}
