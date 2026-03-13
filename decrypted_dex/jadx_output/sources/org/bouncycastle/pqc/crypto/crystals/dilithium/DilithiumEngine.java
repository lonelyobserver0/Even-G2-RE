package org.bouncycastle.pqc.crypto.crystals.dilithium;

import Xa.h;
import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DilithiumEngine {
    public static final int CrhBytes = 64;
    public static final int DilithiumD = 13;
    public static final int DilithiumN = 256;
    public static final int DilithiumPolyT0PackedBytes = 416;
    public static final int DilithiumPolyT1PackedBytes = 320;
    public static final int DilithiumQ = 8380417;
    public static final int DilithiumQinv = 58728449;
    public static final int DilithiumRootOfUnity = 1753;
    public static final int SeedBytes = 32;
    private final int CryptoBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int DilithiumBeta;
    private final int DilithiumEta;
    private final int DilithiumGamma1;
    private final int DilithiumGamma2;
    private final int DilithiumK;
    private final int DilithiumL;
    private final int DilithiumMode;
    private final int DilithiumOmega;
    private final int DilithiumPolyEtaPackedBytes;
    private final int DilithiumPolyVecHPackedBytes;
    private final int DilithiumPolyW1PackedBytes;
    private final int DilithiumPolyZPackedBytes;
    private final int DilithiumTau;
    private final int PolyUniformGamma1NBlocks;
    private final SecureRandom random;
    private final SHAKEDigest shake128Digest = new SHAKEDigest(128);
    private final SHAKEDigest shake256Digest = new SHAKEDigest(256);
    private final Symmetric symmetric;

    public DilithiumEngine(int i3, SecureRandom secureRandom, boolean z2) {
        int i10;
        int i11;
        this.DilithiumMode = i3;
        if (i3 == 2) {
            this.DilithiumK = 4;
            this.DilithiumL = 4;
            this.DilithiumEta = 2;
            this.DilithiumTau = 39;
            this.DilithiumBeta = 78;
            this.DilithiumGamma1 = PKIFailureInfo.unsupportedVersion;
            this.DilithiumGamma2 = 95232;
            this.DilithiumOmega = 80;
            this.DilithiumPolyZPackedBytes = 576;
            this.DilithiumPolyW1PackedBytes = 192;
            this.DilithiumPolyEtaPackedBytes = 96;
        } else if (i3 == 3) {
            this.DilithiumK = 6;
            this.DilithiumL = 5;
            this.DilithiumEta = 4;
            this.DilithiumTau = 49;
            this.DilithiumBeta = 196;
            this.DilithiumGamma1 = PKIFailureInfo.signerNotTrusted;
            this.DilithiumGamma2 = 261888;
            this.DilithiumOmega = 55;
            this.DilithiumPolyZPackedBytes = 640;
            this.DilithiumPolyW1PackedBytes = 128;
            this.DilithiumPolyEtaPackedBytes = 128;
        } else {
            if (i3 != 5) {
                throw new IllegalArgumentException(h.g(i3, StubApp.getString2(33969), StubApp.getString2(33970)));
            }
            this.DilithiumK = 8;
            this.DilithiumL = 7;
            this.DilithiumEta = 2;
            this.DilithiumTau = 60;
            this.DilithiumBeta = 120;
            this.DilithiumGamma1 = PKIFailureInfo.signerNotTrusted;
            this.DilithiumGamma2 = 261888;
            this.DilithiumOmega = 75;
            this.DilithiumPolyZPackedBytes = 640;
            this.DilithiumPolyW1PackedBytes = 128;
            this.DilithiumPolyEtaPackedBytes = 96;
        }
        this.symmetric = z2 ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
        this.random = secureRandom;
        int i12 = this.DilithiumOmega;
        int i13 = this.DilithiumK;
        int i14 = i12 + i13;
        this.DilithiumPolyVecHPackedBytes = i14;
        this.CryptoPublicKeyBytes = (i13 * DilithiumPolyT1PackedBytes) + 32;
        int i15 = this.DilithiumL;
        int i16 = this.DilithiumPolyEtaPackedBytes;
        this.CryptoSecretKeyBytes = (i13 * DilithiumPolyT0PackedBytes) + (i16 * i13) + (i15 * i16) + 96;
        this.CryptoBytes = AbstractC1482f.c(i15, this.DilithiumPolyZPackedBytes, 32, i14);
        int i17 = this.DilithiumGamma1;
        if (i17 == 131072) {
            i10 = this.symmetric.stream256BlockBytes;
            i11 = i10 + 575;
        } else {
            if (i17 != 524288) {
                throw new RuntimeException(StubApp.getString2(33971));
            }
            i10 = this.symmetric.stream256BlockBytes;
            i11 = i10 + 639;
        }
        this.PolyUniformGamma1NBlocks = i11 / i10;
    }

    public Symmetric GetSymmetric() {
        return this.symmetric;
    }

    public byte[][] generateKeyPair() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        this.random.nextBytes(bArr);
        this.shake256Digest.update(bArr, 0, 32);
        this.shake256Digest.doFinal(bArr2, 0, 128);
        System.arraycopy(bArr2, 0, bArr4, 0, 32);
        System.arraycopy(bArr2, 32, bArr5, 0, 64);
        System.arraycopy(bArr2, 96, bArr6, 0, 32);
        polyVecMatrix.expandMatrix(bArr4);
        polyVecL.uniformEta(bArr5, (short) 0);
        polyVecK.uniformEta(bArr5, (short) this.DilithiumL);
        PolyVecL polyVecL2 = new PolyVecL(this);
        polyVecL.copyPolyVecL(polyVecL2);
        polyVecL2.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL2);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.addPolyVecK(polyVecK);
        polyVecK2.conditionalAddQ();
        polyVecK2.power2Round(polyVecK3);
        byte[] packPublicKey = Packing.packPublicKey(polyVecK2, this);
        this.shake256Digest.update(bArr4, 0, 32);
        this.shake256Digest.update(packPublicKey, 0, packPublicKey.length);
        this.shake256Digest.doFinal(bArr3, 0, 32);
        byte[][] packSecretKey = Packing.packSecretKey(bArr4, bArr3, bArr6, polyVecK3, polyVecL, polyVecK, this);
        return new byte[][]{packSecretKey[0], packSecretKey[1], packSecretKey[2], packSecretKey[3], packSecretKey[4], packSecretKey[5], packPublicKey};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getDilithiumBeta() {
        return this.DilithiumBeta;
    }

    public int getDilithiumEta() {
        return this.DilithiumEta;
    }

    public int getDilithiumGamma1() {
        return this.DilithiumGamma1;
    }

    public int getDilithiumGamma2() {
        return this.DilithiumGamma2;
    }

    public int getDilithiumK() {
        return this.DilithiumK;
    }

    public int getDilithiumL() {
        return this.DilithiumL;
    }

    public int getDilithiumMode() {
        return this.DilithiumMode;
    }

    public int getDilithiumOmega() {
        return this.DilithiumOmega;
    }

    public int getDilithiumPolyEtaPackedBytes() {
        return this.DilithiumPolyEtaPackedBytes;
    }

    public int getDilithiumPolyVecHPackedBytes() {
        return this.DilithiumPolyVecHPackedBytes;
    }

    public int getDilithiumPolyW1PackedBytes() {
        return this.DilithiumPolyW1PackedBytes;
    }

    public int getDilithiumPolyZPackedBytes() {
        return this.DilithiumPolyZPackedBytes;
    }

    public int getDilithiumTau() {
        return this.DilithiumTau;
    }

    public int getPolyUniformGamma1NBlocks() {
        return this.PolyUniformGamma1NBlocks;
    }

    public SHAKEDigest getShake128Digest() {
        return this.shake128Digest;
    }

    public SHAKEDigest getShake256Digest() {
        return this.shake256Digest;
    }

    public byte[] sign(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        return signSignature(bArr, i3, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7);
    }

    public boolean signOpen(byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4) {
        return signVerify(bArr2, i3, bArr, bArr.length, bArr3, bArr4);
    }

    public byte[] signSignature(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        PolyVecK polyVecK;
        byte[] bArr8 = new byte[this.CryptoBytes + i3];
        byte[] bArr9 = new byte[64];
        byte[] bArr10 = new byte[64];
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecL polyVecL2 = new PolyVecL(this);
        PolyVecL polyVecL3 = new PolyVecL(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        PolyVecK polyVecK4 = new PolyVecK(this);
        PolyVecK polyVecK5 = new PolyVecK(this);
        PolyVecK polyVecK6 = new PolyVecK(this);
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecK polyVecK7 = polyVecK6;
        Poly poly2 = poly;
        Packing.unpackSecretKey(polyVecK2, polyVecL, polyVecK3, bArr5, bArr6, bArr7, this);
        this.shake256Digest.update(bArr4, 0, 32);
        this.shake256Digest.update(bArr, 0, i3);
        this.shake256Digest.doFinal(bArr9, 0, 64);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr10);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr3, 96);
            System.arraycopy(bArr9, 0, copyOf, 32, 64);
            this.shake256Digest.update(copyOf, 0, 96);
            this.shake256Digest.doFinal(bArr10, 0, 64);
        }
        PolyVecMatrix polyVecMatrix2 = polyVecMatrix;
        polyVecMatrix2.expandMatrix(bArr2);
        polyVecL.polyVecNtt();
        polyVecK3.polyVecNtt();
        polyVecK2.polyVecNtt();
        int i10 = 0;
        short s10 = 0;
        while (i10 < 1000) {
            int i11 = i10 + 1;
            short s11 = (short) (s10 + 1);
            polyVecL2.uniformGamma1(bArr10, s10);
            polyVecL2.copyPolyVecL(polyVecL3);
            polyVecL3.polyVecNtt();
            polyVecMatrix2.pointwiseMontgomery(polyVecK4, polyVecL3);
            polyVecK4.reduce();
            polyVecK4.invNttToMont();
            polyVecK4.conditionalAddQ();
            polyVecK4.decompose(polyVecK5);
            System.arraycopy(polyVecK4.packW1(), 0, bArr8, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
            this.shake256Digest.update(bArr9, 0, 64);
            PolyVecMatrix polyVecMatrix3 = polyVecMatrix2;
            this.shake256Digest.update(bArr8, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
            this.shake256Digest.doFinal(bArr8, 0, 32);
            Poly poly3 = poly2;
            poly3.challenge(Arrays.copyOfRange(bArr8, 0, 32));
            poly3.polyNtt();
            polyVecL3.pointwisePolyMontgomery(poly3, polyVecL);
            polyVecL3.invNttToMont();
            polyVecL3.addPolyVecL(polyVecL2);
            polyVecL3.reduce();
            if (polyVecL3.checkNorm(this.DilithiumGamma1 - this.DilithiumBeta)) {
                polyVecK = polyVecK7;
            } else {
                polyVecK = polyVecK7;
                polyVecK.pointwisePolyMontgomery(poly3, polyVecK3);
                polyVecK.invNttToMont();
                polyVecK5.subtract(polyVecK);
                polyVecK5.reduce();
                if (polyVecK5.checkNorm(this.DilithiumGamma2 - this.DilithiumBeta)) {
                    continue;
                } else {
                    polyVecK.pointwisePolyMontgomery(poly3, polyVecK2);
                    polyVecK.invNttToMont();
                    polyVecK.reduce();
                    if (polyVecK.checkNorm(this.DilithiumGamma2)) {
                        continue;
                    } else {
                        polyVecK5.addPolyVecK(polyVecK);
                        polyVecK5.conditionalAddQ();
                        if (polyVecK.makeHint(polyVecK5, polyVecK4) <= this.DilithiumOmega) {
                            return Packing.packSignature(bArr8, polyVecL3, polyVecK, this);
                        }
                    }
                }
            }
            polyVecK7 = polyVecK;
            poly2 = poly3;
            s10 = s11;
            polyVecMatrix2 = polyVecMatrix3;
            i10 = i11;
        }
        return null;
    }

    public boolean signVerify(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        if (i3 != this.CryptoBytes) {
            return false;
        }
        PolyVecK unpackPublicKey = Packing.unpackPublicKey(polyVecK, bArr4, this);
        if (!Packing.unpackSignature(polyVecL, polyVecK3, bArr, this)) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 32);
        if (polyVecL.checkNorm(getDilithiumGamma1() - getDilithiumBeta())) {
            return false;
        }
        this.shake256Digest.update(bArr3, 0, bArr3.length);
        this.shake256Digest.update(bArr4, 0, bArr4.length);
        this.shake256Digest.doFinal(bArr5, 0, 32);
        this.shake256Digest.update(bArr5, 0, 32);
        this.shake256Digest.update(bArr2, 0, i10);
        this.shake256Digest.doFinal(bArr5, 0);
        poly.challenge(copyOfRange);
        polyVecMatrix.expandMatrix(bArr3);
        polyVecL.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL);
        poly.polyNtt();
        unpackPublicKey.shiftLeft();
        unpackPublicKey.polyVecNtt();
        unpackPublicKey.pointwisePolyMontgomery(poly, unpackPublicKey);
        polyVecK2.subtract(unpackPublicKey);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.conditionalAddQ();
        polyVecK2.useHint(polyVecK2, polyVecK3);
        byte[] packW1 = polyVecK2.packW1();
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, 64);
        sHAKEDigest.update(packW1, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
        sHAKEDigest.doFinal(bArr6, 0, 32);
        for (int i11 = 0; i11 < 32; i11++) {
            if (copyOfRange[i11] != bArr6[i11]) {
                return false;
            }
        }
        return true;
    }
}
