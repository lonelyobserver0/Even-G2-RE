package i6;

import N5.o;
import T5.b;
import java.util.Arrays;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1060a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14849a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14850b = {6, 2, 7, 3};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14851c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14852d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f14853e = {0, 180, 270, 90};

    public static int[] a(b bVar, int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i12 = 0;
        while (bVar.b(i3, i10) && i3 > 0) {
            int i13 = i12 + 1;
            if (i12 >= 3) {
                break;
            }
            i3--;
            i12 = i13;
        }
        int length = iArr.length;
        int i14 = i3;
        int i15 = 0;
        boolean z2 = false;
        while (i3 < i11) {
            if (bVar.b(i3, i10) != z2) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else {
                    if (c(iArr2, iArr) < 0.42f) {
                        return new int[]{i14, i3};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i16 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z2 = !z2;
            }
            i3++;
        }
        if (i15 != length - 1 || c(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i14, i3 - 1};
    }

    public static o[] b(b bVar, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        boolean z2;
        int[] a3;
        o[] oVarArr = new o[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i15 = i11;
        while (true) {
            if (i15 >= i3) {
                i14 = i15;
                z2 = false;
                break;
            }
            int[] a9 = a(bVar, i12, i15, i10, iArr2, iArr3);
            if (a9 != null) {
                int[] iArr4 = a9;
                while (true) {
                    i14 = i15;
                    if (i14 <= 0 || (a3 = a(bVar, i12, i14 - 1, i10, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = a3;
                }
                float f10 = i14;
                oVarArr[0] = new o(iArr4[0], f10);
                oVarArr[1] = new o(iArr4[1], f10);
                z2 = true;
            } else {
                i15 += 5;
                iArr2 = iArr;
            }
        }
        int i16 = i14 + 1;
        if (z2) {
            int[] iArr5 = {(int) oVarArr[0].f4926a, (int) oVarArr[1].f4926a};
            int i17 = i16;
            int i18 = 0;
            while (i17 < i3) {
                int[] a10 = a(bVar, iArr5[0], i17, i10, iArr, iArr3);
                if (a10 != null && Math.abs(iArr5[0] - a10[0]) < 5 && Math.abs(iArr5[1] - a10[1]) < 5) {
                    iArr5 = a10;
                    i18 = 0;
                } else {
                    if (i18 > 25) {
                        break;
                    }
                    i18++;
                }
                i17++;
            }
            i16 = i17 - (i18 + 1);
            float f11 = i16;
            oVarArr[2] = new o(iArr5[0], f11);
            oVarArr[3] = new o(iArr5[1], f11);
        }
        if (i16 - i14 < i13) {
            Arrays.fill(oVarArr, (Object) null);
        }
        return oVarArr;
    }

    public static float c(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i3 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i3 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i3;
        float f11 = f10 / i10;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            float f14 = iArr2[i12] * f11;
            float f15 = iArr[i12];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
