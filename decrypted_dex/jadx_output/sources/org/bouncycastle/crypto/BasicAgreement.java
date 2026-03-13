package org.bouncycastle.crypto;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface BasicAgreement {
    BigInteger calculateAgreement(CipherParameters cipherParameters);

    int getFieldSize();

    void init(CipherParameters cipherParameters);
}
