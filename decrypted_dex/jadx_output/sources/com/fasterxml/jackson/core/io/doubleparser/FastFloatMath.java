package com.fasterxml.jackson.core.io.doubleparser;

import com.fasterxml.jackson.core.io.doubleparser.FastDoubleMath;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
abstract class FastFloatMath {
    private static final float[] FLOAT_POWER_OF_TEN = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    public static float decFloatLiteralToFloat(boolean z2, long j, int i3, boolean z10, int i10) {
        if (j == 0) {
            return z2 ? -0.0f : 0.0f;
        }
        if (!z10) {
            if (-45 > i3 || i3 > 38) {
                return Float.NaN;
            }
            return tryDecToFloatWithFastAlgorithm(z2, j, i3);
        }
        if (-45 <= i10 && i10 <= 38) {
            float tryDecToFloatWithFastAlgorithm = tryDecToFloatWithFastAlgorithm(z2, j, i10);
            float tryDecToFloatWithFastAlgorithm2 = tryDecToFloatWithFastAlgorithm(z2, j + 1, i10);
            if (!Float.isNaN(tryDecToFloatWithFastAlgorithm) && tryDecToFloatWithFastAlgorithm2 == tryDecToFloatWithFastAlgorithm) {
                return tryDecToFloatWithFastAlgorithm;
            }
        }
        return Float.NaN;
    }

    public static float hexFloatLiteralToFloat(boolean z2, long j, int i3, boolean z10, int i10) {
        if (j == 0) {
            return z2 ? -0.0f : 0.0f;
        }
        if (!z10) {
            if (-126 > i3 || i3 > 127) {
                return Float.NaN;
            }
            return tryHexToFloatWithFastAlgorithm(z2, j, i3);
        }
        if (-126 <= i10 && i10 <= 127) {
            float tryHexToFloatWithFastAlgorithm = tryHexToFloatWithFastAlgorithm(z2, j, i10);
            float tryHexToFloatWithFastAlgorithm2 = tryHexToFloatWithFastAlgorithm(z2, j + 1, i10);
            if (!Double.isNaN(tryHexToFloatWithFastAlgorithm) && tryHexToFloatWithFastAlgorithm2 == tryHexToFloatWithFastAlgorithm) {
                return tryHexToFloatWithFastAlgorithm;
            }
        }
        return Float.NaN;
    }

    public static float tryDecToFloatWithFastAlgorithm(boolean z2, long j, int i3) {
        float f10;
        long j3;
        if (-10 <= i3 && i3 <= 10 && Long.compareUnsigned(j, 16777215L) <= 0) {
            float f11 = j;
            float f12 = i3 < 0 ? f11 / FLOAT_POWER_OF_TEN[-i3] : f11 * FLOAT_POWER_OF_TEN[i3];
            return z2 ? -f12 : f12;
        }
        int i10 = i3 + 325;
        long j10 = FastDoubleMath.MANTISSA_64[i10];
        long j11 = ((i3 * 217706) >> 16) + 191;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long j12 = j << numberOfLeadingZeros;
        FastDoubleMath.UInt128 fullMultiplication = FastDoubleMath.fullMultiplication(j12, j10);
        long j13 = fullMultiplication.low;
        long j14 = fullMultiplication.high;
        if ((j14 & 274877906943L) != 274877906943L || Long.compareUnsigned(j13 + j12, j13) >= 0) {
            f10 = Float.NaN;
            j3 = 0;
        } else {
            FastDoubleMath.UInt128 fullMultiplication2 = FastDoubleMath.fullMultiplication(j12, FastDoubleMath.MANTISSA_128[i10]);
            long j15 = fullMultiplication2.low;
            f10 = Float.NaN;
            j3 = 0;
            long j16 = fullMultiplication2.high + j13;
            if (Long.compareUnsigned(j16, j13) < 0) {
                j14++;
            }
            if (j16 + 1 == 0 && (j14 & 549755813887L) == 549755813887L && j15 + Long.compareUnsigned(j12, j15) < 0) {
                return Float.NaN;
            }
        }
        long j17 = j14 >>> 63;
        long j18 = j14 >>> ((int) (38 + j17));
        int i11 = numberOfLeadingZeros + ((int) (j17 ^ 1));
        long j19 = j14 & 274877906943L;
        if (j19 != 274877906943L && (j19 != j3 || (3 & j18) != 1)) {
            long j20 = (j18 + 1) >>> 1;
            if (j20 >= 16777216) {
                i11--;
                j20 = 8388608;
            }
            long j21 = j20 & (-8388609);
            long j22 = j11 - i11;
            if (j22 >= 1 && j22 <= 254) {
                return Float.intBitsToFloat((int) (j21 | (j22 << 23) | (z2 ? 2147483648L : j3)));
            }
        }
        return f10;
    }

    public static float tryHexToFloatWithFastAlgorithm(boolean z2, long j, int i3) {
        if (j == 0 || i3 < -180) {
            return z2 ? -0.0f : 0.0f;
        }
        if (i3 > 127) {
            return z2 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        if (Long.compareUnsigned(j, 9007199254740991L) > 0) {
            return Float.NaN;
        }
        float scalb = Math.scalb(1.0f, i3) * j;
        return z2 ? -scalb : scalb;
    }
}
