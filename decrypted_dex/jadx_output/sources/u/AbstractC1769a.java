package u;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1769a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f21382a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f21383b = new Object[0];

    public static final int a(int i3, int i10, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i11 = i3 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] array, int i3, long j) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = i3 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j3 = array[i12];
            if (j3 < j) {
                i11 = i12 + 1;
            } else {
                if (j3 <= j) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }
}
