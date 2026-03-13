package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X931Signer implements Signer {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA224 = 14540;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private RSAKeyParameters kParam;
    private int keyBits;
    private int trailer;

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }

    private void clearBlock(byte[] bArr) {
        for (int i3 = 0; i3 != bArr.length; i3++) {
            bArr[i3] = 0;
        }
    }

    private void createSignatureBlock(int i3) {
        int i10;
        int digestSize = this.digest.getDigestSize();
        if (i3 == 188) {
            byte[] bArr = this.block;
            i10 = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, i10);
            this.block[r5.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            byte[] bArr2 = this.block;
            int length = (bArr2.length - digestSize) - 2;
            this.digest.doFinal(bArr2, length);
            byte[] bArr3 = this.block;
            bArr3[bArr3.length - 2] = (byte) (i3 >>> 8);
            bArr3[bArr3.length - 1] = (byte) i3;
            i10 = length;
        }
        this.block[0] = 107;
        for (int i11 = i10 - 2; i11 != 0; i11--) {
            this.block[i11] = -69;
        }
        this.block[i10 - 1] = -70;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        createSignatureBlock(this.trailer);
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr = this.block;
        BigInteger bigInteger = new BigInteger(1, asymmetricBlockCipher.processBlock(bArr, 0, bArr.length));
        clearBlock(this.block);
        return BigIntegers.asUnsignedByteArray(BigIntegers.getUnsignedByteLength(this.kParam.getModulus()), bigInteger.min(this.kParam.getModulus().subtract(bigInteger)));
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.kParam = rSAKeyParameters;
        this.cipher.init(z2, rSAKeyParameters);
        int bitLength = this.kParam.getModulus().bitLength();
        this.keyBits = bitLength;
        this.block = new byte[(bitLength + 7) / 8];
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.digest.update(b2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if ((r4.intValue() & 15) == 12) goto L9;
     */
    @Override // org.bouncycastle.crypto.Signer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verifySignature(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            org.bouncycastle.crypto.AsymmetricBlockCipher r1 = r3.cipher     // Catch: java.lang.Exception -> L5e
            int r2 = r4.length     // Catch: java.lang.Exception -> L5e
            byte[] r4 = r1.processBlock(r4, r0, r2)     // Catch: java.lang.Exception -> L5e
            r3.block = r4     // Catch: java.lang.Exception -> L5e
            java.math.BigInteger r4 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = r3.block
            r4.<init>(r1, r2)
            int r1 = r4.intValue()
            r1 = r1 & 15
            r2 = 12
            if (r1 != r2) goto L1d
            goto L2f
        L1d:
            org.bouncycastle.crypto.params.RSAKeyParameters r1 = r3.kParam
            java.math.BigInteger r1 = r1.getModulus()
            java.math.BigInteger r4 = r1.subtract(r4)
            int r1 = r4.intValue()
            r1 = r1 & 15
            if (r1 != r2) goto L5e
        L2f:
            int r0 = r3.trailer
            r3.createSignatureBlock(r0)
            byte[] r0 = r3.block
            int r0 = r0.length
            byte[] r4 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(r0, r4)
            byte[] r0 = r3.block
            boolean r0 = org.bouncycastle.util.Arrays.constantTimeAreEqual(r0, r4)
            int r1 = r3.trailer
            r2 = 15052(0x3acc, float:2.1092E-41)
            if (r1 != r2) goto L56
            if (r0 != 0) goto L56
            byte[] r0 = r3.block
            int r1 = r0.length
            int r1 = r1 + (-2)
            r2 = 64
            r0[r1] = r2
            boolean r0 = org.bouncycastle.util.Arrays.constantTimeAreEqual(r0, r4)
        L56:
            byte[] r1 = r3.block
            r3.clearBlock(r1)
            r3.clearBlock(r4)
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.X931Signer.verifySignature(byte[]):boolean");
    }

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z2) {
        int intValue;
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        if (z2) {
            intValue = 188;
        } else {
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException(StubApp.getString2(29316) + digest.getAlgorithmName());
            }
            intValue = trailer.intValue();
        }
        this.trailer = intValue;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.digest.update(bArr, i3, i10);
    }
}
