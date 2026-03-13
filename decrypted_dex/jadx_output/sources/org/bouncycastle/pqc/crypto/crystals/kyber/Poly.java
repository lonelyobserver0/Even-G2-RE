package org.bouncycastle.pqc.crypto.crystals.kyber;

import com.stub.StubApp;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Poly {
    private KyberEngine engine;
    private int eta1;
    private int polyCompressedBytes;
    private Symmetric symmetric;
    private short[] coeffs = new short[256];
    private int eta2 = KyberEngine.getKyberEta2();

    public Poly(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.polyCompressedBytes = kyberEngine.getKyberPolyCompressedBytes();
        this.eta1 = kyberEngine.getKyberEta1();
        this.symmetric = kyberEngine.getSymmetric();
    }

    public static void baseMultMontgomery(Poly poly, Poly poly2, Poly poly3) {
        for (int i3 = 0; i3 < 64; i3++) {
            int i10 = i3 * 4;
            short coeffIndex = poly2.getCoeffIndex(i10);
            int i11 = i10 + 1;
            short coeffIndex2 = poly2.getCoeffIndex(i11);
            short coeffIndex3 = poly3.getCoeffIndex(i10);
            short coeffIndex4 = poly3.getCoeffIndex(i11);
            short[] sArr = Ntt.nttZetas;
            int i12 = i3 + 64;
            Ntt.baseMult(poly, i10, coeffIndex, coeffIndex2, coeffIndex3, coeffIndex4, sArr[i12]);
            int i13 = i10 + 2;
            int i14 = i10 + 3;
            Ntt.baseMult(poly, i13, poly2.getCoeffIndex(i13), poly2.getCoeffIndex(i14), poly3.getCoeffIndex(i13), poly3.getCoeffIndex(i14), (short) (sArr[i12] * (-1)));
        }
    }

    public void addCoeffs(Poly poly) {
        for (int i3 = 0; i3 < 256; i3++) {
            setCoeffIndex(i3, (short) (getCoeffIndex(i3) + poly.getCoeffIndex(i3)));
        }
    }

    public byte[] compressPoly() {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[this.polyCompressedBytes];
        conditionalSubQ();
        int i3 = this.polyCompressedBytes;
        if (i3 == 128) {
            int i10 = 0;
            for (int i11 = 0; i11 < 32; i11++) {
                for (int i12 = 0; i12 < 8; i12++) {
                    bArr[i12] = (byte) ((((getCoeffIndex((i11 * 8) + i12) << 4) + 1664) / KyberEngine.KyberQ) & 15);
                }
                bArr2[i10] = (byte) (bArr[0] | (bArr[1] << 4));
                bArr2[i10 + 1] = (byte) (bArr[2] | (bArr[3] << 4));
                bArr2[i10 + 2] = (byte) (bArr[4] | (bArr[5] << 4));
                bArr2[i10 + 3] = (byte) (bArr[6] | (bArr[7] << 4));
                i10 += 4;
            }
        } else {
            if (i3 != 160) {
                throw new RuntimeException(StubApp.getString2(33997));
            }
            int i13 = 0;
            for (int i14 = 0; i14 < 32; i14++) {
                for (int i15 = 0; i15 < 8; i15++) {
                    bArr[i15] = (byte) ((((getCoeffIndex((i14 * 8) + i15) << 5) + 1664) / KyberEngine.KyberQ) & 31);
                }
                bArr2[i13] = (byte) (bArr[0] | (bArr[1] << 5));
                bArr2[i13 + 1] = (byte) ((bArr[1] >> 3) | (bArr[2] << 2) | (bArr[3] << 7));
                bArr2[i13 + 2] = (byte) ((bArr[3] >> 1) | (bArr[4] << 4));
                bArr2[i13 + 3] = (byte) ((bArr[4] >> 4) | (bArr[5] << 1) | (bArr[6] << 6));
                bArr2[i13 + 4] = (byte) ((bArr[6] >> 2) | (bArr[7] << 3));
                i13 += 5;
            }
        }
        return bArr2;
    }

    public void conditionalSubQ() {
        for (int i3 = 0; i3 < 256; i3++) {
            setCoeffIndex(i3, Reduce.conditionalSubQ(getCoeffIndex(i3)));
        }
    }

    public void convertToMont() {
        for (int i3 = 0; i3 < 256; i3++) {
            setCoeffIndex(i3, Reduce.montgomeryReduce(getCoeffIndex(i3) * 1353));
        }
    }

    public void decompressPoly(byte[] bArr) {
        int i3 = 7;
        int i10 = 5;
        int i11 = 3;
        int i12 = 2;
        if (this.engine.getKyberPolyCompressedBytes() == 128) {
            int i13 = 0;
            for (int i14 = 0; i14 < 128; i14++) {
                int i15 = i14 * 2;
                setCoeffIndex(i15, (short) (((((short) (bArr[i13] & 15)) * 3329) + 8) >> 4));
                setCoeffIndex(i15 + 1, (short) (((((short) ((bArr[i13] & UByte.MAX_VALUE) >> 4)) * 3329) + 8) >> 4));
                i13++;
            }
            return;
        }
        if (this.engine.getKyberPolyCompressedBytes() != 160) {
            throw new RuntimeException(StubApp.getString2(33997));
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < 32) {
            byte b2 = bArr[i17];
            byte b10 = (byte) (b2 & UByte.MAX_VALUE);
            int i18 = (b2 & UByte.MAX_VALUE) >> i10;
            byte b11 = bArr[i17 + 1];
            byte b12 = (byte) (i18 | ((b11 & UByte.MAX_VALUE) << i11));
            byte b13 = (byte) ((b11 & UByte.MAX_VALUE) >> i12);
            int i19 = (b11 & UByte.MAX_VALUE) >> i3;
            byte b14 = bArr[i17 + 2];
            int i20 = i3;
            byte b15 = (byte) (((b14 & UByte.MAX_VALUE) << 1) | i19);
            int i21 = (b14 & UByte.MAX_VALUE) >> 4;
            byte b16 = bArr[i17 + 3];
            int i22 = i10;
            byte b17 = (byte) (i21 | ((b16 & UByte.MAX_VALUE) << 4));
            byte b18 = (byte) ((b16 & UByte.MAX_VALUE) >> 1);
            int i23 = (b16 & UByte.MAX_VALUE) >> 6;
            int i24 = i11;
            byte b19 = bArr[i17 + 4];
            int i25 = i12;
            byte b20 = (byte) (((b19 & UByte.MAX_VALUE) << 2) | i23);
            byte b21 = (byte) ((b19 & UByte.MAX_VALUE) >> 3);
            byte[] bArr2 = new byte[8];
            bArr2[0] = b10;
            bArr2[1] = b12;
            bArr2[i25] = b13;
            bArr2[i24] = b15;
            bArr2[4] = b17;
            bArr2[i22] = b18;
            bArr2[6] = b20;
            bArr2[i20] = b21;
            i17 += 5;
            for (int i26 = 0; i26 < 8; i26++) {
                setCoeffIndex((i16 * 8) + i26, (short) ((((bArr2[i26] & 31) * KyberEngine.KyberQ) + 16) >> 5));
            }
            i16++;
            i3 = i20;
            i10 = i22;
            i12 = i25;
            i11 = i24;
        }
    }

    public void fromBytes(byte[] bArr) {
        for (int i3 = 0; i3 < 128; i3++) {
            int i10 = i3 * 2;
            int i11 = i3 * 3;
            setCoeffIndex(i10, (short) (((bArr[i11] & UByte.MAX_VALUE) | ((bArr[i11 + 1] & UByte.MAX_VALUE) << 8)) & 4095));
            setCoeffIndex(i10 + 1, (short) ((((bArr[r4] & UByte.MAX_VALUE) >> 4) | ((bArr[i11 + 2] & UByte.MAX_VALUE) << 4)) & 4095));
        }
    }

    public void fromMsg(byte[] bArr) {
        if (bArr.length != 32) {
            throw new RuntimeException(StubApp.getString2(33998));
        }
        for (int i3 = 0; i3 < 32; i3++) {
            for (int i10 = 0; i10 < 8; i10++) {
                setCoeffIndex((i3 * 8) + i10, (short) (((short) (((short) (((bArr[i3] & UByte.MAX_VALUE) >> i10) & 1)) * (-1))) & 1665));
            }
        }
    }

    public short getCoeffIndex(int i3) {
        return this.coeffs[i3];
    }

    public short[] getCoeffs() {
        return this.coeffs;
    }

    public void getEta1Noise(byte[] bArr, byte b2) {
        byte[] bArr2 = new byte[(this.eta1 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b2);
        CBD.kyberCBD(this, bArr2, this.eta1);
    }

    public void getEta2Noise(byte[] bArr, byte b2) {
        byte[] bArr2 = new byte[(this.eta2 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b2);
        CBD.kyberCBD(this, bArr2, this.eta2);
    }

    public void polyInverseNttToMont() {
        setCoeffs(Ntt.invNtt(getCoeffs()));
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(getCoeffs()));
        reduce();
    }

    public void polySubtract(Poly poly) {
        for (int i3 = 0; i3 < 256; i3++) {
            setCoeffIndex(i3, (short) (poly.getCoeffIndex(i3) - getCoeffIndex(i3)));
        }
    }

    public void reduce() {
        for (int i3 = 0; i3 < 256; i3++) {
            setCoeffIndex(i3, Reduce.barretReduce(getCoeffIndex(i3)));
        }
    }

    public void setCoeffIndex(int i3, short s10) {
        this.coeffs[i3] = s10;
    }

    public void setCoeffs(short[] sArr) {
        this.coeffs = sArr;
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[KyberEngine.KyberPolyBytes];
        conditionalSubQ();
        for (int i3 = 0; i3 < 128; i3++) {
            int i10 = i3 * 2;
            short coeffIndex = getCoeffIndex(i10);
            short coeffIndex2 = getCoeffIndex(i10 + 1);
            int i11 = i3 * 3;
            bArr[i11] = (byte) coeffIndex;
            bArr[i11 + 1] = (byte) ((coeffIndex >> 8) | (coeffIndex2 << 4));
            bArr[i11 + 2] = (byte) (coeffIndex2 >> 4);
        }
        return bArr;
    }

    public byte[] toMsg() {
        byte[] bArr = new byte[KyberEngine.getKyberIndCpaMsgBytes()];
        conditionalSubQ();
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = 0;
            for (int i10 = 0; i10 < 8; i10++) {
                bArr[i3] = (byte) (((byte) (((short) (((((short) (getCoeffIndex((i3 * 8) + i10) << 1)) + 1664) / KyberEngine.KyberQ) & 1)) << i10)) | bArr[i3]);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(1557));
        int i3 = 0;
        while (true) {
            short[] sArr = this.coeffs;
            if (i3 >= sArr.length) {
                stringBuffer.append(StubApp.getString2(511));
                return stringBuffer.toString();
            }
            stringBuffer.append((int) sArr[i3]);
            if (i3 != this.coeffs.length - 1) {
                stringBuffer.append(StubApp.getString2(81));
            }
            i3++;
        }
    }
}
