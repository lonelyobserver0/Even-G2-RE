package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Mac {
    int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException;

    String getAlgorithmName();

    int getMacSize();

    void init(CipherParameters cipherParameters) throws IllegalArgumentException;

    void reset();

    void update(byte b2) throws IllegalStateException;

    void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException;
}
