package org.bouncycastle.math.raw;

import com.stub.StubApp;
import i2.u;
import java.util.Random;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Mod {
    private static final int M30 = 1073741823;
    private static final long M32L = 4294967295L;

    private static int add30(int i3, int[] iArr, int[] iArr2) {
        int i10 = i3 - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12] + iArr2[i12] + i11;
            iArr[i12] = M30 & i13;
            i11 = i13 >> 30;
        }
        int i14 = iArr[i10] + iArr2[i10] + i11;
        iArr[i10] = i14;
        return i14 >> 30;
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException(StubApp.getString2(33018));
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new ArithmeticException(StubApp.getString2(33018));
        }
    }

    private static void cnegate30(int i3, int i10, int[] iArr) {
        int i11 = i3 - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = ((iArr[i13] ^ i10) - i10) + i12;
            iArr[i13] = M30 & i14;
            i12 = i14 >> 30;
        }
        iArr[i11] = ((iArr[i11] ^ i10) - i10) + i12;
    }

    private static void cnormalize30(int i3, int i10, int[] iArr, int[] iArr2) {
        int i11 = i3 - 1;
        int i12 = iArr[i11] >> 31;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = (((iArr[i14] + (iArr2[i14] & i12)) ^ i10) - i10) + i13;
            iArr[i14] = i15 & M30;
            i13 = i15 >> 30;
        }
        int i16 = (((iArr[i11] + (i12 & iArr2[i11])) ^ i10) - i10) + i13;
        iArr[i11] = i16;
        int i17 = i16 >> 31;
        int i18 = 0;
        for (int i19 = 0; i19 < i11; i19++) {
            int i20 = iArr[i19] + (iArr2[i19] & i17) + i18;
            iArr[i19] = i20 & M30;
            i18 = i20 >> 30;
        }
        iArr[i11] = iArr[i11] + (i17 & iArr2[i11]) + i18;
    }

    private static void decode30(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = 0;
        long j = 0;
        while (i3 > 0) {
            while (i12 < Math.min(32, i3)) {
                j |= iArr[i10] << i12;
                i12 += 30;
                i10++;
            }
            iArr2[i11] = (int) j;
            j >>>= 32;
            i12 -= 32;
            i3 -= 32;
            i11++;
        }
    }

    private static int divsteps30(int i3, int i10, int i11, int[] iArr) {
        int i12 = 1073741824;
        int i13 = 1073741824;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < 30; i16++) {
            int i17 = i3 >> 31;
            int i18 = -(i11 & 1);
            int i19 = i11 - ((i10 ^ i17) & i18);
            int i20 = i15 - ((i12 ^ i17) & i18);
            int i21 = i13 - ((i14 ^ i17) & i18);
            int i22 = (~i17) & i18;
            i3 = (i3 ^ i22) - (i22 - 1);
            i10 += i19 & i22;
            i12 += i20 & i22;
            i14 += i22 & i21;
            i11 = i19 >> 1;
            i15 = i20 >> 1;
            i13 = i21 >> 1;
        }
        iArr[0] = i12;
        iArr[1] = i14;
        iArr[2] = i15;
        iArr[3] = i13;
        return i3;
    }

    private static int divsteps30Var(int i3, int i10, int i11, int[] iArr) {
        int i12;
        int i13 = 30;
        int i14 = 1;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int numberOfTrailingZeros = Integers.numberOfTrailingZeros(((-1) << i13) | i11);
            int i18 = i11 >> numberOfTrailingZeros;
            i14 <<= numberOfTrailingZeros;
            i16 <<= numberOfTrailingZeros;
            i3 -= numberOfTrailingZeros;
            i13 -= numberOfTrailingZeros;
            if (i13 <= 0) {
                iArr[0] = i14;
                iArr[1] = i16;
                iArr[2] = i17;
                iArr[3] = i15;
                return i3;
            }
            if (i3 < 0) {
                i3 = -i3;
                int i19 = -i10;
                int i20 = -i14;
                int i21 = -i16;
                int i22 = i3 + 1;
                if (i22 > i13) {
                    i22 = i13;
                }
                i12 = ((-1) >>> (32 - i22)) & 63 & (((i18 * i18) - 2) * i18 * i19);
                i18 = i19;
                i10 = i18;
                int i23 = i17;
                i17 = i20;
                i14 = i23;
                int i24 = i15;
                i15 = i21;
                i16 = i24;
            } else {
                int i25 = i3 + 1;
                if (i25 > i13) {
                    i25 = i13;
                }
                i12 = ((-1) >>> (32 - i25)) & 15 & ((-((((i10 + 1) & 4) << 1) + i10)) * i18);
            }
            i11 = i18 + (i10 * i12);
            i17 += i14 * i12;
            i15 += i12 * i16;
        }
    }

    private static void encode30(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = 0;
        long j = 0;
        while (i3 > 0) {
            if (i12 < Math.min(30, i3)) {
                j |= (iArr[i10] & 4294967295L) << i12;
                i12 += 32;
                i10++;
            }
            iArr2[i11] = ((int) j) & M30;
            j >>>= 30;
            i12 -= 30;
            i3 -= 30;
            i11++;
        }
    }

    private static int getMaximumDivsteps(int i3) {
        return ((i3 * 49) + (i3 < 46 ? 80 : 47)) / 17;
    }

    public static int inverse32(int i3) {
        int i10 = (2 - (i3 * i3)) * i3;
        int i11 = (2 - (i3 * i10)) * i10;
        int i12 = (2 - (i3 * i11)) * i11;
        return (2 - (i3 * i12)) * i12;
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int numberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i3 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[i3];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        iArr6[0] = 1;
        encode30(numberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(numberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i3);
        int inverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(numberOfLeadingZeros);
        int i10 = 0;
        for (int i11 = 0; i11 < maximumDivsteps; i11 += 30) {
            i10 = divsteps30(i10, iArr7[0], iArr8[0], iArr4);
            updateDE30(i3, iArr5, iArr6, iArr4, inverse32, iArr9);
            updateFG30(i3, iArr7, iArr8, iArr4);
        }
        int i12 = iArr7[i3 - 1] >> 31;
        cnegate30(i3, i12, iArr7);
        cnormalize30(i3, i12, iArr5, iArr9);
        decode30(numberOfLeadingZeros, iArr5, 0, iArr3, 0);
        return Nat.equalTo(i3, iArr7, 1) & Nat.equalToZero(i3, iArr8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r17v1 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        boolean z2 = true;
        int numberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i3 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[i3];
        int[] iArr7 = new int[i3];
        int[] iArr8 = new int[i3];
        int[] iArr9 = new int[i3];
        ?? r11 = 0;
        iArr6[0] = 1;
        encode30(numberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(numberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i3);
        int i10 = i3 - 1;
        int numberOfLeadingZeros2 = (-1) - (Integers.numberOfLeadingZeros(iArr8[i10] | 1) - (((i3 * 30) + 2) - numberOfLeadingZeros));
        int inverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(numberOfLeadingZeros);
        int i11 = i3;
        int i12 = 0;
        while (!Nat.isZero(i11, iArr8)) {
            if (i12 >= maximumDivsteps) {
                return r11;
            }
            i12 += 30;
            boolean z10 = z2;
            ?? r17 = r11;
            int divsteps30Var = divsteps30Var(numberOfLeadingZeros2, iArr7[r11], iArr8[r17], iArr4);
            int i13 = inverse32;
            updateDE30(i3, iArr5, iArr6, iArr4, i13, iArr9);
            updateFG30(i11, iArr7, iArr8, iArr4);
            int i14 = i11 - 1;
            int i15 = iArr7[i14];
            int i16 = iArr8[i14];
            int i17 = i11 - 2;
            if (((i17 >> 31) | (i15 ^ (i15 >> 31)) | (i16 ^ (i16 >> 31))) == 0) {
                iArr7[i17] = iArr7[i17] | (i15 << 30);
                iArr8[i17] = (i16 << 30) | iArr8[i17];
                i11--;
            }
            inverse32 = i13;
            r11 = r17;
            numberOfLeadingZeros2 = divsteps30Var;
            z2 = z10;
        }
        boolean z11 = z2;
        boolean z12 = r11;
        int i18 = iArr7[i11 - 1] >> 31;
        int i19 = iArr5[i10] >> 31;
        if (i19 < 0) {
            i19 = add30(i3, iArr5, iArr9);
        }
        if (i18 < 0) {
            i19 = negate30(i3, iArr5);
            negate30(i11, iArr7);
        }
        if (!Nat.isOne(i11, iArr7)) {
            return z12;
        }
        if (i19 < 0) {
            add30(i3, iArr5, iArr9);
        }
        decode30(numberOfLeadingZeros, iArr5, z12 ? 1 : 0, iArr3, z12 ? 1 : 0);
        return z11;
    }

    private static int negate30(int i3, int[] iArr) {
        int i10 = i3 - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i11 - iArr[i12];
            iArr[i12] = M30 & i13;
            i11 = i13 >> 30;
        }
        int i14 = i11 - iArr[i10];
        iArr[i10] = i14;
        return i14 >> 30;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] create = Nat.create(length);
        int i3 = length - 1;
        int i10 = iArr[i3];
        int i11 = i10 | (i10 >>> 1);
        int i12 = i11 | (i11 >>> 2);
        int i13 = i12 | (i12 >>> 4);
        int i14 = i13 | (i13 >>> 8);
        int i15 = i14 | (i14 >>> 16);
        do {
            for (int i16 = 0; i16 != length; i16++) {
                create[i16] = random.nextInt();
            }
            create[i3] = create[i3] & i15;
        } while (Nat.gte(length, create, iArr));
        return create;
    }

    private static void updateDE30(int i3, int[] iArr, int[] iArr2, int[] iArr3, int i10, int[] iArr4) {
        int i11 = i3;
        int i12 = iArr3[0];
        int i13 = iArr3[1];
        int i14 = iArr3[2];
        int i15 = iArr3[3];
        int i16 = i11 - 1;
        int i17 = iArr[i16] >> 31;
        int i18 = iArr2[i16] >> 31;
        int i19 = (i12 & i17) + (i13 & i18);
        int i20 = (i17 & i14) + (i18 & i15);
        int i21 = iArr4[0];
        long j = i12;
        long j3 = iArr[0];
        long j10 = i13;
        long j11 = iArr2[0];
        long j12 = (j10 * j11) + (j * j3);
        long j13 = i14;
        long j14 = i15;
        long j15 = (j14 * j11) + (j3 * j13);
        int i22 = i19 - (((((int) j12) * i10) + i19) & M30);
        long j16 = i21;
        long j17 = i22;
        long j18 = (j16 * j17) + j12;
        long j19 = i20 - (((((int) j15) * i10) + i20) & M30);
        char c10 = 30;
        long j20 = j18 >> 30;
        long j21 = ((j16 * j19) + j15) >> 30;
        int i23 = 1;
        while (i23 < i11) {
            int i24 = iArr4[i23];
            char c11 = c10;
            long j22 = j19;
            long j23 = iArr[i23];
            long j24 = j * j23;
            long j25 = iArr2[i23];
            long j26 = i24;
            long j27 = j17;
            long i25 = u.i(j26, j27, (j10 * j25) + j24, j20);
            long i26 = u.i(j26, j22, (j25 * j14) + (j13 * j23), j21);
            int i27 = i23 - 1;
            iArr[i27] = ((int) i25) & M30;
            j20 = i25 >> c11;
            iArr2[i27] = ((int) i26) & M30;
            j21 = i26 >> c11;
            i23++;
            i11 = i3;
            c10 = c11;
            j17 = j27;
            j19 = j22;
        }
        iArr[i16] = (int) j20;
        iArr2[i16] = (int) j21;
    }

    private static void updateFG30(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = iArr3[0];
        int i11 = 1;
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        long j = i10;
        long j3 = iArr[0];
        long j10 = i12;
        long j11 = iArr2[0];
        long j12 = (j10 * j11) + (j * j3);
        long j13 = i13;
        long j14 = i14;
        long j15 = ((j11 * j14) + (j3 * j13)) >> 30;
        int i15 = 1;
        long j16 = j12 >> 30;
        while (i15 < i3) {
            long j17 = iArr[i15];
            int i16 = i11;
            long j18 = j13;
            long j19 = iArr2[i15];
            long i17 = u.i(j10, j19, j * j17, j16);
            long j20 = j14;
            long i18 = u.i(j20, j19, j18 * j17, j15);
            int i19 = i15 - 1;
            iArr[i19] = ((int) i17) & M30;
            j16 = i17 >> 30;
            iArr2[i19] = ((int) i18) & M30;
            j15 = i18 >> 30;
            i15++;
            i11 = i16;
            j14 = j20;
            j13 = j18;
        }
        int i20 = i3 - i11;
        iArr[i20] = (int) j16;
        iArr2[i20] = (int) j15;
    }
}
