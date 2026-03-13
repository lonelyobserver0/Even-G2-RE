package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface AsymmetricBlockCipher {
    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean z2, CipherParameters cipherParameters);

    byte[] processBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException;
}
