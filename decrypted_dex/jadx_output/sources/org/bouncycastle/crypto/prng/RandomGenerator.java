package org.bouncycastle.crypto.prng;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i3, int i10);
}
