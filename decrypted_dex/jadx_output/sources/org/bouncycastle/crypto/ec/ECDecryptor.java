package org.bouncycastle.crypto.ec;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ECDecryptor {
    ECPoint decrypt(ECPair eCPair);

    void init(CipherParameters cipherParameters);
}
