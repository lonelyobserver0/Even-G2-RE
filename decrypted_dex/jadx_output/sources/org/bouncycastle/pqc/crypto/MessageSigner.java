package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface MessageSigner {
    byte[] generateSignature(byte[] bArr);

    void init(boolean z2, CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, byte[] bArr2);
}
