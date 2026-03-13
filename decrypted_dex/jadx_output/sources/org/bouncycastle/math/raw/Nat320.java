package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Nat320 {
    public static void copy64(long[] jArr, int i3, long[] jArr2, int i10) {
        jArr2[i10] = jArr[i3];
        jArr2[i10 + 1] = jArr[i3 + 1];
        jArr2[i10 + 2] = jArr[i3 + 2];
        jArr2[i10 + 3] = jArr[i3 + 3];
        jArr2[i10 + 4] = jArr[i3 + 4];
    }

    public static long[] create64() {
        return new long[5];
    }

    public static long[] createExt64() {
        return new long[10];
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i3 = 4; i3 >= 0; i3--) {
            if (jArr[i3] != jArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i3 = 0; i3 < 5; i3++) {
            create64[i3] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i3 = 1; i3 < 5; i3++) {
            if (jArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i3 = 0; i3 < 5; i3++) {
            if (jArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[40];
        for (int i3 = 0; i3 < 5; i3++) {
            long j = jArr[i3];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (4 - i3) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }
}
