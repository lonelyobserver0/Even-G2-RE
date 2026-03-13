package org.bouncycastle.pqc.crypto.ntruprime;

import com.stub.StubApp;
import i2.u;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static int bToUnsignedInt(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }

    public static void checkForSmallPolynomial(byte[] bArr, byte[] bArr2, int i3, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 != bArr2.length; i12++) {
            i11 += bArr2[i12] & 1;
        }
        int checkNotEqualToZero = checkNotEqualToZero(i11 - i10);
        for (int i13 = 0; i13 < i10; i13++) {
            bArr[i13] = (byte) (((bArr2[i13] ^ 1) & (~checkNotEqualToZero)) ^ 1);
        }
        while (i10 < i3) {
            bArr[i10] = (byte) (bArr2[i10] & (~checkNotEqualToZero));
            i10++;
        }
    }

    private static int checkLessThanZero(int i3) {
        return -(i3 >>> 31);
    }

    private static int checkNotEqualToZero(int i3) {
        return -((int) ((-iToUnsignedLong(i3)) >>> 63));
    }

    public static void cryptoSort(int[] iArr, int i3) {
        if (i3 < 2) {
            return;
        }
        int i10 = 1;
        while (i10 < i3 - i10) {
            i10 += i10;
        }
        for (int i11 = i10; i11 > 0; i11 >>>= 1) {
            for (int i12 = 0; i12 < i3 - i11; i12++) {
                if ((i12 & i11) == 0) {
                    minmax(iArr, i12, i12 + i11);
                }
            }
            for (int i13 = i10; i13 > i11; i13 >>>= 1) {
                for (int i14 = 0; i14 < i3 - i13; i14++) {
                    if ((i14 & i11) == 0) {
                        minmax(iArr, i14 + i11, i14 + i13);
                    }
                }
            }
        }
    }

    private static void decode(short[] sArr, byte[] bArr, short[] sArr2, int i3, int i10, int i11) {
        int i12;
        if (i3 == 1) {
            short s10 = sArr2[0];
            if (s10 == 1) {
                sArr[i10] = 0;
            } else if (s10 <= 256) {
                sArr[i10] = (short) getUnsignedMod(bToUnsignedInt(bArr[i11]), sArr2[0]);
            } else {
                sArr[i10] = (short) getUnsignedMod(bToUnsignedInt(bArr[i11]) + (bArr[i11 + 1] << 8), sArr2[0]);
            }
        }
        if (i3 > 1) {
            int i13 = (i3 + 1) / 2;
            short[] sArr3 = new short[i13];
            short[] sArr4 = new short[i13];
            int i14 = i3 / 2;
            short[] sArr5 = new short[i14];
            int[] iArr = new int[i14];
            int i15 = i11;
            int i16 = 0;
            while (true) {
                i12 = i3 - 1;
                if (i16 >= i12) {
                    break;
                }
                int i17 = sArr2[i16] * sArr2[i16 + 1];
                if (i17 > 4194048) {
                    int i18 = i16 / 2;
                    iArr[i18] = 65536;
                    sArr5[i18] = (short) ((bToUnsignedInt(bArr[i15 + 1]) * 256) + bToUnsignedInt(bArr[i15]));
                    i15 += 2;
                    sArr4[i18] = (short) ((((i17 + 255) >>> 8) + 255) >>> 8);
                } else if (i17 >= 16384) {
                    int i19 = i16 / 2;
                    iArr[i19] = 256;
                    sArr5[i19] = (short) bToUnsignedInt(bArr[i15]);
                    i15++;
                    sArr4[i19] = (short) ((i17 + 255) >>> 8);
                } else {
                    int i20 = i16 / 2;
                    iArr[i20] = 1;
                    sArr5[i20] = 0;
                    sArr4[i20] = (short) i17;
                }
                i16 += 2;
            }
            if (i16 < i3) {
                sArr4[i16 / 2] = sArr2[i16];
            }
            decode(sArr3, bArr, sArr4, i13, i10, i15);
            int i21 = i10;
            int i22 = 0;
            while (i22 < i12) {
                int i23 = i22 / 2;
                int[] unsignedDivMod = getUnsignedDivMod((iArr[i23] * sToUnsignedInt(sArr3[i23])) + sToUnsignedInt(sArr5[i23]), sArr2[i22]);
                int i24 = i21 + 1;
                sArr[i21] = (short) unsignedDivMod[1];
                i21 += 2;
                sArr[i24] = (short) getUnsignedMod(unsignedDivMod[0], sArr2[i22 + 1]);
                i22 += 2;
            }
            if (i22 < i3) {
                sArr[i21] = sArr3[i22 / 2];
            }
        }
    }

    private static void encode(byte[] bArr, short[] sArr, short[] sArr2, int i3, int i10) {
        int i11 = 0;
        if (i3 == 1) {
            short s10 = sArr[0];
            short s11 = sArr2[0];
            while (s11 > 1) {
                bArr[i10] = (byte) s10;
                s10 = (short) (s10 >>> 8);
                s11 = (short) ((s11 + 255) >>> 8);
                i10++;
            }
        }
        if (i3 > 1) {
            int i12 = (i3 + 1) / 2;
            short[] sArr3 = new short[i12];
            short[] sArr4 = new short[i12];
            while (i11 < i3 - 1) {
                short s12 = sArr2[i11];
                int i13 = i11 + 1;
                int i14 = (sArr[i13] * s12) + sArr[i11];
                int i15 = sArr2[i13] * s12;
                while (i15 >= 16384) {
                    bArr[i10] = (byte) i14;
                    i14 >>>= 8;
                    i15 = (i15 + 255) >>> 8;
                    i10++;
                }
                int i16 = i11 / 2;
                sArr3[i16] = (short) i14;
                sArr4[i16] = (short) i15;
                i11 += 2;
            }
            if (i11 < i3) {
                int i17 = i11 / 2;
                sArr3[i17] = sArr[i11];
                sArr4[i17] = sArr2[i11];
            }
            encode(bArr, sArr3, sArr4, i12, i10);
        }
    }

    public static void expand(int[] iArr, byte[] bArr) {
        byte[] bArr2 = new byte[iArr.length * 4];
        byte[] bArr3 = new byte[iArr.length * 4];
        generateAES256CTRStream(bArr2, bArr3, new byte[16], bArr);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i10 = i3 * 4;
            iArr[i3] = bToUnsignedInt(bArr3[i10]) + (bToUnsignedInt(bArr3[i10 + 1]) << 8) + (bToUnsignedInt(bArr3[i10 + 2]) << 16) + (bToUnsignedInt(bArr3[i10 + 3]) << 24);
        }
    }

    private static void generateAES256CTRStream(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        SICBlockCipher sICBlockCipher = new SICBlockCipher(new AESEngine());
        sICBlockCipher.init(true, new ParametersWithIV(new KeyParameter(bArr4), bArr3));
        sICBlockCipher.processBytes(bArr, 0, bArr2.length, bArr2, 0);
    }

    public static void generatePolynomialInRQFromSeed(short[] sArr, byte[] bArr, int i3, int i10) {
        int[] iArr = new int[i3];
        expand(iArr, bArr);
        for (int i11 = 0; i11 < i3; i11++) {
            sArr[i11] = (short) (getUnsignedMod(iArr[i11], i10) - ((i10 - 1) / 2));
        }
    }

    public static void getDecodedPolynomial(short[] sArr, byte[] bArr, int i3, int i10) {
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            sArr3[i11] = (short) i10;
        }
        decode(sArr2, bArr, sArr3, i3, 0, 0);
        for (int i12 = 0; i12 < i3; i12++) {
            sArr[i12] = (short) (sArr2[i12] - ((i10 - 1) / 2));
        }
    }

    public static void getDecodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i3) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < i3 / 4) {
            int i13 = i11 + 1;
            byte b2 = bArr2[i11];
            bArr[i12] = (byte) ((bToUnsignedInt(b2) & 3) - 1);
            bArr[i12 + 1] = (byte) ((bToUnsignedInt(r1) & 3) - 1);
            byte b10 = (byte) (((byte) (b2 >>> 2)) >>> 2);
            int i14 = i12 + 3;
            bArr[i12 + 2] = (byte) ((bToUnsignedInt(b10) & 3) - 1);
            i12 += 4;
            bArr[i14] = (byte) ((bToUnsignedInt((byte) (b10 >>> 2)) & 3) - 1);
            i10++;
            i11 = i13;
        }
        bArr[i12] = (byte) ((bToUnsignedInt(bArr2[i11]) & 3) - 1);
    }

    public static void getEncodedInputs(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            int i10 = i3 >>> 3;
            bArr[i10] = (byte) (bArr[i10] | (bArr2[i3] << (i3 & 7)));
        }
    }

    public static void getEncodedPolynomial(byte[] bArr, short[] sArr, int i3, int i10) {
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            sArr2[i11] = (short) u.c(i10, 1, 2, sArr[i11]);
        }
        for (int i12 = 0; i12 < i3; i12++) {
            sArr3[i12] = (short) i10;
        }
        encode(bArr, sArr2, sArr3, i3, 0);
    }

    public static void getEncodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i3) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < i3 / 4) {
            int i13 = i12 + 3;
            byte b2 = (byte) (((byte) (((byte) (bArr2[i12] + 1)) + (((byte) (bArr2[i12 + 1] + 1)) << 2))) + (((byte) (bArr2[i12 + 2] + 1)) << 4));
            i12 += 4;
            bArr[i11] = (byte) (b2 + (((byte) (bArr2[i13] + 1)) << 6));
            i10++;
            i11++;
        }
        bArr[i11] = (byte) (bArr2[i12] + 1);
    }

    public static byte[] getHashWithPrefix(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        int length = bArr.length + bArr2.length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        SHA512Digest sHA512Digest = new SHA512Digest();
        sHA512Digest.update(bArr4, 0, length);
        sHA512Digest.doFinal(bArr3, 0);
        return bArr3;
    }

    public static int getInverseInRQ(int i3, int i10) {
        int i11 = i3;
        for (int i12 = 1; i12 < i10 - 2; i12++) {
            i11 = getModFreeze(i11 * i3, i10);
        }
        return i11;
    }

    public static int getModFreeze(int i3, int i10) {
        int i11 = (i10 - 1) / 2;
        return getSignedDivMod(i3 + i11, i10)[1] - i11;
    }

    public static void getOneThirdInverseInRQ(short[] sArr, byte[] bArr, int i3, int i10) {
        int i11 = i3 + 1;
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i11];
        short[] sArr4 = new short[i11];
        short[] sArr5 = new short[i11];
        sArr4[0] = (short) getInverseInRQ(3, i10);
        sArr2[0] = 1;
        int i12 = i3 - 1;
        sArr2[i12] = -1;
        sArr2[i3] = -1;
        for (int i13 = 0; i13 < i3; i13++) {
            sArr3[i12 - i13] = bArr[i13];
        }
        sArr3[i3] = 0;
        int i14 = 1;
        for (int i15 = 0; i15 < (i3 * 2) - 1; i15++) {
            System.arraycopy(sArr5, 0, sArr5, 1, i3);
            sArr5[0] = 0;
            int i16 = -i14;
            int checkLessThanZero = checkLessThanZero(i16) & checkNotEqualToZero(sArr3[0]);
            i14 = (i14 ^ ((i16 ^ i14) & checkLessThanZero)) + 1;
            for (int i17 = 0; i17 < i11; i17++) {
                short s10 = sArr2[i17];
                int i18 = (sArr3[i17] ^ s10) & checkLessThanZero;
                sArr2[i17] = (short) (s10 ^ i18);
                sArr3[i17] = (short) (sArr3[i17] ^ i18);
                short s11 = sArr5[i17];
                int i19 = (sArr4[i17] ^ s11) & checkLessThanZero;
                sArr5[i17] = (short) (s11 ^ i19);
                sArr4[i17] = (short) (sArr4[i17] ^ i19);
            }
            short s12 = sArr2[0];
            short s13 = sArr3[0];
            for (int i20 = 0; i20 < i11; i20++) {
                sArr3[i20] = (short) getModFreeze((sArr3[i20] * s12) - (sArr2[i20] * s13), i10);
            }
            for (int i21 = 0; i21 < i11; i21++) {
                sArr4[i21] = (short) getModFreeze((sArr4[i21] * s12) - (sArr5[i21] * s13), i10);
            }
            int i22 = 0;
            while (i22 < i3) {
                int i23 = i22 + 1;
                sArr3[i22] = sArr3[i23];
                i22 = i23;
            }
            sArr3[i3] = 0;
        }
        int inverseInRQ = getInverseInRQ(sArr2[0], i10);
        for (int i24 = 0; i24 < i3; i24++) {
            sArr[i24] = (short) getModFreeze(sArr5[i12 - i24] * inverseInRQ, i10);
        }
    }

    public static void getRandomInputs(SecureRandom secureRandom, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length / 8];
        secureRandom.nextBytes(bArr2);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr[i3] = (byte) ((bArr2[i3 >>> 3] >>> (i3 & 7)) & 1);
        }
    }

    public static void getRandomShortPolynomial(SecureRandom secureRandom, byte[] bArr, int i3, int i10) {
        int[] iArr = new int[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            iArr[i11] = getRandomUnsignedInteger(secureRandom);
        }
        sortGenerateShortPolynomial(bArr, iArr, i3, i10);
    }

    public static void getRandomSmallPolynomial(SecureRandom secureRandom, byte[] bArr) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr[i3] = (byte) ((((getRandomUnsignedInteger(secureRandom) & 1073741823) * 3) >>> 30) - 1);
        }
    }

    public static int getRandomUnsignedInteger(SecureRandom secureRandom) {
        byte[] bArr = new byte[4];
        secureRandom.nextBytes(bArr);
        return bToUnsignedInt(bArr[0]) + (bToUnsignedInt(bArr[1]) << 8) + (bToUnsignedInt(bArr[2]) << 16) + (bToUnsignedInt(bArr[3]) << 24);
    }

    public static void getRoundedDecodedPolynomial(short[] sArr, byte[] bArr, int i3, int i10) {
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            sArr3[i11] = (short) ((i10 + 2) / 3);
        }
        decode(sArr2, bArr, sArr3, i3, 0, 0);
        for (int i12 = 0; i12 < i3; i12++) {
            sArr[i12] = (short) ((sArr2[i12] * 3) - ((i10 - 1) / 2));
        }
    }

    public static void getRoundedEncodedPolynomial(byte[] bArr, short[] sArr, int i3, int i10) {
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            sArr2[i11] = (short) (((((i10 - 1) / 2) + sArr[i11]) * 10923) >>> 15);
            sArr3[i11] = (short) ((i10 + 2) / 3);
        }
        encode(bArr, sArr2, sArr3, i3, 0);
    }

    private static int[] getSignedDivMod(int i3, int i10) {
        int[] unsignedDivMod = getUnsignedDivMod(toIntExact(iToUnsignedLong(i3) - 2147483648L), i10);
        int[] unsignedDivMod2 = getUnsignedDivMod(Integer.MIN_VALUE, i10);
        int intExact = toIntExact(iToUnsignedLong(unsignedDivMod[0]) - iToUnsignedLong(unsignedDivMod2[0]));
        int intExact2 = toIntExact(iToUnsignedLong(unsignedDivMod[1]) - iToUnsignedLong(unsignedDivMod2[1]));
        int i11 = -(intExact2 >>> 31);
        return new int[]{intExact + i11, intExact2 + (i10 & i11)};
    }

    public static void getTopDecodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            int i10 = i3 * 2;
            bArr[i10] = (byte) (bArr2[i3] & 15);
            bArr[i10 + 1] = (byte) (bArr2[i3] >>> 4);
        }
    }

    public static void getTopEncodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i10 = i3 * 2;
            bArr[i3] = (byte) (bArr2[i10] + (bArr2[i10 + 1] << 4));
        }
    }

    private static int[] getUnsignedDivMod(int i3, int i10) {
        long iToUnsignedLong = iToUnsignedLong(i3);
        long j = i10;
        long iToUnsignedLong2 = iToUnsignedLong(Integer.MIN_VALUE) / j;
        long j3 = (iToUnsignedLong * iToUnsignedLong2) >>> 31;
        long j10 = iToUnsignedLong - (j3 * j);
        long j11 = (iToUnsignedLong2 * j10) >>> 31;
        long j12 = (j10 - (j11 * j)) - j;
        long j13 = j3 + j11 + 1;
        long j14 = -(j12 >>> 63);
        return new int[]{toIntExact(j13 + j14), toIntExact(j12 + (j & j14))};
    }

    private static int getUnsignedMod(int i3, int i10) {
        return getUnsignedDivMod(i3, i10)[1];
    }

    public static long iToUnsignedLong(int i3) {
        return i3 & BodyPartID.bodyIdMax;
    }

    public static boolean isInvertiblePolynomialInR3(byte[] bArr, byte[] bArr2, int i3) {
        int i10 = i3 + 1;
        byte[] bArr3 = new byte[i10];
        byte[] bArr4 = new byte[i10];
        byte[] bArr5 = new byte[i10];
        byte[] bArr6 = new byte[i10];
        bArr5[0] = 1;
        bArr3[0] = 1;
        int i11 = i3 - 1;
        bArr3[i11] = -1;
        bArr3[i3] = -1;
        for (int i12 = 0; i12 < i3; i12++) {
            bArr4[i11 - i12] = bArr[i12];
        }
        bArr4[i3] = 0;
        int i13 = 1;
        for (int i14 = 0; i14 < (i3 * 2) - 1; i14++) {
            System.arraycopy(bArr6, 0, bArr6, 1, i3);
            bArr6[0] = 0;
            int i15 = (-bArr4[0]) * bArr3[0];
            int i16 = -i13;
            int checkLessThanZero = checkLessThanZero(i16) & checkNotEqualToZero(bArr4[0]);
            i13 = (i13 ^ ((i16 ^ i13) & checkLessThanZero)) + 1;
            for (int i17 = 0; i17 < i10; i17++) {
                byte b2 = bArr3[i17];
                int i18 = (bArr4[i17] ^ b2) & checkLessThanZero;
                bArr3[i17] = (byte) (b2 ^ i18);
                bArr4[i17] = (byte) (bArr4[i17] ^ i18);
                byte b10 = bArr6[i17];
                int i19 = (bArr5[i17] ^ b10) & checkLessThanZero;
                bArr6[i17] = (byte) (b10 ^ i19);
                bArr5[i17] = (byte) (bArr5[i17] ^ i19);
            }
            for (int i20 = 0; i20 < i10; i20++) {
                bArr4[i20] = (byte) getModFreeze((bArr3[i20] * i15) + bArr4[i20], 3);
            }
            for (int i21 = 0; i21 < i10; i21++) {
                bArr5[i21] = (byte) getModFreeze((bArr6[i21] * i15) + bArr5[i21], 3);
            }
            int i22 = 0;
            while (i22 < i3) {
                int i23 = i22 + 1;
                bArr4[i22] = bArr4[i23];
                i22 = i23;
            }
            bArr4[i3] = 0;
        }
        byte b11 = bArr3[0];
        for (int i24 = 0; i24 < i3; i24++) {
            bArr2[i24] = (byte) (bArr6[i11 - i24] * b11);
        }
        return i13 == 0;
    }

    public static void minmax(int[] iArr, int i3, int i10) {
        int i11 = iArr[i3];
        int i12 = iArr[i10];
        int i13 = i11 ^ i12;
        int i14 = i12 - i11;
        int i15 = i13 & (-((i14 ^ (((i14 ^ i12) ^ Integer.MIN_VALUE) & i13)) >>> 31));
        iArr[i3] = i11 ^ i15;
        iArr[i10] = i12 ^ i15;
    }

    public static void multiplicationInR3(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3) {
        int i10 = i3 + i3;
        int i11 = i10 - 1;
        byte[] bArr4 = new byte[i11];
        for (int i12 = 0; i12 < i3; i12++) {
            byte b2 = 0;
            for (int i13 = 0; i13 <= i12; i13++) {
                b2 = (byte) getModFreeze((bArr2[i13] * bArr3[i12 - i13]) + b2, 3);
            }
            bArr4[i12] = b2;
        }
        for (int i14 = i3; i14 < i11; i14++) {
            byte b10 = 0;
            for (int i15 = (i14 - i3) + 1; i15 < i3; i15++) {
                b10 = (byte) getModFreeze((bArr2[i15] * bArr3[i14 - i15]) + b10, 3);
            }
            bArr4[i14] = b10;
        }
        for (int i16 = i10 - 2; i16 >= i3; i16--) {
            int i17 = i16 - i3;
            bArr4[i17] = (byte) getModFreeze(bArr4[i17] + bArr4[i16], 3);
            int i18 = i17 + 1;
            bArr4[i18] = (byte) getModFreeze(bArr4[i18] + bArr4[i16], 3);
        }
        for (int i19 = 0; i19 < i3; i19++) {
            bArr[i19] = bArr4[i19];
        }
    }

    public static void multiplicationInRQ(short[] sArr, short[] sArr2, byte[] bArr, int i3, int i10) {
        int i11 = i3 + i3;
        int i12 = i11 - 1;
        short[] sArr3 = new short[i12];
        for (int i13 = 0; i13 < i3; i13++) {
            short s10 = 0;
            for (int i14 = 0; i14 <= i13; i14++) {
                s10 = (short) getModFreeze((sArr2[i14] * bArr[i13 - i14]) + s10, i10);
            }
            sArr3[i13] = s10;
        }
        for (int i15 = i3; i15 < i12; i15++) {
            short s11 = 0;
            for (int i16 = (i15 - i3) + 1; i16 < i3; i16++) {
                s11 = (short) getModFreeze((sArr2[i16] * bArr[i15 - i16]) + s11, i10);
            }
            sArr3[i15] = s11;
        }
        for (int i17 = i11 - 2; i17 >= i3; i17--) {
            int i18 = i17 - i3;
            sArr3[i18] = (short) getModFreeze(sArr3[i18] + sArr3[i17], i10);
            int i19 = i18 + 1;
            sArr3[i19] = (short) getModFreeze(sArr3[i19] + sArr3[i17], i10);
        }
        for (int i20 = 0; i20 < i3; i20++) {
            sArr[i20] = sArr3[i20];
        }
    }

    public static void right(byte[] bArr, short[] sArr, byte[] bArr2, int i3, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < bArr.length; i13++) {
            bArr[i13] = (byte) (-checkLessThanZero(getModFreeze(AbstractC1482f.c(i10, 4, getModFreeze((bArr2[i13] * i12) - i11, i3) - sArr[i13], 1), i3)));
        }
    }

    public static void roundPolynomial(short[] sArr, short[] sArr2) {
        for (int i3 = 0; i3 < sArr.length; i3++) {
            short s10 = sArr2[i3];
            sArr[i3] = (short) (s10 - getModFreeze(s10, 3));
        }
    }

    public static int sToUnsignedInt(short s10) {
        return s10 & UShort.MAX_VALUE;
    }

    public static void scalarMultiplicationInRQ(short[] sArr, short[] sArr2, int i3, int i10) {
        for (int i11 = 0; i11 < sArr2.length; i11++) {
            sArr[i11] = (short) getModFreeze(sArr2[i11] * i3, i10);
        }
    }

    public static void sortGenerateShortPolynomial(byte[] bArr, int[] iArr, int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = iArr[i11] & (-2);
        }
        while (i10 < i3) {
            iArr[i10] = (iArr[i10] & (-3)) | 1;
            i10++;
        }
        cryptoSort(iArr, i3);
        for (int i12 = 0; i12 < i3; i12++) {
            bArr[i12] = (byte) ((iArr[i12] & 3) - 1);
        }
    }

    public static int toIntExact(long j) {
        int i3 = (int) j;
        if (i3 == j) {
            return i3;
        }
        throw new IllegalStateException(StubApp.getString2(34066));
    }

    public static void top(byte[] bArr, short[] sArr, byte[] bArr2, int i3, int i10, int i11) {
        for (int i12 = 0; i12 < bArr.length; i12++) {
            bArr[i12] = (byte) ((((getModFreeze((((i3 - 1) / 2) * bArr2[i12]) + sArr[i12], i3) + i10) * i11) + 16384) >>> 15);
        }
    }

    public static void transformRQToR3(byte[] bArr, short[] sArr) {
        for (int i3 = 0; i3 < sArr.length; i3++) {
            bArr[i3] = (byte) getModFreeze(sArr[i3], 3);
        }
    }

    public static void updateDiffMask(byte[] bArr, byte[] bArr2, int i3) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10];
            bArr[i10] = (byte) (i11 ^ ((bArr2[i10] ^ i11) & i3));
        }
    }
}
