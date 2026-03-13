package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import i2.u;
import kotlin.UByte;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }

    private void clearBlock(byte[] bArr) {
        for (int i3 = 0; i3 != bArr.length; i3++) {
            bArr[i3] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z2;
        int i3 = this.messageLength;
        byte[] bArr3 = this.mBuf;
        if (i3 > bArr3.length) {
            z2 = bArr3.length <= bArr2.length;
            for (int i10 = 0; i10 != this.mBuf.length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    z2 = false;
                }
            }
            return z2;
        }
        z2 = i3 == bArr2.length;
        for (int i11 = 0; i11 != bArr2.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                z2 = false;
            }
        }
        return z2;
    }

    private boolean returnFalse(byte[] bArr) {
        this.messageLength = 0;
        clearBlock(this.mBuf);
        clearBlock(bArr);
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        int length;
        int i3;
        int i10;
        int i11;
        int digestSize = this.digest.getDigestSize();
        if (this.trailer == 188) {
            byte[] bArr = this.block;
            length = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, length);
            byte[] bArr2 = this.block;
            bArr2[bArr2.length - 1] = PSSSigner.TRAILER_IMPLICIT;
            i3 = 8;
        } else {
            byte[] bArr3 = this.block;
            length = (bArr3.length - digestSize) - 2;
            this.digest.doFinal(bArr3, length);
            byte[] bArr4 = this.block;
            int length2 = bArr4.length - 2;
            int i12 = this.trailer;
            bArr4[length2] = (byte) (i12 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i12;
            i3 = 16;
        }
        int i13 = this.messageLength;
        int i14 = ((((digestSize + i13) * 8) + i3) + 4) - this.keyBits;
        if (i14 > 0) {
            int i15 = i13 - ((i14 + 7) / 8);
            i10 = length - i15;
            System.arraycopy(this.mBuf, 0, this.block, i10, i15);
            this.recoveredMessage = new byte[i15];
            i11 = 96;
        } else {
            i10 = length - i13;
            System.arraycopy(this.mBuf, 0, this.block, i10, i13);
            this.recoveredMessage = new byte[this.messageLength];
            i11 = 64;
        }
        int i16 = i10 - 1;
        if (i16 > 0) {
            for (int i17 = i16; i17 != 0; i17--) {
                this.block[i17] = -69;
            }
            byte[] bArr5 = this.block;
            bArr5[i16] = (byte) (bArr5[i16] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (11 | i11);
        } else {
            byte[] bArr6 = this.block;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i11);
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr7 = this.block;
        byte[] processBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        this.fullMessage = (i11 & 32) == 0;
        byte[] bArr8 = this.mBuf;
        byte[] bArr9 = this.recoveredMessage;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.messageLength = 0;
        clearBlock(this.mBuf);
        clearBlock(this.block);
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.recoveredMessage;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.fullMessage;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z2, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.cipher.init(z2, rSAKeyParameters);
        int bitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = bitLength;
        byte[] bArr = new byte[(bitLength + 7) / 8];
        this.block = bArr;
        int i3 = this.trailer;
        int length = bArr.length;
        if (i3 == 188) {
            this.mBuf = new byte[(length - this.digest.getDigestSize()) - 2];
        } else {
            this.mBuf = new byte[(length - this.digest.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        clearBlock(this.mBuf);
        byte[] bArr = this.recoveredMessage;
        if (bArr != null) {
            clearBlock(bArr);
        }
        this.recoveredMessage = null;
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        this.digest.update(b2);
        int i3 = this.messageLength;
        byte[] bArr = this.mBuf;
        if (i3 < bArr.length) {
            bArr[i3] = b2;
        }
        this.messageLength = i3 + 1;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i3;
        byte[] processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        int i10 = (processBlock[0] & 192) ^ 64;
        String string2 = StubApp.getString2(29321);
        if (i10 != 0) {
            throw new InvalidCipherTextException(string2);
        }
        if (((processBlock[processBlock.length - 1] & 15) ^ 12) != 0) {
            throw new InvalidCipherTextException(string2);
        }
        if (((processBlock[processBlock.length - 1] & UByte.MAX_VALUE) ^ 188) == 0) {
            i3 = 1;
        } else {
            i3 = 2;
            int i11 = ((processBlock[processBlock.length - 2] & UByte.MAX_VALUE) << 8) | (processBlock[processBlock.length - 1] & UByte.MAX_VALUE);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException(StubApp.getString2(29319));
            }
            int intValue = trailer.intValue();
            if (i11 != intValue && (intValue != 15052 || i11 != 16588)) {
                throw new IllegalStateException(u.p(i11, StubApp.getString2(29318)));
            }
        }
        int i12 = 0;
        while (i12 != processBlock.length && ((processBlock[i12] & 15) ^ 10) != 0) {
            i12++;
        }
        int i13 = i12 + 1;
        int length = ((processBlock.length - i3) - this.digest.getDigestSize()) - i13;
        if (length <= 0) {
            throw new InvalidCipherTextException(StubApp.getString2(29322));
        }
        if ((processBlock[0] & 32) == 0) {
            this.fullMessage = true;
            byte[] bArr2 = new byte[length];
            this.recoveredMessage = bArr2;
            System.arraycopy(processBlock, i13, bArr2, 0, bArr2.length);
        } else {
            this.fullMessage = false;
            byte[] bArr3 = new byte[length];
            this.recoveredMessage = bArr3;
            System.arraycopy(processBlock, i13, bArr3, 0, bArr3.length);
        }
        this.preSig = bArr;
        this.preBlock = processBlock;
        Digest digest = this.digest;
        byte[] bArr4 = this.recoveredMessage;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.recoveredMessage;
        this.messageLength = bArr5.length;
        System.arraycopy(bArr5, 0, this.mBuf, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] processBlock;
        int i3;
        byte[] bArr2 = this.preSig;
        if (bArr2 == null) {
            try {
                processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (!Arrays.areEqual(bArr2, bArr)) {
                throw new IllegalStateException(StubApp.getString2(29320));
            }
            processBlock = this.preBlock;
            this.preSig = null;
            this.preBlock = null;
        }
        if (((processBlock[0] & 192) ^ 64) == 0 && ((processBlock[processBlock.length - 1] & 15) ^ 12) == 0) {
            if (((processBlock[processBlock.length - 1] & UByte.MAX_VALUE) ^ 188) == 0) {
                i3 = 1;
            } else {
                i3 = 2;
                int i10 = ((processBlock[processBlock.length - 2] & UByte.MAX_VALUE) << 8) | (processBlock[processBlock.length - 1] & UByte.MAX_VALUE);
                Integer trailer = ISOTrailers.getTrailer(this.digest);
                if (trailer == null) {
                    throw new IllegalArgumentException(StubApp.getString2(29319));
                }
                int intValue = trailer.intValue();
                if (i10 != intValue && (intValue != 15052 || i10 != 16588)) {
                    throw new IllegalStateException(u.p(i10, StubApp.getString2(29318)));
                }
            }
            int i11 = 0;
            while (i11 != processBlock.length && ((processBlock[i11] & 15) ^ 10) != 0) {
                i11++;
            }
            int i12 = i11 + 1;
            int digestSize = this.digest.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            int length = (processBlock.length - i3) - digestSize;
            int i13 = length - i12;
            if (i13 <= 0) {
                return returnFalse(processBlock);
            }
            if ((processBlock[0] & 32) == 0) {
                this.fullMessage = true;
                if (this.messageLength > i13) {
                    return returnFalse(processBlock);
                }
                this.digest.reset();
                this.digest.update(processBlock, i12, i13);
                this.digest.doFinal(bArr3, 0);
                boolean z2 = true;
                for (int i14 = 0; i14 != digestSize; i14++) {
                    int i15 = length + i14;
                    byte b2 = (byte) (processBlock[i15] ^ bArr3[i14]);
                    processBlock[i15] = b2;
                    if (b2 != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return returnFalse(processBlock);
                }
                byte[] bArr4 = new byte[i13];
                this.recoveredMessage = bArr4;
                System.arraycopy(processBlock, i12, bArr4, 0, bArr4.length);
            } else {
                this.fullMessage = false;
                this.digest.doFinal(bArr3, 0);
                boolean z10 = true;
                for (int i16 = 0; i16 != digestSize; i16++) {
                    int i17 = length + i16;
                    byte b10 = (byte) (processBlock[i17] ^ bArr3[i16]);
                    processBlock[i17] = b10;
                    if (b10 != 0) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    return returnFalse(processBlock);
                }
                byte[] bArr5 = new byte[i13];
                this.recoveredMessage = bArr5;
                System.arraycopy(processBlock, i12, bArr5, 0, bArr5.length);
            }
            if (this.messageLength != 0 && !isSameAs(this.mBuf, this.recoveredMessage)) {
                return returnFalse(processBlock);
            }
            clearBlock(this.mBuf);
            clearBlock(processBlock);
            this.messageLength = 0;
            return true;
        }
        return returnFalse(processBlock);
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z2) {
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
        while (i10 > 0 && this.messageLength < this.mBuf.length) {
            update(bArr[i3]);
            i3++;
            i10--;
        }
        this.digest.update(bArr, i3, i10);
        this.messageLength += i10;
    }
}
