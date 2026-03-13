package org.bouncycastle.crypto;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface DSA {
    BigInteger[] generateSignature(byte[] bArr);

    void init(boolean z2, CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2);
}
