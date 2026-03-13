package org.bouncycastle.pqc.math.linearalgebra;

import E1.a;
import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Random;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GF2Polynomial {
    private int blocks;
    private int len;
    private int[] value;
    private static Random rand = new Random();
    private static final boolean[] parity = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private static final short[] squaringTable = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    private static final int[] bitMask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, PKIFailureInfo.notAuthorized, PKIFailureInfo.unsupportedVersion, PKIFailureInfo.transactionIdInUse, PKIFailureInfo.signerNotTrusted, PKIFailureInfo.badCertTemplate, PKIFailureInfo.badSenderNonce, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, PKIFailureInfo.duplicateCertReq, 1073741824, Integer.MIN_VALUE, 0};
    private static final int[] reverseRightMask = {0, 1, 3, 7, 15, 31, 63, CertificateBody.profileType, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, IntCompanionObject.MAX_VALUE, -1};

    public GF2Polynomial(int i3) {
        i3 = i3 < 1 ? 1 : i3;
        int i10 = ((i3 - 1) >> 5) + 1;
        this.blocks = i10;
        this.value = new int[i10];
        this.len = i3;
    }

    private void doShiftBlocksLeft(int i3) {
        int i10 = this.blocks;
        int[] iArr = this.value;
        if (i10 > iArr.length) {
            int[] iArr2 = new int[i10];
            System.arraycopy(iArr, 0, iArr2, i3, i10 - i3);
            this.value = iArr2;
            return;
        }
        for (int i11 = i10 - 1; i11 >= i3; i11--) {
            int[] iArr3 = this.value;
            iArr3[i11] = iArr3[i11 - i3];
        }
        for (int i12 = 0; i12 < i3; i12++) {
            this.value[i12] = 0;
        }
    }

    private GF2Polynomial karaMult(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len << 1);
        int i3 = this.len;
        if (i3 <= 32) {
            gF2Polynomial2.value = mult32(this.value[0], gF2Polynomial.value[0]);
            return gF2Polynomial2;
        }
        if (i3 <= 64) {
            gF2Polynomial2.value = mult64(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i3 <= 128) {
            gF2Polynomial2.value = mult128(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i3 <= 256) {
            gF2Polynomial2.value = mult256(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i3 <= 512) {
            gF2Polynomial2.value = mult512(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        int i10 = bitMask[IntegerFunctions.floorLog(i3 - 1)];
        int i11 = ((i10 - 1) >> 5) + 1;
        GF2Polynomial lower = lower(i11);
        GF2Polynomial upper = upper(i11);
        GF2Polynomial lower2 = gF2Polynomial.lower(i11);
        GF2Polynomial upper2 = gF2Polynomial.upper(i11);
        GF2Polynomial karaMult = upper.karaMult(upper2);
        GF2Polynomial karaMult2 = lower.karaMult(lower2);
        lower.addToThis(upper);
        lower2.addToThis(upper2);
        GF2Polynomial karaMult3 = lower.karaMult(lower2);
        gF2Polynomial2.shiftLeftAddThis(karaMult, i10 << 1);
        gF2Polynomial2.shiftLeftAddThis(karaMult, i10);
        gF2Polynomial2.shiftLeftAddThis(karaMult3, i10);
        gF2Polynomial2.shiftLeftAddThis(karaMult2, i10);
        gF2Polynomial2.addToThis(karaMult2);
        return gF2Polynomial2;
    }

    private GF2Polynomial lower(int i3) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(i3 << 5);
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, Math.min(i3, this.blocks));
        return gF2Polynomial;
    }

    private static int[] mult128(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[2];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(2, iArr.length));
        int[] iArr5 = new int[2];
        if (iArr.length > 2) {
            System.arraycopy(iArr, 2, iArr5, 0, Math.min(2, iArr.length - 2));
        }
        int[] iArr6 = new int[2];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(2, iArr2.length));
        int[] iArr7 = new int[2];
        if (iArr2.length > 2) {
            System.arraycopy(iArr2, 2, iArr7, 0, Math.min(2, iArr2.length - 2));
        }
        if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i3 = iArr5[0];
            if (i3 != 0 || iArr7[0] != 0) {
                int[] mult32 = mult32(i3, iArr7[0]);
                int i10 = iArr3[5];
                int i11 = mult32[1];
                iArr3[5] = i10 ^ i11;
                int i12 = iArr3[4];
                int i13 = mult32[0];
                iArr3[4] = i12 ^ i13;
                iArr3[3] = iArr3[3] ^ i11;
                iArr3[2] = i13 ^ iArr3[2];
            }
        } else {
            int[] mult64 = mult64(iArr5, iArr7);
            int i14 = iArr3[7];
            int i15 = mult64[3];
            iArr3[7] = i14 ^ i15;
            int i16 = iArr3[6];
            int i17 = mult64[2];
            iArr3[6] = i16 ^ i17;
            int i18 = iArr3[5];
            int i19 = mult64[1];
            iArr3[5] = i18 ^ (i15 ^ i19);
            int i20 = iArr3[4];
            int i21 = mult64[0];
            iArr3[4] = i20 ^ (i21 ^ i17);
            iArr3[3] = iArr3[3] ^ i19;
            iArr3[2] = i21 ^ iArr3[2];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        int i22 = iArr7[0] ^ iArr6[0];
        iArr7[0] = i22;
        int i23 = iArr7[1] ^ iArr6[1];
        iArr7[1] = i23;
        if (iArr5[1] == 0 && i23 == 0) {
            int[] mult322 = mult32(iArr5[0], i22);
            iArr3[3] = iArr3[3] ^ mult322[1];
            iArr3[2] = mult322[0] ^ iArr3[2];
        } else {
            int[] mult642 = mult64(iArr5, iArr7);
            iArr3[5] = iArr3[5] ^ mult642[3];
            iArr3[4] = iArr3[4] ^ mult642[2];
            iArr3[3] = iArr3[3] ^ mult642[1];
            iArr3[2] = mult642[0] ^ iArr3[2];
        }
        if (iArr4[1] == 0 && iArr6[1] == 0) {
            int[] mult323 = mult32(iArr4[0], iArr6[0]);
            int i24 = iArr3[3];
            int i25 = mult323[1];
            iArr3[3] = i24 ^ i25;
            int i26 = iArr3[2];
            int i27 = mult323[0];
            iArr3[2] = i26 ^ i27;
            iArr3[1] = iArr3[1] ^ i25;
            iArr3[0] = i27 ^ iArr3[0];
            return iArr3;
        }
        int[] mult643 = mult64(iArr4, iArr6);
        int i28 = iArr3[5];
        int i29 = mult643[3];
        iArr3[5] = i28 ^ i29;
        int i30 = iArr3[4];
        int i31 = mult643[2];
        iArr3[4] = i30 ^ i31;
        int i32 = iArr3[3];
        int i33 = mult643[1];
        iArr3[3] = i32 ^ (i29 ^ i33);
        int i34 = iArr3[2];
        int i35 = mult643[0];
        iArr3[2] = i34 ^ (i35 ^ i31);
        iArr3[1] = iArr3[1] ^ i33;
        iArr3[0] = i35 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult256(int[] iArr, int[] iArr2) {
        char c10;
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[4];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(4, iArr.length));
        int[] iArr5 = new int[4];
        if (iArr.length > 4) {
            System.arraycopy(iArr, 4, iArr5, 0, Math.min(4, iArr.length - 4));
        }
        int[] iArr6 = new int[4];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(4, iArr2.length));
        int[] iArr7 = new int[4];
        if (iArr2.length > 4) {
            System.arraycopy(iArr2, 4, iArr7, 0, Math.min(4, iArr2.length - 4));
        }
        if (iArr5[3] != 0 || iArr5[2] != 0 || iArr7[3] != 0 || iArr7[2] != 0) {
            c10 = 3;
            int[] mult128 = mult128(iArr5, iArr7);
            int i3 = iArr3[15];
            int i10 = mult128[7];
            iArr3[15] = i3 ^ i10;
            int i11 = iArr3[14];
            int i12 = mult128[6];
            iArr3[14] = i11 ^ i12;
            int i13 = iArr3[13];
            int i14 = mult128[5];
            iArr3[13] = i13 ^ i14;
            int i15 = iArr3[12];
            int i16 = mult128[4];
            iArr3[12] = i15 ^ i16;
            int i17 = iArr3[11];
            int i18 = mult128[3];
            iArr3[11] = i17 ^ (i18 ^ i10);
            int i19 = iArr3[10];
            int i20 = mult128[2];
            iArr3[10] = i19 ^ (i20 ^ i12);
            int i21 = iArr3[9];
            int i22 = mult128[1];
            iArr3[9] = i21 ^ (i22 ^ i14);
            int i23 = iArr3[8];
            int i24 = mult128[0];
            iArr3[8] = i23 ^ (i24 ^ i16);
            iArr3[7] = iArr3[7] ^ i18;
            iArr3[6] = iArr3[6] ^ i20;
            iArr3[5] = iArr3[5] ^ i22;
            iArr3[4] = i24 ^ iArr3[4];
        } else if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i25 = iArr5[0];
            if (i25 == 0 && iArr7[0] == 0) {
                c10 = 3;
            } else {
                c10 = 3;
                int[] mult32 = mult32(i25, iArr7[0]);
                int i26 = iArr3[9];
                int i27 = mult32[1];
                iArr3[9] = i26 ^ i27;
                int i28 = iArr3[8];
                int i29 = mult32[0];
                iArr3[8] = i28 ^ i29;
                iArr3[5] = iArr3[5] ^ i27;
                iArr3[4] = i29 ^ iArr3[4];
            }
        } else {
            c10 = 3;
            int[] mult64 = mult64(iArr5, iArr7);
            int i30 = iArr3[11];
            int i31 = mult64[3];
            iArr3[11] = i30 ^ i31;
            int i32 = iArr3[10];
            int i33 = mult64[2];
            iArr3[10] = i32 ^ i33;
            int i34 = iArr3[9];
            int i35 = mult64[1];
            iArr3[9] = i34 ^ i35;
            int i36 = iArr3[8];
            int i37 = mult64[0];
            iArr3[8] = i36 ^ i37;
            iArr3[7] = iArr3[7] ^ i31;
            iArr3[6] = iArr3[6] ^ i33;
            iArr3[5] = iArr3[5] ^ i35;
            iArr3[4] = i37 ^ iArr3[4];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[c10] = iArr5[c10] ^ iArr4[c10];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[c10] = iArr7[c10] ^ iArr6[c10];
        int[] mult1282 = mult128(iArr5, iArr7);
        iArr3[11] = iArr3[11] ^ mult1282[7];
        iArr3[10] = iArr3[10] ^ mult1282[6];
        iArr3[9] = iArr3[9] ^ mult1282[5];
        iArr3[8] = iArr3[8] ^ mult1282[4];
        iArr3[7] = iArr3[7] ^ mult1282[c10];
        iArr3[6] = iArr3[6] ^ mult1282[2];
        iArr3[5] = iArr3[5] ^ mult1282[1];
        iArr3[4] = mult1282[0] ^ iArr3[4];
        int[] mult1283 = mult128(iArr4, iArr6);
        int i38 = iArr3[11];
        int i39 = mult1283[7];
        iArr3[11] = i38 ^ i39;
        int i40 = iArr3[10];
        int i41 = mult1283[6];
        iArr3[10] = i40 ^ i41;
        int i42 = iArr3[9];
        int i43 = mult1283[5];
        iArr3[9] = i42 ^ i43;
        int i44 = iArr3[8];
        int i45 = mult1283[4];
        iArr3[8] = i44 ^ i45;
        int i46 = iArr3[7];
        int i47 = mult1283[c10];
        iArr3[7] = i46 ^ (i39 ^ i47);
        int i48 = iArr3[6];
        int i49 = mult1283[2];
        iArr3[6] = i48 ^ (i41 ^ i49);
        int i50 = iArr3[5];
        int i51 = mult1283[1];
        iArr3[5] = i50 ^ (i43 ^ i51);
        int i52 = iArr3[4];
        int i53 = mult1283[0];
        iArr3[4] = i52 ^ (i53 ^ i45);
        iArr3[c10] = iArr3[c10] ^ i47;
        iArr3[2] = iArr3[2] ^ i49;
        iArr3[1] = iArr3[1] ^ i51;
        iArr3[0] = i53 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult32(int i3, int i10) {
        int[] iArr = new int[2];
        if (i3 != 0 && i10 != 0) {
            long j = i10 & BodyPartID.bodyIdMax;
            long j3 = 0;
            for (int i11 = 1; i11 <= 32; i11++) {
                if ((bitMask[i11 - 1] & i3) != 0) {
                    j3 ^= j;
                }
                j <<= 1;
            }
            iArr[1] = (int) (j3 >>> 32);
            iArr[0] = (int) (j3 & BodyPartID.bodyIdMax);
        }
        return iArr;
    }

    private static int[] mult512(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[32];
        int[] iArr4 = new int[8];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(8, iArr.length));
        int[] iArr5 = new int[8];
        if (iArr.length > 8) {
            System.arraycopy(iArr, 8, iArr5, 0, Math.min(8, iArr.length - 8));
        }
        int[] iArr6 = new int[8];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(8, iArr2.length));
        int[] iArr7 = new int[8];
        if (iArr2.length > 8) {
            System.arraycopy(iArr2, 8, iArr7, 0, Math.min(8, iArr2.length - 8));
        }
        int[] mult256 = mult256(iArr5, iArr7);
        int i3 = iArr3[31];
        int i10 = mult256[15];
        iArr3[31] = i3 ^ i10;
        int i11 = iArr3[30];
        int i12 = mult256[14];
        iArr3[30] = i11 ^ i12;
        int i13 = iArr3[29];
        int i14 = mult256[13];
        iArr3[29] = i13 ^ i14;
        int i15 = iArr3[28];
        int i16 = mult256[12];
        iArr3[28] = i15 ^ i16;
        int i17 = iArr3[27];
        int i18 = mult256[11];
        iArr3[27] = i17 ^ i18;
        int i19 = iArr3[26];
        int i20 = mult256[10];
        iArr3[26] = i19 ^ i20;
        int i21 = iArr3[25];
        int i22 = mult256[9];
        iArr3[25] = i21 ^ i22;
        int i23 = iArr3[24];
        int i24 = mult256[8];
        iArr3[24] = i23 ^ i24;
        int i25 = iArr3[23];
        int i26 = mult256[7];
        iArr3[23] = i25 ^ (i26 ^ i10);
        int i27 = iArr3[22];
        int i28 = mult256[6];
        iArr3[22] = i27 ^ (i28 ^ i12);
        int i29 = iArr3[21];
        int i30 = mult256[5];
        iArr3[21] = i29 ^ (i30 ^ i14);
        int i31 = iArr3[20];
        int i32 = mult256[4];
        iArr3[20] = i31 ^ (i32 ^ i16);
        int i33 = iArr3[19];
        int i34 = mult256[3];
        iArr3[19] = i33 ^ (i34 ^ i18);
        int i35 = iArr3[18];
        int i36 = mult256[2];
        iArr3[18] = i35 ^ (i36 ^ i20);
        int i37 = iArr3[17];
        int i38 = mult256[1];
        iArr3[17] = i37 ^ (i38 ^ i22);
        int i39 = iArr3[16];
        int i40 = mult256[0];
        iArr3[16] = i39 ^ (i40 ^ i24);
        iArr3[15] = iArr3[15] ^ i26;
        iArr3[14] = iArr3[14] ^ i28;
        iArr3[13] = iArr3[13] ^ i30;
        iArr3[12] = iArr3[12] ^ i32;
        iArr3[11] = iArr3[11] ^ i34;
        iArr3[10] = iArr3[10] ^ i36;
        iArr3[9] = iArr3[9] ^ i38;
        iArr3[8] = iArr3[8] ^ i40;
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr5[4] = iArr5[4] ^ iArr4[4];
        iArr5[5] = iArr5[5] ^ iArr4[5];
        iArr5[6] = iArr5[6] ^ iArr4[6];
        iArr5[7] = iArr5[7] ^ iArr4[7];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        iArr7[4] = iArr7[4] ^ iArr6[4];
        iArr7[5] = iArr7[5] ^ iArr6[5];
        iArr7[6] = iArr7[6] ^ iArr6[6];
        iArr7[7] = iArr7[7] ^ iArr6[7];
        int[] mult2562 = mult256(iArr5, iArr7);
        iArr3[23] = iArr3[23] ^ mult2562[15];
        iArr3[22] = iArr3[22] ^ mult2562[14];
        iArr3[21] = iArr3[21] ^ mult2562[13];
        iArr3[20] = iArr3[20] ^ mult2562[12];
        iArr3[19] = iArr3[19] ^ mult2562[11];
        iArr3[18] = iArr3[18] ^ mult2562[10];
        iArr3[17] = iArr3[17] ^ mult2562[9];
        iArr3[16] = iArr3[16] ^ mult2562[8];
        iArr3[15] = iArr3[15] ^ mult2562[7];
        iArr3[14] = iArr3[14] ^ mult2562[6];
        iArr3[13] = iArr3[13] ^ mult2562[5];
        iArr3[12] = iArr3[12] ^ mult2562[4];
        iArr3[11] = iArr3[11] ^ mult2562[3];
        iArr3[10] = iArr3[10] ^ mult2562[2];
        iArr3[9] = iArr3[9] ^ mult2562[1];
        iArr3[8] = mult2562[0] ^ iArr3[8];
        int[] mult2563 = mult256(iArr4, iArr6);
        int i41 = iArr3[23];
        int i42 = mult2563[15];
        iArr3[23] = i41 ^ i42;
        int i43 = iArr3[22];
        int i44 = mult2563[14];
        iArr3[22] = i43 ^ i44;
        int i45 = iArr3[21];
        int i46 = mult2563[13];
        iArr3[21] = i45 ^ i46;
        int i47 = iArr3[20];
        int i48 = mult2563[12];
        iArr3[20] = i47 ^ i48;
        int i49 = iArr3[19];
        int i50 = mult2563[11];
        iArr3[19] = i49 ^ i50;
        int i51 = iArr3[18];
        int i52 = mult2563[10];
        iArr3[18] = i51 ^ i52;
        int i53 = iArr3[17];
        int i54 = mult2563[9];
        iArr3[17] = i53 ^ i54;
        int i55 = iArr3[16];
        int i56 = mult2563[8];
        iArr3[16] = i55 ^ i56;
        int i57 = iArr3[15];
        int i58 = mult2563[7];
        iArr3[15] = i57 ^ (i42 ^ i58);
        int i59 = iArr3[14];
        int i60 = mult2563[6];
        iArr3[14] = i59 ^ (i44 ^ i60);
        int i61 = iArr3[13];
        int i62 = mult2563[5];
        iArr3[13] = i61 ^ (i46 ^ i62);
        int i63 = iArr3[12];
        int i64 = mult2563[4];
        iArr3[12] = i63 ^ (i48 ^ i64);
        int i65 = iArr3[11];
        int i66 = mult2563[3];
        iArr3[11] = i65 ^ (i50 ^ i66);
        int i67 = iArr3[10];
        int i68 = mult2563[2];
        iArr3[10] = i67 ^ (i68 ^ i52);
        int i69 = iArr3[9];
        int i70 = mult2563[1];
        iArr3[9] = i69 ^ (i70 ^ i54);
        int i71 = iArr3[8];
        int i72 = mult2563[0];
        iArr3[8] = i71 ^ (i72 ^ i56);
        iArr3[7] = iArr3[7] ^ i58;
        iArr3[6] = iArr3[6] ^ i60;
        iArr3[5] = iArr3[5] ^ i62;
        iArr3[4] = iArr3[4] ^ i64;
        iArr3[3] = iArr3[3] ^ i66;
        iArr3[2] = iArr3[2] ^ i68;
        iArr3[1] = iArr3[1] ^ i70;
        iArr3[0] = i72 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult64(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[4];
        int i3 = iArr[0];
        int i10 = iArr.length > 1 ? iArr[1] : 0;
        int i11 = iArr2[0];
        int i12 = iArr2.length > 1 ? iArr2[1] : 0;
        if (i10 != 0 || i12 != 0) {
            int[] mult32 = mult32(i10, i12);
            int i13 = iArr3[3];
            int i14 = mult32[1];
            iArr3[3] = i13 ^ i14;
            int i15 = iArr3[2];
            int i16 = mult32[0];
            iArr3[2] = i15 ^ (i16 ^ i14);
            iArr3[1] = i16 ^ iArr3[1];
        }
        int[] mult322 = mult32(i10 ^ i3, i12 ^ i11);
        iArr3[2] = iArr3[2] ^ mult322[1];
        iArr3[1] = mult322[0] ^ iArr3[1];
        int[] mult323 = mult32(i3, i11);
        int i17 = iArr3[2];
        int i18 = mult323[1];
        iArr3[2] = i17 ^ i18;
        int i19 = iArr3[1];
        int i20 = mult323[0];
        iArr3[1] = i19 ^ (i18 ^ i20);
        iArr3[0] = i20 ^ iArr3[0];
        return iArr3;
    }

    private GF2Polynomial upper(int i3) {
        int min = Math.min(i3, this.blocks - i3);
        GF2Polynomial gF2Polynomial = new GF2Polynomial(min << 5);
        if (this.blocks >= i3) {
            System.arraycopy(this.value, i3, gF2Polynomial.value, 0, min);
        }
        return gF2Polynomial;
    }

    private void zeroUnusedBits() {
        int i3 = this.len;
        if ((i3 & 31) != 0) {
            int[] iArr = this.value;
            int i10 = this.blocks - 1;
            iArr[i10] = reverseRightMask[i3 & 31] & iArr[i10];
        }
    }

    public GF2Polynomial add(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void addToThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public void assignAll() {
        for (int i3 = 0; i3 < this.blocks; i3++) {
            this.value[i3] = -1;
        }
        zeroUnusedBits();
    }

    public void assignOne() {
        for (int i3 = 1; i3 < this.blocks; i3++) {
            this.value[i3] = 0;
        }
        this.value[0] = 1;
    }

    public void assignX() {
        for (int i3 = 1; i3 < this.blocks; i3++) {
            this.value[i3] = 0;
        }
        this.value[0] = 2;
    }

    public void assignZero() {
        for (int i3 = 0; i3 < this.blocks; i3++) {
            this.value[i3] = 0;
        }
    }

    public Object clone() {
        return new GF2Polynomial(this);
    }

    public GF2Polynomial[] divide(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[2];
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i3 = gF2Polynomial3.len;
        int i10 = gF2Polynomial4.len;
        if (i3 < i10) {
            gF2PolynomialArr[0] = new GF2Polynomial(0);
            gF2PolynomialArr[1] = gF2Polynomial3;
            return gF2PolynomialArr;
        }
        int i11 = i3 - i10;
        gF2Polynomial2.expandN(i11 + 1);
        while (i11 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i11));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i11);
            i11 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        gF2PolynomialArr[0] = gF2Polynomial2;
        gF2PolynomialArr[1] = gF2Polynomial3;
        return gF2PolynomialArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2Polynomial)) {
            return false;
        }
        GF2Polynomial gF2Polynomial = (GF2Polynomial) obj;
        if (this.len != gF2Polynomial.len) {
            return false;
        }
        for (int i3 = 0; i3 < this.blocks; i3++) {
            if (this.value[i3] != gF2Polynomial.value[i3]) {
                return false;
            }
        }
        return true;
    }

    public void expandN(int i3) {
        if (this.len >= i3) {
            return;
        }
        this.len = i3;
        int i10 = ((i3 - 1) >>> 5) + 1;
        int i11 = this.blocks;
        if (i11 >= i10) {
            return;
        }
        int[] iArr = this.value;
        if (iArr.length >= i10) {
            while (i11 < i10) {
                this.value[i11] = 0;
                i11++;
            }
            this.blocks = i10;
            return;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        this.blocks = i10;
        this.value = iArr2;
    }

    public GF2Polynomial gcd(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (isZero() && gF2Polynomial.isZero()) {
            throw new ArithmeticException(StubApp.getString2(34817));
        }
        if (isZero()) {
            return new GF2Polynomial(gF2Polynomial);
        }
        if (gF2Polynomial.isZero()) {
            return new GF2Polynomial(this);
        }
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
        GF2Polynomial gF2Polynomial5 = gF2Polynomial3;
        while (!gF2Polynomial5.isZero()) {
            GF2Polynomial gF2Polynomial6 = gF2Polynomial5;
            gF2Polynomial5 = gF2Polynomial4.remainder(gF2Polynomial5);
            gF2Polynomial4 = gF2Polynomial6;
        }
        return gF2Polynomial4;
    }

    public int getBit(int i3) {
        if (i3 < 0) {
            throw new RuntimeException();
        }
        if (i3 > this.len - 1) {
            return 0;
        }
        return (bitMask[i3 & 31] & this.value[i3 >>> 5]) != 0 ? 1 : 0;
    }

    public int getLength() {
        return this.len;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value) + this.len;
    }

    public GF2Polynomial increase() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.increaseThis();
        return gF2Polynomial;
    }

    public void increaseThis() {
        xorBit(0);
    }

    public boolean isIrreducible() {
        if (isZero()) {
            return false;
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.reduceN();
        int i3 = gF2Polynomial.len;
        int i10 = i3 - 1;
        String string2 = StubApp.getString2(4926);
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(i3, string2);
        for (int i11 = 1; i11 <= (i10 >> 1); i11++) {
            gF2Polynomial2.squareThisPreCalc();
            gF2Polynomial2 = gF2Polynomial2.remainder(gF2Polynomial);
            GF2Polynomial add = gF2Polynomial2.add(new GF2Polynomial(32, string2));
            if (add.isZero() || !gF2Polynomial.gcd(add).isOne()) {
                return false;
            }
        }
        return true;
    }

    public boolean isOne() {
        for (int i3 = 1; i3 < this.blocks; i3++) {
            if (this.value[i3] != 0) {
                return false;
            }
        }
        return this.value[0] == 1;
    }

    public boolean isZero() {
        if (this.len == 0) {
            return true;
        }
        for (int i3 = 0; i3 < this.blocks; i3++) {
            if (this.value[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public GF2Polynomial multiply(GF2Polynomial gF2Polynomial) {
        int max = Math.max(this.len, gF2Polynomial.len);
        expandN(max);
        gF2Polynomial.expandN(max);
        return karaMult(gF2Polynomial);
    }

    public GF2Polynomial multiplyClassic(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(Math.max(this.len, gF2Polynomial.len) << 1);
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[32];
        gF2PolynomialArr[0] = new GF2Polynomial(this);
        for (int i3 = 1; i3 <= 31; i3++) {
            gF2PolynomialArr[i3] = gF2PolynomialArr[i3 - 1].shiftLeft();
        }
        for (int i10 = 0; i10 < gF2Polynomial.blocks; i10++) {
            for (int i11 = 0; i11 <= 31; i11++) {
                if ((gF2Polynomial.value[i10] & bitMask[i11]) != 0) {
                    gF2Polynomial2.xorThisBy(gF2PolynomialArr[i11]);
                }
            }
            for (int i12 = 0; i12 <= 31; i12++) {
                gF2PolynomialArr[i12].shiftBlocksLeft();
            }
        }
        return gF2Polynomial2;
    }

    public GF2Polynomial quotient(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i3 = gF2Polynomial3.len;
        int i10 = gF2Polynomial4.len;
        if (i3 < i10) {
            return new GF2Polynomial(0);
        }
        int i11 = i3 - i10;
        gF2Polynomial2.expandN(i11 + 1);
        while (i11 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i11));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i11);
            i11 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        return gF2Polynomial2;
    }

    public void randomize() {
        for (int i3 = 0; i3 < this.blocks; i3++) {
            this.value[i3] = rand.nextInt();
        }
        zeroUnusedBits();
    }

    public void reduceN() {
        int i3;
        int i10 = this.blocks;
        do {
            i10--;
            i3 = this.value[i10];
            if (i3 != 0) {
                break;
            }
        } while (i10 > 0);
        int i11 = 0;
        while (i3 != 0) {
            i3 >>>= 1;
            i11++;
        }
        this.len = (i10 << 5) + i11;
        this.blocks = i10 + 1;
    }

    public void reducePentanomial(int i3, int[] iArr) {
        int i10 = i3 >>> 5;
        int i11 = i3 & 31;
        int i12 = 32 - i11;
        int i13 = 0;
        int i14 = iArr[0];
        int i15 = (i3 - i14) >>> 5;
        int i16 = 32 - ((i3 - i14) & 31);
        boolean z2 = true;
        int i17 = iArr[1];
        int i18 = (i3 - i17) >>> 5;
        int i19 = 32 - ((i3 - i17) & 31);
        int i20 = iArr[2];
        int i21 = (i3 - i20) >>> 5;
        int i22 = 32 - ((i3 - i20) & 31);
        int i23 = ((i3 << 1) - 2) >>> 5;
        while (i23 > i10) {
            int i24 = i13;
            int[] iArr2 = this.value;
            boolean z10 = z2;
            long j = iArr2[i23] & BodyPartID.bodyIdMax;
            int i25 = i23 - i10;
            int i26 = i25 - 1;
            int i27 = i10;
            int i28 = i11;
            iArr2[i26] = iArr2[i26] ^ ((int) (j << i12));
            iArr2[i25] = (int) (iArr2[i25] ^ (j >>> (32 - i12)));
            int i29 = i23 - i15;
            int i30 = i29 - 1;
            iArr2[i30] = ((int) (j << i16)) ^ iArr2[i30];
            iArr2[i29] = (int) (iArr2[i29] ^ (j >>> (32 - i16)));
            int i31 = i23 - i18;
            int i32 = i31 - 1;
            iArr2[i32] = ((int) (j << i19)) ^ iArr2[i32];
            iArr2[i31] = (int) (iArr2[i31] ^ (j >>> (32 - i19)));
            int i33 = i23 - i21;
            int i34 = i33 - 1;
            iArr2[i34] = ((int) (j << i22)) ^ iArr2[i34];
            iArr2[i33] = (int) (iArr2[i33] ^ (j >>> (32 - i22)));
            iArr2[i23] = i24;
            i23--;
            i13 = i24;
            z2 = z10;
            i10 = i27;
            i11 = i28;
        }
        int i35 = i10;
        int i36 = i11;
        int[] iArr3 = this.value;
        long j3 = iArr3[i35] & BodyPartID.bodyIdMax & (BodyPartID.bodyIdMax << i36);
        iArr3[i13] = (int) (iArr3[r16] ^ (j3 >>> (32 - i12)));
        int i37 = i35 - i15;
        int i38 = i37 - 1;
        if (i38 >= 0) {
            iArr3[i38] = iArr3[i38] ^ ((int) (j3 << i16));
        }
        iArr3[i37] = (int) (iArr3[i37] ^ (j3 >>> (32 - i16)));
        int i39 = i35 - i18;
        int i40 = i39 - 1;
        if (i40 >= 0) {
            iArr3[i40] = iArr3[i40] ^ ((int) (j3 << i19));
        }
        iArr3[i39] = (int) (iArr3[i39] ^ (j3 >>> (32 - i19)));
        int i41 = i35 - i21;
        int i42 = i41 - 1;
        if (i42 >= 0) {
            iArr3[i42] = iArr3[i42] ^ ((int) (j3 << i22));
        }
        iArr3[i41] = (int) (iArr3[i41] ^ (j3 >>> (32 - i22)));
        iArr3[i35] = iArr3[i35] & reverseRightMask[i36];
        this.blocks = ((i3 - 1) >>> 5) + 1;
        this.len = i3;
    }

    public void reduceTrinomial(int i3, int i10) {
        int i11 = i3 >>> 5;
        int i12 = i3 & 31;
        int i13 = 32 - i12;
        int i14 = i3 - i10;
        int i15 = i14 >>> 5;
        int i16 = 32 - (i14 & 31);
        for (int i17 = ((i3 << 1) - 2) >>> 5; i17 > i11; i17--) {
            int[] iArr = this.value;
            long j = BodyPartID.bodyIdMax & iArr[i17];
            int i18 = i17 - i11;
            int i19 = i18 - 1;
            iArr[i19] = ((int) (j << i13)) ^ iArr[i19];
            iArr[i18] = (int) (iArr[i18] ^ (j >>> (32 - i13)));
            int i20 = i17 - i15;
            int i21 = i20 - 1;
            iArr[i21] = iArr[i21] ^ ((int) (j << i16));
            iArr[i20] = (int) (iArr[i20] ^ (j >>> (32 - i16)));
            iArr[i17] = 0;
        }
        int[] iArr2 = this.value;
        long j3 = (BodyPartID.bodyIdMax << i12) & iArr2[i11] & BodyPartID.bodyIdMax;
        iArr2[0] = (int) (iArr2[0] ^ (j3 >>> (32 - i13)));
        int i22 = i11 - i15;
        int i23 = i22 - 1;
        if (i23 >= 0) {
            iArr2[i23] = iArr2[i23] ^ ((int) (j3 << i16));
        }
        iArr2[i22] = (int) ((j3 >>> (32 - i16)) ^ iArr2[i22]);
        iArr2[i11] = reverseRightMask[i12] & iArr2[i11];
        this.blocks = ((i3 - 1) >>> 5) + 1;
        this.len = i3;
    }

    public GF2Polynomial remainder(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial3.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial2.reduceN();
        gF2Polynomial3.reduceN();
        int i3 = gF2Polynomial2.len;
        int i10 = gF2Polynomial3.len;
        if (i3 >= i10) {
            while (true) {
                int i11 = i3 - i10;
                if (i11 < 0) {
                    break;
                }
                gF2Polynomial2.subtractFromThis(gF2Polynomial3.shiftLeft(i11));
                gF2Polynomial2.reduceN();
                i3 = gF2Polynomial2.len;
                i10 = gF2Polynomial3.len;
            }
        }
        return gF2Polynomial2;
    }

    public void resetBit(int i3) throws RuntimeException {
        if (i3 < 0) {
            throw new RuntimeException();
        }
        if (i3 > this.len - 1) {
            return;
        }
        int[] iArr = this.value;
        int i10 = i3 >>> 5;
        iArr[i10] = (~bitMask[i3 & 31]) & iArr[i10];
    }

    public void setBit(int i3) throws RuntimeException {
        if (i3 < 0 || i3 > this.len - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.value;
        int i10 = i3 >>> 5;
        iArr[i10] = bitMask[i3 & 31] | iArr[i10];
    }

    public void shiftBlocksLeft() {
        int i3 = this.blocks;
        int i10 = i3 + 1;
        this.blocks = i10;
        this.len += 32;
        int[] iArr = this.value;
        if (i10 > iArr.length) {
            int[] iArr2 = new int[i10];
            System.arraycopy(iArr, 0, iArr2, 1, i3);
            this.value = iArr2;
        } else {
            while (i3 >= 1) {
                int[] iArr3 = this.value;
                iArr3[i3] = iArr3[i3 - 1];
                i3--;
            }
            this.value[0] = 0;
        }
    }

    public GF2Polynomial shiftLeft() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + 1, this.value);
        for (int i3 = gF2Polynomial.blocks - 1; i3 >= 1; i3--) {
            int[] iArr = gF2Polynomial.value;
            int i10 = iArr[i3] << 1;
            iArr[i3] = i10;
            iArr[i3] = i10 | (iArr[i3 - 1] >>> 31);
        }
        int[] iArr2 = gF2Polynomial.value;
        iArr2[0] = iArr2[0] << 1;
        return gF2Polynomial;
    }

    public void shiftLeftAddThis(GF2Polynomial gF2Polynomial, int i3) {
        int i10;
        if (i3 == 0) {
            addToThis(gF2Polynomial);
            return;
        }
        expandN(gF2Polynomial.len + i3);
        int i11 = i3 >>> 5;
        for (int i12 = gF2Polynomial.blocks - 1; i12 >= 0; i12--) {
            int i13 = i12 + i11;
            int i14 = i13 + 1;
            if (i14 < this.blocks && (i10 = i3 & 31) != 0) {
                int[] iArr = this.value;
                iArr[i14] = (gF2Polynomial.value[i12] >>> (32 - i10)) ^ iArr[i14];
            }
            int[] iArr2 = this.value;
            iArr2[i13] = iArr2[i13] ^ (gF2Polynomial.value[i12] << (i3 & 31));
        }
    }

    public void shiftLeftThis() {
        int i3 = this.len;
        int i10 = i3 & 31;
        this.len = i3 + 1;
        int i11 = this.blocks;
        if (i10 != 0) {
            for (int i12 = i11 - 1; i12 >= 1; i12--) {
                int[] iArr = this.value;
                int i13 = iArr[i12] << 1;
                iArr[i12] = i13;
                iArr[i12] = i13 | (iArr[i12 - 1] >>> 31);
            }
            int[] iArr2 = this.value;
            iArr2[0] = iArr2[0] << 1;
            return;
        }
        int i14 = i11 + 1;
        this.blocks = i14;
        int[] iArr3 = this.value;
        if (i14 > iArr3.length) {
            int[] iArr4 = new int[i14];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            this.value = iArr4;
        }
        for (int i15 = this.blocks - 1; i15 >= 1; i15--) {
            int[] iArr5 = this.value;
            int i16 = i15 - 1;
            iArr5[i15] = iArr5[i15] | (iArr5[i16] >>> 31);
            iArr5[i16] = iArr5[i16] << 1;
        }
    }

    public GF2Polynomial shiftRight() {
        int i3;
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len - 1);
        int i10 = 0;
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, gF2Polynomial.blocks);
        while (true) {
            i3 = gF2Polynomial.blocks;
            if (i10 > i3 - 2) {
                break;
            }
            int[] iArr = gF2Polynomial.value;
            int i11 = iArr[i10] >>> 1;
            iArr[i10] = i11;
            int i12 = i10 + 1;
            iArr[i10] = i11 | (iArr[i12] << 31);
            i10 = i12;
        }
        int[] iArr2 = gF2Polynomial.value;
        int i13 = i3 - 1;
        iArr2[i13] = iArr2[i13] >>> 1;
        if (i3 < this.blocks) {
            int i14 = i3 - 1;
            iArr2[i14] = (this.value[i3] << 31) | iArr2[i14];
        }
        return gF2Polynomial;
    }

    public void shiftRightThis() {
        int i3;
        int i10 = this.len;
        this.len = i10 - 1;
        this.blocks = ((i10 - 2) >>> 5) + 1;
        int i11 = 0;
        while (true) {
            i3 = this.blocks;
            if (i11 > i3 - 2) {
                break;
            }
            int[] iArr = this.value;
            int i12 = iArr[i11] >>> 1;
            iArr[i11] = i12;
            int i13 = i11 + 1;
            iArr[i11] = i12 | (iArr[i13] << 31);
            i11 = i13;
        }
        int[] iArr2 = this.value;
        int i14 = i3 - 1;
        iArr2[i14] = iArr2[i14] >>> 1;
        if ((this.len & 31) == 0) {
            int i15 = i3 - 1;
            iArr2[i15] = (iArr2[i3] << 31) | iArr2[i15];
        }
    }

    public void squareThisBitwise() {
        if (isZero()) {
            return;
        }
        int i3 = this.blocks;
        int i10 = i3 << 1;
        int[] iArr = new int[i10];
        for (int i11 = i3 - 1; i11 >= 0; i11--) {
            int i12 = this.value[i11];
            int i13 = 1;
            for (int i14 = 0; i14 < 16; i14++) {
                if ((i12 & 1) != 0) {
                    int i15 = i11 << 1;
                    iArr[i15] = iArr[i15] | i13;
                }
                if ((65536 & i12) != 0) {
                    int i16 = (i11 << 1) + 1;
                    iArr[i16] = iArr[i16] | i13;
                }
                i13 <<= 2;
                i12 >>>= 1;
            }
        }
        this.value = iArr;
        this.blocks = i10;
        this.len = (this.len << 1) - 1;
    }

    public void squareThisPreCalc() {
        int i3;
        int i10;
        if (isZero()) {
            return;
        }
        int length = this.value.length;
        int i11 = this.blocks;
        if (length >= (i11 << 1)) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                int[] iArr = this.value;
                int i13 = i12 << 1;
                short[] sArr = squaringTable;
                int i14 = iArr[i12];
                iArr[i13 + 1] = (sArr[(i14 & (-16777216)) >>> 24] << 16) | sArr[(i14 & 16711680) >>> 16];
                int i15 = iArr[i12];
                iArr[i13] = (sArr[(i15 & 65280) >>> 8] << 16) | sArr[i15 & 255];
            }
            i10 = this.blocks << 1;
        } else {
            int[] iArr2 = new int[i11 << 1];
            int i16 = 0;
            while (true) {
                i3 = this.blocks;
                if (i16 >= i3) {
                    break;
                }
                int i17 = i16 << 1;
                short[] sArr2 = squaringTable;
                int[] iArr3 = this.value;
                int i18 = iArr3[i16];
                iArr2[i17] = (sArr2[(i18 & 65280) >>> 8] << 16) | sArr2[i18 & 255];
                int i19 = iArr3[i16];
                iArr2[i17 + 1] = (sArr2[(i19 & (-16777216)) >>> 24] << 16) | sArr2[(i19 & 16711680) >>> 16];
                i16++;
            }
            this.value = iArr2;
            i10 = i3 << 1;
        }
        this.blocks = i10;
        this.len = (this.len << 1) - 1;
    }

    public GF2Polynomial subtract(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void subtractFromThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public boolean testBit(int i3) {
        if (i3 < 0) {
            throw new RuntimeException();
        }
        if (i3 > this.len - 1) {
            return false;
        }
        return (bitMask[i3 & 31] & this.value[i3 >>> 5]) != 0;
    }

    public byte[] toByteArray() {
        int i3 = ((this.len - 1) >> 3) + 1;
        int i10 = i3 & 3;
        byte[] bArr = new byte[i3];
        for (int i11 = 0; i11 < (i3 >> 2); i11++) {
            int i12 = i3 - (i11 << 2);
            int i13 = this.value[i11];
            bArr[i12 - 1] = (byte) (i13 & 255);
            bArr[i12 - 2] = (byte) ((65280 & i13) >>> 8);
            bArr[i12 - 3] = (byte) ((16711680 & i13) >>> 16);
            bArr[i12 - 4] = (byte) (((-16777216) & i13) >>> 24);
        }
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = ((i10 - i14) - 1) << 3;
            bArr[i14] = (byte) ((this.value[this.blocks - 1] & (255 << i15)) >>> i15);
        }
        return bArr;
    }

    public BigInteger toFlexiBigInt() {
        return (this.len == 0 || isZero()) ? new BigInteger(0, new byte[0]) : new BigInteger(1, toByteArray());
    }

    public int[] toIntegerArray() {
        int i3 = this.blocks;
        int[] iArr = new int[i3];
        System.arraycopy(this.value, 0, iArr, 0, i3);
        return iArr;
    }

    public String toString(int i3) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String[] strArr = {StubApp.getString2(9267), StubApp.getString2(34820), StubApp.getString2(34821), StubApp.getString2(34822), StubApp.getString2(34823), StubApp.getString2(34824), StubApp.getString2(34825), StubApp.getString2(34826), StubApp.getString2(20546), StubApp.getString2(20792), StubApp.getString2(34827), StubApp.getString2(34828), StubApp.getString2(34829), StubApp.getString2(34830), StubApp.getString2(34818), StubApp.getString2(34819)};
        String str = new String();
        String string2 = StubApp.getString2(397);
        if (i3 == 16) {
            for (int i10 = this.blocks - 1; i10 >= 0; i10--) {
                StringBuilder b2 = AbstractC1856e.b(str);
                b2.append(cArr[(this.value[i10] >>> 28) & 15]);
                StringBuilder b10 = AbstractC1856e.b(b2.toString());
                b10.append(cArr[(this.value[i10] >>> 24) & 15]);
                StringBuilder b11 = AbstractC1856e.b(b10.toString());
                b11.append(cArr[(this.value[i10] >>> 20) & 15]);
                StringBuilder b12 = AbstractC1856e.b(b11.toString());
                b12.append(cArr[(this.value[i10] >>> 16) & 15]);
                StringBuilder b13 = AbstractC1856e.b(b12.toString());
                b13.append(cArr[(this.value[i10] >>> 12) & 15]);
                StringBuilder b14 = AbstractC1856e.b(b13.toString());
                b14.append(cArr[(this.value[i10] >>> 8) & 15]);
                StringBuilder b15 = AbstractC1856e.b(b14.toString());
                b15.append(cArr[(this.value[i10] >>> 4) & 15]);
                StringBuilder b16 = AbstractC1856e.b(b15.toString());
                b16.append(cArr[this.value[i10] & 15]);
                str = AbstractC1482f.g(b16.toString(), string2);
            }
            return str;
        }
        for (int i11 = this.blocks - 1; i11 >= 0; i11--) {
            StringBuilder b17 = AbstractC1856e.b(str);
            b17.append(strArr[(this.value[i11] >>> 28) & 15]);
            StringBuilder b18 = AbstractC1856e.b(b17.toString());
            b18.append(strArr[(this.value[i11] >>> 24) & 15]);
            StringBuilder b19 = AbstractC1856e.b(b18.toString());
            b19.append(strArr[(this.value[i11] >>> 20) & 15]);
            StringBuilder b20 = AbstractC1856e.b(b19.toString());
            b20.append(strArr[(this.value[i11] >>> 16) & 15]);
            StringBuilder b21 = AbstractC1856e.b(b20.toString());
            b21.append(strArr[(this.value[i11] >>> 12) & 15]);
            StringBuilder b22 = AbstractC1856e.b(b21.toString());
            b22.append(strArr[(this.value[i11] >>> 8) & 15]);
            StringBuilder b23 = AbstractC1856e.b(b22.toString());
            b23.append(strArr[(this.value[i11] >>> 4) & 15]);
            StringBuilder b24 = AbstractC1856e.b(b23.toString());
            b24.append(strArr[this.value[i11] & 15]);
            str = AbstractC1482f.g(b24.toString(), string2);
        }
        return str;
    }

    public boolean vectorMult(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (this.len != gF2Polynomial.len) {
            throw new RuntimeException();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < this.blocks; i3++) {
            int i10 = this.value[i3] & gF2Polynomial.value[i3];
            boolean[] zArr = parity;
            z2 = (((z2 ^ zArr[i10 & 255]) ^ zArr[(i10 >>> 8) & 255]) ^ zArr[(i10 >>> 16) & 255]) ^ zArr[(i10 >>> 24) & 255];
        }
        return z2;
    }

    public GF2Polynomial xor(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2;
        int min = Math.min(this.blocks, gF2Polynomial.blocks);
        int i3 = 0;
        if (this.len >= gF2Polynomial.len) {
            gF2Polynomial2 = new GF2Polynomial(this);
            while (i3 < min) {
                int[] iArr = gF2Polynomial2.value;
                iArr[i3] = iArr[i3] ^ gF2Polynomial.value[i3];
                i3++;
            }
        } else {
            gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
            while (i3 < min) {
                int[] iArr2 = gF2Polynomial2.value;
                iArr2[i3] = iArr2[i3] ^ this.value[i3];
                i3++;
            }
        }
        gF2Polynomial2.zeroUnusedBits();
        return gF2Polynomial2;
    }

    public void xorBit(int i3) throws RuntimeException {
        if (i3 < 0 || i3 > this.len - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.value;
        int i10 = i3 >>> 5;
        iArr[i10] = bitMask[i3 & 31] ^ iArr[i10];
    }

    public void xorThisBy(GF2Polynomial gF2Polynomial) {
        for (int i3 = 0; i3 < Math.min(this.blocks, gF2Polynomial.blocks); i3++) {
            int[] iArr = this.value;
            iArr[i3] = iArr[i3] ^ gF2Polynomial.value[i3];
        }
        zeroUnusedBits();
    }

    public GF2Polynomial(int i3, String str) {
        i3 = i3 < 1 ? 1 : i3;
        int i10 = ((i3 - 1) >> 5) + 1;
        this.blocks = i10;
        this.value = new int[i10];
        this.len = i3;
        if (str.equalsIgnoreCase(StubApp.getString2(34812))) {
            assignZero();
            return;
        }
        if (str.equalsIgnoreCase(StubApp.getString2(34813))) {
            assignOne();
            return;
        }
        if (str.equalsIgnoreCase(StubApp.getString2(34814))) {
            randomize();
        } else if (str.equalsIgnoreCase(StubApp.getString2(4926))) {
            assignX();
        } else {
            if (!str.equalsIgnoreCase(StubApp.getString2(10228))) {
                throw new IllegalArgumentException(a.k(StubApp.getString2(34815), str, StubApp.getString2(34816)));
            }
            assignAll();
        }
    }

    public void randomize(Random random) {
        for (int i3 = 0; i3 < this.blocks; i3++) {
            this.value[i3] = random.nextInt();
        }
        zeroUnusedBits();
    }

    public GF2Polynomial shiftLeft(int i3) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + i3, this.value);
        if (i3 >= 32) {
            gF2Polynomial.doShiftBlocksLeft(i3 >>> 5);
        }
        int i10 = i3 & 31;
        if (i10 != 0) {
            for (int i11 = gF2Polynomial.blocks - 1; i11 >= 1; i11--) {
                int[] iArr = gF2Polynomial.value;
                int i12 = iArr[i11] << i10;
                iArr[i11] = i12;
                iArr[i11] = i12 | (iArr[i11 - 1] >>> (32 - i10));
            }
            int[] iArr2 = gF2Polynomial.value;
            iArr2[0] = iArr2[0] << i10;
        }
        return gF2Polynomial;
    }

    public GF2Polynomial(int i3, BigInteger bigInteger) {
        i3 = i3 < 1 ? 1 : i3;
        int i10 = ((i3 - 1) >> 5) + 1;
        this.blocks = i10;
        this.value = new int[i10];
        this.len = i3;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        int length2 = byteArray.length & 3;
        int length3 = (byteArray.length - 1) >> 2;
        for (int i11 = 0; i11 < length2; i11++) {
            int[] iArr = this.value;
            iArr[length3] = iArr[length3] | ((byteArray[i11] & UByte.MAX_VALUE) << (((length2 - 1) - i11) << 3));
        }
        for (int i12 = 0; i12 <= ((byteArray.length - 4) >> 2); i12++) {
            int length4 = (byteArray.length - 1) - (i12 << 2);
            int[] iArr2 = this.value;
            int i13 = byteArray[length4] & UByte.MAX_VALUE;
            iArr2[i12] = i13;
            int i14 = i13 | ((byteArray[length4 - 1] << 8) & 65280);
            iArr2[i12] = i14;
            int i15 = i14 | ((byteArray[length4 - 2] << Tnaf.POW_2_WIDTH) & 16711680);
            iArr2[i12] = i15;
            iArr2[i12] = ((byteArray[length4 - 3] << 24) & (-16777216)) | i15;
        }
        int i16 = this.len;
        if ((i16 & 31) != 0) {
            int[] iArr3 = this.value;
            int i17 = this.blocks - 1;
            iArr3[i17] = reverseRightMask[i16 & 31] & iArr3[i17];
        }
        reduceN();
    }

    public GF2Polynomial(int i3, Random random) {
        i3 = i3 < 1 ? 1 : i3;
        int i10 = ((i3 - 1) >> 5) + 1;
        this.blocks = i10;
        this.value = new int[i10];
        this.len = i3;
        randomize(random);
    }

    public GF2Polynomial(int i3, byte[] bArr) {
        int i10;
        i3 = i3 < 1 ? 1 : i3;
        int i11 = ((i3 - 1) >> 5) + 1;
        this.blocks = i11;
        this.value = new int[i11];
        this.len = i3;
        int min = Math.min(((bArr.length - 1) >> 2) + 1, i11);
        int i12 = 0;
        while (true) {
            i10 = min - 1;
            if (i12 >= i10) {
                break;
            }
            int length = bArr.length - (i12 << 2);
            int[] iArr = this.value;
            int i13 = bArr[length - 1] & UByte.MAX_VALUE;
            iArr[i12] = i13;
            int i14 = (65280 & (bArr[length - 2] << 8)) | i13;
            iArr[i12] = i14;
            int i15 = (16711680 & (bArr[length - 3] << Tnaf.POW_2_WIDTH)) | i14;
            iArr[i12] = i15;
            iArr[i12] = ((bArr[length - 4] << 24) & (-16777216)) | i15;
            i12++;
        }
        int length2 = bArr.length - (i10 << 2);
        int i16 = length2 - 1;
        int[] iArr2 = this.value;
        int i17 = bArr[i16] & UByte.MAX_VALUE;
        iArr2[i10] = i17;
        if (i16 > 0) {
            iArr2[i10] = (65280 & (bArr[length2 - 2] << 8)) | i17;
        }
        if (i16 > 1) {
            iArr2[i10] = iArr2[i10] | (16711680 & (bArr[length2 - 3] << Tnaf.POW_2_WIDTH));
        }
        if (i16 > 2) {
            iArr2[i10] = ((bArr[length2 - 4] << 24) & (-16777216)) | iArr2[i10];
        }
        zeroUnusedBits();
        reduceN();
    }

    public GF2Polynomial(int i3, int[] iArr) {
        i3 = i3 < 1 ? 1 : i3;
        int i10 = ((i3 - 1) >> 5) + 1;
        this.blocks = i10;
        this.value = new int[i10];
        this.len = i3;
        System.arraycopy(iArr, 0, this.value, 0, Math.min(i10, iArr.length));
        zeroUnusedBits();
    }

    public GF2Polynomial(GF2Polynomial gF2Polynomial) {
        this.len = gF2Polynomial.len;
        this.blocks = gF2Polynomial.blocks;
        this.value = IntUtils.clone(gF2Polynomial.value);
    }
}
