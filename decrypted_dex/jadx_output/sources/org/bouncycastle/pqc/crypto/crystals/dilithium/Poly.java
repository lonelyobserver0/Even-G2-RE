package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Poly {
    private final DilithiumEngine engine;
    private final int polyUniformNBlocks;
    private final Symmetric symmetric;
    private final int dilithiumN = 256;
    private int[] coeffs = new int[256];

    public Poly(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        Symmetric GetSymmetric = dilithiumEngine.GetSymmetric();
        this.symmetric = GetSymmetric;
        int i3 = GetSymmetric.stream128BlockBytes;
        this.polyUniformNBlocks = (i3 + 767) / i3;
    }

    private static int rejectEta(Poly poly, int i3, int i10, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10 && i14 < i11) {
            byte b2 = bArr[i14];
            int i15 = b2 & 15;
            i14++;
            int i16 = (b2 & UByte.MAX_VALUE) >> 4;
            if (i12 == 2) {
                if (i15 < 15) {
                    poly.setCoeffIndex(i3 + i13, 2 - (i15 - (((i15 * 205) >> 10) * 5)));
                    i13++;
                }
                if (i16 < 15 && i13 < i10) {
                    poly.setCoeffIndex(i3 + i13, 2 - (i16 - (((i16 * 205) >> 10) * 5)));
                    i13++;
                }
            } else if (i12 == 4) {
                if (i15 < 9) {
                    poly.setCoeffIndex(i3 + i13, 4 - i15);
                    i13++;
                }
                if (i16 < 9 && i13 < i10) {
                    poly.setCoeffIndex(i3 + i13, 4 - i16);
                    i13++;
                }
            }
        }
        return i13;
    }

    private static int rejectUniform(Poly poly, int i3, int i10, byte[] bArr, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10 && i13 + 3 <= i11) {
            int i14 = i13 + 2;
            int i15 = ((bArr[i13 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i13] & UByte.MAX_VALUE);
            i13 += 3;
            int i16 = (i15 | ((bArr[i14] & UByte.MAX_VALUE) << 16)) & 8388607;
            if (i16 < 8380417) {
                poly.setCoeffIndex(i3 + i12, i16);
                i12++;
            }
        }
        return i12;
    }

    private void unpackZ(byte[] bArr) {
        int i3 = 0;
        if (this.engine.getDilithiumGamma1() != 131072) {
            if (this.engine.getDilithiumGamma1() != 524288) {
                throw new RuntimeException(StubApp.getString2(33978));
            }
            while (i3 < this.dilithiumN / 2) {
                int i10 = i3 * 2;
                int i11 = i3 * 5;
                int i12 = i11 + 2;
                setCoeffIndex(i10, ((bArr[i11] & UByte.MAX_VALUE) | ((bArr[i11 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i12] & UByte.MAX_VALUE) << 16)) & 1048575);
                int i13 = i10 + 1;
                setCoeffIndex(i13, (((bArr[i11 + 4] & UByte.MAX_VALUE) << 12) | ((bArr[i12] & UByte.MAX_VALUE) >> 4) | ((bArr[i11 + 3] & UByte.MAX_VALUE) << 4)) & 1048575);
                setCoeffIndex(i10, this.engine.getDilithiumGamma1() - getCoeffIndex(i10));
                setCoeffIndex(i13, this.engine.getDilithiumGamma1() - getCoeffIndex(i13));
                i3++;
            }
            return;
        }
        while (i3 < this.dilithiumN / 4) {
            int i14 = i3 * 4;
            int i15 = i3 * 9;
            int i16 = i15 + 2;
            setCoeffIndex(i14, ((bArr[i15] & UByte.MAX_VALUE) | ((bArr[i15 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i16] & UByte.MAX_VALUE) << 16)) & 262143);
            int i17 = i14 + 1;
            int i18 = i15 + 4;
            setCoeffIndex(i17, (((bArr[i16] & UByte.MAX_VALUE) >> 2) | ((bArr[i15 + 3] & UByte.MAX_VALUE) << 6) | ((bArr[i18] & UByte.MAX_VALUE) << 14)) & 262143);
            int i19 = i14 + 2;
            int i20 = i15 + 6;
            setCoeffIndex(i19, (((bArr[i18] & UByte.MAX_VALUE) >> 4) | ((bArr[i15 + 5] & UByte.MAX_VALUE) << 4) | ((bArr[i20] & UByte.MAX_VALUE) << 12)) & 262143);
            int i21 = i14 + 3;
            setCoeffIndex(i21, (((bArr[i15 + 8] & UByte.MAX_VALUE) << 10) | ((bArr[i20] & UByte.MAX_VALUE) >> 6) | ((bArr[i15 + 7] & UByte.MAX_VALUE) << 2)) & 262143);
            setCoeffIndex(i14, this.engine.getDilithiumGamma1() - getCoeffIndex(i14));
            setCoeffIndex(i17, this.engine.getDilithiumGamma1() - getCoeffIndex(i17));
            setCoeffIndex(i19, this.engine.getDilithiumGamma1() - getCoeffIndex(i19));
            setCoeffIndex(i21, this.engine.getDilithiumGamma1() - getCoeffIndex(i21));
            i3++;
        }
    }

    public void addPoly(Poly poly) {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            setCoeffIndex(i3, getCoeffIndex(i3) + poly.getCoeffIndex(i3));
        }
    }

    public void challenge(byte[] bArr) {
        int i3;
        int i10;
        int i11;
        int i12;
        byte[] bArr2 = new byte[this.symmetric.stream256BlockBytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doOutput(bArr2, 0, this.symmetric.stream256BlockBytes);
        long j = 0;
        int i13 = 0;
        while (true) {
            i3 = 8;
            if (i13 >= 8) {
                break;
            }
            j |= (bArr2[i13] & UByte.MAX_VALUE) << (i13 * 8);
            i13++;
        }
        int i14 = 0;
        while (true) {
            i10 = this.dilithiumN;
            if (i14 >= i10) {
                break;
            }
            setCoeffIndex(i14, 0);
            i14++;
        }
        int dilithiumTau = i10 - this.engine.getDilithiumTau();
        while (dilithiumTau < this.dilithiumN) {
            while (true) {
                int i15 = this.symmetric.stream256BlockBytes;
                if (i3 >= i15) {
                    sHAKEDigest.doOutput(bArr2, 0, i15);
                    i3 = 0;
                }
                i11 = i3 + 1;
                i12 = bArr2[i3] & UByte.MAX_VALUE;
                if (i12 <= dilithiumTau) {
                    break;
                } else {
                    i3 = i11;
                }
            }
            setCoeffIndex(dilithiumTau, getCoeffIndex(i12));
            setCoeffIndex(i12, (int) (1 - ((j & 1) * 2)));
            j >>= 1;
            dilithiumTau++;
            i3 = i11;
        }
    }

    public boolean checkNorm(int i3) {
        if (i3 > 1047552) {
            return true;
        }
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            if (getCoeffIndex(i10) - ((getCoeffIndex(i10) >> 31) & (getCoeffIndex(i10) * 2)) >= i3) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            setCoeffIndex(i3, Reduce.conditionalAddQ(getCoeffIndex(i3)));
        }
    }

    public void decompose(Poly poly) {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            int[] decompose = Rounding.decompose(getCoeffIndex(i3), this.engine.getDilithiumGamma2());
            setCoeffIndex(i3, decompose[1]);
            poly.setCoeffIndex(i3, decompose[0]);
        }
    }

    public int getCoeffIndex(int i3) {
        return this.coeffs[i3];
    }

    public int[] getCoeffs() {
        return this.coeffs;
    }

    public void invNttToMont() {
        setCoeffs(Ntt.invNttToMont(getCoeffs()));
    }

    public void pointwiseAccountMontgomery(PolyVecL polyVecL, PolyVecL polyVecL2) {
        Poly poly = new Poly(this.engine);
        pointwiseMontgomery(polyVecL.getVectorIndex(0), polyVecL2.getVectorIndex(0));
        for (int i3 = 1; i3 < this.engine.getDilithiumL(); i3++) {
            poly.pointwiseMontgomery(polyVecL.getVectorIndex(i3), polyVecL2.getVectorIndex(i3));
            addPoly(poly);
        }
    }

    public void pointwiseMontgomery(Poly poly, Poly poly2) {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            setCoeffIndex(i3, Reduce.montgomeryReduce(poly.getCoeffIndex(i3) * poly2.getCoeffIndex(i3)));
        }
    }

    public byte[] polyEtaPack(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[8];
        if (this.engine.getDilithiumEta() == 2) {
            for (int i10 = 0; i10 < this.dilithiumN / 8; i10++) {
                int i11 = i10 * 8;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i11));
                bArr2[1] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i11 + 1));
                bArr2[2] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i11 + 2));
                bArr2[3] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i11 + 3));
                bArr2[4] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i11 + 4));
                bArr2[5] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i11 + 5));
                bArr2[6] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i11 + 6));
                bArr2[7] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i11 + 7));
                int i12 = (i10 * 3) + i3;
                bArr[i12] = (byte) (bArr2[0] | (bArr2[1] << 3) | (bArr2[2] << 6));
                bArr[i12 + 1] = (byte) ((bArr2[3] << 1) | (bArr2[2] >> 2) | (bArr2[4] << 4) | (bArr2[5] << 7));
                bArr[i12 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
            }
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                throw new RuntimeException(StubApp.getString2(33979));
            }
            for (int i13 = 0; i13 < this.dilithiumN / 2; i13++) {
                int i14 = i13 * 2;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i14));
                byte dilithiumEta = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i14 + 1));
                bArr2[1] = dilithiumEta;
                bArr[i3 + i13] = (byte) ((dilithiumEta << 4) | bArr2[0]);
            }
        }
        return bArr;
    }

    public void polyEtaUnpack(byte[] bArr, int i3) {
        int dilithiumEta = this.engine.getDilithiumEta();
        int i10 = 0;
        if (this.engine.getDilithiumEta() != 2) {
            if (this.engine.getDilithiumEta() == 4) {
                while (i10 < this.dilithiumN / 2) {
                    int i11 = i10 * 2;
                    int i12 = i3 + i10;
                    setCoeffIndex(i11, bArr[i12] & 15);
                    int i13 = i11 + 1;
                    setCoeffIndex(i13, (bArr[i12] & UByte.MAX_VALUE) >> 4);
                    setCoeffIndex(i11, dilithiumEta - getCoeffIndex(i11));
                    setCoeffIndex(i13, dilithiumEta - getCoeffIndex(i13));
                    i10++;
                }
                return;
            }
            return;
        }
        while (i10 < this.dilithiumN / 8) {
            int i14 = (i10 * 3) + i3;
            int i15 = i10 * 8;
            setCoeffIndex(i15, bArr[i14] & 7);
            int i16 = i15 + 1;
            setCoeffIndex(i16, ((bArr[i14] & UByte.MAX_VALUE) >> 3) & 7);
            int i17 = i15 + 2;
            int i18 = i14 + 1;
            setCoeffIndex(i17, ((bArr[i14] & UByte.MAX_VALUE) >> 6) | (((bArr[i18] & UByte.MAX_VALUE) << 2) & 7));
            int i19 = i15 + 3;
            setCoeffIndex(i19, ((bArr[i18] & UByte.MAX_VALUE) >> 1) & 7);
            int i20 = i15 + 4;
            setCoeffIndex(i20, ((bArr[i18] & UByte.MAX_VALUE) >> 4) & 7);
            int i21 = i15 + 5;
            int i22 = i14 + 2;
            setCoeffIndex(i21, ((bArr[i18] & UByte.MAX_VALUE) >> 7) | (((bArr[i22] & UByte.MAX_VALUE) << 1) & 7));
            int i23 = i15 + 6;
            setCoeffIndex(i23, ((bArr[i22] & UByte.MAX_VALUE) >> 2) & 7);
            int i24 = i15 + 7;
            setCoeffIndex(i24, ((bArr[i22] & UByte.MAX_VALUE) >> 5) & 7);
            setCoeffIndex(i15, dilithiumEta - getCoeffIndex(i15));
            setCoeffIndex(i16, dilithiumEta - getCoeffIndex(i16));
            setCoeffIndex(i17, dilithiumEta - getCoeffIndex(i17));
            setCoeffIndex(i19, dilithiumEta - getCoeffIndex(i19));
            setCoeffIndex(i20, dilithiumEta - getCoeffIndex(i20));
            setCoeffIndex(i21, dilithiumEta - getCoeffIndex(i21));
            setCoeffIndex(i23, dilithiumEta - getCoeffIndex(i23));
            setCoeffIndex(i24, dilithiumEta - getCoeffIndex(i24));
            i10++;
        }
    }

    public int polyMakeHint(Poly poly, Poly poly2) {
        int i3 = 0;
        for (int i10 = 0; i10 < this.dilithiumN; i10++) {
            setCoeffIndex(i10, Rounding.makeHint(poly.getCoeffIndex(i10), poly2.getCoeffIndex(i10), this.engine));
            i3 += getCoeffIndex(i10);
        }
        return i3;
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(this.coeffs));
    }

    public void polyUseHint(Poly poly, Poly poly2) {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            setCoeffIndex(i3, Rounding.useHint(poly.getCoeffIndex(i3), poly2.getCoeffIndex(i3), this.engine.getDilithiumGamma2()));
        }
    }

    public byte[] polyt0Pack(byte[] bArr, int i3) {
        for (int i10 = 0; i10 < this.dilithiumN / 8; i10++) {
            int i11 = i10 * 8;
            int[] iArr = {4096 - getCoeffIndex(i11), 4096 - getCoeffIndex(i11 + 1), 4096 - getCoeffIndex(i11 + 2), 4096 - getCoeffIndex(i11 + 3), 4096 - getCoeffIndex(i11 + 4), 4096 - getCoeffIndex(i11 + 5), 4096 - getCoeffIndex(i11 + 6), 4096 - getCoeffIndex(i11 + 7)};
            int i12 = (i10 * 13) + i3;
            int i13 = iArr[0];
            bArr[i12] = (byte) i13;
            int i14 = i12 + 1;
            byte b2 = (byte) (i13 >> 8);
            bArr[i14] = b2;
            int i15 = iArr[1];
            bArr[i14] = (byte) (b2 | ((byte) (i15 << 5)));
            bArr[i12 + 2] = (byte) (i15 >> 3);
            int i16 = i12 + 3;
            byte b10 = (byte) (i15 >> 11);
            bArr[i16] = b10;
            int i17 = iArr[2];
            bArr[i16] = (byte) (b10 | ((byte) (i17 << 2)));
            int i18 = i12 + 4;
            byte b11 = (byte) (i17 >> 6);
            bArr[i18] = b11;
            int i19 = iArr[3];
            bArr[i18] = (byte) (b11 | ((byte) (i19 << 7)));
            bArr[i12 + 5] = (byte) (i19 >> 1);
            int i20 = i12 + 6;
            byte b12 = (byte) (i19 >> 9);
            bArr[i20] = b12;
            int i21 = iArr[4];
            bArr[i20] = (byte) (b12 | ((byte) (i21 << 4)));
            bArr[i12 + 7] = (byte) (i21 >> 4);
            int i22 = i12 + 8;
            byte b13 = (byte) (i21 >> 12);
            bArr[i22] = b13;
            int i23 = iArr[5];
            bArr[i22] = (byte) (b13 | ((byte) (i23 << 1)));
            int i24 = i12 + 9;
            byte b14 = (byte) (i23 >> 7);
            bArr[i24] = b14;
            int i25 = iArr[6];
            bArr[i24] = (byte) (b14 | ((byte) (i25 << 6)));
            bArr[i12 + 10] = (byte) (i25 >> 2);
            int i26 = i12 + 11;
            byte b15 = (byte) (i25 >> 10);
            bArr[i26] = b15;
            int i27 = iArr[7];
            bArr[i26] = (byte) (((byte) (i27 << 3)) | b15);
            bArr[i12 + 12] = (byte) (i27 >> 5);
        }
        return bArr;
    }

    public void polyt0Unpack(byte[] bArr, int i3) {
        for (int i10 = 0; i10 < this.dilithiumN / 8; i10++) {
            int i11 = (i10 * 13) + i3;
            int i12 = i10 * 8;
            int i13 = i11 + 1;
            setCoeffIndex(i12, ((bArr[i11] & UByte.MAX_VALUE) | ((bArr[i13] & UByte.MAX_VALUE) << 8)) & 8191);
            int i14 = i12 + 1;
            int i15 = i11 + 3;
            setCoeffIndex(i14, (((bArr[i13] & UByte.MAX_VALUE) >> 5) | ((bArr[i11 + 2] & UByte.MAX_VALUE) << 3) | ((bArr[i15] & UByte.MAX_VALUE) << 11)) & 8191);
            int i16 = i12 + 2;
            int i17 = i11 + 4;
            setCoeffIndex(i16, (((bArr[i15] & UByte.MAX_VALUE) >> 2) | ((bArr[i17] & UByte.MAX_VALUE) << 6)) & 8191);
            int i18 = i12 + 3;
            int i19 = i11 + 6;
            setCoeffIndex(i18, (((bArr[i17] & UByte.MAX_VALUE) >> 7) | ((bArr[i11 + 5] & UByte.MAX_VALUE) << 1) | ((bArr[i19] & UByte.MAX_VALUE) << 9)) & 8191);
            int i20 = i12 + 4;
            int i21 = i11 + 8;
            setCoeffIndex(i20, (((bArr[i19] & UByte.MAX_VALUE) >> 4) | ((bArr[i11 + 7] & UByte.MAX_VALUE) << 4) | ((bArr[i21] & UByte.MAX_VALUE) << 12)) & 8191);
            int i22 = i12 + 5;
            int i23 = i11 + 9;
            setCoeffIndex(i22, (((bArr[i21] & UByte.MAX_VALUE) >> 1) | ((bArr[i23] & UByte.MAX_VALUE) << 7)) & 8191);
            int i24 = i12 + 6;
            int i25 = i11 + 11;
            setCoeffIndex(i24, (((bArr[i23] & UByte.MAX_VALUE) >> 6) | ((bArr[i11 + 10] & UByte.MAX_VALUE) << 2) | ((bArr[i25] & UByte.MAX_VALUE) << 10)) & 8191);
            int i26 = i12 + 7;
            setCoeffIndex(i26, (((bArr[i11 + 12] & UByte.MAX_VALUE) << 5) | ((bArr[i25] & UByte.MAX_VALUE) >> 3)) & 8191);
            setCoeffIndex(i12, 4096 - getCoeffIndex(i12));
            setCoeffIndex(i14, 4096 - getCoeffIndex(i14));
            setCoeffIndex(i16, 4096 - getCoeffIndex(i16));
            setCoeffIndex(i18, 4096 - getCoeffIndex(i18));
            setCoeffIndex(i20, 4096 - getCoeffIndex(i20));
            setCoeffIndex(i22, 4096 - getCoeffIndex(i22));
            setCoeffIndex(i24, 4096 - getCoeffIndex(i24));
            setCoeffIndex(i26, 4096 - getCoeffIndex(i26));
        }
    }

    public byte[] polyt1Pack() {
        byte[] bArr = new byte[DilithiumEngine.DilithiumPolyT1PackedBytes];
        for (int i3 = 0; i3 < this.dilithiumN / 4; i3++) {
            int i10 = i3 * 5;
            int[] iArr = this.coeffs;
            int i11 = i3 * 4;
            int i12 = iArr[i11];
            bArr[i10] = (byte) i12;
            int i13 = iArr[i11 + 1];
            bArr[i10 + 1] = (byte) ((i12 >> 8) | (i13 << 2));
            int i14 = i13 >> 6;
            int i15 = iArr[i11 + 2];
            bArr[i10 + 2] = (byte) (i14 | (i15 << 4));
            int i16 = iArr[i11 + 3];
            bArr[i10 + 3] = (byte) ((i16 << 6) | (i15 >> 4));
            bArr[i10 + 4] = (byte) (i16 >> 2);
        }
        return bArr;
    }

    public void polyt1Unpack(byte[] bArr) {
        for (int i3 = 0; i3 < this.dilithiumN / 4; i3++) {
            int i10 = i3 * 4;
            int i11 = i3 * 5;
            int i12 = i11 + 1;
            setCoeffIndex(i10, ((bArr[i11] & UByte.MAX_VALUE) | ((bArr[i12] & UByte.MAX_VALUE) << 8)) & 1023);
            int i13 = i11 + 2;
            setCoeffIndex(i10 + 1, (((bArr[i12] & UByte.MAX_VALUE) >> 2) | ((bArr[i13] & UByte.MAX_VALUE) << 6)) & 1023);
            int i14 = (bArr[i13] & UByte.MAX_VALUE) >> 4;
            int i15 = i11 + 3;
            setCoeffIndex(i10 + 2, (i14 | ((bArr[i15] & UByte.MAX_VALUE) << 4)) & 1023);
            setCoeffIndex(i10 + 3, (((bArr[i11 + 4] & UByte.MAX_VALUE) << 2) | ((bArr[i15] & UByte.MAX_VALUE) >> 6)) & 1023);
        }
    }

    public void power2Round(Poly poly) {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            int[] power2Round = Rounding.power2Round(getCoeffIndex(i3));
            setCoeffIndex(i3, power2Round[0]);
            poly.setCoeffIndex(i3, power2Round[1]);
        }
    }

    public void reduce() {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            setCoeffIndex(i3, Reduce.reduce32(getCoeffIndex(i3)));
        }
    }

    public void setCoeffIndex(int i3, int i10) {
        this.coeffs[i3] = i10;
    }

    public void setCoeffs(int[] iArr) {
        this.coeffs = iArr;
    }

    public void shiftLeft() {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            setCoeffIndex(i3, getCoeffIndex(i3) << 13);
        }
    }

    public void subtract(Poly poly) {
        for (int i3 = 0; i3 < this.dilithiumN; i3++) {
            setCoeffIndex(i3, getCoeffIndex(i3) - poly.getCoeffIndex(i3));
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(1557));
        int i3 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i3 >= iArr.length) {
                stringBuffer.append(StubApp.getString2(511));
                return stringBuffer.toString();
            }
            stringBuffer.append(iArr[i3]);
            if (i3 != this.coeffs.length - 1) {
                stringBuffer.append(StubApp.getString2(81));
            }
            i3++;
        }
    }

    public void uniformBlocks(byte[] bArr, short s10) {
        int i3 = this.polyUniformNBlocks;
        Symmetric symmetric = this.symmetric;
        int i10 = i3 * symmetric.stream128BlockBytes;
        byte[] bArr2 = new byte[i10 + 2];
        symmetric.stream128init(bArr, s10);
        this.symmetric.stream128squeezeBlocks(bArr2, 0, i10);
        int rejectUniform = rejectUniform(this, 0, this.dilithiumN, bArr2, i10);
        while (rejectUniform < this.dilithiumN) {
            int i11 = i10 % 3;
            for (int i12 = 0; i12 < i11; i12++) {
                bArr2[i12] = bArr2[(i10 - i11) + i12];
            }
            Symmetric symmetric2 = this.symmetric;
            symmetric2.stream128squeezeBlocks(bArr2, i11, symmetric2.stream128BlockBytes);
            i10 = this.symmetric.stream128BlockBytes + i11;
            rejectUniform += rejectUniform(this, rejectUniform, this.dilithiumN - rejectUniform, bArr2, i10);
        }
    }

    public void uniformEta(byte[] bArr, short s10) {
        int i3;
        int i10;
        int dilithiumEta = this.engine.getDilithiumEta();
        if (this.engine.getDilithiumEta() == 2) {
            i3 = this.symmetric.stream256BlockBytes;
            i10 = i3 + 135;
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                throw new RuntimeException(StubApp.getString2(33980));
            }
            i3 = this.symmetric.stream256BlockBytes;
            i10 = i3 + 226;
        }
        int i11 = i10 / i3;
        Symmetric symmetric = this.symmetric;
        int i12 = i11 * symmetric.stream256BlockBytes;
        byte[] bArr2 = new byte[i12];
        symmetric.stream256init(bArr, s10);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, i12);
        Poly poly = this;
        int rejectEta = rejectEta(poly, 0, this.dilithiumN, bArr2, i12, dilithiumEta);
        while (rejectEta < 256) {
            Symmetric symmetric2 = poly.symmetric;
            symmetric2.stream256squeezeBlocks(bArr2, 0, symmetric2.stream256BlockBytes);
            rejectEta += rejectEta(poly, rejectEta, poly.dilithiumN - rejectEta, bArr2, poly.symmetric.stream256BlockBytes, dilithiumEta);
            poly = this;
        }
    }

    public void uniformGamma1(byte[] bArr, short s10) {
        int polyUniformGamma1NBlocks = this.engine.getPolyUniformGamma1NBlocks();
        Symmetric symmetric = this.symmetric;
        byte[] bArr2 = new byte[polyUniformGamma1NBlocks * symmetric.stream256BlockBytes];
        symmetric.stream256init(bArr, s10);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, this.engine.getPolyUniformGamma1NBlocks() * this.symmetric.stream256BlockBytes);
        unpackZ(bArr2);
    }

    public byte[] w1Pack() {
        byte[] bArr = new byte[this.engine.getDilithiumPolyW1PackedBytes()];
        int i3 = 0;
        if (this.engine.getDilithiumGamma2() == 95232) {
            while (i3 < this.dilithiumN / 4) {
                int i10 = i3 * 3;
                int i11 = i3 * 4;
                int i12 = i11 + 1;
                bArr[i10] = (byte) (((byte) getCoeffIndex(i11)) | (getCoeffIndex(i12) << 6));
                int i13 = i11 + 2;
                bArr[i10 + 1] = (byte) (((byte) (getCoeffIndex(i12) >> 2)) | (getCoeffIndex(i13) << 4));
                bArr[i10 + 2] = (byte) ((getCoeffIndex(i11 + 3) << 2) | ((byte) (getCoeffIndex(i13) >> 4)));
                i3++;
            }
        } else if (this.engine.getDilithiumGamma2() == 261888) {
            while (i3 < this.dilithiumN / 2) {
                int i14 = i3 * 2;
                bArr[i3] = (byte) ((getCoeffIndex(i14 + 1) << 4) | getCoeffIndex(i14));
                i3++;
            }
        }
        return bArr;
    }

    public byte[] zPack() {
        byte[] bArr = new byte[this.engine.getDilithiumPolyZPackedBytes()];
        int[] iArr = new int[4];
        if (this.engine.getDilithiumGamma1() == 131072) {
            for (int i3 = 0; i3 < this.dilithiumN / 4; i3++) {
                int i10 = i3 * 4;
                iArr[0] = this.engine.getDilithiumGamma1() - getCoeffIndex(i10);
                iArr[1] = this.engine.getDilithiumGamma1() - getCoeffIndex(i10 + 1);
                iArr[2] = this.engine.getDilithiumGamma1() - getCoeffIndex(i10 + 2);
                int dilithiumGamma1 = this.engine.getDilithiumGamma1() - getCoeffIndex(i10 + 3);
                iArr[3] = dilithiumGamma1;
                int i11 = i3 * 9;
                int i12 = iArr[0];
                bArr[i11] = (byte) i12;
                bArr[i11 + 1] = (byte) (i12 >> 8);
                int i13 = iArr[1];
                bArr[i11 + 2] = (byte) (((byte) (i12 >> 16)) | (i13 << 2));
                bArr[i11 + 3] = (byte) (i13 >> 6);
                byte b2 = (byte) (i13 >> 14);
                int i14 = iArr[2];
                bArr[i11 + 4] = (byte) (b2 | (i14 << 4));
                bArr[i11 + 5] = (byte) (i14 >> 4);
                bArr[i11 + 6] = (byte) (((byte) (i14 >> 12)) | (dilithiumGamma1 << 6));
                bArr[i11 + 7] = (byte) (dilithiumGamma1 >> 2);
                bArr[i11 + 8] = (byte) (dilithiumGamma1 >> 10);
            }
        } else {
            if (this.engine.getDilithiumGamma1() != 524288) {
                throw new RuntimeException(StubApp.getString2(33971));
            }
            for (int i15 = 0; i15 < this.dilithiumN / 2; i15++) {
                int i16 = i15 * 2;
                iArr[0] = this.engine.getDilithiumGamma1() - getCoeffIndex(i16);
                int dilithiumGamma12 = this.engine.getDilithiumGamma1() - getCoeffIndex(i16 + 1);
                iArr[1] = dilithiumGamma12;
                int i17 = i15 * 5;
                int i18 = iArr[0];
                bArr[i17] = (byte) i18;
                bArr[i17 + 1] = (byte) (i18 >> 8);
                bArr[i17 + 2] = (byte) (((byte) (i18 >> 16)) | (dilithiumGamma12 << 4));
                bArr[i17 + 3] = (byte) (dilithiumGamma12 >> 4);
                bArr[i17 + 4] = (byte) (dilithiumGamma12 >> 12);
            }
        }
        return bArr;
    }

    public void zUnpack(byte[] bArr) {
        int i3 = 0;
        if (this.engine.getDilithiumGamma1() != 131072) {
            if (this.engine.getDilithiumGamma1() != 524288) {
                throw new RuntimeException(StubApp.getString2(33971));
            }
            while (i3 < this.dilithiumN / 2) {
                int i10 = i3 * 2;
                int i11 = i3 * 5;
                int i12 = i11 + 2;
                setCoeffIndex(i10, ((bArr[i11] & UByte.MAX_VALUE) | ((bArr[i11 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i12] & UByte.MAX_VALUE) << 16)) & 1048575);
                int i13 = i10 + 1;
                setCoeffIndex(i13, (((bArr[i11 + 4] & UByte.MAX_VALUE) << 12) | ((bArr[i12] & UByte.MAX_VALUE) >>> 4) | ((bArr[i11 + 3] & UByte.MAX_VALUE) << 4)) & 1048575);
                setCoeffIndex(i10, this.engine.getDilithiumGamma1() - getCoeffIndex(i10));
                setCoeffIndex(i13, this.engine.getDilithiumGamma1() - getCoeffIndex(i13));
                i3++;
            }
            return;
        }
        while (i3 < this.dilithiumN / 4) {
            int i14 = i3 * 4;
            int i15 = i3 * 9;
            int i16 = i15 + 2;
            setCoeffIndex(i14, ((bArr[i15] & UByte.MAX_VALUE) | ((bArr[i15 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i16] & UByte.MAX_VALUE) << 16)) & 262143);
            int i17 = i14 + 1;
            int i18 = i15 + 4;
            setCoeffIndex(i17, (((bArr[i16] & UByte.MAX_VALUE) >>> 2) | ((bArr[i15 + 3] & UByte.MAX_VALUE) << 6) | ((bArr[i18] & UByte.MAX_VALUE) << 14)) & 262143);
            int i19 = i14 + 2;
            int i20 = i15 + 6;
            setCoeffIndex(i19, (((bArr[i18] & UByte.MAX_VALUE) >>> 4) | ((bArr[i15 + 5] & UByte.MAX_VALUE) << 4) | ((bArr[i20] & UByte.MAX_VALUE) << 12)) & 262143);
            int i21 = i14 + 3;
            setCoeffIndex(i21, (((bArr[i15 + 8] & UByte.MAX_VALUE) << 10) | ((bArr[i20] & UByte.MAX_VALUE) >>> 6) | ((bArr[i15 + 7] & UByte.MAX_VALUE) << 2)) & 262143);
            setCoeffIndex(i14, this.engine.getDilithiumGamma1() - getCoeffIndex(i14));
            setCoeffIndex(i17, this.engine.getDilithiumGamma1() - getCoeffIndex(i17));
            setCoeffIndex(i19, this.engine.getDilithiumGamma1() - getCoeffIndex(i19));
            setCoeffIndex(i21, this.engine.getDilithiumGamma1() - getCoeffIndex(i21));
            i3++;
        }
    }
}
