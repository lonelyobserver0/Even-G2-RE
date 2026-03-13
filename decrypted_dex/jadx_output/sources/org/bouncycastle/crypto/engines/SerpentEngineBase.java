package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;
    protected boolean encrypting;
    protected int keyBits;
    protected int[] wKey;

    public SerpentEngineBase() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256));
    }

    private CryptoServicePurpose getPurpose() {
        return this.wKey == null ? CryptoServicePurpose.ANY : this.encrypting ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }

    public static int rotateLeft(int i3, int i10) {
        return (i3 >>> (-i10)) | (i3 << i10);
    }

    public static int rotateRight(int i3, int i10) {
        return (i3 << (-i10)) | (i3 >>> i10);
    }

    public final void LT(int[] iArr) {
        int rotateLeft = rotateLeft(iArr[0], 13);
        int rotateLeft2 = rotateLeft(iArr[2], 3);
        int i3 = (iArr[1] ^ rotateLeft) ^ rotateLeft2;
        int i10 = (iArr[3] ^ rotateLeft2) ^ (rotateLeft << 3);
        iArr[1] = rotateLeft(i3, 1);
        int rotateLeft3 = rotateLeft(i10, 7);
        iArr[3] = rotateLeft3;
        iArr[0] = rotateLeft((rotateLeft ^ iArr[1]) ^ rotateLeft3, 5);
        iArr[2] = rotateLeft((iArr[3] ^ rotateLeft2) ^ (iArr[1] << 7), 22);
    }

    public abstract void decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10);

    public abstract void encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10);

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28768);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    public final void ib0(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = ~i3;
        int i14 = i10 ^ i3;
        int i15 = (i13 | i14) ^ i12;
        int i16 = i11 ^ i15;
        int i17 = i14 ^ i16;
        iArr[2] = i17;
        int i18 = (i14 & i12) ^ i13;
        int i19 = (i17 & i18) ^ i15;
        iArr[1] = i19;
        int i20 = (i3 & i15) ^ (i19 | i16);
        iArr[3] = i20;
        iArr[0] = i20 ^ (i18 ^ i16);
    }

    public final void ib1(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i12 ^ i10;
        int i14 = i3 ^ (i10 & i13);
        int i15 = i13 ^ i14;
        int i16 = i11 ^ i15;
        iArr[3] = i16;
        int i17 = i10 ^ (i13 & i14);
        int i18 = i14 ^ (i16 | i17);
        iArr[1] = i18;
        int i19 = ~i18;
        int i20 = i17 ^ i16;
        iArr[0] = i19 ^ i20;
        iArr[2] = (i19 | i20) ^ i15;
    }

    public final void ib2(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i10 ^ i12;
        int i14 = ~i13;
        int i15 = i3 ^ i11;
        int i16 = i11 ^ i13;
        int i17 = (i10 & i16) ^ i15;
        iArr[0] = i17;
        int i18 = (((i3 | i14) ^ i12) | i15) ^ i13;
        iArr[3] = i18;
        int i19 = ~i16;
        int i20 = i18 | i17;
        iArr[1] = i19 ^ i20;
        iArr[2] = (i20 ^ i15) ^ (i12 & i19);
    }

    public final void ib3(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i3 | i10;
        int i14 = i10 ^ i11;
        int i15 = i3 ^ (i10 & i14);
        int i16 = i11 ^ i15;
        int i17 = i12 | i15;
        int i18 = i14 ^ i17;
        iArr[0] = i18;
        int i19 = (i17 | i14) ^ i12;
        iArr[2] = i16 ^ i19;
        int i20 = i13 ^ i19;
        int i21 = i15 ^ (i18 & i20);
        iArr[3] = i21;
        iArr[1] = i21 ^ (i20 ^ i18);
    }

    public final void ib4(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i10 ^ ((i11 | i12) & i3);
        int i14 = i11 ^ (i3 & i13);
        int i15 = i12 ^ i14;
        iArr[1] = i15;
        int i16 = ~i3;
        int i17 = (i14 & i15) ^ i13;
        iArr[3] = i17;
        int i18 = i12 ^ (i15 | i16);
        iArr[0] = i17 ^ i18;
        iArr[2] = (i16 ^ i15) ^ (i13 & i18);
    }

    public final void ib5(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (i10 & i13) ^ i12;
        int i15 = i3 & i14;
        int i16 = (i10 ^ i13) ^ i15;
        iArr[3] = i16;
        int i17 = i16 | i10;
        iArr[1] = i14 ^ (i3 & i17);
        int i18 = i12 | i3;
        iArr[0] = (i13 ^ i17) ^ i18;
        iArr[2] = ((i3 ^ i11) | i15) ^ (i10 & i18);
    }

    public final void ib6(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = ~i3;
        int i14 = i3 ^ i10;
        int i15 = i11 ^ i14;
        int i16 = (i11 | i13) ^ i12;
        iArr[1] = i15 ^ i16;
        int i17 = i14 ^ (i15 & i16);
        int i18 = i16 ^ (i10 | i17);
        iArr[3] = i18;
        int i19 = i10 | i18;
        iArr[0] = i17 ^ i19;
        iArr[2] = (i12 & i13) ^ (i19 ^ i15);
    }

    public final void ib7(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = (i3 & i10) | i11;
        int i14 = (i3 | i10) & i12;
        int i15 = i13 ^ i14;
        iArr[3] = i15;
        int i16 = i10 ^ i14;
        int i17 = ((i15 ^ (~i12)) | i16) ^ i3;
        iArr[1] = i17;
        int i18 = (i16 ^ i11) ^ (i12 | i17);
        iArr[0] = i18;
        iArr[2] = ((i3 & i15) ^ i18) ^ (i13 ^ i17);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z2;
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.wKey = makeWorkingKey(key);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, getPurpose()));
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(28769) + getAlgorithmName() + StubApp.getString2(28566) + cipherParameters.getClass().getName());
    }

    public final void inverseLT(int[] iArr) {
        int rotateRight = (rotateRight(iArr[2], 22) ^ iArr[3]) ^ (iArr[1] << 7);
        int rotateRight2 = rotateRight(iArr[0], 5) ^ iArr[1];
        int i3 = iArr[3];
        int i10 = rotateRight2 ^ i3;
        int rotateRight3 = rotateRight(i3, 7);
        int rotateRight4 = rotateRight(iArr[1], 1);
        iArr[3] = (rotateRight3 ^ rotateRight) ^ (i10 << 3);
        iArr[1] = (rotateRight4 ^ i10) ^ rotateRight;
        iArr[2] = rotateRight(rotateRight, 3);
        iArr[0] = rotateRight(i10, 13);
    }

    public abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        if (this.wKey == null) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (i3 + 16 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 16 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        if (this.encrypting) {
            encryptBlock(bArr, i3, bArr2, i10);
            return 16;
        }
        decryptBlock(bArr, i3, bArr2, i10);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public final void sb0(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i3 ^ i12;
        int i14 = i11 ^ i13;
        int i15 = i10 ^ i14;
        int i16 = (i12 & i3) ^ i15;
        iArr[3] = i16;
        int i17 = i3 ^ (i10 & i13);
        iArr[2] = (i11 | i17) ^ i15;
        int i18 = (i14 ^ i17) & i16;
        iArr[1] = (~i14) ^ i18;
        iArr[0] = (~i17) ^ i18;
    }

    public final void sb1(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = (~i3) ^ i10;
        int i14 = (i3 | i13) ^ i11;
        int i15 = i12 ^ i14;
        iArr[2] = i15;
        int i16 = i10 ^ (i12 | i13);
        int i17 = i15 ^ i13;
        int i18 = (i14 & i16) ^ i17;
        iArr[3] = i18;
        int i19 = i16 ^ i14;
        iArr[1] = i18 ^ i19;
        iArr[0] = i14 ^ (i19 & i17);
    }

    public final void sb2(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = ~i3;
        int i14 = i10 ^ i12;
        int i15 = (i11 & i13) ^ i14;
        iArr[0] = i15;
        int i16 = i11 ^ i13;
        int i17 = i10 & (i11 ^ i15);
        int i18 = i16 ^ i17;
        iArr[3] = i18;
        int i19 = i3 ^ ((i17 | i12) & (i15 | i16));
        iArr[2] = i19;
        iArr[1] = (i19 ^ (i12 | i13)) ^ (i14 ^ i18);
    }

    public final void sb3(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i3 ^ i10;
        int i14 = i3 & i11;
        int i15 = i3 | i12;
        int i16 = i11 ^ i12;
        int i17 = i14 | (i13 & i15);
        int i18 = i16 ^ i17;
        iArr[2] = i18;
        int i19 = (i15 ^ i10) ^ i17;
        int i20 = i13 ^ (i16 & i19);
        iArr[0] = i20;
        int i21 = i20 & i18;
        iArr[1] = i19 ^ i21;
        iArr[3] = (i10 | i12) ^ (i16 ^ i21);
    }

    public final void sb4(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i3 ^ i12;
        int i14 = i11 ^ (i12 & i13);
        int i15 = i10 | i14;
        iArr[3] = i13 ^ i15;
        int i16 = ~i10;
        int i17 = (i13 | i16) ^ i14;
        iArr[0] = i17;
        int i18 = i16 ^ i13;
        int i19 = (i15 & i18) ^ (i17 & i3);
        iArr[2] = i19;
        iArr[1] = (i3 ^ i14) ^ (i18 & i19);
    }

    public final void sb5(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = ~i3;
        int i14 = i3 ^ i10;
        int i15 = i3 ^ i12;
        int i16 = (i11 ^ i13) ^ (i14 | i15);
        iArr[0] = i16;
        int i17 = i12 & i16;
        int i18 = (i14 ^ i16) ^ i17;
        iArr[1] = i18;
        int i19 = i15 ^ (i16 | i13);
        iArr[2] = (i14 | i17) ^ i19;
        iArr[3] = (i19 & i18) ^ (i10 ^ i17);
    }

    public final void sb6(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = ~i3;
        int i14 = i3 ^ i12;
        int i15 = i10 ^ i14;
        int i16 = i11 ^ (i13 | i14);
        int i17 = i10 ^ i16;
        iArr[1] = i17;
        int i18 = (i14 | i17) ^ i12;
        int i19 = (i16 & i18) ^ i15;
        iArr[2] = i19;
        int i20 = i18 ^ i16;
        iArr[0] = i19 ^ i20;
        iArr[3] = (i20 & i15) ^ (~i16);
    }

    public final void sb7(int[] iArr, int i3, int i10, int i11, int i12) {
        int i13 = i10 ^ i11;
        int i14 = (i11 & i13) ^ i12;
        int i15 = i3 ^ i14;
        int i16 = i10 ^ ((i12 | i13) & i15);
        iArr[1] = i16;
        int i17 = (i3 & i15) ^ i13;
        iArr[3] = i17;
        int i18 = (i16 | i14) ^ i15;
        int i19 = i14 ^ (i17 & i18);
        iArr[2] = i19;
        iArr[0] = (i17 & i19) ^ (~i18);
    }
}
