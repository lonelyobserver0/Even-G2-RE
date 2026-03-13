package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC5Parameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RC532Engine implements BlockCipher {
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private boolean forEncryption;
    private int _noRounds = 12;
    private int[] _S = null;

    private int bytesToWord(byte[] bArr, int i3) {
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    private int decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToWord = bytesToWord(bArr, i3);
        int bytesToWord2 = bytesToWord(bArr, i3 + 4);
        for (int i11 = this._noRounds; i11 >= 1; i11--) {
            int i12 = i11 * 2;
            bytesToWord2 = rotateRight(bytesToWord2 - this._S[i12 + 1], bytesToWord) ^ bytesToWord;
            bytesToWord = rotateRight(bytesToWord - this._S[i12], bytesToWord2) ^ bytesToWord2;
        }
        wordToBytes(bytesToWord - this._S[0], bArr2, i10);
        wordToBytes(bytesToWord2 - this._S[1], bArr2, i10 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bytesToWord = bytesToWord(bArr, i3) + this._S[0];
        int bytesToWord2 = bytesToWord(bArr, i3 + 4) + this._S[1];
        for (int i11 = 1; i11 <= this._noRounds; i11++) {
            int i12 = i11 * 2;
            bytesToWord = rotateLeft(bytesToWord ^ bytesToWord2, bytesToWord2) + this._S[i12];
            bytesToWord2 = rotateLeft(bytesToWord2 ^ bytesToWord, bytesToWord) + this._S[i12 + 1];
        }
        wordToBytes(bytesToWord, bArr2, i10);
        wordToBytes(bytesToWord2, bArr2, i10 + 4);
        return 8;
    }

    private int rotateLeft(int i3, int i10) {
        int i11 = i10 & 31;
        return (i3 >>> (32 - i11)) | (i3 << i11);
    }

    private int rotateRight(int i3, int i10) {
        int i11 = i10 & 31;
        return (i3 << (32 - i11)) | (i3 >>> i11);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 != bArr.length; i3++) {
            int i10 = i3 / 4;
            iArr2[i10] = iArr2[i10] + ((bArr[i3] & UByte.MAX_VALUE) << ((i3 % 4) * 8));
        }
        int[] iArr3 = new int[(this._noRounds + 1) * 2];
        this._S = iArr3;
        iArr3[0] = P32;
        int i11 = 1;
        while (true) {
            iArr = this._S;
            if (i11 >= iArr.length) {
                break;
            }
            iArr[i11] = iArr[i11 - 1] + Q32;
            i11++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length2; i16++) {
            int[] iArr4 = this._S;
            i13 = rotateLeft(iArr4[i12] + i13 + i14, 3);
            iArr4[i12] = i13;
            i14 = rotateLeft(iArr2[i15] + i13 + i14, i14 + i13);
            iArr2[i15] = i14;
            i12 = (i12 + 1) % this._S.length;
            i15 = (i15 + 1) % length;
        }
    }

    private void wordToBytes(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) i3;
        bArr[i10 + 1] = (byte) (i3 >> 8);
        bArr[i10 + 2] = (byte) (i3 >> 16);
        bArr[i10 + 3] = (byte) (i3 >> 24);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28717);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        byte[] key;
        if (cipherParameters instanceof RC5Parameters) {
            RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
            this._noRounds = rC5Parameters.getRounds();
            key = rC5Parameters.getKey();
            setKey(key);
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.g(StubApp.getString2(28718), cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            setKey(key);
        }
        this.forEncryption = z2;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        return this.forEncryption ? encryptBlock(bArr, i3, bArr2, i10) : decryptBlock(bArr, i3, bArr2, i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
