package org.bouncycastle.pqc.crypto.crystals.kyber;

import kotlin.UByte;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class KyberIndCpa {
    public final int KyberGenerateMatrixNBlocks;
    private KyberEngine engine;
    private int eta1;
    private int indCpaBytes;
    private int indCpaPublicKeyBytes;
    private int kyberK;
    private int polyCompressedBytes;
    private int polyVecBytes;
    private int polyVecCompressedBytes;
    private Symmetric symmetric;

    public KyberIndCpa(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.kyberK = kyberEngine.getKyberK();
        this.eta1 = kyberEngine.getKyberEta1();
        this.indCpaPublicKeyBytes = kyberEngine.getKyberPublicKeyBytes();
        this.polyVecBytes = kyberEngine.getKyberPolyVecBytes();
        this.indCpaBytes = kyberEngine.getKyberIndCpaBytes();
        this.polyVecCompressedBytes = kyberEngine.getKyberPolyVecCompressedBytes();
        this.polyCompressedBytes = kyberEngine.getKyberPolyCompressedBytes();
        Symmetric symmetric = kyberEngine.getSymmetric();
        this.symmetric = symmetric;
        int i3 = symmetric.xofBlockBytes;
        this.KyberGenerateMatrixNBlocks = (i3 + 472) / i3;
    }

    private byte[] packCipherText(PolyVec polyVec, Poly poly) {
        byte[] bArr = new byte[this.indCpaBytes];
        System.arraycopy(polyVec.compressPolyVec(), 0, bArr, 0, this.polyVecCompressedBytes);
        System.arraycopy(poly.compressPoly(), 0, bArr, this.polyVecCompressedBytes, this.polyCompressedBytes);
        return bArr;
    }

    private static int rejectionSampling(Poly poly, int i3, int i10, byte[] bArr, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = i13 + 3;
            if (i14 > i11) {
                break;
            }
            short s10 = (short) (bArr[i13] & UByte.MAX_VALUE);
            byte b2 = bArr[i13 + 1];
            short s11 = (short) ((s10 | (((short) (b2 & UByte.MAX_VALUE)) << 8)) & 4095);
            short s12 = (short) (((((short) (bArr[i13 + 2] & UByte.MAX_VALUE)) << 4) | (((short) (b2 & UByte.MAX_VALUE)) >> 4)) & 4095);
            if (s11 < 3329) {
                poly.setCoeffIndex(i3 + i12, s11);
                i12++;
            }
            if (i12 < i10 && s12 < 3329) {
                poly.setCoeffIndex(i3 + i12, s12);
                i12++;
            }
            i13 = i14;
        }
        return i12;
    }

    private void unpackCipherText(PolyVec polyVec, Poly poly, byte[] bArr) {
        polyVec.decompressPolyVec(Arrays.copyOfRange(bArr, 0, this.engine.getKyberPolyVecCompressedBytes()));
        poly.decompressPoly(Arrays.copyOfRange(bArr, this.engine.getKyberPolyVecCompressedBytes(), bArr.length));
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[KyberEngine.getKyberIndCpaMsgBytes()];
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        Poly poly = new Poly(this.engine);
        Poly poly2 = new Poly(this.engine);
        unpackCipherText(polyVec, poly, bArr);
        unpackSecretKey(polyVec2, bArr2);
        polyVec.polyVecNtt();
        PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec, this.engine);
        poly2.polyInverseNttToMont();
        poly2.polySubtract(poly);
        poly2.reduce();
        return poly2.toMsg();
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        PolyVec polyVec3 = new PolyVec(this.engine);
        PolyVec polyVec4 = new PolyVec(this.engine);
        PolyVec[] polyVecArr = new PolyVec[this.engine.getKyberK()];
        Poly poly = new Poly(this.engine);
        Poly poly2 = new Poly(this.engine);
        Poly poly3 = new Poly(this.engine);
        byte[] unpackPublicKey = unpackPublicKey(polyVec2, bArr2);
        poly3.fromMsg(bArr);
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            polyVecArr[i3] = new PolyVec(this.engine);
        }
        generateMatrix(polyVecArr, unpackPublicKey, true);
        byte b2 = 0;
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            polyVec.getVectorIndex(i10).getEta1Noise(bArr3, b2);
            b2 = (byte) (b2 + 1);
        }
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            polyVec3.getVectorIndex(i11).getEta2Noise(bArr3, b2);
            b2 = (byte) (b2 + 1);
        }
        poly.getEta2Noise(bArr3, b2);
        polyVec.polyVecNtt();
        for (int i12 = 0; i12 < this.kyberK; i12++) {
            PolyVec.pointwiseAccountMontgomery(polyVec4.getVectorIndex(i12), polyVecArr[i12], polyVec, this.engine);
        }
        PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec, this.engine);
        polyVec4.polyVecInverseNttToMont();
        poly2.polyInverseNttToMont();
        polyVec4.addPoly(polyVec3);
        poly2.addCoeffs(poly);
        poly2.addCoeffs(poly3);
        polyVec4.reducePoly();
        poly2.reduce();
        return packCipherText(polyVec4, poly2);
    }

    public byte[][] generateKeyPair() {
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        PolyVec polyVec3 = new PolyVec(this.engine);
        byte[] bArr = new byte[32];
        this.engine.getRandomBytes(bArr);
        byte[] bArr2 = new byte[64];
        this.symmetric.hash_g(bArr2, bArr);
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        System.arraycopy(bArr2, 32, bArr4, 0, 32);
        PolyVec[] polyVecArr = new PolyVec[this.kyberK];
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            polyVecArr[i3] = new PolyVec(this.engine);
        }
        generateMatrix(polyVecArr, bArr3, false);
        byte b2 = 0;
        for (int i10 = 0; i10 < this.kyberK; i10++) {
            polyVec.getVectorIndex(i10).getEta1Noise(bArr4, b2);
            b2 = (byte) (b2 + 1);
        }
        for (int i11 = 0; i11 < this.kyberK; i11++) {
            polyVec3.getVectorIndex(i11).getEta1Noise(bArr4, b2);
            b2 = (byte) (b2 + 1);
        }
        polyVec.polyVecNtt();
        polyVec3.polyVecNtt();
        for (int i12 = 0; i12 < this.kyberK; i12++) {
            PolyVec.pointwiseAccountMontgomery(polyVec2.getVectorIndex(i12), polyVecArr[i12], polyVec, this.engine);
            polyVec2.getVectorIndex(i12).convertToMont();
        }
        polyVec2.addPoly(polyVec3);
        polyVec2.reducePoly();
        return new byte[][]{packPublicKey(polyVec2, bArr3), packSecretKey(polyVec)};
    }

    public void generateMatrix(PolyVec[] polyVecArr, byte[] bArr, boolean z2) {
        byte b2;
        byte b10;
        byte[] bArr2 = new byte[(this.KyberGenerateMatrixNBlocks * this.symmetric.xofBlockBytes) + 2];
        for (int i3 = 0; i3 < this.kyberK; i3++) {
            for (int i10 = 0; i10 < this.kyberK; i10++) {
                Symmetric symmetric = this.symmetric;
                if (z2) {
                    b2 = (byte) i3;
                    b10 = (byte) i10;
                } else {
                    b2 = (byte) i10;
                    b10 = (byte) i3;
                }
                symmetric.xofAbsorb(bArr, b2, b10);
                Symmetric symmetric2 = this.symmetric;
                symmetric2.xofSqueezeBlocks(bArr2, 0, symmetric2.xofBlockBytes * this.KyberGenerateMatrixNBlocks);
                int i11 = this.KyberGenerateMatrixNBlocks * this.symmetric.xofBlockBytes;
                int rejectionSampling = rejectionSampling(polyVecArr[i3].getVectorIndex(i10), 0, 256, bArr2, i11);
                while (rejectionSampling < 256) {
                    int i12 = i11 % 3;
                    for (int i13 = 0; i13 < i12; i13++) {
                        bArr2[i13] = bArr2[(i11 - i12) + i13];
                    }
                    Symmetric symmetric3 = this.symmetric;
                    symmetric3.xofSqueezeBlocks(bArr2, i12, symmetric3.xofBlockBytes * 2);
                    i11 = this.symmetric.xofBlockBytes + i12;
                    rejectionSampling += rejectionSampling(polyVecArr[i3].getVectorIndex(i10), rejectionSampling, 256 - rejectionSampling, bArr2, i11);
                }
            }
        }
    }

    public byte[] packPublicKey(PolyVec polyVec, byte[] bArr) {
        byte[] bArr2 = new byte[this.indCpaPublicKeyBytes];
        System.arraycopy(polyVec.toBytes(), 0, bArr2, 0, this.polyVecBytes);
        System.arraycopy(bArr, 0, bArr2, this.polyVecBytes, 32);
        return bArr2;
    }

    public byte[] packSecretKey(PolyVec polyVec) {
        return polyVec.toBytes();
    }

    public byte[] unpackPublicKey(PolyVec polyVec, byte[] bArr) {
        byte[] bArr2 = new byte[32];
        polyVec.fromBytes(bArr);
        System.arraycopy(bArr, this.polyVecBytes, bArr2, 0, 32);
        return bArr2;
    }

    public void unpackSecretKey(PolyVec polyVec, byte[] bArr) {
        polyVec.fromBytes(bArr);
    }
}
