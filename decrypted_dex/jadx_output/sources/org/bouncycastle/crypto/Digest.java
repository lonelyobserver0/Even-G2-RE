package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Digest {
    int doFinal(byte[] bArr, int i3);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b2);

    void update(byte[] bArr, int i3, int i10);
}
