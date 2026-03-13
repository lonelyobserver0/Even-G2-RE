package org.bouncycastle.pqc.math.ntru;

import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HPS4096Polynomial extends HPSPolynomial {
    public HPS4096Polynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        for (int i3 = 0; i3 < this.params.packDegree() / 2; i3++) {
            short[] sArr = this.coeffs;
            int i10 = i3 * 2;
            int i11 = i3 * 3;
            int i12 = bArr[i11] & UByte.MAX_VALUE;
            byte b2 = bArr[i11 + 1];
            sArr[i10] = (short) (i12 | ((((short) (b2 & UByte.MAX_VALUE)) & 15) << 8));
            sArr[i10 + 1] = (short) (((((short) (bArr[i11 + 2] & UByte.MAX_VALUE)) & 255) << 4) | ((b2 & UByte.MAX_VALUE) >>> 4));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i3) {
        byte[] bArr = new byte[i3];
        int q10 = this.params.q();
        for (int i10 = 0; i10 < this.params.packDegree() / 2; i10++) {
            int i11 = i10 * 3;
            int i12 = i10 * 2;
            bArr[i11] = (byte) (Polynomial.modQ(this.coeffs[i12] & UShort.MAX_VALUE, q10) & 255);
            int modQ = Polynomial.modQ(this.coeffs[i12] & UShort.MAX_VALUE, q10) >>> 8;
            int i13 = i12 + 1;
            bArr[i11 + 1] = (byte) (modQ | ((Polynomial.modQ(this.coeffs[i13] & UShort.MAX_VALUE, q10) & 15) << 4));
            bArr[i11 + 2] = (byte) (Polynomial.modQ(this.coeffs[i13] & UShort.MAX_VALUE, q10) >>> 4);
        }
        return bArr;
    }
}
