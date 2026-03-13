package org.bouncycastle.its.operator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ETSIDataEncryptor {
    byte[] encrypt(byte[] bArr);

    byte[] getKey();

    byte[] getNonce();
}
