package org.bouncycastle.cert.crmf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface EncryptedValuePadder {
    byte[] getPaddedData(byte[] bArr);

    byte[] getUnpaddedData(byte[] bArr);
}
