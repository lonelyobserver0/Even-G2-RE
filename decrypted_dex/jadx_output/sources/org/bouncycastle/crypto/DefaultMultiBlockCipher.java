package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class DefaultMultiBlockCipher implements MultiBlockCipher {
    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int getMultiBlockSize() {
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int processBlocks(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException, IllegalStateException {
        int multiBlockSize = getMultiBlockSize();
        int i12 = 0;
        for (int i13 = 0; i13 != i10; i13++) {
            i12 += processBlock(bArr, i3, bArr2, i11 + i12);
            i3 += multiBlockSize;
        }
        return i12;
    }
}
