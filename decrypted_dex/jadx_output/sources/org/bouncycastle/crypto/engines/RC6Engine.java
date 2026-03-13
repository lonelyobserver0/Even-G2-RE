package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;
    private int[] _S = null;
    private boolean forEncryption;

    private int bytesToWord(byte[] bArr, int i3) {
        int i10 = 0;
        for (int i11 = 3; i11 >= 0; i11--) {
            i10 = (i10 << 8) + (bArr[i11 + i3] & UByte.MAX_VALUE);
        }
        return i10;
    }

    private int decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToWord = bytesToWord(bArr, i3);
        int bytesToWord2 = bytesToWord(bArr, i3 + 4);
        int bytesToWord3 = bytesToWord(bArr, i3 + 8);
        int bytesToWord4 = bytesToWord(bArr, i3 + 12);
        int[] iArr = this._S;
        int i11 = bytesToWord3 - iArr[43];
        int i12 = bytesToWord - iArr[42];
        int i13 = 20;
        while (i13 >= 1) {
            int rotateLeft = rotateLeft(((i12 * 2) + 1) * i12, 5);
            int rotateLeft2 = rotateLeft(((i11 * 2) + 1) * i11, 5);
            int i14 = i13 * 2;
            int rotateRight = rotateRight(bytesToWord2 - this._S[i14 + 1], rotateLeft) ^ rotateLeft2;
            i13--;
            int i15 = i12;
            i12 = rotateRight(bytesToWord4 - this._S[i14], rotateLeft2) ^ rotateLeft;
            bytesToWord4 = i11;
            i11 = rotateRight;
            bytesToWord2 = i15;
        }
        int[] iArr2 = this._S;
        int i16 = bytesToWord4 - iArr2[1];
        int i17 = bytesToWord2 - iArr2[0];
        wordToBytes(i12, bArr2, i10);
        wordToBytes(i17, bArr2, i10 + 4);
        wordToBytes(i11, bArr2, i10 + 8);
        wordToBytes(i16, bArr2, i10 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToWord = bytesToWord(bArr, i3);
        int bytesToWord2 = bytesToWord(bArr, i3 + 4);
        int bytesToWord3 = bytesToWord(bArr, i3 + 8);
        int bytesToWord4 = bytesToWord(bArr, i3 + 12);
        int[] iArr = this._S;
        int i11 = bytesToWord2 + iArr[0];
        int i12 = bytesToWord4 + iArr[1];
        int i13 = 1;
        while (i13 <= 20) {
            int rotateLeft = rotateLeft(((i11 * 2) + 1) * i11, 5);
            int rotateLeft2 = rotateLeft(((i12 * 2) + 1) * i12, 5);
            int i14 = i13 * 2;
            int rotateLeft3 = rotateLeft(bytesToWord ^ rotateLeft, rotateLeft2) + this._S[i14];
            int rotateLeft4 = rotateLeft(bytesToWord3 ^ rotateLeft2, rotateLeft) + this._S[i14 + 1];
            i13++;
            bytesToWord3 = i12;
            i12 = rotateLeft3;
            bytesToWord = i11;
            i11 = rotateLeft4;
        }
        int[] iArr2 = this._S;
        int i15 = bytesToWord + iArr2[42];
        int i16 = bytesToWord3 + iArr2[43];
        wordToBytes(i15, bArr2, i10);
        wordToBytes(i11, bArr2, i10 + 4);
        wordToBytes(i16, bArr2, i10 + 8);
        wordToBytes(i12, bArr2, i10 + 12);
        return 16;
    }

    private int rotateLeft(int i3, int i10) {
        return (i3 >>> (-i10)) | (i3 << i10);
    }

    private int rotateRight(int i3, int i10) {
        return (i3 << (-i10)) | (i3 >>> i10);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = bArr.length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i3 = length3 / 4;
            iArr2[i3] = (iArr2[i3] << 8) + (bArr[length3] & UByte.MAX_VALUE);
        }
        int[] iArr3 = new int[44];
        this._S = iArr3;
        iArr3[0] = P32;
        int i10 = 1;
        while (true) {
            iArr = this._S;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = iArr[i10 - 1] + Q32;
            i10++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length4; i15++) {
            int[] iArr4 = this._S;
            i12 = rotateLeft(iArr4[i11] + i12 + i13, 3);
            iArr4[i11] = i12;
            i13 = rotateLeft(iArr2[i14] + i12 + i13, i13 + i12);
            iArr2[i14] = i13;
            i11 = (i11 + 1) % this._S.length;
            i14 = (i14 + 1) % length2;
        }
    }

    private void wordToBytes(int i3, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11 + i10] = (byte) i3;
            i3 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28721);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28722), cipherParameters));
        }
        this.forEncryption = z2;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int blockSize = getBlockSize();
        if (this._S == null) {
            throw new IllegalStateException(StubApp.getString2(28723));
        }
        if (i3 + blockSize > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (blockSize + i10 <= bArr2.length) {
            return this.forEncryption ? encryptBlock(bArr, i3, bArr2, i10) : decryptBlock(bArr, i3, bArr2, i10);
        }
        throw new OutputLengthException(StubApp.getString2(28306));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
