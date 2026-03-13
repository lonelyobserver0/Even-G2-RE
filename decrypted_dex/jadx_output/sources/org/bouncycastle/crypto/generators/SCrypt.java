package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SCrypt {
    private SCrypt() {
    }

    private static void BlockMix(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i3) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = i3 * 2; i12 > 0; i12--) {
            Xor(iArr2, iArr, i10, iArr3);
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i11, 16);
            i11 = (length + i10) - i11;
            i10 += 16;
        }
    }

    private static void Clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    private static void ClearAll(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            Clear(iArr2);
        }
    }

    private static byte[] MFcrypt(byte[] bArr, byte[] bArr2, int i3, int i10, int i11, int i12) {
        int i13 = i10 * 128;
        byte[] SingleIterationPBKDF2 = SingleIterationPBKDF2(bArr, bArr2, i11 * i13);
        int[] iArr = null;
        try {
            int length = SingleIterationPBKDF2.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(SingleIterationPBKDF2, 0, iArr);
            int i14 = 0;
            for (int i15 = i3 * i10; i3 - i14 > 2 && i15 > 1024; i15 >>>= 1) {
                i14++;
            }
            int i16 = i13 >>> 2;
            for (int i17 = 0; i17 < length; i17 += i16) {
                SMix(iArr, i17, i3, i14, i10);
            }
            Pack.intToLittleEndian(iArr, SingleIterationPBKDF2, 0);
            byte[] SingleIterationPBKDF22 = SingleIterationPBKDF2(bArr, SingleIterationPBKDF2, i12);
            Clear(SingleIterationPBKDF2);
            Clear(iArr);
            return SingleIterationPBKDF22;
        } catch (Throwable th) {
            Clear(SingleIterationPBKDF2);
            Clear(iArr);
            throw th;
        }
    }

    private static void SMix(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i10 >>> i11;
        int i14 = 1 << i11;
        int i15 = i13 - 1;
        int numberOfTrailingZeros = Integers.numberOfTrailingZeros(i10) - i11;
        int i16 = i12 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i16];
        int[] iArr5 = new int[i16];
        int[][] iArr6 = new int[i14][];
        try {
            System.arraycopy(iArr, i3, iArr5, 0, i16);
            int i17 = 0;
            while (i17 < i14) {
                int[] iArr7 = new int[i13 * i16];
                iArr6[i17] = iArr7;
                int i18 = numberOfTrailingZeros;
                int i19 = i14;
                int i20 = 0;
                for (int i21 = 0; i21 < i13; i21 += 2) {
                    System.arraycopy(iArr5, 0, iArr7, i20, i16);
                    int i22 = i20 + i16;
                    BlockMix(iArr5, iArr2, iArr3, iArr4, i12);
                    System.arraycopy(iArr4, 0, iArr7, i22, i16);
                    i20 = i22 + i16;
                    BlockMix(iArr4, iArr2, iArr3, iArr5, i12);
                }
                i17++;
                numberOfTrailingZeros = i18;
                i14 = i19;
            }
            int i23 = numberOfTrailingZeros;
            int i24 = i10 - 1;
            for (int i25 = 0; i25 < i10; i25++) {
                int i26 = iArr5[i16 - 16] & i24;
                System.arraycopy(iArr6[i26 >>> i23], (i26 & i15) * i16, iArr4, 0, i16);
                Xor(iArr4, iArr5, 0, iArr4);
                BlockMix(iArr4, iArr2, iArr3, iArr5, i12);
            }
            System.arraycopy(iArr5, 0, iArr, i3, i16);
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th) {
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th;
        }
    }

    private static byte[] SingleIterationPBKDF2(byte[] bArr, byte[] bArr2, int i3) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i3 * 8)).getKey();
    }

    private static void Xor(int[] iArr, int[] iArr2, int i3, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i3 + length];
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i3, int i10, int i11, int i12) {
        if (bArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(28996));
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException(StubApp.getString2(28995));
        }
        if (i3 <= 1 || !isPowerOf2(i3)) {
            throw new IllegalArgumentException(StubApp.getString2(28994));
        }
        if (i10 == 1 && i3 >= 65536) {
            throw new IllegalArgumentException(StubApp.getString2(28989));
        }
        if (i10 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(28993));
        }
        int i13 = IntCompanionObject.MAX_VALUE / (i10 * 1024);
        if (i11 < 1 || i11 > i13) {
            throw new IllegalArgumentException(AbstractC1482f.e(i13, StubApp.getString2(28991), i10, StubApp.getString2(28992), StubApp.getString2(74)));
        }
        if (i12 >= 1) {
            return MFcrypt(bArr, bArr2, i3, i10, i11, i12);
        }
        throw new IllegalArgumentException(StubApp.getString2(28990));
    }

    private static boolean isPowerOf2(int i3) {
        return (i3 & (i3 + (-1))) == 0;
    }

    private static void Clear(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }
}
