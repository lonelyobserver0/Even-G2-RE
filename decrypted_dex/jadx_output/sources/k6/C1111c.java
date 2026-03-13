package k6;

import kotlin.jvm.internal.IntCompanionObject;
import w.AbstractC1856e;

/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1111c {

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f15454c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a, reason: collision with root package name */
    public final int f15455a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f15456b;

    public C1111c(int i3) {
        int i10 = (i3 >> 3) & 3;
        if (i10 < 0 || i10 >= 4) {
            throw new IllegalArgumentException();
        }
        this.f15455a = AbstractC1110b.f15453a[i10];
        this.f15456b = (byte) (i3 & 7);
    }

    public static C1111c a(int i3, int i10) {
        int bitCount;
        int[][] iArr = f15454c;
        int i11 = IntCompanionObject.MAX_VALUE;
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            int[] iArr2 = iArr[i13];
            int i14 = iArr2[0];
            if (i14 == i3 || i14 == i10) {
                return new C1111c(iArr2[1]);
            }
            int bitCount2 = Integer.bitCount(i3 ^ i14);
            if (bitCount2 < i11) {
                i12 = iArr2[1];
                i11 = bitCount2;
            }
            if (i3 != i10 && (bitCount = Integer.bitCount(i14 ^ i10)) < i11) {
                i12 = iArr2[1];
                i11 = bitCount;
            }
        }
        if (i11 <= 3) {
            return new C1111c(i12);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1111c)) {
            return false;
        }
        C1111c c1111c = (C1111c) obj;
        return this.f15455a == c1111c.f15455a && this.f15456b == c1111c.f15456b;
    }

    public final int hashCode() {
        return (AbstractC1856e.c(this.f15455a) << 3) | this.f15456b;
    }
}
