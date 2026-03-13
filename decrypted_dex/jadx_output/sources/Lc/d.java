package Lc;

import Kc.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class d {
    public static final int a(E e10, int i3) {
        int i10;
        Intrinsics.checkNotNullParameter(e10, "<this>");
        int[] iArr = e10.f3787f;
        int i11 = i3 + 1;
        int length = e10.f3786e.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 >= i11) {
                    if (i14 <= i11) {
                        break;
                    }
                    i12 = i10 - 1;
                } else {
                    i13 = i10 + 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        return i10 >= 0 ? i10 : ~i10;
    }
}
