package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SymmAlgorithm;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ITSPublicEncryptionKey {
    protected final PublicEncryptionKey encryptionKey;

    public enum symmAlgorithm {
        aes128Ccm(SymmAlgorithm.aes128Ccm.intValueExact());

        private final int tagValue;

        symmAlgorithm(int i3) {
            this.tagValue = i3;
        }
    }

    public ITSPublicEncryptionKey(PublicEncryptionKey publicEncryptionKey) {
        this.encryptionKey = publicEncryptionKey;
    }

    public PublicEncryptionKey toASN1Structure() {
        return this.encryptionKey;
    }
}
