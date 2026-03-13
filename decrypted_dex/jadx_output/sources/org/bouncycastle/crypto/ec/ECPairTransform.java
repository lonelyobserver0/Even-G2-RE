package org.bouncycastle.crypto.ec;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ECPairTransform {
    void init(CipherParameters cipherParameters);

    ECPair transform(ECPair eCPair);
}
