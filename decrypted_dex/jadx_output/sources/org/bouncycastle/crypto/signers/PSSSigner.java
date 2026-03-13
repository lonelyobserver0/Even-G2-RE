package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.security.SecureRandom;
import kotlin.UByte;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest1;
    private Digest contentDigest2;
    private int emBits;
    private int hLen;
    private byte[] mDash;
    private Digest mgfDigest;
    private int mgfhLen;
    private SecureRandom random;
    private int sLen;
    private boolean sSet;
    private byte[] salt;
    private byte trailer;

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i3) {
        this(asymmetricBlockCipher, digest, i3, TRAILER_IMPLICIT);
    }

    private void ItoOSP(int i3, byte[] bArr) {
        bArr[0] = (byte) (i3 >>> 24);
        bArr[1] = (byte) (i3 >>> 16);
        bArr[2] = (byte) (i3 >>> 8);
        bArr[3] = (byte) i3;
    }

    private void clearBlock(byte[] bArr) {
        for (int i3 = 0; i3 != bArr.length; i3++) {
            bArr[i3] = 0;
        }
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i3, byte b2) {
        return new PSSSigner(asymmetricBlockCipher, new NullDigest(), digest, digest2, i3, b2);
    }

    private byte[] maskGenerator(byte[] bArr, int i3, int i10, int i11) {
        Digest digest = this.mgfDigest;
        if (!(digest instanceof Xof)) {
            return maskGeneratorFunction1(bArr, i3, i10, i11);
        }
        byte[] bArr2 = new byte[i11];
        digest.update(bArr, i3, i10);
        ((Xof) this.mgfDigest).doFinal(bArr2, 0, i11);
        return bArr2;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i3, int i10, int i11) {
        int i12;
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[this.mgfhLen];
        byte[] bArr4 = new byte[4];
        this.mgfDigest.reset();
        int i13 = 0;
        while (true) {
            i12 = this.mgfhLen;
            if (i13 >= i11 / i12) {
                break;
            }
            ItoOSP(i13, bArr4);
            this.mgfDigest.update(bArr, i3, i10);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i14 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i13 * i14, i14);
            i13++;
        }
        if (i12 * i13 < i11) {
            ItoOSP(i13, bArr4);
            this.mgfDigest.update(bArr, i3, i10);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i15 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i13 * i15, i11 - (i13 * i15));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException, DataLengthException {
        int digestSize = this.contentDigest1.getDigestSize();
        int i3 = this.hLen;
        if (digestSize != i3) {
            throw new IllegalStateException();
        }
        Digest digest = this.contentDigest1;
        byte[] bArr = this.mDash;
        digest.doFinal(bArr, (bArr.length - i3) - this.sLen);
        if (this.sLen != 0) {
            if (!this.sSet) {
                this.random.nextBytes(this.salt);
            }
            byte[] bArr2 = this.salt;
            byte[] bArr3 = this.mDash;
            int length = bArr3.length;
            int i10 = this.sLen;
            System.arraycopy(bArr2, 0, bArr3, length - i10, i10);
        }
        int i11 = this.hLen;
        byte[] bArr4 = new byte[i11];
        Digest digest2 = this.contentDigest2;
        byte[] bArr5 = this.mDash;
        digest2.update(bArr5, 0, bArr5.length);
        this.contentDigest2.doFinal(bArr4, 0);
        byte[] bArr6 = this.block;
        int length2 = bArr6.length;
        int i12 = this.sLen;
        int i13 = this.hLen;
        bArr6[(((length2 - i12) - 1) - i13) - 1] = 1;
        System.arraycopy(this.salt, 0, bArr6, ((bArr6.length - i12) - i13) - 1, i12);
        byte[] maskGenerator = maskGenerator(bArr4, 0, i11, (this.block.length - this.hLen) - 1);
        for (int i14 = 0; i14 != maskGenerator.length; i14++) {
            byte[] bArr7 = this.block;
            bArr7[i14] = (byte) (bArr7[i14] ^ maskGenerator[i14]);
        }
        byte[] bArr8 = this.block;
        int length3 = bArr8.length;
        int i15 = this.hLen;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i15) - 1, i15);
        byte[] bArr9 = this.block;
        bArr9[0] = (byte) ((255 >>> ((bArr9.length * 8) - this.emBits)) & bArr9[0]);
        bArr9[bArr9.length - 1] = this.trailer;
        byte[] processBlock = this.cipher.processBlock(bArr9, 0, bArr9.length);
        clearBlock(this.block);
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        CipherParameters cipherParameters2;
        RSAKeyParameters rSAKeyParameters;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            cipherParameters2 = parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            if (z2) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            cipherParameters2 = cipherParameters;
        }
        if (cipherParameters2 instanceof RSABlindingParameters) {
            rSAKeyParameters = ((RSABlindingParameters) cipherParameters2).getPublicKey();
            this.cipher.init(z2, cipherParameters);
        } else {
            rSAKeyParameters = (RSAKeyParameters) cipherParameters2;
            this.cipher.init(z2, cipherParameters2);
        }
        int bitLength = rSAKeyParameters.getModulus().bitLength();
        int i3 = bitLength - 1;
        this.emBits = i3;
        if (i3 < AbstractC1482f.c(this.sLen, 8, this.hLen * 8, 9)) {
            throw new IllegalArgumentException(StubApp.getString2(29323));
        }
        this.block = new byte[(bitLength + 6) / 8];
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.contentDigest1.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.contentDigest1.update(b2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArr2;
        int length;
        byte b2;
        int digestSize = this.contentDigest1.getDigestSize();
        int i3 = this.hLen;
        if (digestSize != i3) {
            throw new IllegalStateException();
        }
        Digest digest = this.contentDigest1;
        byte[] bArr3 = this.mDash;
        digest.doFinal(bArr3, (bArr3.length - i3) - this.sLen);
        try {
            byte[] processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            byte[] bArr4 = this.block;
            Arrays.fill(bArr4, 0, bArr4.length - processBlock.length, (byte) 0);
            byte[] bArr5 = this.block;
            System.arraycopy(processBlock, 0, bArr5, bArr5.length - processBlock.length, processBlock.length);
            bArr2 = this.block;
            length = 255 >>> ((bArr2.length * 8) - this.emBits);
            b2 = bArr2[0];
        } catch (Exception unused) {
        }
        if ((b2 & UByte.MAX_VALUE) != (b2 & length) || bArr2[bArr2.length - 1] != this.trailer) {
            clearBlock(bArr2);
            return false;
        }
        int length2 = bArr2.length;
        int i10 = this.hLen;
        byte[] maskGenerator = maskGenerator(bArr2, (length2 - i10) - 1, i10, (bArr2.length - i10) - 1);
        for (int i11 = 0; i11 != maskGenerator.length; i11++) {
            byte[] bArr6 = this.block;
            bArr6[i11] = (byte) (bArr6[i11] ^ maskGenerator[i11]);
        }
        byte[] bArr7 = this.block;
        bArr7[0] = (byte) (length & bArr7[0]);
        int i12 = 0;
        while (true) {
            byte[] bArr8 = this.block;
            int length3 = bArr8.length;
            int i13 = this.hLen;
            int i14 = this.sLen;
            if (i12 != ((length3 - i13) - i14) - 2) {
                if (bArr8[i12] != 0) {
                    clearBlock(bArr8);
                    return false;
                }
                i12++;
            } else {
                if (bArr8[((bArr8.length - i13) - i14) - 2] != 1) {
                    clearBlock(bArr8);
                    return false;
                }
                if (this.sSet) {
                    byte[] bArr9 = this.salt;
                    byte[] bArr10 = this.mDash;
                    System.arraycopy(bArr9, 0, bArr10, bArr10.length - i14, i14);
                } else {
                    int length4 = ((bArr8.length - i14) - i13) - 1;
                    byte[] bArr11 = this.mDash;
                    System.arraycopy(bArr8, length4, bArr11, bArr11.length - i14, i14);
                }
                Digest digest2 = this.contentDigest2;
                byte[] bArr12 = this.mDash;
                digest2.update(bArr12, 0, bArr12.length);
                Digest digest3 = this.contentDigest2;
                byte[] bArr13 = this.mDash;
                digest3.doFinal(bArr13, bArr13.length - this.hLen);
                int length5 = this.block.length;
                int i15 = this.hLen;
                int i16 = (length5 - i15) - 1;
                int length6 = this.mDash.length - i15;
                while (true) {
                    byte[] bArr14 = this.mDash;
                    if (length6 == bArr14.length) {
                        clearBlock(bArr14);
                        clearBlock(this.block);
                        return true;
                    }
                    if ((this.block[i16] ^ bArr14[length6]) != 0) {
                        clearBlock(bArr14);
                        clearBlock(this.block);
                        return false;
                    }
                    i16++;
                    length6++;
                }
            }
        }
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i3, byte b2) {
        this(asymmetricBlockCipher, digest, digest, i3, b2);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b2) {
        return new PSSSigner(asymmetricBlockCipher, new NullDigest(), digest, digest2, bArr, b2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i3, int i10) {
        this.contentDigest1.update(bArr, i3, i10);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i3) {
        this(asymmetricBlockCipher, digest, digest2, i3, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i3, byte b2) {
        this(asymmetricBlockCipher, digest, digest, digest2, i3, b2);
    }

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, int i3, byte b2) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = false;
        this.sLen = i3;
        this.salt = new byte[i3];
        this.mDash = new byte[i3 + 8 + this.hLen];
        this.trailer = b2;
    }

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, byte[] bArr, byte b2) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = true;
        int length = bArr.length;
        this.sLen = length;
        this.salt = bArr;
        this.mDash = new byte[length + 8 + this.hLen];
        this.trailer = b2;
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b2) {
        this(asymmetricBlockCipher, digest, digest, digest2, bArr, b2);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, TRAILER_IMPLICIT);
    }
}
