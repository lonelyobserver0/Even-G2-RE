package org.bouncycastle.crypto;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException;

    void init(DerivationParameters derivationParameters);
}
