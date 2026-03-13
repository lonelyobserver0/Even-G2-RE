package org.bouncycastle.pqc.crypto.newhope;

import kotlin.UShort;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    public static short barrett(short s10) {
        int i3 = s10 & UShort.MAX_VALUE;
        return (short) (i3 - (((i3 * 5) >>> 16) * 12289));
    }

    public static short montgomery(int i3) {
        return (short) (((((i3 * QInv) & RMask) * 12289) + i3) >>> 18);
    }
}
