package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface BlockCipher {
    String getAlgorithmName();

    int getBlockSize();

    void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException;

    int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException;

    void reset();
}
