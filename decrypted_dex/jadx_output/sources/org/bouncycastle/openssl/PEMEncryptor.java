package org.bouncycastle.openssl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface PEMEncryptor {
    byte[] encrypt(byte[] bArr) throws PEMException;

    String getAlgorithm();

    byte[] getIV();
}
