package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import i2.u;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ISO9796d2PSSSigner implements SignerWithRecovery {
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
    private int hLen;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private int preMStart;
    private byte[] preSig;
    private int preTLength;
    private SecureRandom random;
    private byte[] recoveredMessage;
    private int saltLength;
    private byte[] standardSalt;
    private int trailer;

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i3) {
        this(asymmetricBlockCipher, digest, i3, false);
    }

    private void ItoOSP(int i3, byte[] bArr) {
        bArr[0] = (byte) (i3 >>> 24);
        bArr[1] = (byte) (i3 >>> 16);
        bArr[2] = (byte) (i3 >>> 8);
        bArr[3] = (byte) i3;
    }

    private void LtoOSP(long j, byte[] bArr) {
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        bArr[4] = (byte) (j >>> 24);
        bArr[5] = (byte) (j >>> 16);
        bArr[6] = (byte) (j >>> 8);
        bArr[7] = (byte) j;
    }

    private void clearBlock(byte[] bArr) {
        for (int i3 = 0; i3 != bArr.length; i3++) {
            bArr[i3] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z2 = this.messageLength == bArr2.length;
        for (int i3 = 0; i3 != bArr2.length; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                z2 = false;
            }
        }
        return z2;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i3, int i10, int i11) {
        int i12;
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[this.hLen];
        byte[] bArr4 = new byte[4];
        this.digest.reset();
        int i13 = 0;
        while (true) {
            i12 = this.hLen;
            if (i13 >= i11 / i12) {
                break;
            }
            ItoOSP(i13, bArr4);
            this.digest.update(bArr, i3, i10);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i14 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i13 * i14, i14);
            i13++;
        }
        if (i12 * i13 < i11) {
            ItoOSP(i13, bArr4);
            this.digest.update(bArr, i3, i10);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i15 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i13 * i15, i11 - (i13 * i15));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        byte[] bArr2 = new byte[8];
        LtoOSP(this.messageLength * 8, bArr2);
        this.digest.update(bArr2, 0, 8);
        this.digest.update(this.mBuf, 0, this.messageLength);
        this.digest.update(bArr, 0, digestSize);
        byte[] bArr3 = this.standardSalt;
        if (bArr3 == null) {
            bArr3 = new byte[this.saltLength];
            this.random.nextBytes(bArr3);
        }
        this.digest.update(bArr3, 0, bArr3.length);
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        this.digest.doFinal(bArr4, 0);
        int i3 = this.trailer == 188 ? 1 : 2;
        byte[] bArr5 = this.block;
        int length = bArr5.length;
        int i10 = this.messageLength;
        int length2 = (((length - i10) - bArr3.length) - this.hLen) - i3;
        bArr5[length2 - 1] = 1;
        System.arraycopy(this.mBuf, 0, bArr5, length2, i10);
        System.arraycopy(bArr3, 0, this.block, length2 + this.messageLength, bArr3.length);
        byte[] maskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, digestSize2, (this.block.length - this.hLen) - i3);
        for (int i11 = 0; i11 != maskGeneratorFunction1.length; i11++) {
            byte[] bArr6 = this.block;
            bArr6[i11] = (byte) (bArr6[i11] ^ maskGeneratorFunction1[i11]);
        }
        byte[] bArr7 = this.block;
        int length3 = bArr7.length;
        int i12 = this.hLen;
        System.arraycopy(bArr4, 0, bArr7, (length3 - i12) - i3, i12);
        int i13 = this.trailer;
        if (i13 == 188) {
            byte[] bArr8 = this.block;
            bArr8[bArr8.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            byte[] bArr9 = this.block;
            bArr9[bArr9.length - 2] = (byte) (i13 >>> 8);
            bArr9[bArr9.length - 1] = (byte) i13;
        }
        byte[] bArr10 = this.block;
        bArr10[0] = (byte) (bArr10[0] & ByteCompanionObject.MAX_VALUE);
        byte[] processBlock = this.cipher.processBlock(bArr10, 0, bArr10.length);
        int i14 = this.messageLength;
        byte[] bArr11 = new byte[i14];
        this.recoveredMessage = bArr11;
        byte[] bArr12 = this.mBuf;
        this.fullMessage = i14 <= bArr12.length;
        System.arraycopy(bArr12, 0, bArr11, 0, bArr11.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
        this.messageLength = 0;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    @Override // org.bouncycastle.crypto.Signer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r4, org.bouncycastle.crypto.CipherParameters r5) {
        /*
            r3 = this;
            int r0 = r3.saltLength
            boolean r1 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithRandom
            if (r1 == 0) goto L17
            org.bouncycastle.crypto.params.ParametersWithRandom r5 = (org.bouncycastle.crypto.params.ParametersWithRandom) r5
            org.bouncycastle.crypto.CipherParameters r1 = r5.getParameters()
            org.bouncycastle.crypto.params.RSAKeyParameters r1 = (org.bouncycastle.crypto.params.RSAKeyParameters) r1
            if (r4 == 0) goto L48
            java.security.SecureRandom r5 = r5.getRandom()
        L14:
            r3.random = r5
            goto L48
        L17:
            boolean r1 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithSalt
            if (r1 == 0) goto L3e
            org.bouncycastle.crypto.params.ParametersWithSalt r5 = (org.bouncycastle.crypto.params.ParametersWithSalt) r5
            org.bouncycastle.crypto.CipherParameters r0 = r5.getParameters()
            r1 = r0
            org.bouncycastle.crypto.params.RSAKeyParameters r1 = (org.bouncycastle.crypto.params.RSAKeyParameters) r1
            byte[] r5 = r5.getSalt()
            r3.standardSalt = r5
            int r0 = r5.length
            int r5 = r5.length
            int r2 = r3.saltLength
            if (r5 != r2) goto L31
            goto L48
        L31:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r5 = 29317(0x7285, float:4.1082E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r4.<init>(r5)
            throw r4
        L3e:
            r1 = r5
            org.bouncycastle.crypto.params.RSAKeyParameters r1 = (org.bouncycastle.crypto.params.RSAKeyParameters) r1
            if (r4 == 0) goto L48
            java.security.SecureRandom r5 = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom()
            goto L14
        L48:
            org.bouncycastle.crypto.AsymmetricBlockCipher r5 = r3.cipher
            r5.init(r4, r1)
            java.math.BigInteger r4 = r1.getModulus()
            int r4 = r4.bitLength()
            r3.keyBits = r4
            int r4 = r4 + 7
            int r4 = r4 / 8
            byte[] r4 = new byte[r4]
            r3.block = r4
            int r5 = r3.trailer
            r1 = 188(0xbc, float:2.63E-43)
            int r4 = r4.length
            if (r5 != r1) goto L75
            org.bouncycastle.crypto.Digest r5 = r3.digest
            int r5 = r5.getDigestSize()
            int r4 = r4 - r5
            int r4 = r4 - r0
            int r4 = r4 + (-2)
            byte[] r4 = new byte[r4]
            r3.mBuf = r4
            goto L83
        L75:
            org.bouncycastle.crypto.Digest r5 = r3.digest
            int r5 = r5.getDigestSize()
            int r4 = r4 - r5
            int r4 = r4 - r0
            int r4 = r4 + (-3)
            byte[] r4 = new byte[r4]
            r3.mBuf = r4
        L83:
            r3.reset()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.ISO9796d2PSSSigner.init(boolean, org.bouncycastle.crypto.CipherParameters):void");
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        byte[] bArr = this.mBuf;
        if (bArr != null) {
            clearBlock(bArr);
        }
        byte[] bArr2 = this.recoveredMessage;
        if (bArr2 != null) {
            clearBlock(bArr2);
            this.recoveredMessage = null;
        }
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b2) {
        if (this.preSig == null) {
            int i3 = this.messageLength;
            byte[] bArr = this.mBuf;
            if (i3 < bArr.length) {
                this.messageLength = i3 + 1;
                bArr[i3] = b2;
                return;
            }
        }
        this.digest.update(b2);
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i3;
        byte[] processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        int length = processBlock.length;
        int i10 = this.keyBits;
        if (length < (i10 + 7) / 8) {
            int i11 = (i10 + 7) / 8;
            byte[] bArr2 = new byte[i11];
            System.arraycopy(processBlock, 0, bArr2, i11 - processBlock.length, processBlock.length);
            clearBlock(processBlock);
            processBlock = bArr2;
        }
        if (((processBlock[processBlock.length - 1] & UByte.MAX_VALUE) ^ 188) == 0) {
            i3 = 1;
        } else {
            i3 = 2;
            int i12 = ((processBlock[processBlock.length - 2] & UByte.MAX_VALUE) << 8) | (processBlock[processBlock.length - 1] & UByte.MAX_VALUE);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException(StubApp.getString2(29319));
            }
            int intValue = trailer.intValue();
            if (i12 != intValue && (intValue != 15052 || i12 != 16588)) {
                throw new IllegalStateException(u.p(i12, StubApp.getString2(29318)));
            }
        }
        this.digest.doFinal(new byte[this.hLen], 0);
        int length2 = processBlock.length;
        int i13 = this.hLen;
        byte[] maskGeneratorFunction1 = maskGeneratorFunction1(processBlock, (length2 - i13) - i3, i13, (processBlock.length - i13) - i3);
        for (int i14 = 0; i14 != maskGeneratorFunction1.length; i14++) {
            processBlock[i14] = (byte) (processBlock[i14] ^ maskGeneratorFunction1[i14]);
        }
        processBlock[0] = (byte) (processBlock[0] & ByteCompanionObject.MAX_VALUE);
        int i15 = 0;
        while (i15 != processBlock.length && processBlock[i15] != 1) {
            i15++;
        }
        int i16 = i15 + 1;
        if (i16 >= processBlock.length) {
            clearBlock(processBlock);
        }
        this.fullMessage = i16 > 1;
        byte[] bArr3 = new byte[(maskGeneratorFunction1.length - i16) - this.saltLength];
        this.recoveredMessage = bArr3;
        System.arraycopy(processBlock, i16, bArr3, 0, bArr3.length);
        byte[] bArr4 = this.recoveredMessage;
        System.arraycopy(bArr4, 0, this.mBuf, 0, bArr4.length);
        this.preSig = bArr;
        this.preBlock = processBlock;
        this.preMStart = i16;
        this.preTLength = i3;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int i3 = this.hLen;
        byte[] bArr2 = new byte[i3];
        this.digest.doFinal(bArr2, 0);
        byte[] bArr3 = this.preSig;
        if (bArr3 == null) {
            try {
                updateWithRecoveredMessage(bArr);
            } catch (Exception unused) {
                return false;
            }
        } else if (!Arrays.areEqual(bArr3, bArr)) {
            throw new IllegalStateException(StubApp.getString2(29320));
        }
        byte[] bArr4 = this.preBlock;
        int i10 = this.preMStart;
        int i11 = this.preTLength;
        this.preSig = null;
        this.preBlock = null;
        byte[] bArr5 = new byte[8];
        LtoOSP(this.recoveredMessage.length * 8, bArr5);
        this.digest.update(bArr5, 0, 8);
        byte[] bArr6 = this.recoveredMessage;
        if (bArr6.length != 0) {
            this.digest.update(bArr6, 0, bArr6.length);
        }
        this.digest.update(bArr2, 0, i3);
        byte[] bArr7 = this.standardSalt;
        if (bArr7 != null) {
            this.digest.update(bArr7, 0, bArr7.length);
        } else {
            this.digest.update(bArr4, i10 + this.recoveredMessage.length, this.saltLength);
        }
        int digestSize = this.digest.getDigestSize();
        byte[] bArr8 = new byte[digestSize];
        this.digest.doFinal(bArr8, 0);
        int length = (bArr4.length - i11) - digestSize;
        boolean z2 = true;
        for (int i12 = 0; i12 != digestSize; i12++) {
            if (bArr8[i12] != bArr4[length + i12]) {
                z2 = false;
            }
        }
        clearBlock(bArr4);
        clearBlock(bArr8);
        if (!z2) {
            this.fullMessage = false;
            this.messageLength = 0;
            clearBlock(this.recoveredMessage);
            return false;
        }
        if (this.messageLength == 0 || isSameAs(this.mBuf, this.recoveredMessage)) {
            this.messageLength = 0;
            clearBlock(this.mBuf);
            return true;
        }
        this.messageLength = 0;
        clearBlock(this.mBuf);
        return false;
    }

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i3, boolean z2) {
        int intValue;
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        this.hLen = digest.getDigestSize();
        this.saltLength = i3;
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
        if (this.preSig == null) {
            while (i10 > 0 && this.messageLength < this.mBuf.length) {
                update(bArr[i3]);
                i3++;
                i10--;
            }
        }
        if (i10 > 0) {
            this.digest.update(bArr, i3, i10);
        }
    }
}
