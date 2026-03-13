package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class NTRUOWCPA {
    private final NTRUParameterSet params;
    private final NTRUSampling sampling;

    public NTRUOWCPA(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
        this.sampling = new NTRUSampling(nTRUParameterSet);
    }

    private int checkCiphertext(byte[] bArr) {
        return (((~((short) (bArr[this.params.ntruCiphertextBytes() - 1] & (255 << (8 - ((this.params.packDegree() * this.params.logQ()) & 7)))))) + 1) >>> 15) & 1;
    }

    private int checkM(HPSPolynomial hPSPolynomial) {
        short s10 = 0;
        short s11 = 0;
        for (int i3 = 0; i3 < this.params.n() - 1; i3++) {
            short s12 = hPSPolynomial.coeffs[i3];
            s10 = (short) (s10 + (s12 & 1));
            s11 = (short) (s11 + (s12 & 2));
        }
        return (((~(((s11 >>> 1) ^ s10) | (((NTRUHPSParameterSet) this.params).weight() ^ s11))) + 1) >>> 31) & 1;
    }

    private int checkR(Polynomial polynomial) {
        int i3 = 0;
        for (int i10 = 0; i10 < this.params.n() - 1; i10++) {
            short s10 = polynomial.coeffs[i10];
            i3 = i3 | ((s10 + 1) & (this.params.q() - 4)) | ((s10 + 2) & 4);
        }
        return (((~(polynomial.coeffs[this.params.n() - 1] | i3)) + 1) >>> 31) & 1;
    }

    public OWCPADecryptResult decrypt(byte[] bArr, byte[] bArr2) {
        int owcpaMsgBytes = this.params.owcpaMsgBytes();
        byte[] bArr3 = new byte[owcpaMsgBytes];
        Polynomial createPolynomial = this.params.createPolynomial();
        Polynomial createPolynomial2 = this.params.createPolynomial();
        Polynomial createPolynomial3 = this.params.createPolynomial();
        Polynomial createPolynomial4 = this.params.createPolynomial();
        createPolynomial.rqSumZeroFromBytes(bArr);
        createPolynomial2.s3FromBytes(bArr2);
        createPolynomial2.z3ToZq();
        createPolynomial3.rqMul(createPolynomial, createPolynomial2);
        createPolynomial2.rqToS3(createPolynomial3);
        createPolynomial3.s3FromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes(), bArr2.length));
        createPolynomial4.s3Mul(createPolynomial2, createPolynomial3);
        byte[] s3ToBytes = createPolynomial4.s3ToBytes(owcpaMsgBytes - this.params.packTrinaryBytes());
        int checkCiphertext = checkCiphertext(bArr);
        if (this.params instanceof NTRUHPSParameterSet) {
            checkCiphertext |= checkM((HPSPolynomial) createPolynomial4);
        }
        createPolynomial2.lift(createPolynomial4);
        for (int i3 = 0; i3 < this.params.n(); i3++) {
            short[] sArr = createPolynomial.coeffs;
            sArr[i3] = (short) (sArr[i3] - createPolynomial2.coeffs[i3]);
        }
        createPolynomial3.sqFromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes() * 2, bArr2.length));
        createPolynomial4.sqMul(createPolynomial, createPolynomial3);
        int checkR = checkCiphertext | checkR(createPolynomial4);
        createPolynomial4.trinaryZqToZ3();
        byte[] s3ToBytes2 = createPolynomial4.s3ToBytes(this.params.owcpaMsgBytes());
        System.arraycopy(s3ToBytes2, 0, bArr3, 0, s3ToBytes2.length);
        System.arraycopy(s3ToBytes, 0, bArr3, this.params.packTrinaryBytes(), s3ToBytes.length);
        return new OWCPADecryptResult(bArr3, checkR);
    }

    public byte[] encrypt(Polynomial polynomial, Polynomial polynomial2, byte[] bArr) {
        Polynomial createPolynomial = this.params.createPolynomial();
        Polynomial createPolynomial2 = this.params.createPolynomial();
        createPolynomial.rqSumZeroFromBytes(bArr);
        createPolynomial2.rqMul(polynomial, createPolynomial);
        createPolynomial.lift(polynomial2);
        for (int i3 = 0; i3 < this.params.n(); i3++) {
            short[] sArr = createPolynomial2.coeffs;
            sArr[i3] = (short) (sArr[i3] + createPolynomial.coeffs[i3]);
        }
        return createPolynomial2.rqSumZeroToBytes(this.params.ntruCiphertextBytes());
    }

    public OWCPAKeyPair keypair(byte[] bArr) {
        int owcpaSecretKeyBytes = this.params.owcpaSecretKeyBytes();
        byte[] bArr2 = new byte[owcpaSecretKeyBytes];
        int n10 = this.params.n();
        this.params.q();
        Polynomial createPolynomial = this.params.createPolynomial();
        Polynomial createPolynomial2 = this.params.createPolynomial();
        Polynomial createPolynomial3 = this.params.createPolynomial();
        PolynomialPair sampleFg = this.sampling.sampleFg(bArr);
        Polynomial f10 = sampleFg.f();
        Polynomial g10 = sampleFg.g();
        createPolynomial.s3Inv(f10);
        byte[] s3ToBytes = f10.s3ToBytes(this.params.owcpaMsgBytes());
        System.arraycopy(s3ToBytes, 0, bArr2, 0, s3ToBytes.length);
        byte[] s3ToBytes2 = createPolynomial.s3ToBytes(owcpaSecretKeyBytes - this.params.packTrinaryBytes());
        System.arraycopy(s3ToBytes2, 0, bArr2, this.params.packTrinaryBytes(), s3ToBytes2.length);
        f10.z3ToZq();
        g10.z3ToZq();
        if (this.params instanceof NTRUHRSSParameterSet) {
            for (int i3 = n10 - 1; i3 > 0; i3--) {
                short[] sArr = g10.coeffs;
                sArr[i3] = (short) ((sArr[i3 - 1] - sArr[i3]) * 3);
            }
            short[] sArr2 = g10.coeffs;
            sArr2[0] = (short) (-(sArr2[0] * 3));
        } else {
            for (int i10 = 0; i10 < n10; i10++) {
                short[] sArr3 = g10.coeffs;
                sArr3[i10] = (short) (sArr3[i10] * 3);
            }
        }
        createPolynomial.rqMul(g10, f10);
        createPolynomial2.rqInv(createPolynomial);
        createPolynomial3.rqMul(createPolynomial2, f10);
        createPolynomial.sqMul(createPolynomial3, f10);
        byte[] sqToBytes = createPolynomial.sqToBytes(owcpaSecretKeyBytes - (this.params.packTrinaryBytes() * 2));
        System.arraycopy(sqToBytes, 0, bArr2, this.params.packTrinaryBytes() * 2, sqToBytes.length);
        createPolynomial3.rqMul(createPolynomial2, g10);
        createPolynomial.rqMul(createPolynomial3, g10);
        return new OWCPAKeyPair(createPolynomial.rqSumZeroToBytes(this.params.owcpaPublicKeyBytes()), bArr2);
    }
}
