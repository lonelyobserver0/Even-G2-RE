package org.bouncycastle.pqc.math.ntru;

import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HPSPolynomial extends Polynomial {
    public HPSPolynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        short[] sArr = this.coeffs;
        System.arraycopy(polynomial.coeffs, 0, sArr, 0, sArr.length);
        z3ToZq();
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void r2Inv(Polynomial polynomial) {
        r2Inv(polynomial, new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params));
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void rqInv(Polynomial polynomial) {
        rqInv(polynomial, new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params));
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void s3Inv(Polynomial polynomial) {
        s3Inv(polynomial, new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params), new HPSPolynomial((NTRUHPSParameterSet) this.params));
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        int i3 = 0;
        while (i3 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i10 = i3 * 8;
            int i11 = i3 * 11;
            int i12 = bArr[i11] & UByte.MAX_VALUE;
            byte b2 = bArr[i11 + 1];
            sArr[i10] = (short) (i12 | ((((short) (b2 & UByte.MAX_VALUE)) & 7) << 8));
            int i13 = (b2 & UByte.MAX_VALUE) >>> 3;
            byte b10 = bArr[i11 + 2];
            sArr[i10 + 1] = (short) (i13 | ((((short) (b10 & UByte.MAX_VALUE)) & 63) << 5));
            int i14 = ((b10 & UByte.MAX_VALUE) >>> 6) | ((((short) (bArr[i11 + 3] & UByte.MAX_VALUE)) & 255) << 2);
            byte b11 = bArr[i11 + 4];
            sArr[i10 + 2] = (short) (i14 | ((((short) (b11 & UByte.MAX_VALUE)) & 1) << 10));
            int i15 = (b11 & UByte.MAX_VALUE) >>> 1;
            byte b12 = bArr[i11 + 5];
            sArr[i10 + 3] = (short) (i15 | ((((short) (b12 & UByte.MAX_VALUE)) & 15) << 7));
            int i16 = (b12 & UByte.MAX_VALUE) >>> 4;
            byte b13 = bArr[i11 + 6];
            sArr[i10 + 4] = (short) (((((short) (b13 & UByte.MAX_VALUE)) & 127) << 4) | i16);
            int i17 = ((b13 & UByte.MAX_VALUE) >>> 7) | ((((short) (bArr[i11 + 7] & UByte.MAX_VALUE)) & 255) << 1);
            byte b14 = bArr[i11 + 8];
            sArr[i10 + 5] = (short) (i17 | ((((short) (b14 & UByte.MAX_VALUE)) & 3) << 9));
            int i18 = (b14 & UByte.MAX_VALUE) >>> 2;
            byte b15 = bArr[i11 + 9];
            sArr[i10 + 6] = (short) (i18 | ((((short) (b15 & UByte.MAX_VALUE)) & 31) << 6));
            sArr[i10 + 7] = (short) (((b15 & UByte.MAX_VALUE) >>> 5) | ((((short) (bArr[i11 + 10] & UByte.MAX_VALUE)) & 255) << 3));
            i3++;
        }
        int packDegree = this.params.packDegree() & 7;
        if (packDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i19 = i3 * 8;
            int i20 = i3 * 11;
            int i21 = bArr[i20] & UByte.MAX_VALUE;
            byte b16 = bArr[i20 + 1];
            sArr2[i19] = (short) (i21 | ((((short) (b16 & UByte.MAX_VALUE)) & 7) << 8));
            sArr2[i19 + 1] = (short) (((((short) (bArr[i20 + 2] & UByte.MAX_VALUE)) & 63) << 5) | ((b16 & UByte.MAX_VALUE) >>> 3));
        } else if (packDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i22 = i3 * 8;
            int i23 = i3 * 11;
            int i24 = bArr[i23] & UByte.MAX_VALUE;
            byte b17 = bArr[i23 + 1];
            sArr3[i22] = (short) (i24 | ((((short) (b17 & UByte.MAX_VALUE)) & 7) << 8));
            int i25 = (b17 & UByte.MAX_VALUE) >>> 3;
            byte b18 = bArr[i23 + 2];
            sArr3[i22 + 1] = (short) (i25 | ((((short) (b18 & UByte.MAX_VALUE)) & 63) << 5));
            int i26 = ((((short) (bArr[i23 + 3] & UByte.MAX_VALUE)) & 255) << 2) | ((b18 & UByte.MAX_VALUE) >>> 6);
            byte b19 = bArr[i23 + 4];
            sArr3[i22 + 2] = (short) (i26 | ((((short) (b19 & UByte.MAX_VALUE)) & 1) << 10));
            sArr3[i22 + 3] = (short) (((((short) (bArr[i23 + 5] & UByte.MAX_VALUE)) & 15) << 7) | ((b19 & UByte.MAX_VALUE) >>> 1));
        }
        this.coeffs[length - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i3) {
        byte[] bArr = new byte[i3];
        short[] sArr = new short[8];
        int i10 = 0;
        while (i10 < this.params.packDegree() / 8) {
            for (int i11 = 0; i11 < 8; i11++) {
                sArr[i11] = (short) Polynomial.modQ(this.coeffs[(i10 * 8) + i11] & UShort.MAX_VALUE, this.params.q());
            }
            int i12 = i10 * 11;
            short s10 = sArr[0];
            bArr[i12] = (byte) (s10 & 255);
            short s11 = sArr[1];
            bArr[i12 + 1] = (byte) ((s10 >>> 8) | ((s11 & 31) << 3));
            int i13 = s11 >>> 5;
            short s12 = sArr[2];
            bArr[i12 + 2] = (byte) (i13 | ((s12 & 3) << 6));
            bArr[i12 + 3] = (byte) ((s12 >>> 2) & 255);
            int i14 = s12 >>> 10;
            short s13 = sArr[3];
            bArr[i12 + 4] = (byte) (i14 | ((s13 & 127) << 1));
            short s14 = sArr[4];
            bArr[i12 + 5] = (byte) ((s13 >>> 7) | ((s14 & 15) << 4));
            short s15 = sArr[5];
            bArr[i12 + 6] = (byte) ((s14 >>> 4) | ((s15 & 1) << 7));
            bArr[i12 + 7] = (byte) ((s15 >>> 1) & 255);
            int i15 = s15 >>> 9;
            short s16 = sArr[6];
            bArr[i12 + 8] = (byte) (i15 | ((s16 & 63) << 2));
            short s17 = sArr[7];
            bArr[i12 + 9] = (byte) ((s16 >>> 6) | ((s17 & 7) << 5));
            bArr[i12 + 10] = (byte) (s17 >>> 3);
            i10++;
        }
        int i16 = 0;
        while (true) {
            int i17 = i10 * 8;
            if (i16 >= this.params.packDegree() - i17) {
                break;
            }
            sArr[i16] = (short) Polynomial.modQ(this.coeffs[i17 + i16] & UShort.MAX_VALUE, this.params.q());
            i16++;
        }
        while (i16 < 8) {
            sArr[i16] = 0;
            i16++;
        }
        int packDegree = this.params.packDegree() & 7;
        if (packDegree == 2) {
            int i18 = i10 * 11;
            short s18 = sArr[0];
            bArr[i18] = (byte) (s18 & 255);
            int i19 = s18 >>> 8;
            short s19 = sArr[1];
            bArr[i18 + 1] = (byte) (i19 | ((s19 & 31) << 3));
            bArr[i18 + 2] = (byte) ((s19 >>> 5) | ((sArr[2] & 3) << 6));
            return bArr;
        }
        if (packDegree != 4) {
            return bArr;
        }
        int i20 = i10 * 11;
        short s20 = sArr[0];
        bArr[i20] = (byte) (s20 & 255);
        int i21 = s20 >>> 8;
        short s21 = sArr[1];
        bArr[i20 + 1] = (byte) (i21 | ((s21 & 31) << 3));
        short s22 = sArr[2];
        bArr[i20 + 2] = (byte) ((s21 >>> 5) | ((s22 & 3) << 6));
        bArr[i20 + 3] = (byte) ((s22 >>> 2) & 255);
        int i22 = s22 >>> 10;
        short s23 = sArr[3];
        bArr[i20 + 4] = (byte) (i22 | ((s23 & 127) << 1));
        bArr[i20 + 5] = (byte) ((s23 >>> 7) | ((sArr[4] & 15) << 4));
        return bArr;
    }
}
