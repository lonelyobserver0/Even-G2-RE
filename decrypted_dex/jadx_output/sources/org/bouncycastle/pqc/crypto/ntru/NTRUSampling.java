package org.bouncycastle.pqc.crypto.ntru;

import com.stub.StubApp;
import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.HRSSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class NTRUSampling {
    private final NTRUParameterSet params;

    public NTRUSampling(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
    }

    private static int mod3(int i3) {
        return i3 % 3;
    }

    public PolynomialPair sampleFg(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair(sampleIidPlus(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleIidPlus(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException(StubApp.getString2(34053));
    }

    public HPSPolynomial sampleFixedType(byte[] bArr) {
        int i3;
        int i10;
        int n10 = this.params.n();
        int weight = ((NTRUHPSParameterSet) this.params).weight();
        HPSPolynomial hPSPolynomial = new HPSPolynomial((NTRUHPSParameterSet) this.params);
        int i11 = n10 - 1;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (true) {
            i3 = i11 / 4;
            if (i12 >= i3) {
                break;
            }
            int i13 = i12 * 4;
            int i14 = i12 * 15;
            iArr[i13] = ((bArr[i14] & UByte.MAX_VALUE) << 2) + ((bArr[i14 + 1] & UByte.MAX_VALUE) << 10) + ((bArr[i14 + 2] & UByte.MAX_VALUE) << 18) + ((bArr[i14 + 3] & UByte.MAX_VALUE) << 26);
            iArr[i13 + 1] = ((bArr[(i12 * 3) + 15] & 192) >> 4) + ((bArr[i14 + 4] & UByte.MAX_VALUE) << 4) + ((bArr[i14 + 5] & UByte.MAX_VALUE) << 12) + ((bArr[i14 + 6] & UByte.MAX_VALUE) << 20) + ((bArr[i14 + 7] & UByte.MAX_VALUE) << 28);
            int i15 = ((bArr[(i12 * 7) + 15] & 240) >> 2) + ((bArr[i14 + 8] & UByte.MAX_VALUE) << 6) + ((bArr[i14 + 9] & UByte.MAX_VALUE) << 14) + ((bArr[i14 + 10] & UByte.MAX_VALUE) << 22);
            byte b2 = bArr[i14 + 11];
            iArr[i13 + 2] = i15 + ((b2 & UByte.MAX_VALUE) << 30);
            iArr[i13 + 3] = (b2 & 252) + ((bArr[i14 + 12] & UByte.MAX_VALUE) << 8) + ((bArr[i14 + 13] & UByte.MAX_VALUE) << 16) + ((bArr[i14 + 14] & UByte.MAX_VALUE) << 24);
            i12++;
        }
        int i16 = i3 * 4;
        if (i11 > i16) {
            int i17 = i3 * 15;
            iArr[i16] = ((bArr[i17] & UByte.MAX_VALUE) << 2) + ((bArr[i17 + 1] & UByte.MAX_VALUE) << 10) + ((bArr[i17 + 2] & UByte.MAX_VALUE) << 18) + ((bArr[i17 + 3] & UByte.MAX_VALUE) << 26);
            iArr[i16 + 1] = ((bArr[(i3 * 3) + 15] & 192) >> 4) + ((bArr[i17 + 4] & UByte.MAX_VALUE) << 4) + ((bArr[i17 + 5] & UByte.MAX_VALUE) << 12) + ((bArr[i17 + 6] & UByte.MAX_VALUE) << 20) + ((bArr[i17 + 7] & UByte.MAX_VALUE) << 28);
        }
        int i18 = 0;
        while (true) {
            i10 = weight / 2;
            if (i18 >= i10) {
                break;
            }
            iArr[i18] = iArr[i18] | 1;
            i18++;
        }
        while (i10 < weight) {
            iArr[i10] = iArr[i10] | 2;
            i10++;
        }
        java.util.Arrays.sort(iArr);
        for (int i19 = 0; i19 < i11; i19++) {
            hPSPolynomial.coeffs[i19] = (short) (iArr[i19] & 3);
        }
        hPSPolynomial.coeffs[i11] = 0;
        return hPSPolynomial;
    }

    public Polynomial sampleIid(byte[] bArr) {
        Polynomial createPolynomial = this.params.createPolynomial();
        for (int i3 = 0; i3 < this.params.n() - 1; i3++) {
            createPolynomial.coeffs[i3] = (short) mod3(bArr[i3] & UByte.MAX_VALUE);
        }
        createPolynomial.coeffs[this.params.n() - 1] = 0;
        return createPolynomial;
    }

    public HRSSPolynomial sampleIidPlus(byte[] bArr) {
        int i3;
        int n10 = this.params.n();
        HRSSPolynomial hRSSPolynomial = (HRSSPolynomial) sampleIid(bArr);
        int i10 = 0;
        while (true) {
            i3 = n10 - 1;
            if (i10 >= i3) {
                break;
            }
            short[] sArr = hRSSPolynomial.coeffs;
            short s10 = sArr[i10];
            sArr[i10] = (short) (s10 | (-(s10 >>> 1)));
            i10++;
        }
        int i11 = 0;
        short s11 = 0;
        while (i11 < i3) {
            short[] sArr2 = hRSSPolynomial.coeffs;
            int i12 = i11 + 1;
            s11 = (short) (s11 + ((short) (sArr2[i12] * sArr2[i11])));
            i11 = i12;
        }
        short s12 = (short) ((-((s11 & UShort.MAX_VALUE) >>> 15)) | 1);
        for (int i13 = 0; i13 < i3; i13 += 2) {
            short[] sArr3 = hRSSPolynomial.coeffs;
            sArr3[i13] = (short) (sArr3[i13] * s12);
        }
        for (int i14 = 0; i14 < i3; i14++) {
            short[] sArr4 = hRSSPolynomial.coeffs;
            short s13 = sArr4[i14];
            sArr4[i14] = (short) ((((s13 & UShort.MAX_VALUE) >>> 15) ^ (s13 & UShort.MAX_VALUE)) & 3);
        }
        return hRSSPolynomial;
    }

    public PolynomialPair sampleRm(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair((HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), (HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException(StubApp.getString2(34053));
    }
}
