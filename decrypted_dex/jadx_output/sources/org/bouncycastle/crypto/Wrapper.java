package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Wrapper {
    String getAlgorithmName();

    void init(boolean z2, CipherParameters cipherParameters);

    byte[] unwrap(byte[] bArr, int i3, int i10) throws InvalidCipherTextException;

    byte[] wrap(byte[] bArr, int i3, int i10);
}
