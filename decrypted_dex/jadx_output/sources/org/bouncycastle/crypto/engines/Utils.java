package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static CryptoServicePurpose getPurpose(boolean z2) {
        return z2 ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }
}
