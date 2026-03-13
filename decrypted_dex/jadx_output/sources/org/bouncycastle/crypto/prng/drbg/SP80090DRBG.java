package org.bouncycastle.crypto.prng.drbg;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface SP80090DRBG {
    int generate(byte[] bArr, byte[] bArr2, boolean z2);

    int getBlockSize();

    void reseed(byte[] bArr);
}
