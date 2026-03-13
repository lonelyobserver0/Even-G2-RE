package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface MessageEncryptor {
    void init(boolean z2, CipherParameters cipherParameters);

    byte[] messageDecrypt(byte[] bArr) throws InvalidCipherTextException;

    byte[] messageEncrypt(byte[] bArr);
}
