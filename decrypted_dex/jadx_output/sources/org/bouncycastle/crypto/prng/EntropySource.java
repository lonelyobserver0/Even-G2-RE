package org.bouncycastle.crypto.prng;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface EntropySource {
    int entropySize();

    byte[] getEntropy();

    boolean isPredictionResistant();
}
