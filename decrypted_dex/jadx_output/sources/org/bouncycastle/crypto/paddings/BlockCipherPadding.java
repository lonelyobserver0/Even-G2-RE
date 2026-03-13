package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface BlockCipherPadding {
    int addPadding(byte[] bArr, int i3);

    String getPaddingName();

    void init(SecureRandom secureRandom) throws IllegalArgumentException;

    int padCount(byte[] bArr) throws InvalidCipherTextException;
}
