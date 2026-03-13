package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface RawAgreement {
    void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i3);

    int getAgreementSize();

    void init(CipherParameters cipherParameters);
}
