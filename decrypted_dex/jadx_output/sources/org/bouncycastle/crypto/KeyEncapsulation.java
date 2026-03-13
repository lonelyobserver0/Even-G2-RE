package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface KeyEncapsulation {
    CipherParameters decrypt(byte[] bArr, int i3, int i10, int i11);

    CipherParameters encrypt(byte[] bArr, int i3, int i10);

    void init(CipherParameters cipherParameters);
}
