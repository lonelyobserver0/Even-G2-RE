package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class IntUtils {
    private IntUtils() {
    }

    public static int[] clone(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z2 &= iArr[length] == iArr2[length];
        }
        return z2;
    }

    public static void fill(int[] iArr, int i3) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = i3;
        }
    }

    private static int partition(int[] iArr, int i3, int i10, int i11) {
        int i12 = iArr[i11];
        iArr[i11] = iArr[i10];
        iArr[i10] = i12;
        int i13 = i3;
        while (i3 < i10) {
            int i14 = iArr[i3];
            if (i14 <= i12) {
                int i15 = iArr[i13];
                iArr[i13] = i14;
                iArr[i3] = i15;
                i13++;
            }
            i3++;
        }
        int i16 = iArr[i13];
        iArr[i13] = iArr[i10];
        iArr[i10] = i16;
        return i13;
    }

    public static void quicksort(int[] iArr) {
        quicksort(iArr, 0, iArr.length - 1);
    }

    public static int[] subArray(int[] iArr, int i3, int i10) {
        int i11 = i10 - i3;
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, i3, iArr2, 0, i11);
        return iArr2;
    }

    public static String toHexString(int[] iArr) {
        return ByteUtils.toHexString(BigEndianConversions.toByteArray(iArr));
    }

    public static String toString(int[] iArr) {
        String str = "";
        for (int i3 : iArr) {
            str = AbstractC1482f.f(i3, StubApp.getString2(397), AbstractC1856e.b(str));
        }
        return str;
    }

    public static void quicksort(int[] iArr, int i3, int i10) {
        if (i10 > i3) {
            int partition = partition(iArr, i3, i10, i10);
            quicksort(iArr, i3, partition - 1);
            quicksort(iArr, partition + 1, i10);
        }
    }
}
