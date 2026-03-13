package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface StreamCipher {
    String getAlgorithmName();

    void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException;

    int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException;

    void reset();

    byte returnByte(byte b2);
}
