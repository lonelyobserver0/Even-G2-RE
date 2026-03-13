package org.bouncycastle.pqc.math.ntru;

import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HRSSPolynomial extends Polynomial {
    public HRSSPolynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        int length = this.coeffs.length;
        HRSSPolynomial hRSSPolynomial = new HRSSPolynomial((NTRUHRSSParameterSet) this.params);
        short s10 = (short) (3 - (length % 3));
        short[] sArr = hRSSPolynomial.coeffs;
        short[] sArr2 = polynomial.coeffs;
        int i3 = 0;
        int i10 = 2 - s10;
        int i11 = sArr2[0] * i10;
        short s11 = sArr2[1];
        short s12 = sArr2[2];
        sArr[0] = (short) ((s12 * s10) + i11);
        sArr[1] = (short) (s11 * i10);
        sArr[2] = (short) (s12 * i10);
        short s13 = 0;
        for (int i12 = 3; i12 < length; i12++) {
            short[] sArr3 = hRSSPolynomial.coeffs;
            short s14 = sArr3[0];
            short[] sArr4 = polynomial.coeffs;
            sArr3[0] = (short) ((((s10 * 2) + s13) * sArr4[i12]) + s14);
            int i13 = s13 + s10;
            sArr3[1] = (short) ((sArr4[i12] * i13) + sArr3[1]);
            sArr3[2] = (short) ((sArr4[i12] * s13) + sArr3[2]);
            s13 = (short) (i13 % 3);
        }
        short[] sArr5 = hRSSPolynomial.coeffs;
        short s15 = sArr5[1];
        short[] sArr6 = polynomial.coeffs;
        short s16 = sArr6[0];
        int i14 = s10 + s13;
        sArr5[1] = (short) ((s16 * i14) + s15);
        short s17 = (short) ((s16 * s13) + sArr5[2]);
        sArr5[2] = s17;
        sArr5[2] = (short) ((sArr6[1] * i14) + s17);
        for (int i15 = 3; i15 < length; i15++) {
            short[] sArr7 = hRSSPolynomial.coeffs;
            short s18 = sArr7[i15 - 3];
            short[] sArr8 = polynomial.coeffs;
            sArr7[i15] = (short) (((sArr8[i15] + sArr8[i15 - 1] + sArr8[i15 - 2]) * 2) + s18);
        }
        hRSSPolynomial.mod3PhiN();
        hRSSPolynomial.z3ToZq();
        this.coeffs[0] = (short) (-hRSSPolynomial.coeffs[0]);
        while (i3 < length - 1) {
            short[] sArr9 = this.coeffs;
            int i16 = i3 + 1;
            short[] sArr10 = hRSSPolynomial.coeffs;
            sArr9[i16] = (short) (sArr10[i3] - sArr10[i16]);
            i3 = i16;
        }
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void r2Inv(Polynomial polynomial) {
        r2Inv(polynomial, new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params));
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void rqInv(Polynomial polynomial) {
        rqInv(polynomial, new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params));
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void s3Inv(Polynomial polynomial) {
        s3Inv(polynomial, new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params), new HRSSPolynomial((NTRUHRSSParameterSet) this.params));
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i3 = 0;
        while (i3 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i10 = i3 * 8;
            int i11 = i3 * 13;
            int i12 = bArr[i11] & UByte.MAX_VALUE;
            byte b2 = bArr[i11 + 1];
            sArr[i10] = (short) (i12 | ((((short) (b2 & UByte.MAX_VALUE)) & 31) << 8));
            int i13 = ((b2 & UByte.MAX_VALUE) >>> 5) | (((short) (bArr[i11 + 2] & UByte.MAX_VALUE)) << 3);
            byte b10 = bArr[i11 + 3];
            sArr[i10 + 1] = (short) (i13 | ((((short) (b10 & UByte.MAX_VALUE)) & 3) << 11));
            int i14 = (b10 & UByte.MAX_VALUE) >>> 2;
            byte b11 = bArr[i11 + 4];
            sArr[i10 + 2] = (short) (i14 | ((((short) (b11 & UByte.MAX_VALUE)) & 127) << 6));
            int i15 = ((b11 & UByte.MAX_VALUE) >>> 7) | (((short) (bArr[i11 + 5] & UByte.MAX_VALUE)) << 1);
            byte b12 = bArr[i11 + 6];
            sArr[i10 + 3] = (short) (i15 | ((((short) (b12 & UByte.MAX_VALUE)) & 15) << 9));
            int i16 = (((short) (bArr[i11 + 7] & UByte.MAX_VALUE)) << 4) | ((b12 & UByte.MAX_VALUE) >>> 4);
            byte b13 = bArr[i11 + 8];
            sArr[i10 + 4] = (short) (i16 | ((((short) (b13 & UByte.MAX_VALUE)) & 1) << 12));
            int i17 = (b13 & UByte.MAX_VALUE) >>> 1;
            byte b14 = bArr[i11 + 9];
            sArr[i10 + 5] = (short) (i17 | ((((short) (b14 & UByte.MAX_VALUE)) & 63) << 7));
            int i18 = (((short) (bArr[i11 + 10] & UByte.MAX_VALUE)) << 2) | ((b14 & UByte.MAX_VALUE) >>> 6);
            byte b15 = bArr[i11 + 11];
            sArr[i10 + 6] = (short) (i18 | ((((short) (b15 & UByte.MAX_VALUE)) & 7) << 10));
            sArr[i10 + 7] = (short) (((b15 & UByte.MAX_VALUE) >>> 3) | (((short) (bArr[i11 + 12] & UByte.MAX_VALUE)) << 5));
            i3++;
        }
        int packDegree = this.params.packDegree() & 7;
        if (packDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i19 = i3 * 8;
            int i20 = i3 * 13;
            int i21 = bArr[i20] & UByte.MAX_VALUE;
            byte b16 = bArr[i20 + 1];
            sArr2[i19] = (short) (i21 | ((((short) (b16 & UByte.MAX_VALUE)) & 31) << 8));
            sArr2[i19 + 1] = (short) (((((short) (bArr[i20 + 3] & UByte.MAX_VALUE)) & 3) << 11) | ((b16 & UByte.MAX_VALUE) >>> 5) | (((short) (bArr[i20 + 2] & UByte.MAX_VALUE)) << 3));
        } else if (packDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i22 = i3 * 8;
            int i23 = i3 * 13;
            int i24 = bArr[i23] & UByte.MAX_VALUE;
            byte b17 = bArr[i23 + 1];
            sArr3[i22] = (short) (i24 | ((((short) (b17 & UByte.MAX_VALUE)) & 31) << 8));
            int i25 = ((b17 & UByte.MAX_VALUE) >>> 5) | (((short) (bArr[i23 + 2] & UByte.MAX_VALUE)) << 3);
            byte b18 = bArr[i23 + 3];
            sArr3[i22 + 1] = (short) (i25 | ((((short) (b18 & UByte.MAX_VALUE)) & 3) << 11));
            int i26 = (b18 & UByte.MAX_VALUE) >>> 2;
            byte b19 = bArr[i23 + 4];
            sArr3[i22 + 2] = (short) (i26 | ((((short) (b19 & UByte.MAX_VALUE)) & 127) << 6));
            sArr3[i22 + 3] = (short) (((((short) (bArr[i23 + 6] & UByte.MAX_VALUE)) & 15) << 9) | ((b19 & UByte.MAX_VALUE) >>> 7) | (((short) (bArr[i23 + 5] & UByte.MAX_VALUE)) << 1));
        }
        this.coeffs[this.params.n() - 1] = 0;
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
            int i12 = i10 * 13;
            short s10 = sArr[0];
            bArr[i12] = (byte) (s10 & 255);
            short s11 = sArr[1];
            bArr[i12 + 1] = (byte) ((s10 >>> 8) | ((s11 & 7) << 5));
            bArr[i12 + 2] = (byte) ((s11 >>> 3) & 255);
            int i13 = s11 >>> 11;
            short s12 = sArr[2];
            bArr[i12 + 3] = (byte) (i13 | ((s12 & 63) << 2));
            short s13 = sArr[3];
            bArr[i12 + 4] = (byte) ((s12 >>> 6) | ((s13 & 1) << 7));
            bArr[i12 + 5] = (byte) ((s13 >>> 1) & 255);
            int i14 = s13 >>> 9;
            short s14 = sArr[4];
            bArr[i12 + 6] = (byte) (i14 | ((s14 & 15) << 4));
            bArr[i12 + 7] = (byte) ((s14 >>> 4) & 255);
            short s15 = sArr[5];
            bArr[i12 + 8] = (byte) ((s14 >>> 12) | ((s15 & 127) << 1));
            int i15 = s15 >>> 7;
            short s16 = sArr[6];
            bArr[i12 + 9] = (byte) (i15 | ((s16 & 3) << 6));
            bArr[i12 + 10] = (byte) ((s16 >>> 2) & 255);
            short s17 = sArr[7];
            bArr[i12 + 11] = (byte) ((s16 >>> 10) | ((s17 & 31) << 3));
            bArr[i12 + 12] = (byte) (s17 >>> 5);
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
        int packDegree = this.params.packDegree() - ((this.params.packDegree() / 8) * 8);
        if (packDegree != 2) {
            if (packDegree != 4) {
                return bArr;
            }
            int i18 = i10 * 13;
            short s18 = sArr[0];
            bArr[i18] = (byte) (s18 & 255);
            short s19 = sArr[1];
            bArr[i18 + 1] = (byte) ((s18 >>> 8) | ((s19 & 7) << 5));
            bArr[i18 + 2] = (byte) ((s19 >>> 3) & 255);
            int i19 = s19 >>> 11;
            short s20 = sArr[2];
            bArr[i18 + 3] = (byte) (i19 | ((s20 & 63) << 2));
            int i20 = s20 >>> 6;
            short s21 = sArr[3];
            bArr[i18 + 4] = (byte) (i20 | ((s21 & 1) << 7));
            bArr[i18 + 5] = (byte) ((s21 >>> 1) & 255);
            bArr[i18 + 6] = (byte) ((s21 >>> 9) | ((sArr[4] & 15) << 4));
        }
        int i21 = i10 * 13;
        short s22 = sArr[0];
        bArr[i21] = (byte) (s22 & 255);
        int i22 = s22 >>> 8;
        short s23 = sArr[1];
        bArr[i21 + 1] = (byte) (i22 | ((s23 & 7) << 5));
        bArr[i21 + 2] = (byte) ((s23 >>> 3) & 255);
        bArr[i21 + 3] = (byte) ((s23 >>> 11) | ((sArr[2] & 63) << 2));
        return bArr;
    }
}
