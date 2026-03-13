package g6;

import f6.AbstractC0927a;
import java.lang.reflect.Array;

/* renamed from: g6.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC0960e {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f14232a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i3;
        for (int i10 = 0; i10 < 2787; i10++) {
            int i11 = AbstractC0927a.f14153b[i10];
            int i12 = i11 & 1;
            int i13 = 0;
            while (i13 < 8) {
                float f10 = 0.0f;
                while (true) {
                    i3 = i11 & 1;
                    if (i3 == i12) {
                        f10 += 1.0f;
                        i11 >>= 1;
                    }
                }
                f14232a[i10][7 - i13] = f10 / 17.0f;
                i13++;
                i12 = i3;
            }
        }
    }
}
