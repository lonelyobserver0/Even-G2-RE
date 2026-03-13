package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.prng.drbg.SP80090DRBG;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
interface DRBGProvider {
    SP80090DRBG get(EntropySource entropySource);

    String getAlgorithm();
}
