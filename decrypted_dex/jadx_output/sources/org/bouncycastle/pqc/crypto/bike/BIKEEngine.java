package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BIKEEngine {
    private int L_BYTE;
    private int R_BYTE;
    private GF2mField field;
    private int hw;

    /* renamed from: l, reason: collision with root package name */
    private int f19353l;
    private int nbIter;

    /* renamed from: r, reason: collision with root package name */
    private int f19354r;
    private final PolynomialGF2mSmallM reductionPoly;

    /* renamed from: t, reason: collision with root package name */
    private int f19355t;
    private int tau;

    /* renamed from: w, reason: collision with root package name */
    private int f19356w;

    public BIKEEngine(int i3, int i10, int i11, int i12, int i13, int i14) {
        this.f19354r = i3;
        this.f19356w = i10;
        this.f19355t = i11;
        this.f19353l = i12;
        this.nbIter = i13;
        this.tau = i14;
        this.hw = i10 / 2;
        this.L_BYTE = i12 / 8;
        this.R_BYTE = (i3 + 7) / 8;
        GF2mField gF2mField = new GF2mField(1);
        this.field = gF2mField;
        this.reductionPoly = new PolynomialGF2mSmallM(gF2mField, i3).addMonomial(0);
    }

    private void BFIter(byte[] bArr, byte[] bArr2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3, byte[] bArr4) {
        int[] iArr5 = new int[this.f19354r * 2];
        for (int i10 = 0; i10 < this.f19354r; i10++) {
            if (ctr(iArr3, bArr, i10) >= i3) {
                updateNewErrorIndex(bArr2, i10);
                iArr5[i10] = 1;
                bArr3[i10] = 1;
            } else if (ctr(iArr3, bArr, i10) >= i3 - this.tau) {
                bArr4[i10] = 1;
            }
        }
        for (int i11 = 0; i11 < this.f19354r; i11++) {
            if (ctr(iArr4, bArr, i11) >= i3) {
                updateNewErrorIndex(bArr2, this.f19354r + i11);
                int i12 = this.f19354r;
                iArr5[i12 + i11] = 1;
                bArr3[i12 + i11] = 1;
            } else if (ctr(iArr4, bArr, i11) >= i3 - this.tau) {
                bArr4[this.f19354r + i11] = 1;
            }
        }
        for (int i13 = 0; i13 < this.f19354r * 2; i13++) {
            if (iArr5[i13] == 1) {
                recomputeSyndrome(bArr, i13, iArr, iArr2);
            }
        }
    }

    private void BFMaskedIter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[this.f19354r * 2];
        for (int i10 = 0; i10 < this.f19354r; i10++) {
            if (ctr(iArr3, bArr, i10) >= i3 && bArr3[i10] == 1) {
                updateNewErrorIndex(bArr2, i10);
                iArr5[i10] = 1;
            }
        }
        for (int i11 = 0; i11 < this.f19354r; i11++) {
            if (ctr(iArr4, bArr, i11) >= i3) {
                int i12 = this.f19354r;
                if (bArr3[i12 + i11] == 1) {
                    updateNewErrorIndex(bArr2, i12 + i11);
                    iArr5[this.f19354r + i11] = 1;
                }
            }
        }
        for (int i13 = 0; i13 < this.f19354r * 2; i13++) {
            if (iArr5[i13] == 1) {
                recomputeSyndrome(bArr, i13, iArr, iArr2);
            }
        }
    }

    private byte[] BGFDecoder(byte[] bArr, int[] iArr, int[] iArr2) {
        byte[] bArr2 = new byte[this.f19354r * 2];
        int[] columnFromCompactVersion = getColumnFromCompactVersion(iArr);
        int[] columnFromCompactVersion2 = getColumnFromCompactVersion(iArr2);
        int i3 = 1;
        while (i3 <= this.nbIter) {
            int i10 = this.f19354r;
            byte[] bArr3 = new byte[i10 * 2];
            byte[] bArr4 = new byte[i10 * 2];
            byte[] bArr5 = bArr;
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int[] iArr5 = columnFromCompactVersion;
            int[] iArr6 = columnFromCompactVersion2;
            BFIter(bArr5, bArr2, threshold(Utils.getHammingWeight(bArr), i3, this.f19354r), iArr3, iArr4, iArr5, iArr6, bArr3, bArr4);
            columnFromCompactVersion2 = iArr6;
            columnFromCompactVersion = iArr5;
            if (i3 == 1) {
                BFMaskedIter(bArr5, bArr2, bArr3, ((this.hw + 1) / 2) + 1, iArr3, iArr4, columnFromCompactVersion, columnFromCompactVersion2);
                BFMaskedIter(bArr5, bArr2, bArr4, ((this.hw + 1) / 2) + 1, iArr3, iArr4, columnFromCompactVersion, columnFromCompactVersion2);
            }
            i3++;
            bArr = bArr5;
            iArr = iArr3;
            iArr2 = iArr4;
        }
        if (Utils.getHammingWeight(bArr) == 0) {
            return bArr2;
        }
        return null;
    }

    private byte[] computeSyndrome(byte[] bArr, byte[] bArr2) {
        return transpose(new PolynomialGF2mSmallM(this.field, bArr2).modKaratsubaMultiplyBigDeg(new PolynomialGF2mSmallM(this.field, bArr), this.reductionPoly).getEncoded());
    }

    private void convertToCompact(int[] iArr, byte[] bArr) {
        int i3;
        int i10 = 0;
        for (int i11 = 0; i11 < this.R_BYTE; i11++) {
            for (int i12 = 0; i12 < 8 && (i3 = (i11 * 8) + i12) != this.f19354r; i12++) {
                if (((bArr[i11] >> i12) & 1) == 1) {
                    iArr[i10] = i3;
                    i10++;
                }
            }
        }
    }

    private int ctr(int[] iArr, byte[] bArr, int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.hw; i11++) {
            if (bArr[(iArr[i11] + i3) % this.f19354r] == 1) {
                i10++;
            }
        }
        return i10;
    }

    private byte[] functionH(byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        return BIKERandomGenerator.generateRandomByteArray(this.f19354r * 2, this.R_BYTE * 2, this.f19355t, sHAKEDigest);
    }

    private byte[] functionK(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        byte[] bArr5 = new byte[this.L_BYTE];
        SHA3Digest sHA3Digest = new SHA3Digest(KyberEngine.KyberPolyBytes);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.update(bArr3, 0, bArr3.length);
        sHA3Digest.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr5, 0, this.L_BYTE);
        return bArr5;
    }

    private byte[] functionL(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[48];
        byte[] bArr4 = new byte[this.L_BYTE];
        SHA3Digest sHA3Digest = new SHA3Digest(KyberEngine.KyberPolyBytes);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.doFinal(bArr3, 0);
        System.arraycopy(bArr3, 0, bArr4, 0, this.L_BYTE);
        return bArr4;
    }

    private int[] getColumnFromCompactVersion(int[] iArr) {
        int[] iArr2 = new int[this.hw];
        int i3 = 0;
        if (iArr[0] != 0) {
            while (true) {
                int i10 = this.hw;
                if (i3 >= i10) {
                    break;
                }
                iArr2[i3] = this.f19354r - iArr[(i10 - 1) - i3];
                i3++;
            }
        } else {
            iArr2[0] = 0;
            int i11 = 1;
            while (true) {
                int i12 = this.hw;
                if (i11 >= i12) {
                    break;
                }
                iArr2[i11] = this.f19354r - iArr[i12 - i11];
                i11++;
            }
        }
        return iArr2;
    }

    private void recomputeSyndrome(byte[] bArr, int i3, int[] iArr, int[] iArr2) {
        int i10 = 0;
        if (i3 < this.f19354r) {
            while (i10 < this.hw) {
                int i11 = iArr[i10];
                if (i11 <= i3) {
                    int i12 = i3 - i11;
                    bArr[i12] = (byte) (bArr[i12] ^ 1);
                } else {
                    int i13 = (this.f19354r + i3) - i11;
                    bArr[i13] = (byte) (bArr[i13] ^ 1);
                }
                i10++;
            }
            return;
        }
        while (i10 < this.hw) {
            int i14 = iArr2[i10];
            int i15 = this.f19354r;
            if (i14 <= i3 - i15) {
                int i16 = (i3 - i15) - i14;
                bArr[i16] = (byte) (bArr[i16] ^ 1);
            } else {
                int i17 = (i3 - i15) + (i15 - i14);
                bArr[i17] = (byte) (bArr[i17] ^ 1);
            }
            i10++;
        }
    }

    private int threshold(int i3, int i10, int i11) {
        if (i11 == 12323) {
            int floor = (int) Math.floor((i3 * 0.0069722d) + 13.53d);
            if (floor > 36) {
                return floor;
            }
            return 36;
        }
        if (i11 == 24659) {
            int floor2 = (int) Math.floor((i3 * 0.005265d) + 15.2588d);
            if (floor2 > 52) {
                return floor2;
            }
            return 52;
        }
        if (i11 != 40973) {
            return 0;
        }
        int floor3 = (int) Math.floor((i3 * 0.00402312d) + 17.8785d);
        if (floor3 > 69) {
            return floor3;
        }
        return 69;
    }

    private byte[] transpose(byte[] bArr) {
        byte[] append0s = Utils.append0s(bArr, this.f19354r);
        byte[] bArr2 = new byte[this.f19354r];
        bArr2[0] = append0s[0];
        int i3 = 1;
        while (true) {
            int i10 = this.f19354r;
            if (i3 >= i10) {
                return bArr2;
            }
            bArr2[i3] = append0s[i10 - i3];
            i3++;
        }
    }

    private void updateNewErrorIndex(byte[] bArr, int i3) {
        int i10;
        if (i3 != 0 && i3 != (i10 = this.f19354r)) {
            i3 = i3 > i10 ? ((i10 * 2) - i3) + i10 : i10 - i3;
        }
        bArr[i3] = (byte) (bArr[i3] ^ 1);
    }

    public void decaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        int i3 = this.f19354r;
        byte[] bArr7 = new byte[i3];
        byte[] bArr8 = new byte[i3];
        byte[] bArr9 = new byte[this.f19353l];
        Utils.fromByteArrayToBitArray(bArr7, bArr5);
        Utils.fromByteArrayToBitArray(bArr8, bArr2);
        Utils.fromByteArrayToBitArray(bArr9, bArr4);
        byte[] removeLast0Bits = Utils.removeLast0Bits(bArr7);
        byte[] removeLast0Bits2 = Utils.removeLast0Bits(bArr8);
        int i10 = this.hw;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        convertToCompact(iArr, bArr2);
        convertToCompact(iArr2, bArr3);
        byte[] BGFDecoder = BGFDecoder(computeSyndrome(removeLast0Bits, removeLast0Bits2), iArr, iArr2);
        byte[] bArr10 = new byte[this.R_BYTE * 2];
        Utils.fromBitArrayToByteArray(bArr10, BGFDecoder);
        byte[] copyOfRange = Arrays.copyOfRange(BGFDecoder, 0, this.f19354r);
        byte[] copyOfRange2 = Arrays.copyOfRange(BGFDecoder, this.f19354r, BGFDecoder.length);
        byte[] bArr11 = new byte[this.R_BYTE];
        Utils.fromBitArrayToByteArray(bArr11, copyOfRange);
        byte[] bArr12 = new byte[this.R_BYTE];
        Utils.fromBitArrayToByteArray(bArr12, copyOfRange2);
        byte[] xorBytes = Utils.xorBytes(bArr6, functionL(bArr11, bArr12), this.L_BYTE);
        byte[] bArr13 = new byte[this.f19353l];
        byte[] functionK = Arrays.areEqual(bArr10, functionH(xorBytes)) ? functionK(xorBytes, bArr5, bArr6) : functionK(bArr4, bArr5, bArr6);
        System.arraycopy(functionK, 0, bArr, 0, functionK.length);
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[64];
        secureRandom.nextBytes(bArr5);
        int i3 = this.L_BYTE;
        byte[] bArr6 = new byte[i3];
        System.arraycopy(bArr5, 0, bArr6, 0, i3);
        byte[] functionH = functionH(bArr6);
        int i10 = this.f19354r * 2;
        byte[] bArr7 = new byte[i10];
        Utils.fromByteArrayToBitArray(bArr7, functionH);
        byte[] copyOfRange = Arrays.copyOfRange(bArr7, 0, this.f19354r);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr7, this.f19354r, i10);
        byte[] removeLast0Bits = Utils.removeLast0Bits(copyOfRange);
        byte[] removeLast0Bits2 = Utils.removeLast0Bits(copyOfRange2);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(this.field, removeLast0Bits);
        PolynomialGF2mSmallM polynomialGF2mSmallM2 = new PolynomialGF2mSmallM(this.field, removeLast0Bits2);
        byte[] bArr8 = new byte[this.f19354r];
        Utils.fromByteArrayToBitArray(bArr8, bArr4);
        byte[] encoded = polynomialGF2mSmallM.add(polynomialGF2mSmallM2.modKaratsubaMultiplyBigDeg(new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr8)), this.reductionPoly)).getEncoded();
        byte[] bArr9 = new byte[this.R_BYTE];
        Utils.fromBitArrayToByteArray(bArr9, encoded);
        System.arraycopy(bArr9, 0, bArr, 0, bArr.length);
        byte[] bArr10 = new byte[this.R_BYTE];
        Utils.fromBitArrayToByteArray(bArr10, copyOfRange);
        byte[] bArr11 = new byte[this.R_BYTE];
        Utils.fromBitArrayToByteArray(bArr11, copyOfRange2);
        System.arraycopy(Utils.xorBytes(bArr6, functionL(bArr10, bArr11), this.L_BYTE), 0, bArr2, 0, bArr2.length);
        byte[] functionK = functionK(bArr6, bArr, bArr2);
        System.arraycopy(functionK, 0, bArr3, 0, functionK.length);
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[64];
        secureRandom.nextBytes(bArr5);
        int i3 = this.L_BYTE;
        byte[] bArr6 = new byte[i3];
        byte[] bArr7 = new byte[i3];
        System.arraycopy(bArr5, 0, bArr6, 0, i3);
        System.arraycopy(bArr5, i3, bArr7, 0, i3);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr6, 0, i3);
        byte[] generateRandomByteArray = BIKERandomGenerator.generateRandomByteArray(this.f19354r, this.R_BYTE, this.hw, sHAKEDigest);
        byte[] generateRandomByteArray2 = BIKERandomGenerator.generateRandomByteArray(this.f19354r, this.R_BYTE, this.hw, sHAKEDigest);
        System.arraycopy(generateRandomByteArray, 0, bArr, 0, bArr.length);
        System.arraycopy(generateRandomByteArray2, 0, bArr2, 0, bArr2.length);
        int i10 = this.f19354r;
        byte[] bArr8 = new byte[i10];
        byte[] bArr9 = new byte[i10];
        Utils.fromByteArrayToBitArray(bArr9, generateRandomByteArray);
        Utils.fromByteArrayToBitArray(bArr8, generateRandomByteArray2);
        byte[] removeLast0Bits = Utils.removeLast0Bits(bArr9);
        byte[] encoded = new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr8)).modKaratsubaMultiplyBigDeg(new PolynomialGF2mSmallM(this.field, removeLast0Bits).modInverseBigDeg(this.reductionPoly), this.reductionPoly).getEncoded();
        byte[] bArr10 = new byte[this.R_BYTE];
        Utils.fromBitArrayToByteArray(bArr10, encoded);
        System.arraycopy(bArr10, 0, bArr4, 0, bArr4.length);
        System.arraycopy(bArr7, 0, bArr3, 0, bArr3.length);
    }

    public int getSessionKeySize() {
        return this.L_BYTE;
    }
}
