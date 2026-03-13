package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RandUtils {
    public static int nextInt(SecureRandom secureRandom, int i3) {
        int nextInt;
        int i10;
        if (((-i3) & i3) == i3) {
            return (int) ((i3 * (secureRandom.nextInt() >>> 1)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() >>> 1;
            i10 = nextInt % i3;
        } while ((i3 - 1) + (nextInt - i10) < 0);
        return i10;
    }
}
