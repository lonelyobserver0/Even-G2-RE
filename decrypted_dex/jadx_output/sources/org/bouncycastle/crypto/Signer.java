package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Signer {
    byte[] generateSignature() throws CryptoException, DataLengthException;

    void init(boolean z2, CipherParameters cipherParameters);

    void reset();

    void update(byte b2);

    void update(byte[] bArr, int i3, int i10);

    boolean verifySignature(byte[] bArr);
}
